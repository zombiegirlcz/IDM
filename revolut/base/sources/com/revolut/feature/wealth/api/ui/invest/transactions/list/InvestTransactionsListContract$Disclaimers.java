package com.revolut.feature.wealth.api.ui.invest.transactions.list;

import android.os.Parcel;
import android.os.Parcelable;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/wealth/api/ui/invest/transactions/list/InvestTransactionsListContract$Disclaimers", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestTransactionsListContract$Disclaimers implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f95361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f95362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f95363c;
    public final boolean d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<InvestTransactionsListContract$Disclaimers> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static InvestTransactionsListContract$Disclaimers a() {
            return new InvestTransactionsListContract$Disclaimers(true, 11);
        }

        public static InvestTransactionsListContract$Disclaimers b() {
            return new InvestTransactionsListContract$Disclaimers(false, 14);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestTransactionsListContract$Disclaimers(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestTransactionsListContract$Disclaimers[i];
        }
    }

    public InvestTransactionsListContract$Disclaimers() {
        this(false, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestTransactionsListContract$Disclaimers)) {
            return false;
        }
        InvestTransactionsListContract$Disclaimers investTransactionsListContract$Disclaimers = (InvestTransactionsListContract$Disclaimers) obj2;
        return this.f95361a == investTransactionsListContract$Disclaimers.f95361a && this.f95362b == investTransactionsListContract$Disclaimers.f95362b && this.f95363c == investTransactionsListContract$Disclaimers.f95363c && this.d == investTransactionsListContract$Disclaimers.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a.c(a.c(Boolean.hashCode(this.f95361a) * 31, 31, this.f95362b), 31, this.f95363c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f95361a ? 1 : 0);
        dest.writeInt(this.f95362b ? 1 : 0);
        dest.writeInt(this.f95363c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }

    public InvestTransactionsListContract$Disclaimers(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f95361a = z;
        this.f95362b = z3;
        this.f95363c = z4;
        this.d = z6;
    }

    public /* synthetic */ InvestTransactionsListContract$Disclaimers(boolean z, int i) {
        this((i & 1) == 0, (i & 2) == 0, (i & 4) != 0 ? false : z, (i & 8) == 0);
    }
}
