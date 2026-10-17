package dhc;

import chc.k;
import chc.l;
import chc.m;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public static final com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations.Configuration a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
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

    public static final m b(RentAndBillsConfigurations.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        double d = configuration.f84779a;
        jo3.a aVarP = mo3.a.p(configuration.f84780b);
        int i = configuration.f84781c;
        RentAndBillsConfigurations.Configuration.PaymentCriteria paymentCriteria = configuration.d;
        Intrinsics.checkNotNullParameter(paymentCriteria, "<this>");
        d dVar = paymentCriteria.f84782a;
        ArrayList arrayList = null;
        jo3.a aVarP2 = dVar != null ? mo3.a.p(dVar) : null;
        d dVar2 = paymentCriteria.f84783b;
        jo3.a aVarP3 = dVar2 != null ? mo3.a.p(dVar2) : null;
        ArrayList arrayList2 = paymentCriteria.f84784c;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((com.revolut.feature.rewards.api.model.rent_and_bills.b) it8.next()).name());
        }
        ArrayList<RentAndBillsConfigurations.PaymentEligibility> arrayList4 = paymentCriteria.d;
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        if (arrayList4 != null) {
            arrayList = new ArrayList(w.t(arrayList4, 10));
            for (RentAndBillsConfigurations.PaymentEligibility paymentEligibility : arrayList4) {
                Intrinsics.checkNotNullParameter(paymentEligibility, "<this>");
                if (!(paymentEligibility instanceof RentAndBillsConfigurations.PaymentEligibility.DirectDebitEligibility)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(new l.b(((RentAndBillsConfigurations.PaymentEligibility.DirectDebitEligibility) paymentEligibility).f84785a));
            }
        }
        return new m(d, aVarP, i, new k(aVarP2, aVarP3, arrayList3, arrayList));
    }
}
