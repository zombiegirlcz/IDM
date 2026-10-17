package com.revolut.feature.payments.profile.impl.ui_kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import do3.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/payments/profile/impl/ui_kompot/flow/PaymentProfileFlowContract$State", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "Loki/a;", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/flow/PaymentProfileFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentProfileFlowContract$State implements States$PersistentDomain, oki.a {

    @NotNull
    public static final Parcelable.Creator<PaymentProfileFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f79628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f79630c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(PaymentProfileFlowContract$State.class, parcel, arrayList, iE, 1);
            }
            return new PaymentProfileFlowContract$State(arrayList, parcel.readString(), (n) parcel.readSerializable(), false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentProfileFlowContract$State[i];
        }
    }

    public PaymentProfileFlowContract$State(List pagerItems, String selectedPagerItemId, n nVar, boolean z) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        this.f79628a = pagerItems;
        this.f79629b = selectedPagerItemId;
        this.f79630c = nVar;
        this.d = z;
    }

    public static PaymentProfileFlowContract$State a(PaymentProfileFlowContract$State paymentProfileFlowContract$State, String selectedPagerItemId, boolean z, int i) {
        List pagerItems = paymentProfileFlowContract$State.f79628a;
        if ((i & 2) != 0) {
            selectedPagerItemId = paymentProfileFlowContract$State.f79629b;
        }
        n nVar = paymentProfileFlowContract$State.f79630c;
        if ((i & 8) != 0) {
            z = paymentProfileFlowContract$State.d;
        }
        paymentProfileFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        return new PaymentProfileFlowContract$State(pagerItems, selectedPagerItemId, nVar, z);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: W, reason: from getter */
    public final List getF79628a() {
        return this.f79628a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentProfileFlowContract$State)) {
            return false;
        }
        PaymentProfileFlowContract$State paymentProfileFlowContract$State = (PaymentProfileFlowContract$State) obj2;
        return Intrinsics.f(this.f79628a, paymentProfileFlowContract$State.f79628a) && Intrinsics.f(this.f79629b, paymentProfileFlowContract$State.f79629b) && Intrinsics.f(this.f79630c, paymentProfileFlowContract$State.f79630c) && this.d == paymentProfileFlowContract$State.d;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f79628a.hashCode() * 31, 31, this.f79629b);
        n nVar = this.f79630c;
        return Boolean.hashCode(this.d) + ((iC + (nVar == null ? 0 : nVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f79628a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.f79629b);
        dest.writeSerializable(this.f79630c);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getF79629b() {
        return this.f79629b;
    }
}
