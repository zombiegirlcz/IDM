package amf;

import ah1.p;
import elf.a1;
import klf.h0;
import klf.m1;
import klf.z2;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f6376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f6377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f6378c;
    public final a1 d;
    public final osg.b e;

    public h(h0 commonDataSource, z2 subscriptionDataSource, m1 juniorDataSource, a1 markAsSubscriptionClickHandler, osg.b walletInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(subscriptionDataSource, "subscriptionDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(markAsSubscriptionClickHandler, "markAsSubscriptionClickHandler");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f6376a = commonDataSource;
        this.f6377b = subscriptionDataSource;
        this.f6378c = juniorDataSource;
        this.d = markAsSubscriptionClickHandler;
        this.e = walletInteractor;
    }

    public final cmf.k a() {
        return new cmf.k(ta6.a.g(this.f6376a.d(), this.f6377b.a(), new a35.d(this.f6378c.a(), 16), rd0.e.e(mo3.a.e(rd0.e.b(((wsg.n) this.e).d0(null, w4l.h.f294642c)), new p(27), new p(28)), zhm.h0.f322473a, new a35.k(3, 10, null)), new g(5, this, h.class, "buildMenuItems", "buildMenuItems(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/recurring_payments/api/data/models/RecurringPayment;ZLjava/util/List;)Ljava/util/List;", 4, 0)), u.c(this.d), "MarkAsSubscription");
    }
}
