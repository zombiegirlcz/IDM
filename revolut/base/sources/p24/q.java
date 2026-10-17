package p24;

import com.revolut.data.model.Data;
import com.revolut.feature.derivatives.models.DerivativesBalance;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingResponse;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftConfig;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import pfk.g0;
import ru.y;
import wim.z;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f232058w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object b(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 ??
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

    private final Object c(Object obj2) {
        DerivativesBalance derivativesBalance = (DerivativesBalance) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ue0.c cVar = ((s76.b) this.f232058w).f260525c;
        Intrinsics.checkNotNullParameter(derivativesBalance, "<this>");
        String str = derivativesBalance.f71898a.f306286a;
        String str2 = derivativesBalance.f71899b;
        String plainString = derivativesBalance.f71900c.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        String plainString2 = derivativesBalance.d.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString2, "toPlainString(...)");
        String plainString3 = derivativesBalance.e.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString3, "toPlainString(...)");
        String plainString4 = derivativesBalance.f.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString4, "toPlainString(...)");
        String plainString5 = derivativesBalance.f71901g.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString5, "toPlainString(...)");
        String plainString6 = derivativesBalance.f71902h.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString6, "toPlainString(...)");
        String plainString7 = derivativesBalance.i.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString7, "toPlainString(...)");
        String plainString8 = derivativesBalance.f71903j.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString8, "toPlainString(...)");
        String plainString9 = derivativesBalance.k.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString9, "toPlainString(...)");
        String plainString10 = derivativesBalance.f71904l.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString10, "toPlainString(...)");
        String plainString11 = derivativesBalance.f71905m.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString11, "toPlainString(...)");
        BigDecimal bigDecimal = derivativesBalance.f71906n;
        String plainString12 = bigDecimal != null ? bigDecimal.toPlainString() : null;
        oj1.a aVar2 = derivativesBalance.o;
        cVar.G(new n76.c(str, str2, plainString, plainString2, plainString3, plainString4, plainString5, plainString6, plainString7, plainString8, plainString9, plainString10, plainString11, plainString12, aVar2 != null ? aVar2.name() : null), "DERIVATIVES_BALANCE_STORAGE_KEY", z.d(o0.b(n76.c.class)));
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        List<lcd.i> list = (List) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ue0.c cVar = ((sbd.h) this.f232058w).f261582c;
        cVar.clear();
        for (lcd.i iVar : list) {
            cVar.G(rbd.b.d(iVar), iVar.f193848a, z.d(o0.b(qbd.v.class)));
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                q qVar = new q((r) this.f232058w, (Continuation) obj4, 0);
                qVar.v = (ou3.g) obj3;
                return qVar.invokeSuspend(Unit.f186387a);
            case 1:
                q qVar2 = new q((pdi.k) this.f232058w, (Continuation) obj4, 1);
                qVar2.v = (RevPointsPocketState) obj3;
                return qVar2.invokeSuspend(Unit.f186387a);
            case 2:
                q qVar3 = new q((pfk.s) this.f232058w, (Continuation) obj4, 2);
                qVar3.v = (lha.d) obj3;
                return qVar3.invokeSuspend(Unit.f186387a);
            case 3:
                q qVar4 = new q((pfk.s) this.f232058w, (Continuation) obj4, 3);
                qVar4.v = (List) obj3;
                return qVar4.invokeSuspend(Unit.f186387a);
            case 4:
                q qVar5 = new q((g0) this.f232058w, (Continuation) obj4, 4);
                qVar5.v = (rha.b) obj3;
                return qVar5.invokeSuspend(Unit.f186387a);
            case 5:
                q qVar6 = new q((phc.j) this.f232058w, (Continuation) obj4, 5);
                qVar6.v = (List) obj3;
                return qVar6.invokeSuspend(Unit.f186387a);
            case 6:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                q qVar7 = new q((plc.g) this.f232058w, (Continuation) obj4, 6);
                qVar7.v = (List) obj3;
                qVar7.invokeSuspend(Unit.f186387a);
                throw null;
            case 7:
                q qVar8 = new q((prl.e) this.f232058w, (Continuation) obj4, 7);
                qVar8.v = (InvestOrder) obj3;
                return qVar8.invokeSuspend(Unit.f186387a);
            case 8:
                q qVar9 = new q((prl.j) this.f232058w, (Continuation) obj4, 8);
                qVar9.v = (k4l.j) obj3;
                return qVar9.invokeSuspend(Unit.f186387a);
            case 9:
                q qVar10 = new q((pti.e) this.f232058w, (Continuation) obj4, 9);
                qVar10.v = (bti.b) obj3;
                return qVar10.invokeSuspend(Unit.f186387a);
            case 10:
                q qVar11 = new q((pti.k) this.f232058w, (Continuation) obj4, 10);
                qVar11.v = (AsftConfig) obj3;
                return qVar11.invokeSuspend(Unit.f186387a);
            case 11:
                q qVar12 = new q((pti.k) this.f232058w, (Continuation) obj4, 11);
                qVar12.v = (String) obj3;
                return qVar12.invokeSuspend(Unit.f186387a);
            case 12:
                q qVar13 = new q((pti.u) this.f232058w, (Continuation) obj4, 12);
                qVar13.v = (List) obj3;
                return qVar13.invokeSuspend(Unit.f186387a);
            case 13:
                q qVar14 = new q((pti.z) this.f232058w, (Continuation) obj4, 13);
                qVar14.v = (bti.d) obj3;
                return qVar14.invokeSuspend(Unit.f186387a);
            case 14:
                q qVar15 = new q((q53.c) this.f232058w, (Continuation) obj4, 14);
                qVar15.v = (wz5.a) obj3;
                return qVar15.invokeSuspend(Unit.f186387a);
            case 15:
                q qVar16 = new q(3, 15, (Continuation) obj4);
                qVar16.v = (String) obj2;
                qVar16.f232058w = (List) obj3;
                return qVar16.invokeSuspend(Unit.f186387a);
            case 16:
                q qVar17 = new q((qb9.b) this.f232058w, (Continuation) obj4, 16);
                qVar17.v = (pd9.a) obj3;
                return qVar17.invokeSuspend(Unit.f186387a);
            case 17:
                q qVar18 = new q((qfa.e) this.f232058w, (Continuation) obj4, 17);
                qVar18.v = (ofa.b) obj3;
                return qVar18.invokeSuspend(Unit.f186387a);
            case 18:
                q qVar19 = new q(3, 18, (Continuation) obj4);
                qVar19.v = (ptb.g) obj2;
                qVar19.f232058w = (List) obj3;
                return qVar19.invokeSuspend(Unit.f186387a);
            case 19:
                q qVar20 = new q((qxb.c) this.f232058w, (Continuation) obj4, 19);
                qVar20.v = (RevPointsPersonalisationTargetingOnboardingResponse) obj3;
                return qVar20.invokeSuspend(Unit.f186387a);
            case 20:
                q qVar21 = new q(3, 20, (Continuation) obj4);
                qVar21.v = (dj0.d) obj2;
                qVar21.f232058w = (Data) obj3;
                return qVar21.invokeSuspend(Unit.f186387a);
            case 21:
                q qVar22 = new q((r5c.b) this.f232058w, (Continuation) obj4, 21);
                qVar22.v = (k5c.a) obj3;
                return qVar22.invokeSuspend(Unit.f186387a);
            case 22:
                q qVar23 = new q(3, 22, (Continuation) obj4);
                qVar23.v = (Data) obj2;
                qVar23.f232058w = (wk5.a) obj3;
                return qVar23.invokeSuspend(Unit.f186387a);
            case 23:
                q qVar24 = new q((rg3.o) this.f232058w, (Continuation) obj4, 23);
                qVar24.v = (List) obj3;
                return qVar24.invokeSuspend(Unit.f186387a);
            case 24:
                q qVar25 = new q((rl2.d) this.f232058w, (Continuation) obj4, 24);
                qVar25.v = (il2.i) obj3;
                return qVar25.invokeSuspend(Unit.f186387a);
            case 25:
                q qVar26 = new q((rs2.n) this.f232058w, (Continuation) obj4, 25);
                qVar26.v = (y) obj3;
                return qVar26.invokeSuspend(Unit.f186387a);
            case 26:
                q qVar27 = new q((s76.b) this.f232058w, (Continuation) obj4, 26);
                qVar27.v = (DerivativesBalance) obj3;
                return qVar27.invokeSuspend(Unit.f186387a);
            case 27:
                q qVar28 = new q((sbd.h) this.f232058w, (Continuation) obj4, 27);
                qVar28.v = (lcd.i) obj3;
                return qVar28.invokeSuspend(Unit.f186387a);
            case 28:
                q qVar29 = new q((sbd.h) this.f232058w, (Continuation) obj4, 28);
                qVar29.v = (List) obj3;
                return qVar29.invokeSuspend(Unit.f186387a);
            default:
                q qVar30 = new q((scl.g) this.f232058w, (Continuation) obj4, 29);
                qVar30.v = (TradingAccounts) obj3;
                return qVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // gim.a
    public final java.lang.Object invokeSuspend(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r36v0 ??
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f232058w = obj2;
    }
}
