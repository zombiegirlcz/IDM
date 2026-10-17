package elf;

import ip0.u00;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class s1 extends yji.n implements s0 {

    @NotNull
    public static final o1 Companion = new o1();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bmf.b f127408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e60.a f127409n;
    public final t80.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rnf.g f127410p;

    public s1(klf.h0 commonDataSource, bmf.b modalFactory, e60.a mediaPicker, t80.c mediaPickerConfiguration, rnf.g receiptsDelegate) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        Intrinsics.checkNotNullParameter(mediaPicker, "mediaPicker");
        Intrinsics.checkNotNullParameter(mediaPickerConfiguration, "mediaPickerConfiguration");
        Intrinsics.checkNotNullParameter(receiptsDelegate, "receiptsDelegate");
        this.f127407l = commonDataSource;
        this.f127408m = modalFactory;
        this.f127409n = mediaPicker;
        this.o = mediaPickerConfiguration;
        this.f127410p = receiptsDelegate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (skm.e0.J(elm.f.f127540b, new mp6.j(r5, ((tof.a3) r12).f272579a, r7, (kotlin.coroutines.Continuation) null, 27), r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(e60.m r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof elf.p1
            if (r0 == 0) goto L13
            r0 = r12
            elf.p1 r0 = (elf.p1) r0
            int r1 = r0.f127397x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127397x = r1
            goto L18
        L13:
            elf.p1 r0 = new elf.p1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127397x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r12)
            goto L73
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            e60.m r11 = r0.u
            yhm.o.b(r12)
            goto L4c
        L38:
            yhm.o.b(r12)
            klf.h0 r12 = r10.f127407l
            kotlinx.coroutines.flow.SharedFlow r12 = r12.d()
            r0.u = r11
            r0.f127397x = r4
            java.lang.Object r12 = vkm.q.x(r12, r0)
            if (r12 != r1) goto L4c
            goto L72
        L4c:
            tof.a3 r12 = (tof.a3) r12
            java.io.File r7 = r11.b()
            java.lang.String r6 = r12.f272579a
            r8 = 0
            r0.u = r8
            r0.f127397x = r3
            rnf.g r11 = r10.f127410p
            r5 = r11
            rnf.l r5 = (rnf.l) r5
            r5.getClass()
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            mp6.j r4 = new mp6.j
            r9 = 27
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L73
        L72:
            return r1
        L73:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.s1.Z2(e60.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof elf.q1
            if (r0 == 0) goto L13
            r0 = r5
            elf.q1 r0 = (elf.q1) r0
            int r1 = r0.f127399w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127399w = r1
            goto L18
        L13:
            elf.q1 r0 = new elf.q1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127399w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            klf.h0 r5 = r4.f127407l
            kotlinx.coroutines.flow.SharedFlow r5 = r5.d()
            r0.f127399w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            tof.a3 r5 = (tof.a3) r5
            com.revolut.feature.transactions.impl.ui.kompot.receipts.declaration.ReceiptsDestination r0 = new com.revolut.feature.transactions.impl.ui.kompot.receipts.declaration.ReceiptsDestination
            java.lang.String r5 = r5.f272579a
            r0.<init>(r5)
            r4.A2(r0)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.s1.b3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r12, java.lang.String r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            java.lang.String r0 = "ID_RECEIPTS"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r13, r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L75
            boolean r13 = r12 instanceof cw0.a.C0648a
            if (r13 == 0) goto L12
            r11.c3()
            goto L69
        L12:
            boolean r13 = r12 instanceof cw0.c
            if (r13 != 0) goto L6e
            boolean r13 = r12 instanceof cw0.a.b
            if (r13 == 0) goto L1b
            goto L6e
        L1b:
            boolean r13 = r12 instanceof cw0.d
            if (r13 == 0) goto L68
            cw0.d r12 = (cw0.d) r12
            cw0.i r12 = r12.f109514a
            java.lang.Object r12 = r12.e
            boolean r13 = r12 instanceof java.io.File
            r14 = 0
            if (r13 == 0) goto L2d
            java.io.File r12 = (java.io.File) r12
            goto L2e
        L2d:
            r12 = r14
        L2e:
            if (r12 != 0) goto L31
            goto L68
        L31:
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_attachment_delete_title
            r0 = 14
            r4.<init>(r13, r14, r14, r0)
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_attachment_delete_subtitle
            r5.<init>(r13, r14, r14, r0)
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r13 = 2131961859(0x7f132803, float:1.9560427E38)
            r6.<init>(r13, r14, r14, r0)
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r13 = 2131961867(0x7f13280b, float:1.9560443E38)
            r8.<init>(r13, r14, r14, r0)
            r9 = 0
            r10 = 472(0x1d8, float:6.61E-43)
            bmf.b r3 = r11.f127408m
            r7 = 0
            com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController r13 = bmf.a.b(r3, r4, r5, r6, r7, r8, r9, r10)
            eed.j r14 = new eed.j
            r0 = 18
            r14.<init>(r11, r12, r0)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r12 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r11.N2(r13, r12, r14)
            goto L69
        L68:
            r1 = r2
        L69:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
            return r12
        L6e:
            gim.c r14 = (gim.c) r14
            java.lang.Object r12 = r11.b3(r14)
            return r12
        L75:
            java.lang.String r14 = "ID_MENU_ITEM_UPLOAD_RECEIPT"
            boolean r13 = kotlin.jvm.internal.Intrinsics.f(r13, r14)
            if (r13 == 0) goto L87
            boolean r12 = r12 instanceof cw0.a.C0648a
            if (r12 == 0) goto L85
            r11.c3()
            goto L86
        L85:
            r1 = r2
        L86:
            r2 = r1
        L87:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.s1.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c3() {
        ((e60.s) this.f127409n).T(new e60.i(null, null, null, true, 0, 0, null, null, false, u00.BACK, null, 15607));
        T2(new ebg.o(this, null, 17), new yi5.b(27));
    }
}
