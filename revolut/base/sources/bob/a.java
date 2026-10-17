package bob;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yfe.a1;
import yfe.d1;
import yfe.h;
import yfe.k;
import yfe.n0;
import yfe.p0;
import yfe.q0;
import yfe.s0;
import yfe.t0;
import yfe.v0;
import yfe.w0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements yfe.b {
    @Override // yfe.b
    public final p0 a(h.c cVar) {
        n0 snapshot = (n0) cVar;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        TextClause textClause = new TextClause(snapshot.f313284c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = R$drawable.uikit_icn_24_vault;
        String str = snapshot.d;
        return new p0(i, textClause, str != null ? new TextClause(str, (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122) : null);
    }

    @Override // yfe.b
    public final q0 b(h.a aVar) {
        k snapshot = (k) aVar;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        TextClause textClause = new TextClause(snapshot.f313274c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        dj0.d dVar = snapshot.d;
        int i = snapshot.e;
        a1 a1Var = new a1(nib.a.a());
        return new q0(textClause, dVar, new d1(i != 1 ? i != 2 ? new v0(a1Var, new t0(i - 1)) : new v0(a1Var, new s0(a1Var)) : new w0(a1Var), false), null, 56);
    }
}
