package com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/common/screen/counterpart_chooser/SharedFavouritesCounterpartChooserScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedFavouritesCounterpartChooserScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SharedFavouritesCounterpartChooserScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f86836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f86837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86838c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SharedFavouritesCounterpartChooserScreenContract$InputData((Clause) parcel.readParcelable(SharedFavouritesCounterpartChooserScreenContract$InputData.class.getClassLoader()), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedFavouritesCounterpartChooserScreenContract$InputData[i];
        }
    }

    public SharedFavouritesCounterpartChooserScreenContract$InputData(Clause toolbarTitle, List ignoreAssetIds, boolean z, String str) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(ignoreAssetIds, "ignoreAssetIds");
        this.f86836a = toolbarTitle;
        this.f86837b = ignoreAssetIds;
        this.f86838c = z;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SharedFavouritesCounterpartChooserScreenContract$InputData)) {
            return false;
        }
        SharedFavouritesCounterpartChooserScreenContract$InputData sharedFavouritesCounterpartChooserScreenContract$InputData = (SharedFavouritesCounterpartChooserScreenContract$InputData) obj2;
        return Intrinsics.f(this.f86836a, sharedFavouritesCounterpartChooserScreenContract$InputData.f86836a) && Intrinsics.f(this.f86837b, sharedFavouritesCounterpartChooserScreenContract$InputData.f86837b) && this.f86838c == sharedFavouritesCounterpartChooserScreenContract$InputData.f86838c && Intrinsics.f(this.d, sharedFavouritesCounterpartChooserScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.d(this.f86836a.hashCode() * 31, 31, this.f86837b), 31, this.f86838c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86836a, i);
        dest.writeStringList(this.f86837b);
        dest.writeInt(this.f86838c ? 1 : 0);
        dest.writeString(this.d);
    }
}
