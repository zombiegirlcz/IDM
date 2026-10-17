package uo;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f281501a;

    public q(d1 viewAdapterDetailsFinder) {
        Intrinsics.checkNotNullParameter(viewAdapterDetailsFinder, "viewAdapterDetailsFinder");
        this.f281501a = viewAdapterDetailsFinder;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x014b A[LOOP:0: B:5:0x000b->B:132:0x014b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0150 A[EDGE_INSN: B:137:0x0150->B:133:0x0150 BREAK  A[LOOP:0: B:5:0x000b->B:132:0x014b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static uo.p b(koi.h r26, int r27) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.q.b(koi.h, int):uo.p");
    }

    public final p a(c1 viewAdapterDetails) {
        Intrinsics.checkNotNullParameter(viewAdapterDetails, "viewAdapterDetails");
        int i = viewAdapterDetails.f281469c;
        p pVarB = b(viewAdapterDetails.f281468b, i);
        int i2 = pVarB.f281499b;
        if (pVarB.f281498a == null) {
            boolean z = i2 == i + 1;
            c1 c1VarA = this.f281501a.a(viewAdapterDetails.f281467a);
            if (c1VarA != null) {
                p pVarB2 = b(c1VarA.f281468b, c1VarA.f281469c);
                if (!z) {
                    i2 = pVarB.f281500c;
                }
                return new p(pVarB2.f281498a, pVarB2.f281499b, i2);
            }
        }
        return pVarB;
    }
}
