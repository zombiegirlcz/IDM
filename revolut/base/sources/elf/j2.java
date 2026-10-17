package elf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j2 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127356l;

    public j2(klf.h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f127356l = commonDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof elf.i2
            if (r0 == 0) goto L13
            r0 = r5
            elf.i2 r0 = (elf.i2) r0
            int r1 = r0.f127350w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127350w = r1
            goto L18
        L13:
            elf.i2 r0 = new elf.i2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127350w
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
            klf.h0 r5 = r4.f127356l
            kotlinx.coroutines.flow.SharedFlow r5 = r5.d()
            r0.f127350w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            tof.a3 r5 = (tof.a3) r5
            java.lang.String r0 = r5.f272581b
            java.lang.String r5 = r5.f272614t
            r1 = 0
            if (r5 == 0) goto L51
            boolean r2 = kotlin.text.d0.W(r5)
            if (r2 != 0) goto L51
            goto L52
        L51:
            r5 = r1
        L52:
            if (r5 != 0) goto L56
            java.lang.String r5 = ""
        L56:
            com.revolut.feature.transactions.impl.ui.kompot.edit_note.declaration.EditNoteDestination r1 = new com.revolut.feature.transactions.impl.ui.kompot.edit_note.declaration.EditNoteDestination
            r1.<init>(r0, r5)
            r4.A2(r1)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.j2.Z2(gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return (Intrinsics.f(str, "ID_COMMENT") || Intrinsics.f(str, "ID_MENU_ITEM_NOTE")) ? Z2((gim.c) continuation) : Boolean.FALSE;
    }
}
