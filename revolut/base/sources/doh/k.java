package doh;

import a83.w0;
import com.revolut.data.model.Data;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import z0h.q1;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f116574a;

    public k(a assetImageMapper, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(assetImageMapper, "assetImageMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f116574a = wealthDisclaimersMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f116565b, new dmj.a(19), new dmb.m(17), new w0(domainState.f116564a, this, 3));
        Data data = domainState.f116566c;
        List[] elements = {list, data != null ? ((aah.m) this.f116574a).b(data) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new g(w.u(kotlin.collections.d.L(elements)));
    }
}
