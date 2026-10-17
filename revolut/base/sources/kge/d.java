package kge;

import ael.k;
import androidx.room.RxRoom;
import boh.f;
import com.onfido.android.sdk.capture.internal.model.UploadedArtifact;
import com.revolut.feature.apm.core.api.ApmToggles$Breb;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreen;
import efm.d0;
import efm.r;
import ffk.t;
import h93.l;
import igm.o;
import im9.h;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import jli.g;
import klf.w1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import ml.m0;
import mx0.y9;
import nl.b0;
import nl.c0;
import nl.g1;
import nl.v;
import nl.w;
import om4.t3;
import p2b.j;
import pfm.z;
import qz9.u;
import r0e.i;
import rd0.e;
import retrofit2.HttpException;
import retrofit2.Response;
import sl.p;
import tx0.o1;
import vkm.q;
import vkm.q0;
import zc.m;
import zc.n;
import zc.y;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements o, pc.c, efm.d, cy8.a, n, e4i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f183974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f183975c;

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f183973a = i;
        this.f183974b = obj2;
        this.f183975c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static y49.h k(nel.n r16, java.util.List r17) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kge.d.k(nel.n, java.util.List):y49.h");
    }

    public static akg.n u(d dVar, String positionId, String portfolioId) {
        n9l.b ratesUpdatePeriod = n9l.b.SEC_3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(ratesUpdatePeriod, "ratesUpdatePeriod");
        akg.n nVarV = nim.a.v(((j) dVar.f183974b).a(portfolioId, null, ratesUpdatePeriod), new t3(positionId, 17));
        return nim.a.v(u0.m(nVarV, f.e(q.q(nim.a.v(nVarV, new p0g.b(6))), new p2b.d(dVar, 1))), new p0g.b(7));
    }

    public static akg.n w(d dVar, String ref2, String portfolioId) {
        n9l.b ratesUpdatePeriod = n9l.b.SEC_3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(ratesUpdatePeriod, "ratesUpdatePeriod");
        return nim.a.v(u0.m(e.b(((k) ((ybl.b) dVar.f183975c)).f(ref2)), nim.a.v(((j) dVar.f183974b).a(portfolioId, null, ratesUpdatePeriod), new t3(ref2, 16))), new p2b.d(dVar, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r6, gim.c r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f183974b
            eqj.d r0 = (eqj.d) r0
            boolean r1 = r7 instanceof knd.u0
            if (r1 == 0) goto L17
            r1 = r7
            knd.u0 r1 = (knd.u0) r1
            int r2 = r1.f186139x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f186139x = r2
            goto L1c
        L17:
            knd.u0 r1 = new knd.u0
            r1.<init>(r5, r7)
        L1c:
            java.lang.Object r7 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f186139x
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r6 = r1.u
            yhm.o.b(r7)
            goto L43
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r7)
            r1.u = r6
            r1.f186139x = r4
            java.lang.Object r7 = r0.c(r1)
            if (r7 != r2) goto L43
            return r2
        L43:
            lzi.j r7 = (lzi.j) r7
            if (r7 == 0) goto L50
            r1 = 0
            r2 = 3
            lzi.j r6 = lzi.j.a(r7, r1, r6, r2)
            r0.h(r6)
        L50:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kge.d.A(com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(java.lang.String r6, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r7, lzi.i r8, gim.c r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f183974b
            eqj.d r0 = (eqj.d) r0
            boolean r1 = r9 instanceof knd.v0
            if (r1 == 0) goto L17
            r1 = r9
            knd.v0 r1 = (knd.v0) r1
            int r2 = r1.z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.z = r2
            goto L1c
        L17:
            knd.v0 r1 = new knd.v0
            r1.<init>(r5, r9)
        L1c:
            java.lang.Object r9 = r1.f186147x
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.z
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            lzi.i r8 = r1.f186146w
            com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval r7 = r1.v
            java.lang.String r6 = r1.u
            yhm.o.b(r9)
            goto L4b
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            yhm.o.b(r9)
            r1.u = r6
            r1.v = r7
            r1.f186146w = r8
            r1.z = r4
            java.lang.Object r9 = r0.c(r1)
            if (r9 != r2) goto L4b
            return r2
        L4b:
            lzi.j r9 = (lzi.j) r9
            if (r9 == 0) goto L6d
            if (r8 != 0) goto L53
            lzi.i r8 = r9.f200980a
        L53:
            java.lang.String r9 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            java.lang.String r9 = "interval"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r9)
            lzi.j r9 = new lzi.j
            r1 = 0
            r9.<init>(r8, r7, r1)
            lzi.i r7 = lzi.i.CUSTOM
            if (r8 != r7) goto L6a
            r0.f(r6, r9)
        L6a:
            r0.h(r9)
        L6d:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kge.d.B(java.lang.String, com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval, lzi.i, gim.c):java.lang.Object");
    }

    @Override // zc.o
    public Object a() {
        return new rc.q(((uqi.b) this.f183974b).f282191a, (y) ((m) this.f183975c).a(), new nd.m(8));
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f183973a) {
            case 13:
                UploadedArtifact uploadArtifact = (UploadedArtifact) obj2;
                Intrinsics.checkNotNullParameter(uploadArtifact, "uploadArtifact");
                c0 c0Var = (c0) this.f183974b;
                p pVar = (p) this.f183975c;
                Completable completableA = c0Var.e.a(pVar, uploadArtifact.getId());
                b0 b0Var = new b0(pVar);
                completableA.getClass();
                ogm.a aVar = new ogm.a(completableA, b0Var, 2);
                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorComplete(...)");
                mgm.b bVarD = new ogm.e(new v(c0Var, 0), 2).d(Observable.just(w.f216959a));
                Intrinsics.checkNotNullExpressionValue(bVarD, "andThen(...)");
                return aVar.d(bVarD);
            default:
                m0 it8 = (m0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                g1 g1Var = (g1) this.f183974b;
                sl.f fVar = g1Var.f216911b;
                sl.v task = (sl.v) this.f183975c;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(task, "task");
                f0 uploadIds = f0.f322471a;
                Intrinsics.checkNotNullParameter(task, "task");
                Intrinsics.checkNotNullParameter(uploadIds, "uploadIds");
                Completable completableC = fVar.c(task, uploadIds);
                kl.b0 b0Var2 = new kl.b0(g1Var, 24);
                he2.b bVar = kgm.j.d;
                kgm.b bVar2 = kgm.j.f184027c;
                completableC.getClass();
                return new ogm.m(completableC, b0Var2, bVar, bVar2, bVar2).d(Observable.just(Unit.f186387a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof sck.b
            if (r0 == 0) goto L13
            r0 = r8
            sck.b r0 = (sck.b) r0
            int r1 = r0.f261758w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261758w = r1
            goto L18
        L13:
            sck.b r0 = new sck.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261758w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L58
        L36:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f183974b
            uck.f r8 = (uck.f) r8
            r0.f261758w = r4
            r8.getClass()
            uck.c r2 = new uck.c
            r5 = 0
            r2.<init>(r8, r7, r5, r4)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L53
            goto L55
        L53:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L55:
            if (r7 != r1) goto L58
            goto L68
        L58:
            java.lang.Object r7 = r6.f183975c
            ffk.t r7 = (ffk.t) r7
            rfm.f0 r7 = r7.y()
            r0.f261758w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kge.d.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a r13, com.revolut.feature.wealth.api.navigation.models.DepositInfo r14, kotlin.jvm.functions.Function1 r15, gim.c r16) {
        /*
            r12 = this;
            r0 = r16
            boolean r1 = r0 instanceof n9h.a
            if (r1 == 0) goto L15
            r1 = r0
            n9h.a r1 = (n9h.a) r1
            int r2 = r1.f213648y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f213648y = r2
            goto L1a
        L15:
            n9h.a r1 = new n9h.a
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.f213646w
            fim.a r9 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f213648y
            r8 = 2
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L34
            if (r2 != r8) goto L2c
            yhm.o.b(r0)
            return r0
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            com.revolut.feature.wealth.api.navigation.models.DepositInfo r2 = r1.v
            com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a r3 = r1.u
            yhm.o.b(r0)
            r5 = r2
            r2 = r3
            goto L51
        L3e:
            yhm.o.b(r0)
            r1.u = r13
            r1.v = r14
            r1.f213648y = r3
            java.lang.Object r3 = r15.invoke(r1)
            if (r3 != r9) goto L4e
            goto L7d
        L4e:
            r2 = r13
            r5 = r14
            r0 = r3
        L51:
            nii.m0 r0 = (nii.m0) r0
            al6.c r10 = new al6.c
            r3 = 28
            r10.<init>(r3)
            iah.i r11 = new iah.i
            r3 = 1
            r11.<init>(r0, r3)
            n9h.b r6 = new n9h.b
            r7 = 1
            r3 = r2
            r2 = r6
            r6 = 0
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r1.u = r6
            r1.v = r6
            r1.f213648y = r8
            r6 = r2
            r2 = r3
            r3 = 0
            r8 = 1
            r7 = r1
            r4 = r10
            r5 = r11
            java.lang.Object r0 = n14.k.V(r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r9) goto L7e
        L7d:
            return r9
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kge.d.c(com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a, com.revolut.feature.wealth.api.navigation.models.DepositInfo, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(com.revolut.feature.slot_manager.api.model.SlotContext r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rmg.b
            if (r0 == 0) goto L13
            r0 = r6
            rmg.b r0 = (rmg.b) r0
            int r1 = r0.f255313w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255313w = r1
            goto L18
        L13:
            rmg.b r0 = new rmg.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f255313w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f183974b
            skd.i r6 = (skd.i) r6
            akg.n r5 = r6.b(r5)
            q87.q r6 = new q87.q
            r2 = 3
            r6.<init>(r5, r2)
            r0.f255313w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r5 = r6.getContent()
            java.util.List r5 = (java.util.List) r5
            r6 = 0
            if (r5 == 0) goto L72
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L5a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r5.next()
            boolean r1 = r0 instanceof com.revolut.feature.slot_manager.api.model.prompt.SlotAdoptionJourneyPrompt
            if (r1 == 0) goto L5a
            goto L6a
        L69:
            r0 = r6
        L6a:
            boolean r5 = r0 instanceof com.revolut.feature.slot_manager.api.model.prompt.SlotAdoptionJourneyPrompt
            if (r5 != 0) goto L6f
            goto L70
        L6f:
            r6 = r0
        L70:
            com.revolut.feature.slot_manager.api.model.prompt.SlotAdoptionJourneyPrompt r6 = (com.revolut.feature.slot_manager.api.model.prompt.SlotAdoptionJourneyPrompt) r6
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kge.d.d(com.revolut.feature.slot_manager.api.model.SlotContext, gim.c):java.lang.Object");
    }

    @Override // e4i.a
    public l4i.a e() {
        return (l4i.a) this.f183975c;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vm3.a h(lm3.a r5) {
        /*
            r4 = this;
            java.lang.String r0 = "domainState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            vm3.b r0 = r5.f196865b
            java.lang.String r1 = r5.e
            int[] r2 = om3.c.f226509a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L2f
            r2 = 2
            if (r0 != r2) goto L29
            java.lang.Object r0 = r4.f183975c
            zzl.b r0 = (zzl.b) r0
            java.lang.String r2 = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$"
            zzl.c r0 = (zzl.c) r0
            boolean r0 = r0.a(r2, r1)
            if (r0 == 0) goto L27
            goto L4c
        L27:
            r1 = r3
            goto L4c
        L29:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L2f:
            vm3.c r0 = r5.f196866c
            if (r0 == 0) goto L3e
            int r0 = r0.f290525b
            java.lang.String r1 = r5.d
            java.lang.String r2 = "+"
            java.lang.String r0 = j6.a.l(r0, r2, r1)
            goto L3f
        L3e:
            r0 = r3
        L3f:
            if (r0 == 0) goto L27
            java.lang.Object r1 = r4.f183974b
            z80.b r1 = (z80.b) r1
            boolean r1 = z80.b.l(r1, r0)
            if (r1 == 0) goto L27
            r1 = r0
        L4c:
            if (r1 == 0) goto L59
            vm3.b r0 = r5.f196865b
            java.lang.String r2 = r5.f
            boolean r5 = r5.f196867g
            vm3.a r3 = new vm3.a
            r3.<init>(r2, r1, r0, r5)
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kge.d.h(lm3.a):vm3.a");
    }

    @Override // cy8.a
    public Object i(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        String str = (String) this.f183974b;
        if (str == null || !a0.H(url2, str, false)) {
            return null;
        }
        return url2;
    }

    public Object j(KProperty property) {
        Object obj2;
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj3 = this.f183975c;
        if (obj3 != null) {
            return obj3;
        }
        synchronized (this) {
            try {
                if (this.f183975c == null) {
                    this.f183975c = ((Function0) this.f183974b).invoke();
                }
                obj2 = this.f183975c;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return obj2;
    }

    public l l(Response pinResponse) {
        Intrinsics.checkNotNullParameter(pinResponse, "pinResponse");
        Pair pairX = x(pinResponse);
        r6l.b bVar = (r6l.b) pairX.f186385a;
        String token = (String) pairX.f186386b;
        k6l.b bVar2 = (k6l.b) this.f183975c;
        String pin = bVar.getPin();
        boolean skipCache = bVar.getSkipCache();
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(token, "token");
        return new l(g.f(new String(bVar2.a(pin, token), Charsets.UTF_8)), skipCache);
    }

    @Override // cy8.a
    public /* bridge */ /* synthetic */ av1.c m() {
        return tx8.b.f275344c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r4.i(r2, r8, r5, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof rmg.c
            if (r0 == 0) goto L13
            r0 = r8
            rmg.c r0 = (rmg.c) r0
            int r1 = r0.f255315x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255315x = r1
            goto L18
        L13:
            rmg.c r0 = new rmg.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f255315x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L64
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            com.revolut.feature.slot_manager.api.model.SlotContext r2 = r0.u
            yhm.o.b(r8)
            goto L4e
        L38:
            yhm.o.b(r8)
            java.lang.Object r8 = r7.f183975c
            om4.d0 r8 = (om4.d0) r8
            com.revolut.feature.slot_manager.api.model.SlotContext r2 = r8.h()
            r0.u = r2
            r0.f255315x = r4
            java.lang.Object r8 = r7.d(r2, r0)
            if (r8 != r1) goto L4e
            goto L63
        L4e:
            com.revolut.feature.slot_manager.api.model.prompt.SlotAdoptionJourneyPrompt r8 = (com.revolut.feature.slot_manager.api.model.prompt.SlotAdoptionJourneyPrompt) r8
            if (r8 == 0) goto L67
            java.lang.Object r4 = r7.f183974b
            skd.i r4 = (skd.i) r4
            akd.a r5 = akd.a.VIEW
            r6 = 0
            r0.u = r6
            r0.f255315x = r3
            java.lang.Object r8 = r4.i(r2, r8, r5, r0)
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L67:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kge.d.n(gim.c):java.lang.Object");
    }

    public b o() {
        r rVarSubscribeOn = RxRoom.createObservable(((dge.b) this.f183974b).f114648a, false, new String[]{"account_notification_info"}, new dg3.d(1)).subscribeOn(hhm.f.f152431c);
        Intrinsics.checkNotNullExpressionValue(rVarSubscribeOn, "subscribeOn(...)");
        return new b(e.b(rVarSubscribeOn), 0);
    }

    @Override // efm.d
    public void onComplete() {
        efm.d dVar = (efm.d) this.f183974b;
        try {
            ((rof.e) ((pfm.l) this.f183975c).f235743c).accept(null);
            dVar.onComplete();
        } catch (Throwable th10) {
            m70.a.u(th10);
            dVar.onError(th10);
        }
    }

    @Override // efm.d
    public void onError(Throwable th10) {
        try {
            ((rof.e) ((pfm.l) this.f183975c).f235743c).accept(th10);
        } catch (Throwable th11) {
            m70.a.u(th11);
            th10 = new CompositeException(th10, th11);
        }
        ((efm.d) this.f183974b).onError(th10);
    }

    @Override // efm.d
    public void onSubscribe(ifm.c cVar) {
        ((efm.d) this.f183974b).onSubscribe(cVar);
    }

    public akg.n p() {
        return nim.a.v(q(new u(8)), new i(9));
    }

    public vkm.y q(Function2 function2) {
        r rVarE = ((ang.f) this.f183975c).d.e();
        ty1.e eVar = (ty1.e) ((uw1.e) this.f183974b);
        ty1.b bVar = (ty1.b) eVar.f275460a;
        bVar.getClass();
        z zVarC = bVar.c(yoj.c.APM_BIZUM);
        ufm.i iVarA = bVar.a();
        ufm.c cVarD = bVar.d(uw1.f.BREB, ApmToggles$Breb.f61793c);
        ufm.c cVarE = bVar.e();
        z zVarC2 = bVar.c(yoj.c.APM_MULTIBANCO);
        ufm.c cVarF = bVar.f(uw1.f.PAY_ID);
        z zVarC3 = bVar.c(yoj.c.PIX_BRL);
        ufm.c cVarG = bVar.g();
        int i = 2;
        ufm.c cVar = new ufm.c(new ty1.d(eVar, 1), i);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        ufm.i iVar = new ufm.i(bVar.c(yoj.c.APM_WERO), new o1(new ty1.a(bVar, i), 29), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        rfm.f0 f0VarE = d0.E(zhm.v.k(zVarC, iVarA, cVarD, cVarE, zVarC2, cVarF, zVarC3, cVarG, cVar, iVar), new ty1.c(new tx.f(16), 5));
        Intrinsics.checkNotNullExpressionValue(f0VarE, "zip(...)");
        r rVarX = f0VarE.x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        r map = te0.w.l(rVarE, rVarX).map(new qza.a(10, new r10.b(this, function2, 13)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Continuation continuation = null;
        return new vkm.y(new w1(i, 18, continuation), new vkm.y(e.b(map), new qtb.o(3, 4, continuation)));
    }

    @Override // cy8.a
    public String r(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        String string = ((f80.b) ((f80.a) this.f183975c)).f(a0.F(url2, "#", "?", false)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public t38.e s() {
        return new t38.e(((jt0.b) this.f183974b).A0(true), 24, (SharedFlow) ((klf.g1) this.f183975c).f.getValue(), new qlf.a(3, null));
    }

    public Flow t(ProductAccountId accountId, ProductId productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        String str = accountId.f89729a;
        Continuation continuation = null;
        if (a0.H(str, "Total-", false)) {
            return new go.g(null, 2);
        }
        String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(productId.getId(), "-", str);
        r rVarSubscribeOn = RxRoom.createObservable(((dge.b) this.f183974b).f114648a, false, new String[]{"account_notification_info"}, new avj.o(productId.getId(), str, 8)).subscribeOn(hhm.f.f152431c);
        Intrinsics.checkNotNullExpressionValue(rVarSubscribeOn, "subscribeOn(...)");
        return new vkm.y(new k0g.b(this, strO, continuation, 23), new q0(new b(e.b(rVarSubscribeOn), 1), new h(this, strO, continuation, 13), 1));
    }

    public akg.n v(String portfolioId, xi0.b bVar, n9l.b ratesUpdatePeriod) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(ratesUpdatePeriod, "ratesUpdatePeriod");
        akg.n nVarV = nim.a.v(((j) this.f183974b).a(portfolioId, bVar, ratesUpdatePeriod), new p0g.b(8));
        return nim.a.v(u0.m(f.e(q.q(nim.a.v(nVarV, new p0g.b(9))), new p2b.d(this, 2)), nVarV), new p0g.b(this, 10));
    }

    public Pair x(Response response) {
        if (!response.isSuccessful()) {
            throw new HttpException(response);
        }
        Object objBody = response.body();
        if (objBody == null) {
            throw new IllegalStateException("response's body is null");
        }
        String basic = response.raw().f226087a.a("Authorization");
        if (basic == null) {
            throw new IllegalStateException("request doesn't contain auth header");
        }
        yf.c cVar = (yf.c) this.f183974b;
        Intrinsics.checkNotNullParameter(basic, "basic");
        byte[] bArrA = ((tl0.a) cVar.b).a(kotlin.text.d0.e0(basic, "Basic "));
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        String str = new String(bArrA, UTF_8);
        String id10 = kotlin.text.d0.z0(str, ":", "");
        String rawValue = kotlin.text.d0.v0(str, ":", "");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        return new Pair(objBody, rawValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(yld.d r8, gim.c r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f183974b
            eqj.d r0 = (eqj.d) r0
            boolean r1 = r9 instanceof knd.s0
            if (r1 == 0) goto L17
            r1 = r9
            knd.s0 r1 = (knd.s0) r1
            int r2 = r1.f186130x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f186130x = r2
            goto L1c
        L17:
            knd.s0 r1 = new knd.s0
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f186130x
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L37
            if (r3 != r5) goto L2f
            yld.d r8 = r1.u
            yhm.o.b(r9)
            goto L95
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)
            r1.u = r8
            r1.f186130x = r5
            jqj.h r9 = r0.f128475a
            ne0.d r3 = r9.f177737b
            java.lang.String r5 = "KEY_FIXED_PERIOD"
            java.lang.Object r5 = r3.get(r5)
            lzi.j r5 = (lzi.j) r5
            if (r5 == 0) goto L4f
            r9.b(r5)
        L4f:
            if (r5 == 0) goto L54
            kotlin.Unit r9 = kotlin.Unit.f186387a
            goto L8d
        L54:
            java.lang.String r5 = "KEY_CYCLE"
            java.lang.Object r3 = r3.get(r5)
            lzi.h r3 = (lzi.h) r3
            if (r3 != 0) goto L70
            ue0.c r3 = r9.f177736a
            java.lang.Class<kqj.c> r6 = kqj.c.class
            java.lang.Object r3 = j6.a.k(r6, r3, r5)
            kqj.c r3 = (kqj.c) r3
            if (r3 == 0) goto L6f
            lzi.h r3 = kqj.b.c(r3)
            goto L70
        L6f:
            r3 = r4
        L70:
            if (r3 == 0) goto L8b
            x4l.c r5 = r9.f
            kotlin.Unit r6 = kotlin.Unit.f186387a
            kzi.a r9 = r9.d
            gqj.c r9 = (gqj.c) r9
            lzi.j r9 = r9.d(r4, r3)
            java.lang.Object r9 = r5.f(r6, r9, r1)
            if (r9 != r2) goto L85
            goto L86
        L85:
            r9 = r6
        L86:
            if (r9 != r2) goto L89
            goto L8d
        L89:
            r9 = r6
            goto L8d
        L8b:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L8d:
            if (r9 != r2) goto L90
            goto L92
        L90:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L92:
            if (r9 != r2) goto L95
            return r2
        L95:
            java.lang.String r8 = r8.toString()
            r0.f(r8, r4)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kge.d.y(yld.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(java.lang.String r18, com.revolut.feature.categorisation.api.model.PeriodPreferenceType r19, org.joda.time.DateTime r20, yld.d r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kge.d.z(java.lang.String, com.revolut.feature.categorisation.api.model.PeriodPreferenceType, org.joda.time.DateTime, yld.d, gim.c):java.lang.Object");
    }

    @Override // pc.c
    public Object zza() {
        return new oc.i(((oc.f) ((kl.b0) this.f183974b).f185144b).f224008a, (oc.j) ((pc.c) this.f183975c).zza());
    }

    public d(uqi.b bVar, m mVar, dfm.c cVar) {
        this.f183973a = 25;
        this.f183974b = bVar;
        this.f183975c = mVar;
    }

    public d(String str, f80.a uriHelper) {
        this.f183973a = 23;
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f183974b = str;
        this.f183975c = uriHelper;
    }

    public d(hyk.a onboardingRepository, ybl.d portfolioInteractor) {
        this.f183973a = 6;
        Intrinsics.checkNotNullParameter(onboardingRepository, "onboardingRepository");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f183974b = onboardingRepository;
        this.f183975c = portfolioInteractor;
    }

    public d(Function0 initializer) {
        this.f183973a = 15;
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f183974b = initializer;
    }

    public d(z80.b phoneToolsProvider, zzl.b regexMatcher) {
        this.f183973a = 17;
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f183974b = phoneToolsProvider;
        this.f183975c = regexMatcher;
    }

    public d(jpc.e callRequestTicketsInteractor, rf3.j callRequestAvailabilityProvider) {
        this.f183973a = 7;
        Intrinsics.checkNotNullParameter(callRequestTicketsInteractor, "callRequestTicketsInteractor");
        Intrinsics.checkNotNullParameter(callRequestAvailabilityProvider, "callRequestAvailabilityProvider");
        this.f183974b = callRequestTicketsInteractor;
        this.f183975c = callRequestAvailabilityProvider;
    }

    public d(lx1.c apmContactsFindInteractor, z80.b phoneToolsProvider) {
        this.f183973a = 28;
        Intrinsics.checkNotNullParameter(apmContactsFindInteractor, "apmContactsFindInteractor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f183974b = apmContactsFindInteractor;
        this.f183975c = phoneToolsProvider;
    }

    public d(uck.f repository, t pricingPlanInteractor) {
        this.f183973a = 29;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f183974b = repository;
        this.f183975c = pricingPlanInteractor;
    }

    public d(vdf.d assetFormatter, l4i.a amountConverter) {
        this.f183973a = 27;
        Intrinsics.checkNotNullParameter(assetFormatter, "assetFormatter");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f183974b = assetFormatter;
        this.f183975c = amountConverter;
    }

    public d(skd.i slotManagerInteractor, om4.d0 mainApplicationSlotContextProvider) {
        this.f183973a = 26;
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(mainApplicationSlotContextProvider, "mainApplicationSlotContextProvider");
        this.f183974b = slotManagerInteractor;
        this.f183975c = mainApplicationSlotContextProvider;
    }

    public d(iz9.c transactionsInteractor, iz9.a moneyRequestsInteractor) {
        this.f183973a = 2;
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(moneyRequestsInteractor, "moneyRequestsInteractor");
        this.f183974b = transactionsInteractor;
        this.f183975c = moneyRequestsInteractor;
    }

    public d(qj8.l juniorWorkflowBasedProfileRepository, CoroutineScope coroutineScope) {
        this.f183973a = 12;
        Intrinsics.checkNotNullParameter(juniorWorkflowBasedProfileRepository, "juniorWorkflowBasedProfileRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f183974b = juniorWorkflowBasedProfileRepository;
        this.f183975c = coroutineScope;
    }

    public d(sf0.h serverErrorParser, v60.e serverErrorsProvider) {
        this.f183973a = 21;
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f183974b = serverErrorParser;
        this.f183975c = serverErrorsProvider;
    }

    public d(tzg.k portfolioDepositInteractor, oah.d input) {
        this.f183973a = 11;
        Intrinsics.checkNotNullParameter(portfolioDepositInteractor, "portfolioDepositInteractor");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f183974b = portfolioDepositInteractor;
        this.f183975c = input;
    }

    public d(yf.c tokenEncoder, k6l.b cardDataDecoder) {
        this.f183973a = 3;
        Intrinsics.checkNotNullParameter(tokenEncoder, "tokenEncoder");
        Intrinsics.checkNotNullParameter(cardDataDecoder, "cardDataDecoder");
        this.f183974b = tokenEncoder;
        this.f183975c = cardDataDecoder;
    }

    public d(jt0.b commonHeaderProvider, klf.g1 instalmentsDataSource) {
        this.f183973a = 22;
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(instalmentsDataSource, "instalmentsDataSource");
        this.f183974b = commonHeaderProvider;
        this.f183975c = instalmentsDataSource;
    }

    public d(kwg.l complexAnalyticsInteractor, l80.e dateProvider, x8h.k displayCurrencyInteractor) {
        this.f183973a = 5;
        Intrinsics.checkNotNullParameter(complexAnalyticsInteractor, "complexAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        this.f183974b = complexAnalyticsInteractor;
        this.f183975c = displayCurrencyInteractor;
    }

    public d(dge.b accountNotificationDao, ne0.d memoryCache) {
        this.f183973a = 0;
        Intrinsics.checkNotNullParameter(accountNotificationDao, "accountNotificationDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f183974b = accountNotificationDao;
        this.f183975c = memoryCache;
    }

    public d(yf.c supportInteractor, mt8.d kycInteractor, xoj.a featuresInteractor) {
        this.f183973a = 4;
        Intrinsics.checkNotNullParameter(supportInteractor, "supportInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f183974b = kycInteractor;
        this.f183975c = featuresInteractor;
    }

    public d(eqj.d analyticsCustomPeriodInteractor, kzi.a analyticsPeriodIntervalMapper) {
        this.f183973a = 1;
        Intrinsics.checkNotNullParameter(analyticsCustomPeriodInteractor, "analyticsCustomPeriodInteractor");
        Intrinsics.checkNotNullParameter(analyticsPeriodIntervalMapper, "analyticsPeriodIntervalMapper");
        this.f183974b = analyticsCustomPeriodInteractor;
        this.f183975c = analyticsPeriodIntervalMapper;
    }

    public d(j cfdShareablePerformanceInteractor, ybl.b instrumentTickerInteractor) {
        this.f183973a = 19;
        Intrinsics.checkNotNullParameter(cfdShareablePerformanceInteractor, "cfdShareablePerformanceInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f183974b = cfdShareablePerformanceInteractor;
        this.f183975c = instrumentTickerInteractor;
    }

    public d(uw1.e apmProductProvider, ang.f userInteractor) {
        this.f183973a = 24;
        Intrinsics.checkNotNullParameter(apmProductProvider, "apmProductProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f183974b = apmProductProvider;
        this.f183975c = userInteractor;
    }

    public d(pfm.l lVar, efm.d dVar) {
        this.f183973a = 20;
        this.f183975c = lVar;
        this.f183974b = dVar;
    }

    public d(InvestSettingsScreen investSettingsScreen) {
        this.f183973a = 9;
        this.f183974b = investSettingsScreen.f89892a0;
        this.f183975c = investSettingsScreen.Z;
    }

    public d(ou2.d dVar) {
        this.f183973a = 18;
        this.f183974b = dVar;
    }

    public d(com.revolut.core.ui_kit.views.o hostView, y9 embeddedContainerView) {
        this.f183973a = 10;
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Intrinsics.checkNotNullParameter(embeddedContainerView, "embeddedContainerView");
        this.f183974b = hostView;
        this.f183975c = embeddedContainerView;
    }
}
