package vcc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\u0006\u000e\u0016\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\f\u0010!R\u001a\u0010&\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b\u001f\u0010%¨\u0006'"}, d2 = {"Lvcc/b;", "", "", "toString", "()Ljava/lang/String;", "Lvcc/b$a;", "a", "Lvcc/b$a;", "()Lvcc/b$a;", "crypto", "", "Lvcc/b$c;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "items", "Lvcc/b$d;", "Lvcc/b$d;", "g", "()Lvcc/b$d;", "to", "d", "Ljava/lang/String;", "network", "Lvcc/b$b;", "e", "Lvcc/b$b;", "()Lvcc/b$b;", "price", "", "f", "J", "()J", "fees", "", "Z", "()Z", "showFcaNotice", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("crypto")
    @NotNull
    private final a crypto;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<c> items;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("to")
    @NotNull
    private final d to;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("network")
    @NotNull
    private final String network;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("price")
    @NotNull
    private final C1591b price;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("fees")
    private final long fees;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("showFcaNotice")
    private final boolean showFcaNotice;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lvcc/b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "currency", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currency;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.currency, ((a) obj2).currency);
        }

        public final int hashCode() {
            return this.currency.hashCode();
        }
    }

    /* JADX INFO: renamed from: vcc.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lvcc/b$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "b", "()J", "units", "amount", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1591b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("units")
        private final long units;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getUnits() {
            return this.units;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1591b)) {
                return false;
            }
            C1591b c1591b = (C1591b) obj2;
            return this.units == c1591b.units && this.amount == c1591b.amount;
        }

        public final int hashCode() {
            return Long.hashCode(this.amount) + (Long.hashCode(this.units) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lvcc/b$c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "cryptoAmount", "b", "totalAmount", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("cryptoAmount")
        private final long cryptoAmount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalAmount")
        private final long totalAmount;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getCryptoAmount() {
            return this.cryptoAmount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTotalAmount() {
            return this.totalAmount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return this.cryptoAmount == cVar.cryptoAmount && this.totalAmount == cVar.totalAmount;
        }

        public final int hashCode() {
            return Long.hashCode(this.totalAmount) + (Long.hashCode(this.cryptoAmount) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lvcc/b$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "name", "address", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("address")
        @NotNull
        private final String address;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.name, dVar.name) && Intrinsics.f(this.address, dVar.address);
        }

        public final int hashCode() {
            return this.address.hashCode() + (this.name.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getCrypto() {
        return this.crypto;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C1591b getPrice() {
        return this.price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.crypto, bVar.crypto) && Intrinsics.f(this.items, bVar.items) && Intrinsics.f(this.to, bVar.to) && Intrinsics.f(this.network, bVar.network) && Intrinsics.f(this.price, bVar.price) && this.fees == bVar.fees && this.showFcaNotice == bVar.showFcaNotice;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShowFcaNotice() {
        return this.showFcaNotice;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d getTo() {
        return this.to;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showFcaNotice) + a0.d.c((this.price.hashCode() + p.a.c((this.to.hashCode() + p.a.d(this.crypto.hashCode() * 31, 31, this.items)) * 31, 31, this.network)) * 31, 31, this.fees);
    }
}
