package ofj;

import com.revolut.retail.feature.esim.api.model.EsimMobilePlanNetworkProvider;
import com.revolut.retail.feature.esim.api.model.EsimProfileScope;
import dej.o1;
import kfj.a3;
import kfj.q0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f224899a = r0.k(new Pair("ORDERED", o1.ORDERED), new Pair("FAILED", o1.FAILED), new Pair("READY", o1.READY), new Pair("DOWNLOADED", o1.DOWNLOADED), new Pair("INSTALLED", o1.INSTALLED), new Pair("UNINSTALLED", o1.UNINSTALLED), new Pair("INACTIVE", o1.INACTIVE), new Pair("UNKNOWN", o1.UNKNOWN));

    public static final EsimProfileScope a(a3 a3Var) {
        EsimMobilePlanNetworkProvider esimMobilePlanNetworkProvider;
        dej.m mVar;
        wi0.b bVarA;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        String mobilePlanType = a3Var.getMobilePlanType();
        dej.m[] mVarArrValues = dej.m.values();
        int length = mVarArrValues.length;
        int i = 0;
        while (true) {
            esimMobilePlanNetworkProvider = null;
            if (i >= length) {
                mVar = null;
                break;
            }
            mVar = mVarArrValues[i];
            if (a0.z(mVar.name(), mobilePlanType, true)) {
                break;
            }
            i++;
        }
        if (mVar == null) {
            mVar = dej.m.DATA_PLAN;
        }
        dej.m mVar2 = mVar;
        String coverageCountry = a3Var.getCoverageCountry();
        if (coverageCountry != null) {
            wi0.b.Companion.getClass();
            bVarA = wi0.a.a(coverageCountry);
        } else {
            bVarA = null;
        }
        String primaryPhoneNumber = a3Var.getPrimaryPhoneNumber();
        boolean scheduledForTerminationDueToMigration = a3Var.getScheduledForTerminationDueToMigration();
        Boolean directInstallIsStateIndependent = a3Var.getDirectInstallIsStateIndependent();
        boolean zBooleanValue = directInstallIsStateIndependent != null ? directInstallIsStateIndependent.booleanValue() : false;
        Boolean carrierPrivilegesMissing = a3Var.getCarrierPrivilegesMissing();
        boolean zBooleanValue2 = carrierPrivilegesMissing != null ? carrierPrivilegesMissing.booleanValue() : false;
        q0 provider = a3Var.getProvider();
        if (provider != null) {
            Intrinsics.checkNotNullParameter(provider, "<this>");
            esimMobilePlanNetworkProvider = new EsimMobilePlanNetworkProvider(provider.getName(), provider.getIconUrl());
        }
        return new EsimProfileScope(mVar2, bVarA, primaryPhoneNumber, scheduledForTerminationDueToMigration, zBooleanValue, zBooleanValue2, esimMobilePlanNetworkProvider, a3Var.getSimProfileIssuer());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final java.util.ArrayList b(java.util.List r24) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ofj.m.b(java.util.List):java.util.ArrayList");
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public static final java.util.ArrayList c(
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

    public static final a3 d(EsimProfileScope esimProfileScope) {
        String str;
        q0 q0Var;
        q0 q0Var2;
        Intrinsics.checkNotNullParameter(esimProfileScope, "<this>");
        String strName = esimProfileScope.f100450a.name();
        wi0.b bVar = esimProfileScope.f100451b;
        if (bVar != null) {
            str = bVar.f297794a;
            q0Var = null;
        } else {
            str = null;
            q0Var = null;
        }
        String str2 = esimProfileScope.f100452c;
        q0 q0Var3 = q0Var;
        boolean z = esimProfileScope.d;
        Boolean boolValueOf = Boolean.valueOf(esimProfileScope.e);
        Boolean boolValueOf2 = Boolean.valueOf(esimProfileScope.f);
        EsimMobilePlanNetworkProvider esimMobilePlanNetworkProvider = esimProfileScope.f100453g;
        if (esimMobilePlanNetworkProvider != null) {
            Intrinsics.checkNotNullParameter(esimMobilePlanNetworkProvider, "<this>");
            q0Var2 = new q0(esimMobilePlanNetworkProvider.f100299a, esimMobilePlanNetworkProvider.f100300b);
        } else {
            q0Var2 = q0Var3;
        }
        return new a3(strName, str, str2, z, boolValueOf, boolValueOf2, q0Var2, esimProfileScope.f100454h);
    }
}
