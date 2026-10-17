package com.revolut.feature.topup_screen.impl.data.repository.topup_methods;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.model.CheckoutContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yte.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/data/repository/topup_methods/TopUpMethodsRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopUpMethodsRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TopUpMethodsRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f90581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f90582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CheckoutContext f90583c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            n nVarValueOf = n.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TopUpMethodsRequest(nVarValueOf, boolValueOf, (CheckoutContext) parcel.readParcelable(TopUpMethodsRequest.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TopUpMethodsRequest[i];
        }
    }

    public TopUpMethodsRequest(n contextType, Boolean bool, CheckoutContext checkoutContext) {
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        this.f90581a = contextType;
        this.f90582b = bool;
        this.f90583c = checkoutContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TopUpMethodsRequest)) {
            return false;
        }
        TopUpMethodsRequest topUpMethodsRequest = (TopUpMethodsRequest) obj2;
        return this.f90581a == topUpMethodsRequest.f90581a && Intrinsics.f(this.f90582b, topUpMethodsRequest.f90582b) && Intrinsics.f(this.f90583c, topUpMethodsRequest.f90583c);
    }

    public final int hashCode() {
        int iHashCode = this.f90581a.hashCode() * 31;
        Boolean bool = this.f90582b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        CheckoutContext checkoutContext = this.f90583c;
        return iHashCode2 + (checkoutContext != null ? checkoutContext.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90581a.name());
        Boolean bool = this.f90582b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeParcelable(this.f90583c, i);
    }
}
