package cuj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.api.rewards_hub.R$string;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.collection.RewardsHubCollectionScreenContract$InputData;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class y extends oki.h implements o {

    @NotNull
    public static final q Companion = new q();
    public final RewardsHubCollectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f109065p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h60.d f109066q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final stj.h f109067r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f109068s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cli.y f109069t;

    public y(b0 stateMapper, RewardsHubCollectionScreenContract$InputData inputData, a completionDialogMapper, h60.d animationControllerExtension, stj.h rewardsHubInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(completionDialogMapper, "completionDialogMapper");
        Intrinsics.checkNotNullParameter(animationControllerExtension, "animationControllerExtension");
        Intrinsics.checkNotNullParameter(rewardsHubInteractor, "rewardsHubInteractor");
        this.o = inputData;
        this.f109065p = completionDialogMapper;
        this.f109066q = animationControllerExtension;
        this.f109067r = rewardsHubInteractor;
        this.f109068s = new vii.b();
        this.f109069t = mra.d.b(this, new i(0), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(cuj.y r10, cuj.h r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof cuj.s
            if (r0 == 0) goto L13
            r0 = r12
            cuj.s r0 = (cuj.s) r0
            int r1 = r0.f109055x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109055x = r1
            goto L18
        L13:
            cuj.s r0 = new cuj.s
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109055x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            cuj.h r11 = r0.u
            yhm.o.b(r12)
            goto L4e
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            yhm.o.b(r12)
            d0j.v r12 = r11.f109038c
            java.lang.String r12 = r12.f110438c
            cuj.u r2 = new cuj.u
            r5 = 0
            r2.<init>(r10, r11, r3, r5)
            r0.u = r11
            r0.f109055x = r4
            tji.f r4 = r10.X()
            java.lang.Object r12 = zh9.u0.b0(r4, r12, r2, r0)
            if (r12 != r1) goto L4e
            return r1
        L4e:
            com.revolut.data.model.Data r12 = (com.revolut.data.model.Data) r12
            java.lang.Object r12 = r12.getContent()
            d0j.j r12 = (d0j.j) r12
            if (r12 != 0) goto L70
            java.lang.String r12 = "ACTIVATE_ERROR_STATUS_DIALOG_ID"
            nii.y0 r12 = K2(r12)
            kotlinx.coroutines.flow.Flow r5 = r10.X1(r12)
            cuj.t r8 = new cuj.t
            r12 = 0
            r8.<init>(r10, r11, r3, r12)
            r9 = 3
            r6 = 0
            r7 = 0
            r4 = r10
            yji.l.a1(r4, r5, r6, r7, r8, r9)
            goto L8b
        L70:
            r4 = r10
            d0j.b0 r10 = r11.f109037b
            cli.y r11 = r4.f109069t
            cp7.k r0 = new cp7.k
            r1 = 28
            r0.<init>(r10, r1)
            r4.H2(r11, r0)
            java.lang.String r10 = r12.f110408a
            java.lang.String r11 = r12.f110409b
            cuj.l r12 = new cuj.l
            r12.<init>(r10, r11)
            r4.C2(r12)
        L8b:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cuj.y.I2(cuj.y, cuj.h, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(cuj.y r10, cuj.h r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof cuj.x
            if (r0 == 0) goto L13
            r0 = r12
            cuj.x r0 = (cuj.x) r0
            int r1 = r0.f109064x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109064x = r1
            goto L18
        L13:
            cuj.x r0 = new cuj.x
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109064x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            cuj.h r11 = r0.u
            yhm.o.b(r12)
            goto L4e
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            yhm.o.b(r12)
            d0j.v r12 = r11.f109038c
            java.lang.String r12 = r12.f110438c
            cuj.u r2 = new cuj.u
            r5 = 1
            r2.<init>(r10, r11, r3, r5)
            r0.u = r11
            r0.f109064x = r4
            tji.f r5 = r10.X()
            java.lang.Object r12 = zh9.u0.b0(r5, r12, r2, r0)
            if (r12 != r1) goto L4e
            return r1
        L4e:
            com.revolut.data.model.Data r12 = (com.revolut.data.model.Data) r12
            java.lang.Object r12 = r12.getContent()
            if (r12 != 0) goto L6e
            java.lang.String r12 = "REVEAL_ERROR_STATUS_DIALOG_ID"
            nii.y0 r12 = K2(r12)
            kotlinx.coroutines.flow.Flow r5 = r10.X1(r12)
            cuj.t r8 = new cuj.t
            r12 = 1
            r8.<init>(r10, r11, r3, r12)
            r9 = 3
            r6 = 0
            r7 = 0
            r4 = r10
            yji.l.a1(r4, r5, r6, r7, r8, r9)
            goto L8c
        L6e:
            d0j.b0 r12 = r11.f109037b
            cli.y r0 = r10.f109069t
            cp7.k r1 = new cp7.k
            r2 = 28
            r1.<init>(r12, r2)
            r10.H2(r0, r1)
            cuj.m r12 = new cuj.m
            java.lang.String r0 = r11.f109036a
            d0j.v r11 = r11.f109038c
            java.lang.String r1 = r11.f110436a
            java.lang.String r11 = r11.f110437b
            r12.<init>(r0, r1, r11, r4)
            r10.C2(r12)
        L8c:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cuj.y.J2(cuj.y, cuj.h, gim.c):java.lang.Object");
    }

    public static y0 K2(String str) {
        return new y0(str, new nii.z(new TextLocalisedClause(R$string.rewards_hub_common_error_generic, null, null, 14), null, new TextLocalisedClause(R$string.rewards_hub_common_error_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f109068s, new bw4.s(continuation, this, 27)), null, null, new ck7.j(this, continuation, 26), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        mii.f fVar;
        cli.y yVar = this.f109069t;
        d0j.b0 type = ((i) ((j2) yVar.f22677a).getValue()).f109040b;
        if (type != null) {
            this.f109065p.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            int i = b.f109032a[type.ordinal()];
            Object obj2 = null;
            if (i == 1) {
                fVar = new mii.f("LAST_DAY_MESSAGE_DIALOG_ID", new TextLocalisedClause(R$string.rewards_hub_collections_last_day_advent_calendar, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_trophy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                IllegalStateException illegalStateException = new IllegalStateException("UNKNOWN type is not supported");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                fVar = null;
            }
            if (fVar != null) {
                X1(fVar);
            }
            this.f109066q.R(h60.a.f149577a);
            H2(yVar, new cp7.k(obj2, 28));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f109069t;
    }
}
