package mx2;

import android.content.Context;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_design.api.CardDesignApi$Toggles$CardDesignsChromaticFeatures;
import com.revolut.feature.card_design.api.CardDesignApi$Toggles$Carousel2dDesigns;
import com.revolut.feature.card_design.api.CardDesignApi$Toggles$CustomCardholderName;
import com.revolut.feature.card_design.api.CardDesignApi$Toggles$JointAccountsPlanCards;
import com.revolut.feature.card_design.api.CardDesignApi$Toggles$VirtualCardsRevPointsUnlockCondition;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import g48.r0;
import h93.j0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mpd.p;
import mx0.bc;
import mx0.oc;
import mx0.v9;
import ofm.i;
import skm.p0;
import sri.m;
import te0.w;
import w38.t;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements uri.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f210161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f210162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f210163c;

    public f(r0 jointAccountsInteractor, t pendingAccountBottomSheetProvider, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(pendingAccountBottomSheetProvider, "pendingAccountBottomSheetProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f210161a = jointAccountsInteractor;
        this.f210162b = pendingAccountBottomSheetProvider;
        this.f210163c = userInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x02e6, code lost:
    
        if (r2 == r4) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(mx2.f r41, com.revolut.feature.card_design.api.CardDesignFeatureConfig r42, gim.c r43) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx2.f.d(mx2.f, com.revolut.feature.card_design.api.CardDesignFeatureConfig, gim.c):java.lang.Object");
    }

    public static c93.e f(b93.e eVar) {
        switch (b.f210155a[eVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return c93.e.PHYSICAL;
            case 4:
            case 5:
            case 6:
                return c93.e.VIRTUAL;
            case 7:
            case 8:
                return c93.e.DISPOSABLE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static j0 h(b93.e eVar, AccountId accountId) {
        if (accountId instanceof AccountId.Joint) {
            return j0.JOINT_ACCOUNT;
        }
        eVar.getClass();
        return (eVar == b93.e.FREELANCER || eVar == b93.e.FREELANCER_VIRTUAL || eVar == b93.e.FREELANCER_DISPOSABLE) ? j0.PRO : (eVar == b93.e.JUNIOR || eVar == b93.e.JUNIOR_VIRTUAL) ? j0.YOUTH : j0.RETAIL;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof CardDesignFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        CardDesignFeatureConfig config = (CardDesignFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        w.o0(p0.f264003c, new p(this, config, null, 13)).q(new i(new bc(new v9(1, navigator, m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 4), 3), new bc(new oc(1), 4), 0));
    }

    @Override // nte.a
    public final List e() {
        return v.k(CardDesignApi$Toggles$Carousel2dDesigns.f64535c, CardDesignApi$Toggles$CustomCardholderName.f64536c, CardDesignApi$Toggles$JointAccountsPlanCards.f64537c, CardDesignApi$Toggles$CardDesignsChromaticFeatures.f64534c, CardDesignApi$Toggles$VirtualCardsRevPointsUnlockCondition.f64538c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum g(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof mx2.c
            if (r0 == 0) goto L13
            r0 = r6
            mx2.c r0 = (mx2.c) r0
            int r1 = r0.f210156w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f210156w = r1
            goto L18
        L13:
            mx2.c r0 = new mx2.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f210156w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            goto L48
        L28:
            r6 = move-exception
            goto L4b
        L2a:
            r6 = move-exception
            goto L74
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            yhm.o.b(r6)
            ang.f r6 = r5.f210163c     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            zmg.d r6 = r6.d     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            efm.k r6 = r6.c()     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            r0.f210156w = r4     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.Object r6 = nim.a.i(r6, r0)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            if (r6 != r1) goto L48
            return r1
        L48:
            do3.n r6 = (do3.n) r6     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            goto L55
        L4b:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r3, r3, r6, r0)
            r6 = r3
        L55:
            if (r6 == 0) goto L5f
            com.revolut.feature.address.models.Address r6 = r6.k
            if (r6 == 0) goto L5f
            wi0.b r3 = nz8.d.g(r6)
        L5f:
            boolean r6 = com.bumptech.glide.d.s(r3)
            if (r6 == 0) goto L68
            h93.l0 r6 = h93.l0.INDIA_LOCAL
            goto L73
        L68:
            boolean r6 = com.bumptech.glide.d.n(r3)
            if (r6 == 0) goto L71
            h93.l0 r6 = h93.l0.BRAZIL_LOCAL
            goto L73
        L71:
            h93.l0 r6 = h93.l0.DEBIT
        L73:
            return r6
        L74:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mx2.f.g(gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mx2.e
            if (r0 == 0) goto L13
            r0 = r7
            mx2.e r0 = (mx2.e) r0
            int r1 = r0.f210160w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f210160w = r1
            goto L18
        L13:
            mx2.e r0 = new mx2.e
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f210160w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L55
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            yhm.o.b(r7)
            n38.q r7 = n38.q.PENDING
            java.util.Set r7 = zhm.y0.b(r7)
            g48.r0 r2 = r6.f210161a
            w4l.h r5 = w4l.h.f294642c
            cxe.u r7 = r2.e(r7, r5)
            mv5.h r2 = new mv5.h
            r5 = 12
            r2.<init>(r5)
            jhi.b r7 = mo3.a.g(r7, r3, r2, r4)
            r0.f210160w = r4
            java.lang.Object r7 = vkm.q.z(r7, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            od0.i r7 = (od0.i) r7
            if (r7 == 0) goto L5e
            java.lang.Object r7 = r7.f224257a
            r3 = r7
            n38.a r3 = (n38.a) r3
        L5e:
            if (r3 == 0) goto L61
            goto L62
        L61:
            r4 = 0
        L62:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mx2.f.i(gim.c):java.lang.Object");
    }
}
