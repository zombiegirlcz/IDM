package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements xki.c, ko6.a, io6.a, go6.a, un6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrossBorderLinkAccountFlowContract$InputData f305011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f305012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f305013c = this;
    public final e4m.e d;

    public r(t tVar, CrossBorderLinkAccountFlowContract$InputData crossBorderLinkAccountFlowContract$InputData) {
        this.f305012b = tVar;
        this.f305011a = crossBorderLinkAccountFlowContract$InputData;
        this.d = e4m.b.b(new whc.d(tVar, this, 22));
    }

    @Override // un6.a
    public final u0 b() {
        return new u0(this.f305012b, this.f305013c, 0);
    }

    @Override // ko6.a
    public final j1 c() {
        return new j1(this.f305012b, this.f305013c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // go6.a
    public final f1 j() {
        return new f1(this.f305012b, this.f305013c, 0);
    }

    @Override // io6.a
    public final h1 q() {
        return new h1(this.f305012b, this.f305013c, 0);
    }
}
