package com.revolut.feature.retail.cfd.api.navigation;

import a2b.i;
import aii.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/revolut/feature/retail/cfd/api/navigation/CfdTradingDescriptor$Withdraw", "La2b/i;", "Laii/q;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CfdTradingDescriptor$Withdraw implements i, ParcelableControllerDescriptor<q> {

    @NotNull
    public static final Parcelable.Creator<CfdTradingDescriptor$Withdraw> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f82125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModalTransitionAnimation.Style f82126c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CfdTradingDescriptor$Withdraw(parcel.readString(), (b) parcel.readSerializable(), (ModalTransitionAnimation.Style) parcel.readParcelable(CfdTradingDescriptor$Withdraw.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CfdTradingDescriptor$Withdraw[i];
        }
    }

    public CfdTradingDescriptor$Withdraw(String portfolioId, b currency, ModalTransitionAnimation.Style style) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f82124a = portfolioId;
        this.f82125b = currency;
        this.f82126c = style;
    }

    /* JADX INFO: renamed from: T8, reason: from getter */
    public final b getF82125b() {
        return this.f82125b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ModalTransitionAnimation.Style getF82126c() {
        return this.f82126c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CfdTradingDescriptor$Withdraw)) {
            return false;
        }
        CfdTradingDescriptor$Withdraw cfdTradingDescriptor$Withdraw = (CfdTradingDescriptor$Withdraw) obj2;
        return Intrinsics.f(this.f82124a, cfdTradingDescriptor$Withdraw.f82124a) && Intrinsics.f(this.f82125b, cfdTradingDescriptor$Withdraw.f82125b) && Intrinsics.f(this.f82126c, cfdTradingDescriptor$Withdraw.f82126c);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF82124a() {
        return this.f82124a;
    }

    public final int hashCode() {
        int iJ = l.j(this.f82125b, this.f82124a.hashCode() * 31, 31);
        ModalTransitionAnimation.Style style = this.f82126c;
        return iJ + (style == null ? 0 : style.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82124a);
        dest.writeSerializable(this.f82125b);
        dest.writeParcelable(this.f82126c, i);
    }
}
