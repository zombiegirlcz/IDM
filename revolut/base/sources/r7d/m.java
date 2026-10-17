package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.help_centre.impl.main.HelpFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HelpFlowContract$InputData f252137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f252138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f252139c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f252140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f252141h;

    public m(l lVar, BaseFlow baseFlow, HelpFlowContract$InputData helpFlowContract$InputData) {
        this.f252138b = lVar;
        this.f252137a = helpFlowContract$InputData;
        int i = 29;
        this.d = e4m.b.b(new qy7.f(lVar, this, 0, i));
        this.e = e4m.b.b(new qy7.f(lVar, this, 2, i));
        this.f = e4m.b.b(e4m.c.a(baseFlow));
        int i2 = 29;
        this.f252140g = e4m.b.b(new qy7.f(lVar, this, 1, i2));
        this.f252141h = e4m.b.b(new qy7.f(lVar, this, 3, i2));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
