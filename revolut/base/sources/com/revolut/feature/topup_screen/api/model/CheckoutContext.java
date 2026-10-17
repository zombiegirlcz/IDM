package com.revolut.feature.topup_screen.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/model/CheckoutContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckoutContext implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CheckoutContext> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f90523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yte.b f90524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90525c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckoutContext((d) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : yte.b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckoutContext[i];
        }
    }

    public CheckoutContext(d topUpAmount, String str, yte.b bVar) {
        Intrinsics.checkNotNullParameter(topUpAmount, "topUpAmount");
        this.f90523a = topUpAmount;
        this.f90524b = bVar;
        this.f90525c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CheckoutContext)) {
            return false;
        }
        CheckoutContext checkoutContext = (CheckoutContext) obj2;
        return Intrinsics.f(this.f90523a, checkoutContext.f90523a) && this.f90524b == checkoutContext.f90524b && Intrinsics.f(this.f90525c, checkoutContext.f90525c);
    }

    public final int hashCode() {
        int iHashCode = this.f90523a.hashCode() * 31;
        yte.b bVar = this.f90524b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f90525c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90523a);
        yte.b bVar = this.f90524b;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeString(this.f90525c);
    }
}
