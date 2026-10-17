package com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.simple_selector;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/alerts/ui/screen/create_alert/simple_selector/SimpleSelectorControllerContract$SimpleSelectorItem", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SimpleSelectorControllerContract$SimpleSelectorItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SimpleSelectorControllerContract$SimpleSelectorItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f86757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f86758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86759c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SimpleSelectorControllerContract$SimpleSelectorItem(parcel.readValue(SimpleSelectorControllerContract$SimpleSelectorItem.class.getClassLoader()), (Clause) parcel.readParcelable(SimpleSelectorControllerContract$SimpleSelectorItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SimpleSelectorControllerContract$SimpleSelectorItem[i];
        }
    }

    public SimpleSelectorControllerContract$SimpleSelectorItem(Object value, Clause title, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f86757a = value;
        this.f86758b = title;
        this.f86759c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SimpleSelectorControllerContract$SimpleSelectorItem)) {
            return false;
        }
        SimpleSelectorControllerContract$SimpleSelectorItem simpleSelectorControllerContract$SimpleSelectorItem = (SimpleSelectorControllerContract$SimpleSelectorItem) obj2;
        return Intrinsics.f(this.f86757a, simpleSelectorControllerContract$SimpleSelectorItem.f86757a) && Intrinsics.f(this.f86758b, simpleSelectorControllerContract$SimpleSelectorItem.f86758b) && this.f86759c == simpleSelectorControllerContract$SimpleSelectorItem.f86759c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86759c) + p.a.a(this.f86757a.hashCode() * 31, 31, this.f86758b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeValue(this.f86757a);
        dest.writeParcelable(this.f86758b, i);
        dest.writeInt(this.f86759c ? 1 : 0);
    }
}
