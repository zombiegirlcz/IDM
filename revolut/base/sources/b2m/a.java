package b2m;

import a3m.e;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentSignatureVerifyingParams;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTDocumentType;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTResidenceCardAddress;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTSubmitDocumentRequestResidenceCard;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct.PostIcChipReaderJapanCtProcessesDocumentRequestBody;
import gim.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m2m.m;
import y1m.d;
import y1m.g;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2m.b f11967a;

    public a(g2m.b coreEkycIcChipReaderJapanRepository) {
        Intrinsics.checkNotNullParameter(coreEkycIcChipReaderJapanRepository, "coreEkycIcChipReaderJapanRepository");
        this.f11967a = coreEkycIcChipReaderJapanRepository;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public final java.lang.Object a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r39v0 ??
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

    public final Object b(String str, d model, Continuation continuation) {
        m mVar = (m) this.f11967a;
        mVar.getClass();
        ICChipReaderJapanCTDocumentType iCChipReaderJapanCTDocumentType = ICChipReaderJapanCTDocumentType.INDIVIDUAL_NUMBER_CARD;
        e model2 = model.f310435c;
        Intrinsics.checkNotNullParameter(model2, "model");
        ICChipReaderJapanCTDocumentSignatureVerifyingParams iCChipReaderJapanCTDocumentSignatureVerifyingParams = new ICChipReaderJapanCTDocumentSignatureVerifyingParams(model2.b(), model2.c(), model2.a());
        Intrinsics.checkNotNullParameter(model, "model");
        return mVar.b(str, new PostIcChipReaderJapanCtProcessesDocumentRequestBody(iCChipReaderJapanCTDocumentType, iCChipReaderJapanCTDocumentSignatureVerifyingParams, null, null, null, new ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard(model.f310433a, model.f310434b), 28, null), (c) continuation);
    }

    public final Object c(String str, y1m.e model, Continuation continuation) {
        ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress;
        m mVar = (m) this.f11967a;
        mVar.getClass();
        ICChipReaderJapanCTDocumentType iCChipReaderJapanCTDocumentType = ICChipReaderJapanCTDocumentType.RESIDENCE_CARD;
        e model2 = model.f310440h;
        Intrinsics.checkNotNullParameter(model2, "model");
        ICChipReaderJapanCTDocumentSignatureVerifyingParams iCChipReaderJapanCTDocumentSignatureVerifyingParams = new ICChipReaderJapanCTDocumentSignatureVerifyingParams(model2.b(), model2.c(), model2.a());
        Intrinsics.checkNotNullParameter(model, "model");
        String str2 = model.f310436a;
        a3m.m model3 = model.f310437b;
        if (model3 != null) {
            Intrinsics.checkNotNullParameter(model3, "model");
            iCChipReaderJapanCTResidenceCardAddress = new ICChipReaderJapanCTResidenceCardAddress(model3.a(), model3.b(), model3.c());
        } else {
            iCChipReaderJapanCTResidenceCardAddress = null;
        }
        return mVar.b(str, new PostIcChipReaderJapanCtProcessesDocumentRequestBody(iCChipReaderJapanCTDocumentType, iCChipReaderJapanCTDocumentSignatureVerifyingParams, null, new ICChipReaderJapanCTSubmitDocumentRequestResidenceCard(str2, iCChipReaderJapanCTResidenceCardAddress, model.f310438c, model.d, model.e, model.f, model.f310439g), null, null, 52, null), (c) continuation);
    }

    public final Object d(String str, g model, Continuation continuation) {
        ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress;
        m mVar = (m) this.f11967a;
        mVar.getClass();
        ICChipReaderJapanCTDocumentType iCChipReaderJapanCTDocumentType = ICChipReaderJapanCTDocumentType.SPECIAL_PERMANENT_RESIDENT_CERTIFICATE;
        e model2 = model.e;
        Intrinsics.checkNotNullParameter(model2, "model");
        ICChipReaderJapanCTDocumentSignatureVerifyingParams iCChipReaderJapanCTDocumentSignatureVerifyingParams = new ICChipReaderJapanCTDocumentSignatureVerifyingParams(model2.b(), model2.c(), model2.a());
        Intrinsics.checkNotNullParameter(model, "model");
        String str2 = model.f310441a;
        a3m.m model3 = model.f310442b;
        if (model3 != null) {
            Intrinsics.checkNotNullParameter(model3, "model");
            iCChipReaderJapanCTResidenceCardAddress = new ICChipReaderJapanCTResidenceCardAddress(model3.a(), model3.b(), model3.c());
        } else {
            iCChipReaderJapanCTResidenceCardAddress = null;
        }
        return mVar.b(str, new PostIcChipReaderJapanCtProcessesDocumentRequestBody(iCChipReaderJapanCTDocumentType, iCChipReaderJapanCTDocumentSignatureVerifyingParams, null, null, new ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate(str2, iCChipReaderJapanCTResidenceCardAddress, model.f310443c, model.d), null, 44, null), (c) continuation);
    }
}
