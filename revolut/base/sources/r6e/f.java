package r6e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements xki.c, f8e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreateSubaccountFlowContract$InputData f251728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zfe.e f251729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f251730c;
    public final f d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f251731g;

    public f(o oVar, CreateSubaccountFlowContract$InputData createSubaccountFlowContract$InputData, zfe.e eVar) {
        this.f251730c = oVar;
        this.f251728a = createSubaccountFlowContract$InputData;
        this.f251729b = eVar;
        int i = 12;
        this.e = e4m.b.b(new qy7.f(oVar, this, 0, i));
        this.f = e4m.b.b(new qy7.f(oVar, this, 2, i));
        this.f251731g = e4m.b.b(new qy7.f(oVar, this, 1, i));
    }

    @Override // f8e.a
    public final x b() {
        return new x(this.f251730c, this.d, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
