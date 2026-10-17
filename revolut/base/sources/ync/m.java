package ync;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import d8f.z;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import wnc.u;
import wnc.w;
import y66.q;
import ybh.c0;
import yjh.b0;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f315438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f315439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f315440c;
    public final snc.a d;

    public m(z headerMapper, l tabsMapper, j selectedTabMapper, c0 viewPagerItemsMapper, h tabsModeMapper, snc.a buttonMapper) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(tabsMapper, "tabsMapper");
        Intrinsics.checkNotNullParameter(selectedTabMapper, "selectedTabMapper");
        Intrinsics.checkNotNullParameter(viewPagerItemsMapper, "viewPagerItemsMapper");
        Intrinsics.checkNotNullParameter(tabsModeMapper, "tabsModeMapper");
        Intrinsics.checkNotNullParameter(buttonMapper, "buttonMapper");
        this.f315438a = headerMapper;
        this.f315439b = tabsMapper;
        this.f315440c = viewPagerItemsMapper;
        this.d = buttonMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        w wVar;
        wnc.m domainState = (wnc.m) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f298805a;
        Data data2 = domainState.f298806b;
        Data dataT = (data == null || data2 == null) ? null : t1.t(data, data2);
        return (dataT == null || (wVar = (w) iii.c.f(dataT, new yjj.j(this, 23), new b0(19), new q(this, domainState, 13))) == null) ? new w(null, null, null, null, u.e) : wVar;
    }
}
