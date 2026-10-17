package com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_out/review/domain/SwitchOutReview;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SwitchOutReview implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SwitchOutReview> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwitchOutRequestStatus f64068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f64069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f64070c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            SwitchOutRequestStatus switchOutRequestStatusCreateFromParcel = SwitchOutRequestStatus.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(DirectDebit.CREATOR, parcel, arrayList, iA, 1);
            }
            return new SwitchOutReview(switchOutRequestStatusCreateFromParcel, arrayList, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SwitchOutReview[i];
        }
    }

    public SwitchOutReview(SwitchOutRequestStatus status, List directDebits, List obligatedProducts) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(directDebits, "directDebits");
        Intrinsics.checkNotNullParameter(obligatedProducts, "obligatedProducts");
        this.f64068a = status;
        this.f64069b = directDebits;
        this.f64070c = obligatedProducts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SwitchOutReview)) {
            return false;
        }
        SwitchOutReview switchOutReview = (SwitchOutReview) obj2;
        return Intrinsics.f(this.f64068a, switchOutReview.f64068a) && Intrinsics.f(this.f64069b, switchOutReview.f64069b) && Intrinsics.f(this.f64070c, switchOutReview.f64070c);
    }

    public final int hashCode() {
        return this.f64070c.hashCode() + p.a.d(this.f64068a.hashCode() * 31, 31, this.f64069b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f64068a.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.f64069b, dest);
        while (itV.hasNext()) {
            ((DirectDebit) itV.next()).writeToParcel(dest, i);
        }
        dest.writeStringList(this.f64070c);
    }
}
