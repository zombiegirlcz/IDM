package com.revolut.feature.trusted_merchants.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trusted_merchants/impl/ui/TrustedMerchantsFlowContract$MerchantsContent", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trusted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TrustedMerchantsFlowContract$MerchantsContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TrustedMerchantsFlowContract$MerchantsContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f94417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f94418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94419c;
    public final boolean d;
    public final Throwable e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (true) {
                if (iE == i) {
                    break;
                }
                iE = j6.a.e(TrustedMerchantsFlowContract$MerchantsContent.class, parcel, arrayList, iE, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iE2 = 0;
            while (iE2 != i2) {
                iE2 = j6.a.e(TrustedMerchantsFlowContract$MerchantsContent.class, parcel, arrayList2, iE2, 1);
            }
            return new TrustedMerchantsFlowContract$MerchantsContent(arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0, (Throwable) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TrustedMerchantsFlowContract$MerchantsContent[i];
        }
    }

    public TrustedMerchantsFlowContract$MerchantsContent(List approvedMerchants, List toReviewMerchants, boolean z, boolean z3, Throwable th10) {
        Intrinsics.checkNotNullParameter(approvedMerchants, "approvedMerchants");
        Intrinsics.checkNotNullParameter(toReviewMerchants, "toReviewMerchants");
        this.f94417a = approvedMerchants;
        this.f94418b = toReviewMerchants;
        this.f94419c = z;
        this.d = z3;
        this.e = th10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TrustedMerchantsFlowContract$MerchantsContent)) {
            return false;
        }
        TrustedMerchantsFlowContract$MerchantsContent trustedMerchantsFlowContract$MerchantsContent = (TrustedMerchantsFlowContract$MerchantsContent) obj2;
        return Intrinsics.f(this.f94417a, trustedMerchantsFlowContract$MerchantsContent.f94417a) && Intrinsics.f(this.f94418b, trustedMerchantsFlowContract$MerchantsContent.f94418b) && this.f94419c == trustedMerchantsFlowContract$MerchantsContent.f94419c && this.d == trustedMerchantsFlowContract$MerchantsContent.d && Intrinsics.f(this.e, trustedMerchantsFlowContract$MerchantsContent.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(p.a.d(this.f94417a.hashCode() * 31, 31, this.f94418b), 31, this.f94419c), 31, this.d);
        Throwable th10 = this.e;
        return iC + (th10 == null ? 0 : th10.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f94417a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = p.a.v(this.f94418b, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        dest.writeInt(this.f94419c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeSerializable(this.e);
    }
}
