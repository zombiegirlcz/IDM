package l05;

import com.revolut.feature.credit.health.api.models.CreditScore;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreDetails;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsights;
import com.revolut.feature.crypto.exchange.fees.impl.model.CryptoExchangeFeesFacadeV2;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationBrandsResponse;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationPreferencesResponse;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import d0j.h0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ll7.e0;
import mtj.q;
import n8a.f0;
import nfj.s2;
import nuj.j;
import o29.m;
import pfj.k;
import u91.u;
import whf.p;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f191173w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    private final Object b(Object obj2) {
        String str;
        String str2;
        od0.i iVar = (od0.i) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g0j.a aVar2 = (g0j.a) iVar.f224257a;
        if (aVar2 != null) {
            ue0.c cVar = ((ouj.d) this.f191173w).f229884c;
            Intrinsics.checkNotNullParameter(aVar2, "<this>");
            String str3 = aVar2.f139495a;
            String str4 = aVar2.f139496b.f297794a;
            String str5 = aVar2.f139497c;
            ArrayList arrayList = aVar2.d;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                switch (j.f219330a[((g0j.c) it8.next()).ordinal()]) {
                    case 1:
                        str2 = "exchangeRate";
                        break;
                    case 2:
                        str2 = "esim";
                        break;
                    case 3:
                        str2 = "splitBill";
                        break;
                    case 4:
                        str2 = "atm";
                        break;
                    case 5:
                        str2 = "transportHubs";
                        break;
                    case 6:
                        str2 = "apmAreaBizum";
                        break;
                    case 7:
                        str2 = "pixArea";
                        break;
                    case 8:
                        str2 = "alipay";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList2.add(new nuj.f(str2));
            }
            ArrayList arrayList3 = aVar2.e;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            Iterator it9 = arrayList3.iterator();
            while (it9.hasNext()) {
                int i = j.f219331b[((g0j.b) it9.next()).ordinal()];
                if (i == 1) {
                    str = "stays";
                } else if (i == 2) {
                    str = "experiences";
                } else if (i == 3) {
                    str = "lounges";
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "insurance";
                }
                arrayList4.add(new nuj.c(str));
            }
            nuj.i iVar2 = new nuj.i(str3, str4, str5, arrayList2, arrayList4);
            Type type = ouj.d.e;
            Intrinsics.checkNotNullExpressionValue(type, "access$getTravelDestinationDtoType$cp(...)");
            cVar.G(iVar2, "travel_storage", type);
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                b bVar = new b((c) this.f191173w, (Continuation) obj4, 0);
                bVar.v = (CreditScoreDetails) obj3;
                return bVar.invokeSuspend(Unit.f186387a);
            case 1:
                b bVar2 = new b((g) this.f191173w, (Continuation) obj4, 1);
                bVar2.v = (CreditScoreInsights) obj3;
                return bVar2.invokeSuspend(Unit.f186387a);
            case 2:
                b bVar3 = new b((i) this.f191173w, (Continuation) obj4, 2);
                bVar3.v = (CreditScore) obj3;
                return bVar3.invokeSuspend(Unit.f186387a);
            case 3:
                b bVar4 = new b((l16.e) this.f191173w, (Continuation) obj4, 3);
                bVar4.v = (e16.b) obj3;
                return bVar4.invokeSuspend(Unit.f186387a);
            case 4:
                b bVar5 = new b((l16.e) this.f191173w, (Continuation) obj4, 4);
                bVar5.v = (List) obj3;
                return bVar5.invokeSuspend(Unit.f186387a);
            case 5:
                b bVar6 = new b((l91.g) this.f191173w, (Continuation) obj4, 5);
                bVar6.v = (u91.d) obj3;
                return bVar6.invokeSuspend(Unit.f186387a);
            case 6:
                b bVar7 = new b((l91.g) this.f191173w, (Continuation) obj4, 6);
                bVar7.v = (u91.e) obj3;
                return bVar7.invokeSuspend(Unit.f186387a);
            case 7:
                b bVar8 = new b((l91.g) this.f191173w, (Continuation) obj4, 7);
                bVar8.v = (u91.h) obj3;
                return bVar8.invokeSuspend(Unit.f186387a);
            case 8:
                b bVar9 = new b((l91.g) this.f191173w, (Continuation) obj4, 8);
                bVar9.v = (List) obj3;
                return bVar9.invokeSuspend(Unit.f186387a);
            case 9:
                b bVar10 = new b((l91.g) this.f191173w, (Continuation) obj4, 9);
                bVar10.v = (u) obj3;
                return bVar10.invokeSuspend(Unit.f186387a);
            case 10:
                b bVar11 = new b((laj.d) this.f191173w, (Continuation) obj4, 10);
                bVar11.v = (List) obj3;
                return bVar11.invokeSuspend(Unit.f186387a);
            case 11:
                b bVar12 = new b((lf6.j) this.f191173w, (Continuation) obj4, 11);
                bVar12.v = (og6.a) obj3;
                return bVar12.invokeSuspend(Unit.f186387a);
            case 12:
                b bVar13 = new b((lf6.j) this.f191173w, (Continuation) obj4, 12);
                bVar13.v = (og6.g) obj3;
                return bVar13.invokeSuspend(Unit.f186387a);
            case 13:
                b bVar14 = new b((e0) this.f191173w, (Continuation) obj4, 13);
                bVar14.v = (List) obj3;
                return bVar14.invokeSuspend(Unit.f186387a);
            case 14:
                b bVar15 = new b((mhc.b) this.f191173w, (Continuation) obj4, 14);
                bVar15.v = (dgc.i) obj3;
                return bVar15.invokeSuspend(Unit.f186387a);
            case 15:
                b bVar16 = new b(3, 15, (Continuation) obj4);
                bVar16.v = (Map) obj2;
                bVar16.f191173w = (Pair) obj3;
                return bVar16.invokeSuspend(Unit.f186387a);
            case 16:
                b bVar17 = new b((q) this.f191173w, (Continuation) obj4, 16);
                bVar17.v = (d0j.f) obj3;
                return bVar17.invokeSuspend(Unit.f186387a);
            case 17:
                b bVar18 = new b((q) this.f191173w, (Continuation) obj4, 17);
                bVar18.v = (h0) obj3;
                return bVar18.invokeSuspend(Unit.f186387a);
            case 18:
                b bVar19 = new b(3, 18, (Continuation) obj4);
                bVar19.v = (p) obj2;
                bVar19.f191173w = (RevPointsTransaction) obj3;
                return bVar19.invokeSuspend(Unit.f186387a);
            case 19:
                b bVar20 = new b((f0) this.f191173w, (Continuation) obj4, 19);
                bVar20.v = (List) obj3;
                return bVar20.invokeSuspend(Unit.f186387a);
            case 20:
                b bVar21 = new b((nf5.d) this.f191173w, (Continuation) obj4, 20);
                bVar21.v = (CryptoExchangeFeesFacadeV2) obj3;
                return bVar21.invokeSuspend(Unit.f186387a);
            case 21:
                b bVar22 = new b((nfj.g) this.f191173w, (Continuation) obj4, 21);
                bVar22.v = (dej.i) obj3;
                return bVar22.invokeSuspend(Unit.f186387a);
            case 22:
                b bVar23 = new b((s2) this.f191173w, (Continuation) obj4, 22);
                bVar23.v = (k) obj3;
                return bVar23.invokeSuspend(Unit.f186387a);
            case 23:
                b bVar24 = new b((nhc.i) this.f191173w, (Continuation) obj4, 23);
                bVar24.v = (RentAndBillsLinkedPayments) obj3;
                return bVar24.invokeSuspend(Unit.f186387a);
            case 24:
                b bVar25 = new b(3, 24, (Continuation) obj4);
                bVar25.v = obj2;
                bVar25.f191173w = (nzi.e) obj3;
                return bVar25.invokeSuspend(Unit.f186387a);
            case 25:
                b bVar26 = new b((m) this.f191173w, (Continuation) obj4, 25);
                bVar26.v = (y19.h) obj3;
                return bVar26.invokeSuspend(Unit.f186387a);
            case 26:
                b bVar27 = new b((ouj.d) this.f191173w, (Continuation) obj4, 26);
                bVar27.v = (od0.i) obj3;
                return bVar27.invokeSuspend(Unit.f186387a);
            case 27:
                b bVar28 = new b((oxb.f) this.f191173w, (Continuation) obj4, 27);
                bVar28.v = (RevPointsPersonalisationBrandsResponse) obj3;
                return bVar28.invokeSuspend(Unit.f186387a);
            case 28:
                b bVar29 = new b((oxb.f) this.f191173w, (Continuation) obj4, 28);
                bVar29.v = (RevPointsPersonalisationPreferencesResponse) obj3;
                return bVar29.invokeSuspend(Unit.f186387a);
            default:
                b bVar30 = new b((p15.b) this.f191173w, (Continuation) obj4, 29);
                bVar30.v = (Map) obj3;
                return bVar30.invokeSuspend(Unit.f186387a);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f191173w = obj2;
    }
}
