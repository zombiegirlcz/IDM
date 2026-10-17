package a82;

import e4k.m0;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2022w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f2022w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s((com.revolut.feature.apm.multibanco.impl.ui.home.area.b) this.f2022w, continuation, 0);
                sVar.v = ((Number) obj2).longValue();
                return sVar;
            case 1:
                s sVar2 = new s((a92.i) this.f2022w, continuation, 1);
                sVar2.v = ((Number) obj2).longValue();
                return sVar2;
            case 2:
                s sVar3 = new s((h07.j) this.f2022w, continuation, 2);
                sVar3.v = ((Number) obj2).longValue();
                return sVar3;
            case 3:
                s sVar4 = new s((jni.s) this.f2022w, continuation, 3);
                sVar4.v = ((Number) obj2).longValue();
                return sVar4;
            case 4:
                s sVar5 = new s((Function1) this.f2022w, continuation, 4);
                sVar5.v = ((Number) obj2).longValue();
                return sVar5;
            case 5:
                s sVar6 = new s((com.revolut.feature.apm.core.code.ui.a) this.f2022w, continuation, 5);
                sVar6.v = ((Number) obj2).longValue();
                return sVar6;
            case 6:
                return new s((kw.d) this.f2022w, this.v, continuation);
            case 7:
                s sVar7 = new s((pni.x) this.f2022w, continuation, 7);
                sVar7.v = ((Number) obj2).longValue();
                return sVar7;
            case 8:
                s sVar8 = new s((qa4.k) this.f2022w, continuation, 8);
                sVar8.v = ((Number) obj2).longValue();
                return sVar8;
            case 9:
                s sVar9 = new s((qni.i) this.f2022w, continuation, 9);
                sVar9.v = ((Number) obj2).longValue();
                return sVar9;
            case 10:
                s sVar10 = new s((com.revolut.feature.confirmation_code.ui.otp.a) this.f2022w, continuation, 10);
                sVar10.v = ((Number) obj2).longValue();
                return sVar10;
            case 11:
                s sVar11 = new s((sa2.r) this.f2022w, continuation, 11);
                sVar11.v = ((Number) obj2).longValue();
                return sVar11;
            case 12:
                s sVar12 = new s((tma.l) this.f2022w, continuation, 12);
                sVar12.v = ((Number) obj2).longValue();
                return sVar12;
            case 13:
                s sVar13 = new s((u4b.j) this.f2022w, continuation, 13);
                sVar13.v = ((Number) obj2).longValue();
                return sVar13;
            case 14:
                s sVar14 = new s((com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) this.f2022w, continuation, 14);
                sVar14.v = ((Number) obj2).longValue();
                return sVar14;
            case 15:
                s sVar15 = new s((wca.l) this.f2022w, continuation, 15);
                sVar15.v = ((kotlin.time.b) obj2).f187924a;
                return sVar15;
            case 16:
                s sVar16 = new s((wv2.n) this.f2022w, continuation, 16);
                sVar16.v = ((Number) obj2).longValue();
                return sVar16;
            case 17:
                s sVar17 = new s((com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a) this.f2022w, continuation, 17);
                sVar17.v = ((Number) obj2).longValue();
                return sVar17;
            default:
                s sVar18 = new s((xvf.m) this.f2022w, continuation, 18);
                sVar18.v = ((Number) obj2).longValue();
                return sVar18;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((s) create(new kotlin.time.b(((kotlin.time.b) obj2).f187924a), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = 0;
        int i2 = 17;
        int i3 = 22;
        int i5 = 1;
        switch (this.u) {
            case 0:
                long j2 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.apm.multibanco.impl.ui.home.area.b bVar = (com.revolut.feature.apm.multibanco.impl.ui.home.area.b) this.f2022w;
                bVar.H2(bVar.A, new r(j2, i));
                return Unit.f186387a;
            case 1:
                long j3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a92.i iVar = (a92.i) this.f2022w;
                iVar.H2(iVar.f2306q, new r(j3, i5));
                return Unit.f186387a;
            case 2:
                long j5 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h07.j jVar = (h07.j) this.f2022w;
                jVar.H2(jVar.f148201q, new r(j5, i2));
                return Unit.f186387a;
            case 3:
                long j16 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jni.s sVar = (jni.s) this.f2022w;
                sVar.H2(sVar.v, new r(j16, 19));
                return Unit.f186387a;
            case 4:
                long j22 = this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((Function1) this.f2022w).invoke(new Long(j22));
                return Unit.f186387a;
            case 5:
                long j42 = this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.apm.core.code.ui.a aVar7 = (com.revolut.feature.apm.core.code.ui.a) this.f2022w;
                aVar7.H2(aVar7.f61840s, new r(j42 / 1000, 20));
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kw.d dVar = (kw.d) this.f2022w;
                long j46 = this.v;
                if (!dVar.f190182g.compareAndSet(false, true)) {
                    throw new IllegalStateException("Video IMU artifact session is already finished or cancelled");
                }
                try {
                    dVar.a();
                    dVar.f = false;
                    return kw.a.a(dVar.f190179a, j46, dVar.f190180b, d0.d1(dVar.d), d0.d1(dVar.e), dVar.f190181c);
                } catch (Throwable th10) {
                    dVar.f = false;
                    dVar.a();
                    dVar.d.clear();
                    dVar.e.clear();
                    throw th10;
                }
            case 7:
                long j47 = this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pni.x xVar = (pni.x) this.f2022w;
                xVar.H2(xVar.f237829s, new nxc.a(j47, 3));
                return Unit.f186387a;
            case 8:
                long j57 = this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qa4.k kVar = (qa4.k) this.f2022w;
                kVar.H2(kVar.f243959s, new nxc.a(j57 / ((long) 1000), 4));
                return Unit.f186387a;
            case 9:
                long j58 = this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qni.i iVar2 = (qni.i) this.f2022w;
                iVar2.H2(iVar2.f247957p, new nxc.a(j58, 5));
                return Unit.f186387a;
            case 10:
                long j65 = this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.confirmation_code.ui.otp.a aVar13 = (com.revolut.feature.confirmation_code.ui.otp.a) this.f2022w;
                aVar13.H2(aVar13.v, new nxc.a(j65 / 1000, 8));
                return Unit.f186387a;
            case 11:
                long j69 = this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sa2.r rVar = (sa2.r) this.f2022w;
                rVar.H2(rVar.f261286r, new nxc.a(j69, 10));
                return Unit.f186387a;
            case 12:
                long j76 = this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j76);
                tma.l lVar = (tma.l) this.f2022w;
                lVar.H2(lVar.f272175q, new l2c.l(seconds, i3));
                return Unit.f186387a;
            case 13:
                long j85 = this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u4b.j jVar2 = (u4b.j) this.f2022w;
                jVar2.H2(jVar2.v, new nxc.a(j85, 14));
                return Unit.f186387a;
            case 14:
                long j100 = this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar18 = (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) this.f2022w;
                aVar18.H2(aVar18.J, new m0(j100, aVar18, 16));
                return Unit.f186387a;
            case 15:
                long j101 = this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wca.l lVar2 = (wca.l) this.f2022w;
                lVar2.H2(lVar2.f296378r, new nxc.a(j101, i2));
                return Unit.f186387a;
            case 16:
                long j102 = this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wv2.n nVar = (wv2.n) this.f2022w;
                nVar.H2(nVar.f300285q, new wk4.k((int) j102, i5));
                return Unit.f186387a;
            case 17:
                long j103 = this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a aVar22 = (com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a) this.f2022w;
                aVar22.H2(aVar22.u, new nxc.a(j103, i3));
                return Unit.f186387a;
            default:
                long j104 = this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xvf.m mVar = (xvf.m) this.f2022w;
                mVar.H2(mVar.f309257r, new nxc.a(j104, 23));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(kw.d dVar, long j2, Continuation continuation) {
        super(2, continuation);
        this.u = 6;
        this.f2022w = dVar;
        this.v = j2;
    }
}
