package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.all;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/cards/all/AllCardsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AllCardsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AllCardsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86311b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AllCardsScreenContract$InputData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AllCardsScreenContract$InputData[i];
        }
    }

    public AllCardsScreenContract$InputData(String str, boolean z) {
        this.f86310a = str;
        this.f86311b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AllCardsScreenContract$InputData)) {
            return false;
        }
        AllCardsScreenContract$InputData allCardsScreenContract$InputData = (AllCardsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f86310a, allCardsScreenContract$InputData.f86310a) && this.f86311b == allCardsScreenContract$InputData.f86311b;
    }

    public final int hashCode() {
        String str = this.f86310a;
        return Boolean.hashCode(this.f86311b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86310a);
        dest.writeInt(this.f86311b ? 1 : 0);
    }
}
