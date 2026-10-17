package p5a;

import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import com.revolut.feature.push_to_card.api.navigation.PushToCardReviewControllerDescriptor;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferReviewInputData;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.quotes.TransferQuoteUserIdentifier;
import cu8.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o9k.t0;
import opf.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f233077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f233078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f233079c;
    public final wsg.n d;
    public final asa.m e;
    public final f4h.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t0 f233080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bqf.d f233081h;
    public final bqf.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r9k.k f233082j;
    public final csa.c k;

    public l(fk3.a configurationInteractor, r0 kycTransformer, z transferFundingSourceInteractor, wsg.n walletInteractor, asa.m pushToCardErrorStateProvider, f4h.a bankTransferExtraData, t0 p2pExtension, bqf.d trustInteractor, bqf.g trustedPayeeChecker, r9k.k p2pErrorStateProvider, csa.c pushToCardDialogProvider) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(kycTransformer, "kycTransformer");
        Intrinsics.checkNotNullParameter(transferFundingSourceInteractor, "transferFundingSourceInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(pushToCardErrorStateProvider, "pushToCardErrorStateProvider");
        Intrinsics.checkNotNullParameter(bankTransferExtraData, "bankTransferExtraData");
        Intrinsics.checkNotNullParameter(p2pExtension, "p2pExtension");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        Intrinsics.checkNotNullParameter(trustedPayeeChecker, "trustedPayeeChecker");
        Intrinsics.checkNotNullParameter(p2pErrorStateProvider, "p2pErrorStateProvider");
        Intrinsics.checkNotNullParameter(pushToCardDialogProvider, "pushToCardDialogProvider");
        this.f233077a = configurationInteractor;
        this.f233078b = kycTransformer;
        this.f233079c = transferFundingSourceInteractor;
        this.d = walletInteractor;
        this.e = pushToCardErrorStateProvider;
        this.f = bankTransferExtraData;
        this.f233080g = p2pExtension;
        this.f233081h = trustInteractor;
        this.i = trustedPayeeChecker;
        this.f233082j = p2pErrorStateProvider;
        this.k = pushToCardDialogProvider;
    }

    public static o97.b f(boolean z, CardOwnerWithStats cardOwnerWithStats, dj0.d dVar, PushToCardTransferData pushToCardTransferData) {
        CardOwner cardOwner = cardOwnerWithStats.f81495a;
        return z ? new o97.b(new PushToCardReviewControllerDescriptor(new PushToCardTransferReviewInputData(cardOwner, pushToCardTransferData))) : new o97.b(new cqa.a(PushToCardTransferInputData.Companion.a(PushToCardTransferInputData.INSTANCE, cardOwner, new TransferMoneyPocket(dVar, null, 2), TransferFlowType.Default.f92257b, 24)));
    }

    public static TransferQuoteUserIdentifier.Code g(zm3.a aVar) {
        if (aVar instanceof zm3.e) {
            return null;
        }
        if (aVar instanceof zm3.f) {
            return new TransferQuoteUserIdentifier.Code(((zm3.f) aVar).f323345a);
        }
        if (aVar instanceof zm3.i) {
            return new TransferQuoteUserIdentifier.Code(((zm3.i) aVar).f323353g);
        }
        if (aVar instanceof zm3.j) {
            return new TransferQuoteUserIdentifier.Code(((zm3.j) aVar).f);
        }
        if (aVar instanceof zm3.n) {
            return null;
        }
        if (aVar instanceof zm3.o) {
            return new TransferQuoteUserIdentifier.Code(((zm3.o) aVar).f323376a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(f5j.a r32, dj0.d r33, gim.c r34) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5a.l.a(f5j.a, dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.push_to_card.api.data.CardOwnerWithStats r19, dj0.d r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5a.l.b(com.revolut.feature.push_to_card.api.data.CardOwnerWithStats, dj0.d, gim.c):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public final java.lang.Object c(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r31v0 ??
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dj0.d r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5a.l.d(dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(dj0.d r25, gim.c r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            boolean r3 = r2 instanceof p5a.j
            if (r3 == 0) goto L19
            r3 = r2
            p5a.j r3 = (p5a.j) r3
            int r4 = r3.f233073x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f233073x = r4
            goto L1e
        L19:
            p5a.j r3 = new p5a.j
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.v
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f233073x
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L2f
            dj0.d r1 = r3.u
            yhm.o.b(r2)
            goto L45
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            yhm.o.b(r2)
            r3.u = r1
            r3.f233073x = r6
            java.lang.Object r2 = r0.d(r1, r3)
            if (r2 != r4) goto L45
            return r4
        L45:
            r8 = r2
            com.revolut.feature.transfer.core.models.FundingSource r8 = (com.revolut.feature.transfer.core.models.FundingSource) r8
            long r4 = r1.f115082a
            xi0.b r6 = r1.f115083b
            xi0.b r7 = r8.f92241b
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote$SimpleNote r10 = new com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote$SimpleNote
            java.lang.String r1 = ""
            r10.<init>(r1)
            m1l.a r12 = m1l.a.SCHEDULE_DISABLED
            com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData r13 = new com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData
            r1 = 0
            r2 = 7
            r14 = 0
            r13.<init>(r14, r1, r2)
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r3 = new com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData
            r22 = 0
            r23 = 1046528(0xff800, float:1.466498E-39)
            com.revolut.core.model.account.AccountId$Personal r9 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r11 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p5a.l.e(dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(gz9.c r7, dj0.d r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5a.l.h(gz9.c, dj0.d, gim.c):java.lang.Object");
    }
}
