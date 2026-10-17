package com.revolut.feature.revolutpay.api.shared.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PayWithAnyFundingOptions;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u6c.t;
import u6c.u;
import w6c.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/revolutpay/api/shared/navigation/PayWithAnyControllerDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayWithAnyControllerDescriptor$InputData implements IOData$Input {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f84430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f84431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f84432c;
    public final PaymentMethod d;
    public final String e;
    public final u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PayWithAnyFundingOptions f84433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f84434h;
    public final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f84435j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f84436l;

    @NotNull
    public static final Parcelable.Creator<PayWithAnyControllerDescriptor$InputData> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            t tVarValueOf = t.valueOf(parcel.readString());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            xi0.b bVar = (xi0.b) parcel.readSerializable();
            PaymentMethod paymentMethod = (PaymentMethod) parcel.readParcelable(PayWithAnyControllerDescriptor$InputData.class.getClassLoader());
            String string = parcel.readString();
            u uVarValueOf = parcel.readInt() != 0 ? u.valueOf(parcel.readString()) : null;
            PayWithAnyFundingOptions payWithAnyFundingOptionsCreateFromParcel = PayWithAnyFundingOptions.CREATOR.createFromParcel(parcel);
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            f fVarValueOf = f.valueOf(parcel.readString());
            String string2 = parcel.readString();
            boolean z4 = true;
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                z4 = z;
            }
            return new PayWithAnyControllerDescriptor$InputData(tVarValueOf, lValueOf, bVar, paymentMethod, string, uVarValueOf, payWithAnyFundingOptionsCreateFromParcel, z3, fVarValueOf, string2, string3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayWithAnyControllerDescriptor$InputData[i];
        }
    }

    public PayWithAnyControllerDescriptor$InputData(t product, Long l2, xi0.b bVar, PaymentMethod paymentMethod, String str, u uVar, PayWithAnyFundingOptions fundingOptions, boolean z, f payWithAnyListMode, String str2, String str3, boolean z3) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(fundingOptions, "fundingOptions");
        Intrinsics.checkNotNullParameter(payWithAnyListMode, "payWithAnyListMode");
        this.f84430a = product;
        this.f84431b = l2;
        this.f84432c = bVar;
        this.d = paymentMethod;
        this.e = str;
        this.f = uVar;
        this.f84433g = fundingOptions;
        this.f84434h = z;
        this.i = payWithAnyListMode;
        this.f84435j = str2;
        this.k = str3;
        this.f84436l = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PayWithAnyControllerDescriptor$InputData)) {
            return false;
        }
        PayWithAnyControllerDescriptor$InputData payWithAnyControllerDescriptor$InputData = (PayWithAnyControllerDescriptor$InputData) obj2;
        return this.f84430a == payWithAnyControllerDescriptor$InputData.f84430a && Intrinsics.f(this.f84431b, payWithAnyControllerDescriptor$InputData.f84431b) && Intrinsics.f(this.f84432c, payWithAnyControllerDescriptor$InputData.f84432c) && Intrinsics.f(this.d, payWithAnyControllerDescriptor$InputData.d) && Intrinsics.f(this.e, payWithAnyControllerDescriptor$InputData.e) && this.f == payWithAnyControllerDescriptor$InputData.f && Intrinsics.f(this.f84433g, payWithAnyControllerDescriptor$InputData.f84433g) && this.f84434h == payWithAnyControllerDescriptor$InputData.f84434h && this.i == payWithAnyControllerDescriptor$InputData.i && Intrinsics.f(this.f84435j, payWithAnyControllerDescriptor$InputData.f84435j) && Intrinsics.f(this.k, payWithAnyControllerDescriptor$InputData.k) && this.f84436l == payWithAnyControllerDescriptor$InputData.f84436l;
    }

    public final int hashCode() {
        int iHashCode = this.f84430a.hashCode() * 31;
        Long l2 = this.f84431b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        xi0.b bVar = this.f84432c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        PaymentMethod paymentMethod = this.d;
        int iHashCode4 = (iHashCode3 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        u uVar = this.f;
        int iHashCode6 = (this.i.hashCode() + a.c((this.f84433g.hashCode() + ((iHashCode5 + (uVar == null ? 0 : uVar.hashCode())) * 31)) * 31, 31, this.f84434h)) * 31;
        String str2 = this.f84435j;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        return Boolean.hashCode(this.f84436l) + ((iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84430a.name());
        Long l2 = this.f84431b;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeSerializable(this.f84432c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        u uVar = this.f;
        if (uVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(uVar.name());
        }
        this.f84433g.writeToParcel(dest, i);
        dest.writeInt(this.f84434h ? 1 : 0);
        dest.writeString(this.i.name());
        dest.writeString(this.f84435j);
        dest.writeString(this.k);
        dest.writeInt(this.f84436l ? 1 : 0);
    }

    public /* synthetic */ PayWithAnyControllerDescriptor$InputData(t tVar, xi0.b bVar, PaymentMethod paymentMethod, PayWithAnyFundingOptions payWithAnyFundingOptions, f fVar, int i) {
        this(tVar, null, bVar, paymentMethod, null, null, (i & 64) != 0 ? new PayWithAnyFundingOptions(null, 7) : payWithAnyFundingOptions, false, (i & 256) != 0 ? f.FULL : fVar, null, null, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PayWithAnyControllerDescriptor$InputData(t product, d amount, PaymentMethod paymentMethod, String str, u uVar, PayWithAnyFundingOptions payWithAnyFundingOptions, f fVar, String str2, String str3, boolean z, int i) {
        String str4 = (i & 8) != 0 ? null : str;
        u uVar2 = (i & 16) != 0 ? null : uVar;
        PayWithAnyFundingOptions fundingOptions = (i & 32) != 0 ? new PayWithAnyFundingOptions(null, 7) : payWithAnyFundingOptions;
        boolean z3 = (i & 64) == 0;
        f payWithAnyListMode = (i & 128) != 0 ? f.FULL : fVar;
        String str5 = (i & 256) != 0 ? null : str2;
        String str6 = (i & 512) != 0 ? null : str3;
        boolean z4 = (i & 1024) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fundingOptions, "fundingOptions");
        Intrinsics.checkNotNullParameter(payWithAnyListMode, "payWithAnyListMode");
        this(product, Long.valueOf(amount.f115082a), amount.f115083b, paymentMethod, str4, uVar2, fundingOptions, z3, payWithAnyListMode, str5, str6, z4);
    }
}
