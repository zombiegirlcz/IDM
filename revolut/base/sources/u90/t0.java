package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.TextInputItem;
import kotlin.jvm.internal.Intrinsics;
import q90.q3;
import q90.v3;

/* JADX INFO: loaded from: classes19.dex */
public final class t0 extends c {
    public t0(z0 validationMapper) {
        Intrinsics.checkNotNullParameter(validationMapper, "validationMapper");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // u90.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.backend_flow.domain.models.BackendItem a(q90.v r21, java.util.List r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u90.t0.a(q90.v, java.util.List):com.revolut.feature.backend_flow.domain.models.BackendItem");
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        TextInputItem item = (TextInputItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63678a;
        String str2 = item.f63679b;
        String str3 = item.d;
        q3 q3Var = str3 != null ? new q3(str3) : null;
        String str4 = item.f63680c;
        boolean z = item.f;
        Integer num = item.f63682h;
        String str5 = item.k;
        String str6 = item.f63684l;
        String strName = item.f63685m.name();
        xl2.e0 e0Var = item.f63688q;
        return new v3(str, q3Var, str2, str4, Boolean.valueOf(z), num, str5, str6, strName, e0Var != null ? e0Var.name() : null);
    }
}
