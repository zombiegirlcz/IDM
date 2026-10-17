package x5b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBenefitsSection;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBenefitsSectionAction;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBenefitsSectionItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import w5b.l2;
import w5b.o2;
import w5b.r2;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e {
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public static final com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfo a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
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

    public static final CobrandedCardsPlanHubInfoBenefitsSection b(o2 o2Var) {
        Intrinsics.checkNotNullParameter(o2Var, "<this>");
        l2 l2Var = o2Var.f294964c;
        CobrandedCardsPlanHubInfoBenefitsSectionAction.Url urlC = l2Var != null ? c(l2Var) : null;
        if (o2Var.f294964c != null && urlC == null) {
            return null;
        }
        String str = o2Var.f294962a;
        List<r2> list = o2Var.f294963b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (r2 r2Var : list) {
            Intrinsics.checkNotNullParameter(r2Var, "<this>");
            arrayList.add(new CobrandedCardsPlanHubInfoBenefitsSectionItem(r2Var.f294995a, r2Var.f294996b, r2Var.f294997c));
        }
        return new CobrandedCardsPlanHubInfoBenefitsSection(str, arrayList, urlC);
    }

    public static final CobrandedCardsPlanHubInfoBenefitsSectionAction.Url c(l2 l2Var) {
        String str;
        Intrinsics.checkNotNullParameter(l2Var, "<this>");
        if (!Intrinsics.f(l2Var.f294912c, "URL") || (str = l2Var.d) == null) {
            return null;
        }
        return new CobrandedCardsPlanHubInfoBenefitsSectionAction.Url(l2Var.f294910a, l2Var.f294911b, str);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public static final com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardChallenge d(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r23v0 ??
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

    public static final l2 e(CobrandedCardsPlanHubInfoBenefitsSectionAction cobrandedCardsPlanHubInfoBenefitsSectionAction) {
        Intrinsics.checkNotNullParameter(cobrandedCardsPlanHubInfoBenefitsSectionAction, "<this>");
        if (!(cobrandedCardsPlanHubInfoBenefitsSectionAction instanceof CobrandedCardsPlanHubInfoBenefitsSectionAction.Url)) {
            throw new NoWhenBranchMatchedException();
        }
        CobrandedCardsPlanHubInfoBenefitsSectionAction.Url url2 = (CobrandedCardsPlanHubInfoBenefitsSectionAction.Url) cobrandedCardsPlanHubInfoBenefitsSectionAction;
        return new l2(url2.f82361a, url2.f82362b, url2.f82363c);
    }

    public static final o2 f(CobrandedCardsPlanHubInfoBenefitsSection cobrandedCardsPlanHubInfoBenefitsSection) {
        Intrinsics.checkNotNullParameter(cobrandedCardsPlanHubInfoBenefitsSection, "<this>");
        String str = cobrandedCardsPlanHubInfoBenefitsSection.f82358a;
        ArrayList<CobrandedCardsPlanHubInfoBenefitsSectionItem> arrayList = cobrandedCardsPlanHubInfoBenefitsSection.f82359b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (CobrandedCardsPlanHubInfoBenefitsSectionItem cobrandedCardsPlanHubInfoBenefitsSectionItem : arrayList) {
            Intrinsics.checkNotNullParameter(cobrandedCardsPlanHubInfoBenefitsSectionItem, "<this>");
            arrayList2.add(new r2(cobrandedCardsPlanHubInfoBenefitsSectionItem.f82364a, cobrandedCardsPlanHubInfoBenefitsSectionItem.f82365b, cobrandedCardsPlanHubInfoBenefitsSectionItem.f82366c));
        }
        CobrandedCardsPlanHubInfoBenefitsSectionAction cobrandedCardsPlanHubInfoBenefitsSectionAction = cobrandedCardsPlanHubInfoBenefitsSection.f82360c;
        return new o2(str, arrayList2, cobrandedCardsPlanHubInfoBenefitsSectionAction != null ? e(cobrandedCardsPlanHubInfoBenefitsSectionAction) : null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 w5b.m3, still in use, count: 2, list:
          (r2v0 w5b.m3) from 0x00db: MOVE (r19v0 w5b.m3) = (r2v0 w5b.m3)
          (r2v0 w5b.m3) from 0x0047: MOVE (r19v2 w5b.m3) = (r2v0 w5b.m3)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static final w5b.m3 g(com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardChallenge r24) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x5b.e.g(com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardChallenge):w5b.m3");
    }
}
