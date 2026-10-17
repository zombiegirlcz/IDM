package kd8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_consent.impl.R$string;
import com.revolut.feature.shared.consent.prompt.builder.api.model.ConsentPromptData;
import com.revolut.feature.shared.consent.prompt.builder.api.navigation.ConsentPromptFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements vc8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj8.a f182856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f182857b;

    public v(hj8.a juniorProfileInteractor, e consentInteractor) {
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(consentInteractor, "consentInteractor");
        this.f182856a = juniorProfileInteractor;
        this.f182857b = consentInteractor;
    }

    public static FeatureCommand b(String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, CdnImage cdnImage, TextLocalisedClause textLocalisedClause3, String str2, v6d.a aVar) {
        return new FeatureCommand(new ConsentPromptFeatureConfig.Default(new ConsentPromptData(str, textLocalisedClause, textLocalisedClause2, cdnImage, textLocalisedClause3, new TextLocalisedClause(R$string.rev_u18_consents_actions_no_thanks, null, null, 14), null, null, str2, aVar, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), w6d.b.MODAL));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, v6d.a r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kd8.r
            if (r0 == 0) goto L13
            r0 = r7
            kd8.r r0 = (kd8.r) r0
            int r1 = r0.f182847x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f182847x = r1
            goto L18
        L13:
            kd8.r r0 = new kd8.r
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f182847x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            v6d.a r6 = r0.u
            yhm.o.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            r0.u = r6
            r0.f182847x = r3
            java.lang.Object r7 = r4.d(r5, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            xc8.g r7 = (xc8.g) r7
            java.util.Map r5 = r7.f304108b
            java.lang.Object r5 = r5.get(r6)
            xc8.c r5 = (xc8.c) r5
            r6 = 0
            if (r5 == 0) goto L4f
            xc8.b r7 = r5.f304103c
            goto L50
        L4f:
            r7 = r6
        L50:
            xc8.b r0 = xc8.b.GUARDIAN_CONSENT
            if (r7 == r0) goto L55
            return r6
        L55:
            java.lang.String r5 = r5.f304101a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kd8.v.a(java.lang.String, v6d.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r7 == r4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r18, java.lang.String r19, java.lang.String r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kd8.v.c(java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kd8.t
            if (r0 == 0) goto L13
            r0 = r9
            kd8.t r0 = (kd8.t) r0
            int r1 = r0.f182852x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f182852x = r1
            goto L18
        L13:
            kd8.t r0 = new kd8.t
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f182852x
            r3 = 0
            kd8.e r4 = r7.f182857b
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2d
            yhm.o.b(r9)
            return r9
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L3b
            goto L5e
        L3b:
            r9 = move-exception
            goto L61
        L3d:
            yhm.o.b(r9)
            r0.u = r8     // Catch: java.lang.Exception -> L3b
            r0.f182852x = r6     // Catch: java.lang.Exception -> L3b
            gd8.i r9 = r4.f182820a     // Catch: java.lang.Exception -> L3b
            gd8.p r9 = (gd8.p) r9     // Catch: java.lang.Exception -> L3b
            w4l.f r9 = r9.f     // Catch: java.lang.Exception -> L3b
            kotlin.Unit r2 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L3b
            efm.b r9 = r9.g(r2, r6)     // Catch: java.lang.Exception -> L3b
            java.lang.Object r9 = nim.a.a(r9, r0)     // Catch: java.lang.Exception -> L3b
            if (r9 != r1) goto L57
            goto L58
        L57:
            r9 = r2
        L58:
            if (r9 != r1) goto L5b
            r2 = r9
        L5b:
            if (r2 != r1) goto L5e
            goto L8b
        L5e:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L3b
            goto L6a
        L61:
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            rd0.d.a(r6, r3, r3, r9, r2)
        L6a:
            w4l.j r9 = w4l.j.f294644c
            akg.n r9 = r4.e(r8, r9)
            f28.b0 r2 = new f28.b0
            r4 = 6
            r2.<init>(r8, r4)
            kd8.f r8 = new kd8.f
            r4 = 9
            r8.<init>(r4)
            jhi.b r8 = mo3.a.e(r9, r2, r8)
            r0.u = r3
            r0.f182852x = r5
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L8c
        L8b:
            return r1
        L8c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kd8.v.d(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kd8.v.e(java.lang.String, gim.c):java.lang.Object");
    }
}
