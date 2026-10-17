package hm9;

import b3j.p;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payees.impl.ui.payees_select.PayeesSelectScreenContract$InputData;
import java.util.Set;
import m3j.n;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayeesSelectScreenContract$InputData f153565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f153566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f153567c = e4m.b.b(new d(this, 2));

    public h(b bVar, e eVar, PayeesSelectScreenContract$InputData payeesSelectScreenContract$InputData) {
        this.f153566b = bVar;
        this.f153565a = payeesSelectScreenContract$InputData;
    }

    public final km9.g b() {
        b bVar = this.f153566b;
        n nVarI = ((p) bVar.f153545a).i();
        aqa.c cVarC = ((jqa.p) bVar.f153546b).c();
        s.j(cVarC);
        dl3.f fVarC = bVar.f153547c.c();
        s.j(fVarC);
        return new km9.g(nVarI, cVarC, fVarC);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
