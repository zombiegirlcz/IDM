package fld;

import kotlin.jvm.internal.Intrinsics;
import lkd.k;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vqb.b f135947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f135948b;

    public d(vqb.b slotManagerChecklistDeeplinkParser) {
        Intrinsics.checkNotNullParameter(slotManagerChecklistDeeplinkParser, "slotManagerChecklistDeeplinkParser");
        this.f135947a = slotManagerChecklistDeeplinkParser;
        this.f135948b = q.b(0, 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // lkd.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(com.revolut.feature.slot_manager.api.model.SlotContext r3, lkd.j r4, lkd.d r5, kotlin.coroutines.Continuation r6) {
        /*
            r2 = this;
            boolean r3 = r6 instanceof fld.c
            if (r3 == 0) goto L13
            r3 = r6
            fld.c r3 = (fld.c) r3
            int r4 = r3.f135946w
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f135946w = r4
            goto L1a
        L13:
            fld.c r3 = new fld.c
            gim.c r6 = (gim.c) r6
            r3.<init>(r2, r6)
        L1a:
            java.lang.Object r4 = r3.u
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            int r0 = r3.f135946w
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            yhm.o.b(r4)
            goto L58
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L31:
            yhm.o.b(r4)
            boolean r4 = r5 instanceof lkd.a
            r0 = 0
            if (r4 == 0) goto L3c
            lkd.a r5 = (lkd.a) r5
            goto L3d
        L3c:
            r5 = r0
        L3d:
            if (r5 == 0) goto L42
            java.lang.String r4 = r5.f196355a
            goto L43
        L42:
            r4 = r0
        L43:
            if (r4 == 0) goto L4b
            vqb.b r5 = r2.f135947a
            com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistFetchConfig r0 = r5.a(r4)
        L4b:
            if (r0 == 0) goto L5b
            r3.f135946w = r1
            vkm.z1 r4 = r2.f135948b
            java.lang.Object r3 = r4.emit(r0, r3)
            if (r3 != r6) goto L58
            return r6
        L58:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L5b:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fld.d.Y(com.revolut.feature.slot_manager.api.model.SlotContext, lkd.j, lkd.d, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
