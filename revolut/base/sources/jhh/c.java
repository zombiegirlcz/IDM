package jhh;

import aah.m;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import z0h.q1;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements m1h.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f174252a;

    public c(m disclaimersMapper) {
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        this.f174252a = disclaimersMapper;
    }

    @Override // m1h.d
    public final Clause a(m1h.b disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        if (!(disclaimer instanceof khh.c)) {
            return null;
        }
        khh.c cVar = (khh.c) disclaimer;
        if (cVar instanceof khh.a) {
            hel.b bVar = ((khh.a) disclaimer).f184142a;
            return q1.a(this.f174252a, u.c(new WealthDisclaimersContract$Disclaimer$Investment.AddMoney(bVar)), bVar);
        }
        if (cVar.equals(khh.b.f184143a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
