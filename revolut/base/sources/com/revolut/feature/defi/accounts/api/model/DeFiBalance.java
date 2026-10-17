package com.revolut.feature.defi.accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import j6.a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.q;
import yhm.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/accounts/api/model/DeFiBalance;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_defi_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiBalance implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f71636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f71637c;
    public final ej0.b d;
    public final Instant e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f71638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f71639h;
    public final Lazy i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f71640j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f71641l;

    @NotNull
    public static final Parcelable.Creator<DeFiBalance> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiBalance(parcel.readString(), (BigInteger) parcel.readSerializable(), parcel.readInt(), (ej0.b) parcel.readSerializable(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiBalance[i];
        }
    }

    public DeFiBalance(String assetExternalId, BigInteger balance, int i, ej0.b bVar, Instant createdDate, Instant updatedDate, String accountScopedAssetId, String assetTicker) {
        Intrinsics.checkNotNullParameter(assetExternalId, "assetExternalId");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(accountScopedAssetId, "accountScopedAssetId");
        Intrinsics.checkNotNullParameter(assetTicker, "assetTicker");
        this.f71635a = assetExternalId;
        this.f71636b = balance;
        this.f71637c = i;
        this.d = bVar;
        this.e = createdDate;
        this.f = updatedDate;
        this.f71638g = accountScopedAssetId;
        this.f71639h = assetTicker;
        final int i2 = 0;
        this.i = j.b(new Function0(this) { // from class: e16.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiBalance f121893b;

            {
                this.f121893b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        DeFiBalance deFiBalance = this.f121893b;
                        return new xi0.b(4, deFiBalance.f71635a, Integer.valueOf(deFiBalance.f71637c));
                    case 1:
                        DeFiBalance deFiBalance2 = this.f121893b;
                        return new BigDecimal(deFiBalance2.f71636b, deFiBalance2.f71637c);
                    case 2:
                        DeFiBalance deFiBalance3 = this.f121893b;
                        return new ej0.b(deFiBalance3.b(), deFiBalance3.getCurrency());
                    default:
                        DeFiBalance deFiBalance4 = this.f121893b;
                        return q.a(deFiBalance4.b(), deFiBalance4.getCurrency());
                }
            }
        });
        final int i3 = 1;
        this.f71640j = j.b(new Function0(this) { // from class: e16.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiBalance f121893b;

            {
                this.f121893b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        DeFiBalance deFiBalance = this.f121893b;
                        return new xi0.b(4, deFiBalance.f71635a, Integer.valueOf(deFiBalance.f71637c));
                    case 1:
                        DeFiBalance deFiBalance2 = this.f121893b;
                        return new BigDecimal(deFiBalance2.f71636b, deFiBalance2.f71637c);
                    case 2:
                        DeFiBalance deFiBalance3 = this.f121893b;
                        return new ej0.b(deFiBalance3.b(), deFiBalance3.getCurrency());
                    default:
                        DeFiBalance deFiBalance4 = this.f121893b;
                        return q.a(deFiBalance4.b(), deFiBalance4.getCurrency());
                }
            }
        });
        final int i5 = 2;
        this.k = j.b(new Function0(this) { // from class: e16.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiBalance f121893b;

            {
                this.f121893b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        DeFiBalance deFiBalance = this.f121893b;
                        return new xi0.b(4, deFiBalance.f71635a, Integer.valueOf(deFiBalance.f71637c));
                    case 1:
                        DeFiBalance deFiBalance2 = this.f121893b;
                        return new BigDecimal(deFiBalance2.f71636b, deFiBalance2.f71637c);
                    case 2:
                        DeFiBalance deFiBalance3 = this.f121893b;
                        return new ej0.b(deFiBalance3.b(), deFiBalance3.getCurrency());
                    default:
                        DeFiBalance deFiBalance4 = this.f121893b;
                        return q.a(deFiBalance4.b(), deFiBalance4.getCurrency());
                }
            }
        });
        final int i6 = 3;
        this.f71641l = j.b(new Function0(this) { // from class: e16.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiBalance f121893b;

            {
                this.f121893b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        DeFiBalance deFiBalance = this.f121893b;
                        return new xi0.b(4, deFiBalance.f71635a, Integer.valueOf(deFiBalance.f71637c));
                    case 1:
                        DeFiBalance deFiBalance2 = this.f121893b;
                        return new BigDecimal(deFiBalance2.f71636b, deFiBalance2.f71637c);
                    case 2:
                        DeFiBalance deFiBalance3 = this.f121893b;
                        return new ej0.b(deFiBalance3.b(), deFiBalance3.getCurrency());
                    default:
                        DeFiBalance deFiBalance4 = this.f121893b;
                        return q.a(deFiBalance4.b(), deFiBalance4.getCurrency());
                }
            }
        });
    }

    public final ej0.b a() {
        return (ej0.b) this.k.getValue();
    }

    public final BigDecimal b() {
        return (BigDecimal) this.f71640j.getValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiBalance)) {
            return false;
        }
        DeFiBalance deFiBalance = (DeFiBalance) obj2;
        return Intrinsics.f(this.f71635a, deFiBalance.f71635a) && Intrinsics.f(this.f71636b, deFiBalance.f71636b) && this.f71637c == deFiBalance.f71637c && Intrinsics.f(this.d, deFiBalance.d) && Intrinsics.f(this.e, deFiBalance.e) && Intrinsics.f(this.f, deFiBalance.f) && Intrinsics.f(this.f71638g, deFiBalance.f71638g) && Intrinsics.f(this.f71639h, deFiBalance.f71639h);
    }

    public final xi0.b getCurrency() {
        return (xi0.b) this.i.getValue();
    }

    public final int hashCode() {
        int iB = a.b(this.f71637c, (this.f71636b.hashCode() + (this.f71635a.hashCode() * 31)) * 31, 31);
        ej0.b bVar = this.d;
        return this.f71639h.hashCode() + p.a.c(r6.b.c(r6.b.c((iB + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f71638g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71635a);
        dest.writeSerializable(this.f71636b);
        dest.writeInt(this.f71637c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeString(this.f71638g);
        dest.writeString(this.f71639h);
    }
}
