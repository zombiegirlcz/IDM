package com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.ThreeDsCheckout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutContent$Order", "Landroid/os/Parcelable;", "Checkout", "ThreeDs", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutContent$Order$Checkout;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutContent$Order$ThreeDs;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CheckoutScreenContract$CheckoutContent$Order extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutContent$Order$Checkout;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutContent$Order;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout implements CheckoutScreenContract$CheckoutContent$Order {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutOrder f90710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final cxe.d f90711b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checkout((CheckoutOrder) parcel.readParcelable(Checkout.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(CheckoutOrder checkout) {
            dj0.d dVarC;
            Intrinsics.checkNotNullParameter(checkout, "checkout");
            this.f90710a = checkout;
            dj0.d dVarA = com.revolut.feature.checkout.models.a.a(checkout);
            Intrinsics.checkNotNullParameter(checkout, "<this>");
            int i = pi3.c.f236387a[checkout.f65847a.ordinal()];
            dj0.d dVar = null;
            if (i == 1) {
                e eVar = checkout.e;
                if (eVar != null) {
                    dj0.d dVar2 = eVar.d.f152326a;
                    dVarC = eVar.i ? dVar2 : null;
                    if (dVarC == null) {
                        dVarC = dj0.d.c(dVar2, 0L, null, 2);
                    }
                } else {
                    dVarC = null;
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                e eVarE = com.revolut.feature.checkout.models.a.e(checkout);
                dj0.d dVar3 = eVarE.d.f152326a;
                dVarC = eVarE.i ? dVar3 : null;
                if (dVarC == null) {
                    dVarC = dj0.d.c(dVar3, 0L, null, 2);
                }
            }
            if (dVarC != null && !dVarC.k()) {
                dVar = dVarC;
            }
            this.f90711b = new cxe.d(dVarA, dVar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Checkout) && Intrinsics.f(this.f90710a, ((Checkout) obj2).f90710a);
        }

        public final int hashCode() {
            return this.f90710a.hashCode();
        }

        @Override // com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order
        /* JADX INFO: renamed from: w0, reason: from getter */
        public final cxe.d getF90713b() {
            return this.f90711b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90710a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutContent$Order$ThreeDs;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutScreenContract$CheckoutContent$Order;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ThreeDs implements CheckoutScreenContract$CheckoutContent$Order {

        @NotNull
        public static final Parcelable.Creator<ThreeDs> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreeDsCheckout f90712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final cxe.d f90713b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ThreeDs((ThreeDsCheckout) parcel.readParcelable(ThreeDs.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThreeDs[i];
            }
        }

        public ThreeDs(ThreeDsCheckout threeDs) {
            Intrinsics.checkNotNullParameter(threeDs, "threeDs");
            this.f90712a = threeDs;
            this.f90713b = new cxe.d(threeDs.f65882b, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ThreeDs) && Intrinsics.f(this.f90712a, ((ThreeDs) obj2).f90712a);
        }

        public final int hashCode() {
            return this.f90712a.hashCode();
        }

        @Override // com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order
        /* JADX INFO: renamed from: w0, reason: from getter */
        public final cxe.d getF90713b() {
            return this.f90713b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f90712a, i);
        }
    }

    /* JADX INFO: renamed from: w0 */
    cxe.d getF90713b();
}
