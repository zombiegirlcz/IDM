package l98;

import kotlin.jvm.internal.Intrinsics;
import wsg.n;
import zjh.i;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y13.c f193117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f193118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f193119c;
    public final uq8.a d;
    public final hj8.a e;
    public final z43.a f;

    public f(y13.c flowConnector, n walletsInteractor, i juniorCardOrderInteractor, uq8.a juniorTransferCommandFactory, hj8.a juniorProfileInteractor, z43.a cardPersonalisationInteractor) {
        Intrinsics.checkNotNullParameter(flowConnector, "flowConnector");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(juniorCardOrderInteractor, "juniorCardOrderInteractor");
        Intrinsics.checkNotNullParameter(juniorTransferCommandFactory, "juniorTransferCommandFactory");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(cardPersonalisationInteractor, "cardPersonalisationInteractor");
        this.f193117a = flowConnector;
        this.f193118b = walletsInteractor;
        this.f193119c = juniorCardOrderInteractor;
        this.d = juniorTransferCommandFactory;
        this.e = juniorProfileInteractor;
        this.f = cardPersonalisationInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r31, java.lang.String r32, java.lang.String r33, b93.b r34, com.revolut.retail.core.navigation.NaviCommand r35, gim.c r36) throws com.revolut.feature.card_order_new.api.junior.CardDesignNotFoundException {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l98.f.a(java.lang.String, java.lang.String, java.lang.String, b93.b, com.revolut.retail.core.navigation.NaviCommand, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r27, java.lang.String r28, java.lang.String r29, b93.b r30, com.revolut.retail.core.navigation.NaviCommand r31, gim.c r32) throws com.revolut.feature.card_order_new.api.junior.CardDesignNotFoundException {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l98.f.b(java.lang.String, java.lang.String, java.lang.String, b93.b, com.revolut.retail.core.navigation.NaviCommand, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.retail.core.navigation.NaviCommand r19, java.lang.String r20, java.lang.String r21, gim.c r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r22
            boolean r2 = r1 instanceof l98.c
            if (r2 == 0) goto L17
            r2 = r1
            l98.c r2 = (l98.c) r2
            int r3 = r2.f193112w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f193112w = r3
            goto L1c
        L17:
            l98.c r2 = new l98.c
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f193112w
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            yhm.o.b(r1)
            goto Laa
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            yhm.o.b(r1)
            if (r19 != 0) goto L70
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r4 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration
            s49.a r6 = s49.a.SINGLE_TOP
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration r7 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$MainContainerTabId r8 = u49.a.f277277c
            r9 = 0
            r10 = 6
            r7.<init>(r8, r9, r9, r10)
            r4.<init>(r6, r7)
            r1.<init>(r4)
            com.revolut.retail.core.navigation.FeatureCommand r4 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.card_screen.api.models.CardScreenAction$Select r6 = new com.revolut.feature.card_screen.api.models.CardScreenAction$Select
            r7 = 0
            r8 = r21
            r6.<init>(r8, r10, r7, r7)
            i63.a r12 = i63.a.JUNIOR
            com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig r11 = new com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig
            r14 = 0
            r17 = 4
            com.revolut.core.model.account.AccountId$Personal r15 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r13 = r20
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r4.<init>(r11)
            com.revolut.retail.core.navigation.CompositeCommand r1 = com.revolut.retail.core.navigation.a.c(r1, r4)
            goto L72
        L70:
            r1 = r19
        L72:
            uq8.a r4 = r0.d
            r13 = r20
            rfm.j r4 = r4.a(r13, r5)
            com.revolut.retail.core.navigation.DummyCommand r6 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            rfm.f0 r4 = r4.p(r6)
            java.lang.String r7 = "toSingle(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r7)
            pfm.z r4 = ue0.e.F(r4, r6)
            ec9.a r6 = new ec9.a
            r7 = 3
            r6.<init>(r1, r7)
            l5i.b r1 = new l5i.b
            r7 = 17
            r1.<init>(r7, r6)
            ufm.i r6 = new ufm.i
            r7 = 1
            r6.<init>(r4, r1, r7)
            java.lang.String r1 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            r2.f193112w = r5
            java.lang.Object r1 = nim.a.b(r6, r2)
            if (r1 != r3) goto Laa
            return r3
        Laa:
            java.lang.String r2 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l98.f.c(com.revolut.retail.core.navigation.NaviCommand, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r22, java.lang.String r23, java.lang.String r24, com.revolut.retail.core.navigation.NaviCommand r25, gim.c r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r26
            boolean r2 = r1 instanceof l98.d
            if (r2 == 0) goto L17
            r2 = r1
            l98.d r2 = (l98.d) r2
            int r3 = r2.f193115y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f193115y = r3
            goto L1c
        L17:
            l98.d r2 = new l98.d
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f193113w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f193115y
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L45
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L32
            com.revolut.retail.core.navigation.NaviCommand r2 = r2.v
            yhm.o.b(r1)
            r12 = r2
            goto L7e
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            java.lang.String r4 = r2.u
            yhm.o.b(r1)
            r20 = r4
            r4 = r1
            r1 = r20
            goto L5b
        L45:
            yhm.o.b(r1)
            r1 = r22
            r2.u = r1
            r2.f193115y = r6
            r4 = r23
            r8 = r24
            r9 = r25
            java.lang.Object r4 = r0.c(r9, r4, r8, r2)
            if (r4 != r3) goto L5b
            goto L7c
        L5b:
            com.revolut.retail.core.navigation.NaviCommand r4 = (com.revolut.retail.core.navigation.NaviCommand) r4
            r2.u = r7
            r2.v = r4
            r2.f193115y = r5
            hj8.a r5 = r0.e
            w4l.j r8 = w4l.j.f294644c
            akg.n r1 = hj8.a.a(r5, r1, r8)
            l2c.v r5 = new l2c.v
            r8 = 29
            r5.<init>(r8)
            jhi.b r1 = mo3.a.g(r1, r7, r5, r6)
            java.lang.Object r1 = vkm.q.x(r1, r2)
            if (r1 != r3) goto L7d
        L7c:
            return r3
        L7d:
            r12 = r4
        L7e:
            com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r1 = (com.revolut.feature.junior_profile.api.models.JuniorBankingProfile) r1
            com.revolut.retail.operation_status.modal_screen.a r8 = h3l.g.Companion
            com.revolut.retail.operation_status.modal_status.StatusViewConfiguration$Success r13 = new com.revolut.retail.operation_status.modal_status.StatusViewConfiguration$Success
            com.revolut.core.ui_kit.models.TextLocalisedClause r15 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.junior.card_request.impl.R$string.junior_virtual_card_order_success_title
            java.lang.String r1 = r1.f77099b
            java.util.List r1 = zhm.u.c(r1)
            r3 = 12
            r15.<init>(r2, r1, r7, r3)
            r18 = 0
            r19 = 2044(0x7fc, float:2.864E-42)
            java.lang.String r14 = "ID_STATUS_VIEW_VIRTUAL_CARD_ORDER_SUCCESS"
            r16 = 0
            r17 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r1 = 0
            r14 = 478(0x1de, float:6.7E-43)
            r10 = 0
            r11 = 0
            r9 = r13
            r13 = r1
            com.revolut.retail.core.navigation.ActivityNavigateCommand r1 = com.revolut.retail.operation_status.modal_screen.a.a(r8, r9, r10, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l98.f.d(java.lang.String, java.lang.String, java.lang.String, com.revolut.retail.core.navigation.NaviCommand, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof l98.e
            if (r0 == 0) goto L13
            r0 = r8
            l98.e r0 = (l98.e) r0
            int r1 = r0.f193116w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f193116w = r1
            goto L18
        L13:
            l98.e r0 = new l98.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f193116w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L5f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            wsg.n r8 = r6.f193118b
            r2 = 4
            efm.r r7 = osg.b.a(r8, r7, r3, r2)
            k8d.t r8 = new k8d.t
            r2 = 26
            r8.<init>(r2)
            l2c.v r2 = new l2c.v
            r4 = 27
            r2.<init>(r4)
            l2c.v r4 = new l2c.v
            r5 = 28
            r4.<init>(r5)
            efm.r r7 = m70.a.f(r7, r8, r2, r4)
            vkm.d r7 = rd0.e.b(r7)
            r0.f193116w = r3
            java.lang.Object r8 = vkm.q.x(r7, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            java.lang.String r7 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l98.f.e(java.lang.String, gim.c):java.lang.Object");
    }
}
