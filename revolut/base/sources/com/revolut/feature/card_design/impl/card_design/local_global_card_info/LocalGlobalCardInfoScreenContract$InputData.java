package com.revolut.feature.card_design.impl.card_design.local_global_card_info;

import android.os.Parcel;
import android.os.Parcelable;
import c93.e;
import com.revolut.kompot.common.IOData$Input;
import hx2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_design/impl/card_design/local_global_card_info/LocalGlobalCardInfoScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalGlobalCardInfoScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LocalGlobalCardInfoScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f64731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f64732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64733c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocalGlobalCardInfoScreenContract$InputData(e.valueOf(parcel.readString()), h.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LocalGlobalCardInfoScreenContract$InputData[i];
        }
    }

    public LocalGlobalCardInfoScreenContract$InputData(e cardType, h infoVariant, boolean z, String str) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(infoVariant, "infoVariant");
        this.f64731a = cardType;
        this.f64732b = infoVariant;
        this.f64733c = z;
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
        if (!(obj2 instanceof LocalGlobalCardInfoScreenContract$InputData)) {
            return false;
        }
        LocalGlobalCardInfoScreenContract$InputData localGlobalCardInfoScreenContract$InputData = (LocalGlobalCardInfoScreenContract$InputData) obj2;
        return this.f64731a == localGlobalCardInfoScreenContract$InputData.f64731a && this.f64732b == localGlobalCardInfoScreenContract$InputData.f64732b && this.f64733c == localGlobalCardInfoScreenContract$InputData.f64733c && Intrinsics.f(this.d, localGlobalCardInfoScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f64732b.hashCode() + (this.f64731a.hashCode() * 31)) * 31, 31, this.f64733c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64731a.name());
        dest.writeString(this.f64732b.name());
        dest.writeInt(this.f64733c ? 1 : 0);
        dest.writeString(this.d);
    }
}
