package xe8;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import ye8.c;
import ye8.d;
import ye8.f;
import ye8.g;
import ye8.h;
import ye8.i;
import ye8.j;
import ye8.k;
import ye8.l;
import ye8.m;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0016\u0010$R\u001a\u0010)\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010'\u001a\u0004\b\u0010\u0010(R\u001a\u0010.\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\n\u0010-R\u001c\u00104\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010:\u001a\u0002058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001c\u0010>\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010<\u001a\u0004\b6\u0010=R\u001c\u0010B\u001a\u0004\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\b\"\u0010AR\u001c\u0010C\u001a\u0004\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\b\u0005\u0010AR\u001a\u0010D\u001a\u00020?8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010@\u001a\u0004\b0\u0010AR\u001c\u0010E\u001a\u0004\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010@\u001a\u0004\b\u001c\u0010AR\u001c\u0010I\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\b+\u0010H¨\u0006J"}, d2 = {"Lxe8/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "m", "userId", "Lye8/a;", "b", "Lye8/a;", "p", "()Lye8/a;", "weeklyAllowance", "Lye8/k;", "c", "Lye8/k;", "l", "()Lye8/k;", "tasks", "Lye8/f;", "d", "Lye8/f;", "g", "()Lye8/f;", "monthlyTopupLimit", "Lye8/l;", "e", "Lye8/l;", "n", "()Lye8/l;", "vaults", "Lye8/d;", "f", "Lye8/d;", "()Lye8/d;", "deposits", "Lye8/c;", "Lye8/c;", "()Lye8/c;", "coparents", "Lye8/b;", "h", "Lye8/b;", "()Lye8/b;", "cards", "Lye8/m;", "i", "Lye8/m;", "o", "()Lye8/m;", "virtualCards", "Lye8/i;", "j", "Lye8/i;", "k", "()Lye8/i;", "paymentLinks", "Lye8/h;", "Lye8/h;", "()Lye8/h;", "partnerships", "Lye8/j;", "Lye8/j;", "()Lye8/j;", "googlePay", "applePay", "p2pTransfers", "firstPartyNfcPayments", "Lye8/g;", "Lye8/g;", "()Lye8/g;", "multicurrency", "feature_junior_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("userId")
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("weeklyAllowance")
    @NotNull
    private final ye8.a weeklyAllowance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("tasks")
    @NotNull
    private final k tasks;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("monthlyTopupLimit")
    @NotNull
    private final f monthlyTopupLimit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("savings")
    @NotNull
    private final l vaults;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("deposits")
    @NotNull
    private final d deposits;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("guardians")
    @NotNull
    private final c coparents;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @b("cards")
    @NotNull
    private final ye8.b cards;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @b("virtualCards")
    private final m virtualCards;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @b("paymentLinks")
    @NotNull
    private final i paymentLinks;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @b("partnerships")
    private final h partnerships;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @b("googlePay")
    private final j googlePay;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @b("applePay")
    private final j applePay;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @b("p2pTransfers")
    @NotNull
    private final j p2pTransfers;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @b("firstPartyNfcPayments")
    private final j firstPartyNfcPayments;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @b("multicurrency")
    private final g multicurrency;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j getApplePay() {
        return this.applePay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ye8.b getCards() {
        return this.cards;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getCoparents() {
        return this.coparents;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getDeposits() {
        return this.deposits;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final j getFirstPartyNfcPayments() {
        return this.firstPartyNfcPayments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.userId, aVar.userId) && Intrinsics.f(this.weeklyAllowance, aVar.weeklyAllowance) && Intrinsics.f(this.tasks, aVar.tasks) && Intrinsics.f(this.monthlyTopupLimit, aVar.monthlyTopupLimit) && Intrinsics.f(this.vaults, aVar.vaults) && Intrinsics.f(this.deposits, aVar.deposits) && Intrinsics.f(this.coparents, aVar.coparents) && Intrinsics.f(this.cards, aVar.cards) && Intrinsics.f(this.virtualCards, aVar.virtualCards) && Intrinsics.f(this.paymentLinks, aVar.paymentLinks) && Intrinsics.f(this.partnerships, aVar.partnerships) && Intrinsics.f(this.googlePay, aVar.googlePay) && Intrinsics.f(this.applePay, aVar.applePay) && Intrinsics.f(this.p2pTransfers, aVar.p2pTransfers) && Intrinsics.f(this.firstPartyNfcPayments, aVar.firstPartyNfcPayments) && Intrinsics.f(this.multicurrency, aVar.multicurrency);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final j getGooglePay() {
        return this.googlePay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final f getMonthlyTopupLimit() {
        return this.monthlyTopupLimit;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final g getMulticurrency() {
        return this.multicurrency;
    }

    public final int hashCode() {
        int iHashCode = (this.cards.hashCode() + ((this.coparents.hashCode() + ((this.deposits.hashCode() + ((this.vaults.hashCode() + ((this.monthlyTopupLimit.hashCode() + ((this.tasks.hashCode() + ((this.weeklyAllowance.hashCode() + (this.userId.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        m mVar = this.virtualCards;
        int iHashCode2 = (this.paymentLinks.hashCode() + ((iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31)) * 31;
        h hVar = this.partnerships;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        j jVar = this.googlePay;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        j jVar2 = this.applePay;
        int iHashCode5 = (this.p2pTransfers.hashCode() + ((iHashCode4 + (jVar2 == null ? 0 : jVar2.hashCode())) * 31)) * 31;
        j jVar3 = this.firstPartyNfcPayments;
        int iHashCode6 = (iHashCode5 + (jVar3 == null ? 0 : jVar3.hashCode())) * 31;
        g gVar = this.multicurrency;
        return iHashCode6 + (gVar != null ? gVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final j getP2pTransfers() {
        return this.p2pTransfers;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final h getPartnerships() {
        return this.partnerships;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final i getPaymentLinks() {
        return this.paymentLinks;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final k getTasks() {
        return this.tasks;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final l getVaults() {
        return this.vaults;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final m getVirtualCards() {
        return this.virtualCards;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final ye8.a getWeeklyAllowance() {
        return this.weeklyAllowance;
    }
}
