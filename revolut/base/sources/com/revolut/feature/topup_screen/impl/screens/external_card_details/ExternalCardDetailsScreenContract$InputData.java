package com.revolut.feature.topup_screen.impl.screens.external_card_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/impl/screens/external_card_details/ExternalCardDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalCardDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ExternalCardDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f91100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91101c;
    public final boolean d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            l lVarValueOf = l.valueOf(parcel.readString());
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new ExternalCardDetailsScreenContract$InputData(string, lVarValueOf, z4, z6, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExternalCardDetailsScreenContract$InputData[i];
        }
    }

    public ExternalCardDetailsScreenContract$InputData(String externalCardId, l pocketType, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(externalCardId, "externalCardId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f91099a = externalCardId;
        this.f91100b = pocketType;
        this.f91101c = z;
        this.d = z3;
        this.e = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExternalCardDetailsScreenContract$InputData)) {
            return false;
        }
        ExternalCardDetailsScreenContract$InputData externalCardDetailsScreenContract$InputData = (ExternalCardDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91099a, externalCardDetailsScreenContract$InputData.f91099a) && this.f91100b == externalCardDetailsScreenContract$InputData.f91100b && this.f91101c == externalCardDetailsScreenContract$InputData.f91101c && this.d == externalCardDetailsScreenContract$InputData.d && this.e == externalCardDetailsScreenContract$InputData.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(t61.a.c(this.f91100b, this.f91099a.hashCode() * 31, 31), 31, this.f91101c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91099a);
        dest.writeString(this.f91100b.name());
        dest.writeInt(this.f91101c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
    }
}
