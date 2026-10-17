package ghc;

import cgc.m;
import com.revolut.feature.rewards.api.model.rewards.AttributedText;
import com.revolut.feature.rewards.api.model.rewards.RewardFooterDetailsItem;
import ehc.o;
import ehc.s;
import ehc.x;
import ggc.c0;
import ggc.d0;
import ggc.t;
import ggc.y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.LocalDateTime;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e {
    public static final Object a(Object obj2, c cVar, String str) {
        if (obj2 != null) {
            return obj2;
        }
        IllegalStateException illegalStateException = new IllegalStateException(cVar + " is missing the required '" + str + "', dropping it");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.rewards.api.model.rewards.RewardAvatar b(ehc.c r8) {
        /*
            java.lang.String r0 = r8.getType()
            java.lang.String r1 = "ICON"
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            r2 = 0
            if (r1 == 0) goto L4c
            java.lang.String r0 = r8.getName()
            ghc.c r1 = ghc.c.AVATAR_ICON
            java.lang.String r3 = "name"
            java.lang.Object r0 = a(r0, r1, r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L6a
            java.lang.String r8 = r8.getStyle()
            if (r8 == 0) goto L3f
            ggc.x[] r1 = ggc.x.values()
            int r3 = r1.length
            r4 = 0
        L29:
            if (r4 >= r3) goto L3d
            r5 = r1[r4]
            java.lang.String r6 = r5.name()
            r7 = 1
            boolean r6 = kotlin.text.a0.z(r6, r8, r7)
            if (r6 == 0) goto L3a
            r2 = r5
            goto L3d
        L3a:
            int r4 = r4 + 1
            goto L29
        L3d:
            if (r2 != 0) goto L41
        L3f:
            ggc.x r2 = ggc.x.NORMAL
        L41:
            com.revolut.feature.rewards.api.model.rewards.RewardIcon r8 = new com.revolut.feature.rewards.api.model.rewards.RewardIcon
            r8.<init>(r0, r2)
            com.revolut.feature.rewards.api.model.rewards.RewardAvatar$Icon r0 = new com.revolut.feature.rewards.api.model.rewards.RewardAvatar$Icon
            r0.<init>(r8)
            return r0
        L4c:
            java.lang.String r1 = "IMAGE"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 == 0) goto L6a
            java.lang.String r8 = r8.getUrl()
            ghc.c r0 = ghc.c.AVATAR_IMAGE
            java.lang.String r1 = "url"
            java.lang.Object r8 = a(r8, r0, r1)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L6a
            com.revolut.feature.rewards.api.model.rewards.RewardAvatar$Image r0 = new com.revolut.feature.rewards.api.model.rewards.RewardAvatar$Image
            r0.<init>(r8)
            return r0
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ghc.e.b(ehc.c):com.revolut.feature.rewards.api.model.rewards.RewardAvatar");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetButton c(ehc.s.e r10) {
        /*
            java.lang.String r0 = r10.getText()
            ghc.c r1 = ghc.c.BOTTOM_SHEET_FOOTER_BUTTON
            java.lang.String r2 = "text"
            java.lang.Object r0 = a(r0, r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            if (r0 != 0) goto L13
            goto L8d
        L13:
            ehc.s$d r3 = r10.getAction()
            java.lang.String r4 = "action"
            java.lang.Object r1 = a(r3, r1, r4)
            ehc.s$d r1 = (ehc.s.d) r1
            if (r1 == 0) goto L8d
            java.lang.String r3 = r1.getType()
            ghc.a[] r4 = ghc.a.values()
            int r5 = r4.length
            r6 = 0
        L2b:
            r7 = 1
            if (r6 >= r5) goto L3e
            r8 = r4[r6]
            java.lang.String r9 = r8.name()
            boolean r9 = kotlin.text.a0.z(r9, r3, r7)
            if (r9 == 0) goto L3b
            goto L3f
        L3b:
            int r6 = r6 + 1
            goto L2b
        L3e:
            r8 = r2
        L3f:
            if (r8 != 0) goto L43
        L41:
            r4 = r2
            goto L80
        L43:
            java.lang.String r3 = r1.getUrl()
            ghc.c r4 = ghc.c.BOTTOM_SHEET_FOOTER_BUTTON_ACTION
            java.lang.String r5 = "url"
            java.lang.Object r3 = a(r3, r4, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L54
            goto L41
        L54:
            int[] r5 = ghc.d.f143902b
            int r6 = r8.ordinal()
            r5 = r5[r6]
            if (r5 == r7) goto L7b
            r6 = 2
            if (r5 != r6) goto L75
            java.lang.String r1 = r1.getCopyable()
            java.lang.String r5 = "copyable"
            java.lang.Object r1 = a(r1, r4, r5)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L41
            com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetAction$CopyAndOpenUrl r4 = new com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetAction$CopyAndOpenUrl
            r4.<init>(r1, r3)
            goto L80
        L75:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L7b:
            com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetAction$OpenUrl r4 = new com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetAction$OpenUrl
            r4.<init>(r3)
        L80:
            if (r4 != 0) goto L83
            goto L8d
        L83:
            com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetButton r1 = new com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetButton
            java.lang.String r10 = r10.getIcon()
            r1.<init>(r10, r0, r4)
            return r1
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ghc.e.c(ehc.s$e):com.revolut.feature.rewards.api.model.rewards.RewardBottomSheetButton");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.rewards.api.model.rewards.RewardFooterButton d(ehc.s.g r20) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ghc.e.d(ehc.s$g):com.revolut.feature.rewards.api.model.rewards.RewardFooterButton");
    }

    public static final RewardFooterDetailsItem e(s.i iVar) {
        String str = (String) a(iVar.getTitle(), c.DETAILS_ITEM, "title");
        if (str == null) {
            return null;
        }
        List description = iVar.getDescription();
        if (description == null) {
            description = f0.f322471a;
        }
        List<ehc.b> list = description;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (ehc.b bVar : list) {
            arrayList.add(new AttributedText(bVar.getText(), bVar.getStrikethrough()));
        }
        return new RewardFooterDetailsItem(str, arrayList);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public static final ggc.l f(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
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

    public static final t g(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return new t(oVar.getTiny(), oVar.getBrief(), oVar.getNormal(), oVar.getVerbose(), oVar.getTerms(), oVar.getPicture());
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public static c0 h(x xVar, int i) {
        m mVar;
        boolean z = (i & 4) == 0;
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        String id10 = xVar.getId();
        String perkId = xVar.getPerkId();
        d0 d0Var = (d0) u1.v(xVar.getType(), hhc.d.f152384a);
        if (d0Var == null) {
            d0Var = d0.UNKNOWN;
        }
        Long start = xVar.getStart();
        LocalDateTime localDateTime = new LocalDateTime(start != null ? start.longValue() : 0L);
        Long end2 = xVar.getEnd();
        LocalDateTime localDateTime2 = new LocalDateTime(end2 != null ? end2.longValue() : 0L);
        y yVarI = yoj.b.I(xVar.getMerchant());
        t tVarG = g(xVar.getDescription());
        String primaryCategory = xVar.getPrimaryCategory();
        ahc.e socialProof = xVar.getSocialProof();
        if (socialProof != null) {
            Intrinsics.checkNotNullParameter(socialProof, "<this>");
            mVar = new m(socialProof.getLikes());
        } else {
            mVar = null;
        }
        String activationState = xVar.getActivationState();
        ggc.m mVar2 = activationState != null ? (ggc.m) u1.v(activationState, hhc.b.f152382a) : null;
        Boolean onlyManualActivation = xVar.getOnlyManualActivation();
        return new c0(id10, perkId, d0Var, localDateTime, localDateTime2, yVarI, tVarG, primaryCategory, mVar, mVar2, false, false, z, onlyManualActivation != null ? onlyManualActivation.booleanValue() : false);
    }
}
