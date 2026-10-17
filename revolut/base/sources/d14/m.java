package d14;

import d14.h;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import xu3.a0;
import xu3.z;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dr3.g f110605a;

    public m(dr3.g creditPromptContentDtoMapper) {
        Intrinsics.checkNotNullParameter(creditPromptContentDtoMapper, "creditPromptContentDtoMapper");
        this.f110605a = creditPromptContentDtoMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static xu3.x a(d14.h.f r22) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d14.m.a(d14.h$f):xu3.x");
    }

    public static a0 b(h.C0658h c0658h) {
        z zVar;
        String status = c0658h.getStatus();
        z[] zVarArrValues = z.values();
        int length = zVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                zVar = null;
                break;
            }
            zVar = zVarArrValues[i];
            if (kotlin.text.a0.z(zVar.name(), status, true)) {
                break;
            }
            i++;
        }
        if (zVar == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "FinancialEvidenceConfigDtoMapper.kt", j6.a.q("Unsupported StatusPopupStatus: ", c0658h.getStatus()), null, h0Var);
            zVar = z.SUCCESS;
        }
        return new a0(c0658h.getTitle(), c0658h.getDescription(), zVar);
    }
}
