package zqa;

import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.feature_config.PushToCardCardTransferFeatureConfig;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerCreationInputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends n implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t1j.b f324445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f324446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ora.a f324447n;
    public final CardOwnerCreationInputData o;

    public f(t1j.b cardOwnerCreationDelegate, g creationDialogsMapper, ora.a resultObserver, CardOwnerCreationInputData inputData) {
        Intrinsics.checkNotNullParameter(cardOwnerCreationDelegate, "cardOwnerCreationDelegate");
        Intrinsics.checkNotNullParameter(creationDialogsMapper, "creationDialogsMapper");
        Intrinsics.checkNotNullParameter(resultObserver, "resultObserver");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f324445l = cardOwnerCreationDelegate;
        this.f324446m = creationDialogsMapper;
        this.f324447n = resultObserver;
        this.o = inputData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (c3(r7, (fqa.m) r8, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$CreationProcessState r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zqa.d
            if (r0 == 0) goto L13
            r0 = r8
            zqa.d r0 = (zqa.d) r0
            int r1 = r0.f324441x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f324441x = r1
            goto L18
        L13:
            zqa.d r0 = new zqa.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f324441x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto L8b
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$CreationProcessState r7 = r0.u
            yhm.o.b(r8)
            goto L4d
        L39:
            yhm.o.b(r8)
            zp8.g r8 = new zp8.g
            r2 = 1
            r8.<init>(r6, r7, r5, r2)
            r0.u = r7
            r0.f324441x = r4
            java.lang.Object r8 = do3.q.u(r6, r8, r0)
            if (r8 != r1) goto L4d
            goto L8a
        L4d:
            fqa.n r8 = (fqa.n) r8
            boolean r2 = r8 instanceof fqa.k
            if (r2 == 0) goto L7a
            fqa.k r8 = (fqa.k) r8
            fqa.l r7 = r8.f137237a
            int[] r8 = zqa.c.f324439b
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 != r4) goto L74
            zp5.g r7 = new zp5.g
            r8 = 2
            r7.<init>(r6, r5, r8)
            yi5.b r8 = new yi5.b
            r0 = 27
            r8.<init>(r0)
            r6.T2(r7, r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L74:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L7a:
            boolean r2 = r8 instanceof fqa.m
            if (r2 == 0) goto L8e
            fqa.m r8 = (fqa.m) r8
            r0.u = r5
            r0.f324441x = r3
            java.lang.Object r7 = r6.c3(r7, r8, r0)
            if (r7 != r1) goto L8b
        L8a:
            return r1
        L8b:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L8e:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zqa.f.Z2(com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$CreationProcessState, gim.c):java.lang.Object");
    }

    public final void b3(CardOwner cardOwner) {
        int i = c.f324438a[this.o.f81545a.ordinal()];
        h hVar = h.f324448b;
        if (i == 1) {
            A2(u0.c(new PushToCardCardTransferFeatureConfig(cardOwner, null, null, null, 14)));
            r2().M0(hVar);
        } else if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            r2().M0(new i(cardOwner));
        } else {
            this.f324447n.D(new eqa.b(cardOwner));
            r2().M0(hVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        if (r2 == r4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$CreationProcessState r20, fqa.m r21, gim.c r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            boolean r3 = r2 instanceof zqa.e
            if (r3 == 0) goto L19
            r3 = r2
            zqa.e r3 = (zqa.e) r3
            int r4 = r3.f324444y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f324444y = r4
            goto L1e
        L19:
            zqa.e r3 = new zqa.e
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f324442w
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f324444y
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L42
            if (r5 == r7) goto L3a
            if (r5 != r6) goto L32
            yhm.o.b(r2)
            goto Lb5
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            fqa.m r1 = r3.v
            com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$CreationProcessState r5 = r3.u
            yhm.o.b(r2)
            goto L94
        L42:
            yhm.o.b(r2)
            boolean r2 = r1.f137239b
            if (r2 == 0) goto Lbb
            zqa.g r2 = r0.f324446m
            r2.getClass()
            nii.y0 r2 = new nii.y0
            nii.l0 r9 = new nii.l0
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.push_to_card.impl.R$string.push2card_new_recipient_dialog_title
            r11 = 14
            r10.<init>(r5, r8, r8, r11)
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r12 = com.revolut.feature.push_to_card.impl.R$string.push2card_new_recipient_dialog_message
            r5.<init>(r12, r8, r8, r11)
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r12 = com.revolut.feature.push_to_card.impl.R$string.push2card_new_recipient_dialog_button_keep
            r13.<init>(r12, r8, r8, r11)
            com.revolut.core.ui_kit.models.TextLocalisedClause r14 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r12 = com.revolut.feature.push_to_card.impl.R$string.push2card_new_recipient_dialog_button_update
            r14.<init>(r12, r8, r8, r11)
            r17 = 0
            r18 = 996(0x3e4, float:1.396E-42)
            r12 = 0
            r15 = 0
            r16 = 0
            r11 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r5 = 0
            r10 = 5
            r2.<init>(r8, r9, r5, r10)
            kotlinx.coroutines.flow.Flow r2 = r0.L2(r2)
            r5 = r20
            r3.u = r5
            r3.v = r1
            r3.f324444y = r7
            java.lang.Object r2 = vkm.q.x(r2, r3)
            if (r2 != r4) goto L94
            goto Lb4
        L94:
            nii.n1 r2 = (nii.n1) r2
            boolean r7 = r2 instanceof nii.l1
            if (r7 == 0) goto La0
            com.revolut.feature.push_to_card.api.data.CardOwner r1 = r1.f137238a
            r0.b3(r1)
            goto Lc0
        La0:
            boolean r2 = r2 instanceof nii.m1
            if (r2 == 0) goto Lc0
            com.revolut.feature.push_to_card.api.data.CardOwner r1 = r1.f137238a
            r3.u = r8
            r3.v = r8
            r3.f324444y = r6
            t1j.b r2 = r0.f324445l
            java.lang.Object r2 = r2.n(r1, r5, r3)
            if (r2 != r4) goto Lb5
        Lb4:
            return r4
        Lb5:
            com.revolut.feature.push_to_card.api.data.CardOwner r2 = (com.revolut.feature.push_to_card.api.data.CardOwner) r2
            r0.b3(r2)
            goto Lc0
        Lbb:
            com.revolut.feature.push_to_card.api.data.CardOwner r1 = r1.f137238a
            r0.b3(r1)
        Lc0:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zqa.f.c3(com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$CreationProcessState, fqa.m, gim.c):java.lang.Object");
    }
}
