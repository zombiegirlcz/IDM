package d14;

import d14.b;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import xu3.a0;
import xu3.z;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dr3.g f110537a;

    public g(dr3.g creditPromptContentDtoMapper) {
        Intrinsics.checkNotNullParameter(creditPromptContentDtoMapper, "creditPromptContentDtoMapper");
        this.f110537a = creditPromptContentDtoMapper;
    }

    public static a0 a(b.g gVar) {
        z zVar;
        String status = gVar.getStatus();
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
            rd0.d.a(rd0.c.ERROR, "FinancialEvidenceConfigDtoMapper.kt", j6.a.q("Unsupported StatusPopupStatus: ", gVar.getStatus()), null, h0Var);
            zVar = z.SUCCESS;
        }
        return new a0(gVar.getTitle(), null, zVar);
    }
}
