package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms;

import aw0.o9;
import aw0.t0;
import cli.n;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.impl.R$string;
import dj0.d;
import java.math.BigDecimal;
import java.util.List;
import jjj.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yoj.b;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanCancellationTermsScreenContract$InputData f101137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gej.a f101138b;

    public a(EsimMobilePlanCancellationTermsScreenContract$InputData inputData, gej.a bytesFormatter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        this.f101137a = inputData;
        this.f101138b = bytesFormatter;
    }

    public static CompositeClause a(d dVar) {
        return b.m(new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(R$string.esim_common_unit_gb, null, null, 14)));
    }

    public static CellDetailsDelegate.Model d(int i, d dVar, Double d) {
        Clause moneyClause;
        if (!dVar.f(d.e) && (d == null || d.doubleValue() <= 0.0d)) {
            return null;
        }
        t0 t0Var = new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30);
        if (d == null || d.doubleValue() <= 0.0d) {
            moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
        } else {
            double dDoubleValue = d.doubleValue();
            int i2 = R$drawable.uikit_icn_24_rev_points;
            Float fValueOf = Float.valueOf(14.0f);
            moneyClause = b.m(new TextClause(" + ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new ImageClause(i2, (Integer) null, fValueOf, fValueOf, 18), new NumberClause(new BigDecimal(String.valueOf(dDoubleValue)), null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), null, 10))), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)));
        }
        return new CellDetailsDelegate.Model("refundItemId", t0Var, moneyClause, null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public final CompositeClause b(long j2, long j3) {
        gej.a aVar = this.f101138b;
        return b.m(new TextClause(" / ", (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), v.k(gej.a.a(aVar, j2, null, 6), gej.a.a(aVar, j3, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 2)));
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // cli.n
    public final cli.o c(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r48v0 ??
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
