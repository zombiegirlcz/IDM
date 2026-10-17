package pfk;

import bka.c1;
import bka.e1;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams;
import com.revolut.feature.incentive_reward.impl.model.lotteries.LotteryParams;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import klf.j1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import sdl.d1;
import sdl.r1;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f235677w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f235678x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.v = obj2;
    }

    private final Object b(Object obj2) {
        Object c1454c;
        UUID uuid = (UUID) this.f235677w;
        cfl.f0 f0Var = (cfl.f0) this.f235678x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ue0.c cVar = ((scl.j) this.v).f261773b;
        String strA = scl.i.a(scl.j.Companion, uuid);
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        if (f0Var instanceof cfl.w) {
            cfl.w wVar = (cfl.w) f0Var;
            c1454c = new d1.a(wVar.f23751a, wVar.f23752b.getF105337a());
        } else if (f0Var instanceof cfl.y) {
            cfl.y yVar = (cfl.y) f0Var;
            c1454c = new d1.c.a(yVar.f23756a, r1.g(yVar.f23757b), r1.e(yVar.f23758c), r1.f(yVar.d));
        } else if (f0Var instanceof cfl.b0) {
            cfl.b0 b0Var = (cfl.b0) f0Var;
            c1454c = new d1.c.b(b0Var.f23729a, r1.g(b0Var.f23730b), r1.e(b0Var.f23731c), r1.f(b0Var.d));
        } else if (f0Var instanceof cfl.e0) {
            cfl.e0 e0Var = (cfl.e0) f0Var;
            c1454c = new d1.c.d(e0Var.f23738a, r1.g(e0Var.f23739b), r1.e(e0Var.f23740c), r1.f(e0Var.d));
        } else {
            if (!(f0Var instanceof cfl.d0)) {
                throw new NoWhenBranchMatchedException();
            }
            cfl.d0 d0Var = (cfl.d0) f0Var;
            c1454c = new d1.c.C1454c(d0Var.f23735a, r1.g(d0Var.f23736b), r1.e(d0Var.f23737c), r1.f(d0Var.d));
        }
        cVar.G(c1454c, strA, wim.z.d(kotlin.jvm.internal.o0.b(d1.class)));
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        nka.k kVar;
        int i;
        aka.k kVar2;
        mka.f fVar;
        nka.q qVar = (nka.q) this.f235677w;
        aka.a article = (aka.a) this.f235678x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ska.k kVar3 = (ska.k) this.v;
        lka.d dVar = kVar3.d;
        Intrinsics.checkNotNullParameter(article, "article");
        String id10 = article.getId();
        List listP = article.p();
        List<aka.g> listO = article.o();
        ArrayList arrayList = new ArrayList(zhm.w.t(listO, 10));
        for (aka.g gVar : listO) {
            arrayList.add(new nka.g(gVar.f5751a, gVar.f5752b, gVar.f5753c));
        }
        List<bka.a> listQ = article.q();
        ArrayList arrayList2 = new ArrayList(zhm.w.t(listQ, 10));
        for (bka.a item : listQ) {
            e84.e eVar = dVar.f196344a;
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof bka.k) {
                fVar = (mka.a) eVar.f123569a;
            } else if (item instanceof bka.r) {
                fVar = (mka.b) eVar.f123570b;
            } else if (item instanceof bka.b0) {
                fVar = (mka.d) eVar.d;
            } else if (item instanceof bka.l0) {
                fVar = (mka.e) eVar.e;
            } else if (item instanceof bka.t0) {
                fVar = (mka.g) eVar.f;
            } else if (item instanceof c1) {
                fVar = (mka.h) eVar.f123572g;
            } else if (item instanceof e1) {
                fVar = (mka.j) eVar.i;
            } else if (item instanceof bka.s) {
                fVar = (mka.c) eVar.f123571c;
            } else {
                if (!(item instanceof bka.d1)) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar = (mka.i) eVar.f123573h;
            }
            arrayList2.add(fVar.a(item));
        }
        boolean z = article instanceof aka.l;
        aka.l lVar = z ? (aka.l) article : null;
        if (lVar != null) {
            aka.j jVar = lVar.f5761b;
            kVar = new nka.k(jVar.f5757a, jVar.f5758b);
        } else {
            kVar = null;
        }
        aka.l lVar2 = z ? (aka.l) article : null;
        nka.n nVar = (lVar2 == null || (kVar2 = lVar2.f5762c) == null) ? null : new nka.n(kVar2.f5759a);
        aka.l lVar3 = z ? (aka.l) article : null;
        ArrayList arrayListB = lVar3 != null ? dVar.b(lVar3.f5763g) : null;
        aka.l lVar4 = z ? (aka.l) article : null;
        ArrayList arrayListB2 = lVar4 != null ? dVar.b(lVar4.f5764h) : null;
        aka.l lVar5 = z ? (aka.l) article : null;
        ArrayList arrayListB3 = lVar5 != null ? dVar.b(lVar5.i) : null;
        if (article instanceof aka.i) {
            i = 1;
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        kVar3.f263798c.G(new nka.o(id10, i, nVar, kVar, arrayList2, arrayList, listP, arrayListB, arrayListB2, arrayListB3), kVar3.e.a(qVar), wim.z.d(kotlin.jvm.internal.o0.b(nka.o.class)));
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                q qVar = new q((s) this.v, (Continuation) obj4, 0);
                qVar.f235677w = (l) obj2;
                qVar.f235678x = (lha.j) obj3;
                return qVar.invokeSuspend(Unit.f186387a);
            case 1:
                q qVar2 = new q((s) this.v, (Continuation) obj4, 1);
                qVar2.f235677w = (String) obj2;
                qVar2.f235678x = (lha.p) obj3;
                return qVar2.invokeSuspend(Unit.f186387a);
            case 2:
                q qVar3 = new q((s) this.v, (Continuation) obj4, 2);
                qVar3.f235677w = (String) obj2;
                qVar3.f235678x = (lha.n) obj3;
                return qVar3.invokeSuspend(Unit.f186387a);
            case 3:
                q qVar4 = new q((e0) this.v, (Continuation) obj4, 3);
                qVar4.f235677w = (String) obj2;
                qVar4.f235678x = (hha.e0) obj3;
                return qVar4.invokeSuspend(Unit.f186387a);
            case 4:
                q qVar5 = new q((p0) this.v, (Continuation) obj4, 4);
                qVar5.f235677w = (v0) obj2;
                qVar5.f235678x = (hha.q0) obj3;
                return qVar5.invokeSuspend(Unit.f186387a);
            case 5:
                q qVar6 = new q((phc.j) this.v, (Continuation) obj4, 5);
                qVar6.f235677w = (cgc.o) obj2;
                qVar6.f235678x = (List) obj3;
                return qVar6.invokeSuspend(Unit.f186387a);
            case 6:
                q qVar7 = new q((bhl.a) this.v, (Continuation) obj4, 6);
                qVar7.f235677w = (phl.k) obj2;
                qVar7.f235678x = (iel.i) obj3;
                return qVar7.invokeSuspend(Unit.f186387a);
            case 7:
                q qVar8 = new q((plc.b) this.v, (Continuation) obj4, 7);
                qVar8.f235677w = (String) obj2;
                qVar8.f235678x = (List) obj3;
                return qVar8.invokeSuspend(Unit.f186387a);
            case 8:
                q qVar9 = new q((frk.b) this.v, (Continuation) obj4, 8);
                qVar9.f235677w = (String) obj2;
                qVar9.f235678x = (RiskMetrics) obj3;
                return qVar9.invokeSuspend(Unit.f186387a);
            case 9:
                q qVar10 = new q((plc.f) this.v, (Continuation) obj4, 9);
                qVar10.f235677w = (String) obj2;
                qVar10.f235678x = (alc.n) obj3;
                return qVar10.invokeSuspend(Unit.f186387a);
            case 10:
                q qVar11 = new q((prl.f) this.v, (Continuation) obj4, 10);
                qVar11.f235677w = (InvestOrdersParams) obj2;
                qVar11.f235678x = (List) obj3;
                return qVar11.invokeSuspend(Unit.f186387a);
            case 11:
                q qVar12 = new q((pti.e) this.v, (Continuation) obj4, 11);
                qVar12.f235677w = (String) obj2;
                qVar12.f235678x = (AsftTerminal) obj3;
                return qVar12.invokeSuspend(Unit.f186387a);
            case 12:
                q qVar13 = new q((pti.u) this.v, (Continuation) obj4, 12);
                qVar13.f235677w = (String) obj2;
                qVar13.f235678x = (AsftPass) obj3;
                return qVar13.invokeSuspend(Unit.f186387a);
            case 13:
                q qVar14 = new q((ApmQuoteDirection) this.v, (Continuation) obj4, 13);
                qVar14.f235677w = (ApmQuote) obj2;
                qVar14.f235678x = (s02.a) obj3;
                return qVar14.invokeSuspend(Unit.f186387a);
            case 14:
                q qVar15 = new q((qf7.i) this.v, (Continuation) obj4, 14);
                qVar15.f235677w = (IncentiveRewardDetailsParams) obj2;
                qVar15.f235678x = (hf7.c) obj3;
                return qVar15.invokeSuspend(Unit.f186387a);
            case 15:
                q qVar16 = new q((qf7.i) this.v, (Continuation) obj4, 15);
                qVar16.f235677w = (Map) obj2;
                qVar16.f235678x = (gf7.o) obj3;
                return qVar16.invokeSuspend(Unit.f186387a);
            case 16:
                q qVar17 = new q((qf7.i) this.v, (Continuation) obj4, 16);
                qVar17.f235677w = (LotteryParams) obj2;
                qVar17.f235678x = (com.revolut.feature.incentive_reward.impl.model.lotteries.b) obj3;
                return qVar17.invokeSuspend(Unit.f186387a);
            case 17:
                q qVar18 = new q((qf7.i) this.v, (Continuation) obj4, 17);
                qVar18.f235677w = (LotteryParams) obj2;
                qVar18.f235678x = (kf7.r) obj3;
                return qVar18.invokeSuspend(Unit.f186387a);
            case 18:
                q qVar19 = new q((qj8.j) this.v, (Continuation) obj4, 18);
                qVar19.f235677w = (qj8.a) obj2;
                qVar19.f235678x = (com.revolut.feature.junior_profile.api.models.a) obj3;
                return qVar19.invokeSuspend(Unit.f186387a);
            case 19:
                q qVar20 = new q((qj8.l) this.v, (Continuation) obj4, 19);
                qVar20.f235677w = (String) obj2;
                qVar20.f235678x = (List) obj3;
                return qVar20.invokeSuspend(Unit.f186387a);
            case 20:
                q qVar21 = new q((zbj.y) this.v, (Continuation) obj4, 20);
                qVar21.f235677w = (Data) obj2;
                qVar21.f235678x = (od0.i) obj3;
                return qVar21.invokeSuspend(Unit.f186387a);
            case 21:
                q qVar22 = new q((rdb.k) this.v, (Continuation) obj4, 21);
                qVar22.f235677w = (String) obj2;
                qVar22.f235678x = (Reservation) obj3;
                return qVar22.invokeSuspend(Unit.f186387a);
            case 22:
                q qVar23 = new q((rdb.k) this.v, (Continuation) obj4, 22);
                qVar23.f235677w = (String) obj2;
                qVar23.f235678x = (xdb.v) obj3;
                return qVar23.invokeSuspend(Unit.f186387a);
            case 23:
                q qVar24 = new q((rs2.n) this.v, (Continuation) obj4, 23);
                qVar24.f235677w = (String) obj2;
                qVar24.f235678x = (ru.a) obj3;
                return qVar24.invokeSuspend(Unit.f186387a);
            case 24:
                q qVar25 = new q((rv1.r) this.v, (Continuation) obj4, 24);
                qVar25.f235677w = (Data) obj2;
                qVar25.f235678x = (Alias) obj3;
                return qVar25.invokeSuspend(Unit.f186387a);
            case 25:
                q qVar26 = new q((k18.c) this.v, (Continuation) obj4, 25);
                qVar26.f235677w = (scl.d) obj2;
                qVar26.f235678x = (List) obj3;
                return qVar26.invokeSuspend(Unit.f186387a);
            case 26:
                q qVar27 = new q((scl.j) this.v, (Continuation) obj4, 26);
                qVar27.f235677w = (UUID) obj2;
                qVar27.f235678x = (cfl.f0) obj3;
                return qVar27.invokeSuspend(Unit.f186387a);
            case 27:
                q qVar28 = new q((ska.k) this.v, (Continuation) obj4, 27);
                qVar28.f235677w = (nka.q) obj2;
                qVar28.f235678x = (aka.i) obj3;
                return qVar28.invokeSuspend(Unit.f186387a);
            case 28:
                q qVar29 = new q((ska.k) this.v, (Continuation) obj4, 28);
                qVar29.f235677w = (nka.q) obj2;
                qVar29.f235678x = (aka.a) obj3;
                return qVar29.invokeSuspend(Unit.f186387a);
            default:
                q qVar30 = new q((skf.f) this.v, (Continuation) obj4, 29);
                qVar30.f235677w = (qua.p) obj2;
                qVar30.f235678x = (j1) obj3;
                return qVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // gim.a
    public final java.lang.Object invokeSuspend(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r40v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
}
