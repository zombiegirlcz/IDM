package kj7;

import aj7.a0;
import aj7.q;
import aj7.r;
import aj7.u;
import aj7.v;
import aj7.x;
import aj7.y;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.insurance.api.models.details.CFACClaimProperties;
import com.revolut.feature.insurance.api.models.details.CFACClaimTransactions;
import com.revolut.feature.insurance.api.models.details.CFACCoverage;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.feature.insurance.api.models.details.CFACInsurer;
import com.revolut.feature.insurance.api.models.details.CFACPaymentCanceller;
import com.revolut.feature.insurance.api.models.details.CFACPaymentPurpose;
import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.api.models.details.CFACProductLink;
import com.revolut.feature.insurance.api.models.details.CFACProductSummary;
import com.revolut.feature.insurance.impl.network.InsuranceService;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import jj7.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import le.u1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements xi7.a {

    @NotNull
    public static final i Companion = new i();
    public static final Type e = new TypeToken<u>() { // from class: com.revolut.feature.insurance.impl.repository.InsuranceDetailsRepositoryImpl$Companion$CFAC_INSURANCE_DETAILS_ENTITY_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceService f184330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f184331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f184332c;
    public final w4l.f d;

    public j(InsuranceService insuranceService, ne0.d memoryCache, xe0.e storage) {
        Intrinsics.checkNotNullParameter(insuranceService, "insuranceService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f184330a = insuranceService;
        this.f184331b = memoryCache;
        this.f184332c = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: kj7.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f184327b;

            {
                this.f184327b = this;
            }

            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String params = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<z> cFACInsuranceDetails = this.f184327b.f184330a.getCFACInsuranceDetails(params);
                        kce.c cVar = new kce.c(new kh4.b(19), 16);
                        cFACInsuranceDetails.getClass();
                        ufm.i iVar = new ufm.i(cFACInsuranceDetails, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String params2 = (String) obj2;
                        CFACInsuranceDetails domain = (CFACInsuranceDetails) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f184327b.f184331b.f(params2, domain);
                        break;
                    default:
                        String params3 = (String) obj2;
                        CFACInsuranceDetails domain2 = (CFACInsuranceDetails) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xe0.e eVar = this.f184327b.f184332c;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        String str = domain2.f74988a;
                        String strH = u1.h(domain2.f74989b, gj7.a.f144238a);
                        if (strH == null) {
                            strH = "";
                        }
                        CFACInsurer cFACInsurer = domain2.f74990c;
                        Intrinsics.checkNotNullParameter(cFACInsurer, "<this>");
                        v vVar = new v(cFACInsurer.f74991a, cFACInsurer.f74992b);
                        CFACClaimProperties cFACClaimProperties = domain2.d;
                        Intrinsics.checkNotNullParameter(cFACClaimProperties, "<this>");
                        CFACClaimTransactions cFACClaimTransactions = cFACClaimProperties.f74973a;
                        Intrinsics.checkNotNullParameter(cFACClaimTransactions, "<this>");
                        long j2 = cFACClaimTransactions.f74976a;
                        ArrayList arrayList = cFACClaimTransactions.f74977b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            CFACClaimTransactions.EligibleTransaction eligibleTransaction = (CFACClaimTransactions.EligibleTransaction) it8.next();
                            Intrinsics.checkNotNullParameter(eligibleTransaction, "<this>");
                            arrayList2.add(new q.a(u1.g(eligibleTransaction.f74978a, r11.a.o), u1.g(eligibleTransaction.f74979b, r11.a.i), eligibleTransaction.f74980c.name(), eligibleTransaction.d));
                            it8 = it8;
                            str = str;
                            strH = strH;
                        }
                        String str2 = str;
                        String str3 = strH;
                        q qVar = new q(j2, arrayList2);
                        ArrayList<CFACPaymentPurpose> arrayList3 = cFACClaimProperties.f74974b;
                        Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        for (CFACPaymentPurpose cFACPaymentPurpose : arrayList3) {
                            arrayList4.add(new x(cFACPaymentPurpose.f74996a, cFACPaymentPurpose.f74997b, cFACPaymentPurpose.f74998c));
                        }
                        ArrayList<CFACPaymentCanceller> arrayList5 = cFACClaimProperties.f74975c;
                        Intrinsics.checkNotNullParameter(arrayList5, "<this>");
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (CFACPaymentCanceller cFACPaymentCanceller : arrayList5) {
                            arrayList6.add(new aj7.w(cFACPaymentCanceller.f74993a, cFACPaymentCanceller.f74994b, cFACPaymentCanceller.f74995c));
                        }
                        aj7.o oVar = new aj7.o(qVar, arrayList4, arrayList6);
                        ArrayList arrayList7 = domain2.e;
                        Intrinsics.checkNotNullParameter(arrayList7, "<this>");
                        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                        Iterator it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            CFACProductDetails cFACProductDetails = (CFACProductDetails) it9.next();
                            String str4 = cFACProductDetails.f74999a;
                            CFACProductSummary cFACProductSummary = cFACProductDetails.f75000b;
                            Intrinsics.checkNotNullParameter(cFACProductSummary, "<this>");
                            String str5 = cFACProductSummary.f75005a;
                            ArrayList<CFACProductLink> arrayList9 = cFACProductSummary.f75006b;
                            Intrinsics.checkNotNullParameter(arrayList9, "<this>");
                            ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                            for (CFACProductLink cFACProductLink : arrayList9) {
                                arrayList10.add(new aj7.z(cFACProductLink.f75002a, cFACProductLink.f75003b, cFACProductLink.f75004c));
                                it9 = it9;
                                str4 = str4;
                            }
                            Iterator it10 = it9;
                            String str6 = str4;
                            a0 a0Var = new a0(str5, arrayList10);
                            dl7.b bVar = cFACProductDetails.f75001c;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            el7.b bVar2 = new el7.b(ebm.a.K(bVar.f115711a), bVar.f115712b, bVar.f115713c);
                            ArrayList<CFACCoverage> arrayList11 = cFACProductDetails.d;
                            Intrinsics.checkNotNullParameter(arrayList11, "<this>");
                            ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                            for (CFACCoverage cFACCoverage : arrayList11) {
                                String strH2 = u1.h(cFACCoverage.f74981a, ij7.a.f161720a);
                                if (strH2 == null) {
                                    strH2 = "";
                                }
                                arrayList12.add(new r(strH2, cFACCoverage.f74982b));
                            }
                            arrayList8.add(new y(str6, a0Var, bVar2, arrayList12, zi7.a.c(cFACProductDetails.e), zi7.a.c(cFACProductDetails.f)));
                            it9 = it10;
                        }
                        eVar.G(new u(str2, str3, vVar, oVar, arrayList8), params3, wim.z.d(o0.b(u.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: kj7.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f184329b;

            {
                this.f184329b = this;
            }

            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
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
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
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
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: kj7.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f184327b;

            {
                this.f184327b = this;
            }

            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String params = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<z> cFACInsuranceDetails = this.f184327b.f184330a.getCFACInsuranceDetails(params);
                        kce.c cVar = new kce.c(new kh4.b(19), 16);
                        cFACInsuranceDetails.getClass();
                        ufm.i iVar = new ufm.i(cFACInsuranceDetails, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String params2 = (String) obj2;
                        CFACInsuranceDetails domain = (CFACInsuranceDetails) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f184327b.f184331b.f(params2, domain);
                        break;
                    default:
                        String params3 = (String) obj2;
                        CFACInsuranceDetails domain2 = (CFACInsuranceDetails) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xe0.e eVar = this.f184327b.f184332c;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        String str = domain2.f74988a;
                        String strH = u1.h(domain2.f74989b, gj7.a.f144238a);
                        if (strH == null) {
                            strH = "";
                        }
                        CFACInsurer cFACInsurer = domain2.f74990c;
                        Intrinsics.checkNotNullParameter(cFACInsurer, "<this>");
                        v vVar = new v(cFACInsurer.f74991a, cFACInsurer.f74992b);
                        CFACClaimProperties cFACClaimProperties = domain2.d;
                        Intrinsics.checkNotNullParameter(cFACClaimProperties, "<this>");
                        CFACClaimTransactions cFACClaimTransactions = cFACClaimProperties.f74973a;
                        Intrinsics.checkNotNullParameter(cFACClaimTransactions, "<this>");
                        long j2 = cFACClaimTransactions.f74976a;
                        ArrayList arrayList = cFACClaimTransactions.f74977b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            CFACClaimTransactions.EligibleTransaction eligibleTransaction = (CFACClaimTransactions.EligibleTransaction) it8.next();
                            Intrinsics.checkNotNullParameter(eligibleTransaction, "<this>");
                            arrayList2.add(new q.a(u1.g(eligibleTransaction.f74978a, r11.a.o), u1.g(eligibleTransaction.f74979b, r11.a.i), eligibleTransaction.f74980c.name(), eligibleTransaction.d));
                            it8 = it8;
                            str = str;
                            strH = strH;
                        }
                        String str2 = str;
                        String str3 = strH;
                        q qVar = new q(j2, arrayList2);
                        ArrayList<CFACPaymentPurpose> arrayList3 = cFACClaimProperties.f74974b;
                        Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        for (CFACPaymentPurpose cFACPaymentPurpose : arrayList3) {
                            arrayList4.add(new x(cFACPaymentPurpose.f74996a, cFACPaymentPurpose.f74997b, cFACPaymentPurpose.f74998c));
                        }
                        ArrayList<CFACPaymentCanceller> arrayList5 = cFACClaimProperties.f74975c;
                        Intrinsics.checkNotNullParameter(arrayList5, "<this>");
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (CFACPaymentCanceller cFACPaymentCanceller : arrayList5) {
                            arrayList6.add(new aj7.w(cFACPaymentCanceller.f74993a, cFACPaymentCanceller.f74994b, cFACPaymentCanceller.f74995c));
                        }
                        aj7.o oVar = new aj7.o(qVar, arrayList4, arrayList6);
                        ArrayList arrayList7 = domain2.e;
                        Intrinsics.checkNotNullParameter(arrayList7, "<this>");
                        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                        Iterator it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            CFACProductDetails cFACProductDetails = (CFACProductDetails) it9.next();
                            String str4 = cFACProductDetails.f74999a;
                            CFACProductSummary cFACProductSummary = cFACProductDetails.f75000b;
                            Intrinsics.checkNotNullParameter(cFACProductSummary, "<this>");
                            String str5 = cFACProductSummary.f75005a;
                            ArrayList<CFACProductLink> arrayList9 = cFACProductSummary.f75006b;
                            Intrinsics.checkNotNullParameter(arrayList9, "<this>");
                            ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                            for (CFACProductLink cFACProductLink : arrayList9) {
                                arrayList10.add(new aj7.z(cFACProductLink.f75002a, cFACProductLink.f75003b, cFACProductLink.f75004c));
                                it9 = it9;
                                str4 = str4;
                            }
                            Iterator it10 = it9;
                            String str6 = str4;
                            a0 a0Var = new a0(str5, arrayList10);
                            dl7.b bVar = cFACProductDetails.f75001c;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            el7.b bVar2 = new el7.b(ebm.a.K(bVar.f115711a), bVar.f115712b, bVar.f115713c);
                            ArrayList<CFACCoverage> arrayList11 = cFACProductDetails.d;
                            Intrinsics.checkNotNullParameter(arrayList11, "<this>");
                            ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                            for (CFACCoverage cFACCoverage : arrayList11) {
                                String strH2 = u1.h(cFACCoverage.f74981a, ij7.a.f161720a);
                                if (strH2 == null) {
                                    strH2 = "";
                                }
                                arrayList12.add(new r(strH2, cFACCoverage.f74982b));
                            }
                            arrayList8.add(new y(str6, a0Var, bVar2, arrayList12, zi7.a.c(cFACProductDetails.e), zi7.a.c(cFACProductDetails.f)));
                            it9 = it10;
                        }
                        eVar.G(new u(str2, str3, vVar, oVar, arrayList8), params3, wim.z.d(o0.b(u.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: kj7.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f184329b;

            {
                this.f184329b = this;
            }

            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
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
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
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
                */
            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
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
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
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
                */
            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException
                */
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: kj7.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f184327b;

            {
                this.f184327b = this;
            }

            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String params = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<z> cFACInsuranceDetails = this.f184327b.f184330a.getCFACInsuranceDetails(params);
                        kce.c cVar = new kce.c(new kh4.b(19), 16);
                        cFACInsuranceDetails.getClass();
                        ufm.i iVar = new ufm.i(cFACInsuranceDetails, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        String params2 = (String) obj2;
                        CFACInsuranceDetails domain = (CFACInsuranceDetails) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f184327b.f184331b.f(params2, domain);
                        break;
                    default:
                        String params3 = (String) obj2;
                        CFACInsuranceDetails domain2 = (CFACInsuranceDetails) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        xe0.e eVar = this.f184327b.f184332c;
                        Intrinsics.checkNotNullParameter(domain2, "<this>");
                        String str = domain2.f74988a;
                        String strH = u1.h(domain2.f74989b, gj7.a.f144238a);
                        if (strH == null) {
                            strH = "";
                        }
                        CFACInsurer cFACInsurer = domain2.f74990c;
                        Intrinsics.checkNotNullParameter(cFACInsurer, "<this>");
                        v vVar = new v(cFACInsurer.f74991a, cFACInsurer.f74992b);
                        CFACClaimProperties cFACClaimProperties = domain2.d;
                        Intrinsics.checkNotNullParameter(cFACClaimProperties, "<this>");
                        CFACClaimTransactions cFACClaimTransactions = cFACClaimProperties.f74973a;
                        Intrinsics.checkNotNullParameter(cFACClaimTransactions, "<this>");
                        long j2 = cFACClaimTransactions.f74976a;
                        ArrayList arrayList = cFACClaimTransactions.f74977b;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            CFACClaimTransactions.EligibleTransaction eligibleTransaction = (CFACClaimTransactions.EligibleTransaction) it8.next();
                            Intrinsics.checkNotNullParameter(eligibleTransaction, "<this>");
                            arrayList2.add(new q.a(u1.g(eligibleTransaction.f74978a, r11.a.o), u1.g(eligibleTransaction.f74979b, r11.a.i), eligibleTransaction.f74980c.name(), eligibleTransaction.d));
                            it8 = it8;
                            str = str;
                            strH = strH;
                        }
                        String str2 = str;
                        String str3 = strH;
                        q qVar = new q(j2, arrayList2);
                        ArrayList<CFACPaymentPurpose> arrayList3 = cFACClaimProperties.f74974b;
                        Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                        for (CFACPaymentPurpose cFACPaymentPurpose : arrayList3) {
                            arrayList4.add(new x(cFACPaymentPurpose.f74996a, cFACPaymentPurpose.f74997b, cFACPaymentPurpose.f74998c));
                        }
                        ArrayList<CFACPaymentCanceller> arrayList5 = cFACClaimProperties.f74975c;
                        Intrinsics.checkNotNullParameter(arrayList5, "<this>");
                        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                        for (CFACPaymentCanceller cFACPaymentCanceller : arrayList5) {
                            arrayList6.add(new aj7.w(cFACPaymentCanceller.f74993a, cFACPaymentCanceller.f74994b, cFACPaymentCanceller.f74995c));
                        }
                        aj7.o oVar = new aj7.o(qVar, arrayList4, arrayList6);
                        ArrayList arrayList7 = domain2.e;
                        Intrinsics.checkNotNullParameter(arrayList7, "<this>");
                        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                        Iterator it9 = arrayList7.iterator();
                        while (it9.hasNext()) {
                            CFACProductDetails cFACProductDetails = (CFACProductDetails) it9.next();
                            String str4 = cFACProductDetails.f74999a;
                            CFACProductSummary cFACProductSummary = cFACProductDetails.f75000b;
                            Intrinsics.checkNotNullParameter(cFACProductSummary, "<this>");
                            String str5 = cFACProductSummary.f75005a;
                            ArrayList<CFACProductLink> arrayList9 = cFACProductSummary.f75006b;
                            Intrinsics.checkNotNullParameter(arrayList9, "<this>");
                            ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                            for (CFACProductLink cFACProductLink : arrayList9) {
                                arrayList10.add(new aj7.z(cFACProductLink.f75002a, cFACProductLink.f75003b, cFACProductLink.f75004c));
                                it9 = it9;
                                str4 = str4;
                            }
                            Iterator it10 = it9;
                            String str6 = str4;
                            a0 a0Var = new a0(str5, arrayList10);
                            dl7.b bVar = cFACProductDetails.f75001c;
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            el7.b bVar2 = new el7.b(ebm.a.K(bVar.f115711a), bVar.f115712b, bVar.f115713c);
                            ArrayList<CFACCoverage> arrayList11 = cFACProductDetails.d;
                            Intrinsics.checkNotNullParameter(arrayList11, "<this>");
                            ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                            for (CFACCoverage cFACCoverage : arrayList11) {
                                String strH2 = u1.h(cFACCoverage.f74981a, ij7.a.f161720a);
                                if (strH2 == null) {
                                    strH2 = "";
                                }
                                arrayList12.add(new r(strH2, cFACCoverage.f74982b));
                            }
                            arrayList8.add(new y(str6, a0Var, bVar2, arrayList12, zi7.a.c(cFACProductDetails.e), zi7.a.c(cFACProductDetails.f)));
                            it9 = it10;
                        }
                        eVar.G(new u(str2, str3, vVar, oVar, arrayList8), params3, wim.z.d(o0.b(u.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
