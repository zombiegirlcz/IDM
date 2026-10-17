package hde;

import efm.d0;
import hae.k;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import te0.w;
import wp5.y;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements vce.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f151420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l93.f f151421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f151422c;

    public i(m navigator, l93.f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.f151420a = navigator;
        this.f151421b = revolutCardsInteractor;
        String[] elements = {"card", "cards"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f151422c = kotlin.collections.d.y0(elements);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        if (y.D(cVar, "deeplink", 1, "past-transactions")) {
            return this.f151422c.contains(cVar.e(2));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof hde.h
            if (r0 == 0) goto L13
            r0 = r8
            hde.h r0 = (hde.h) r0
            int r1 = r0.f151419x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151419x = r1
            goto L1a
        L13:
            hde.h r0 = new hde.h
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f151419x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            jf0.c r7 = r0.u
            yhm.o.b(r8)
            goto L71
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            r8 = 2
            java.lang.String r8 = r7.e(r8)
            java.lang.String r2 = "card"
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            r5 = 3
            if (r2 == 0) goto L58
            java.lang.String r8 = r7.e(r5)
            java.util.List r8 = zhm.u.c(r8)
            r0 = 5
            java.lang.String r7 = r7.e(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r8, r7)
            goto La4
        L58:
            java.lang.String r2 = "cards"
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            if (r8 == 0) goto Lc6
            l93.f r8 = r6.f151421b
            ufm.b r8 = l93.f.j(r8, r4, r5)
            r0.u = r7
            r0.f151419x = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L71
            return r1
        L71:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = zhm.w.t(r8, r1)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L87:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r8.next()
            h93.f0 r1 = (h93.f0) r1
            java.lang.String r1 = r1.f150110a
            r0.add(r1)
            goto L87
        L99:
            r8 = 4
            java.lang.String r7 = r7.e(r8)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r0, r7)
            r0 = r8
        La4:
            q06.h r7 = new q06.h
            com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination r8 = new com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination
            com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination$StartPoint$TransactionTroubleshooter r1 = new com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination$StartPoint$TransactionTroubleshooter
            java.lang.Object r2 = r0.f186386b
            java.lang.String r2 = (java.lang.String) r2
            j7d.a r3 = j7d.a.PAST
            com.revolut.feature.shared.help_centre.api.faq.model.TransactionTroubleshooterFilter$Cards r5 = new com.revolut.feature.shared.help_centre.api.faq.model.TransactionTroubleshooterFilter$Cards
            java.lang.Object r0 = r0.f186385a
            java.util.List r0 = (java.util.List) r0
            r5.<init>(r0)
            r1.<init>(r2, r3, r5)
            r0 = 0
            r2 = 14
            r8.<init>(r1, r4, r0, r2)
            r7.<init>(r8, r4)
            return r7
        Lc6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hde.i.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(2);
        if (Intrinsics.f(strE, "card")) {
            ufm.i iVar = new ufm.i(w.j(u.c(deeplink.e(3))), new k(new h8b.b(deeplink.e(5), this), 8), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            return iVar;
        }
        if (!Intrinsics.f(strE, "cards")) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        String strE2 = deeplink.e(4);
        ufm.i iVar2 = new ufm.i(l93.f.j(this.f151421b, null, 3), new k(new hb4.k(24), 7), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        ufm.i iVar3 = new ufm.i(iVar2, new k(new h8b.b(strE2, this), 8), 1);
        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
        return iVar3;
    }
}
