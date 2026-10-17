package qz4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsContract$InputData;
import dw3.t7;
import dw3.y7;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements xki.c, z44.a, w44.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditForbearanceAgreementsContract$InputData f250356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f250357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f250358c = this;
    public final e4m.e d;
    public final e4m.e e;

    public b(a aVar, CreditForbearanceAgreementsContract$InputData creditForbearanceAgreementsContract$InputData) {
        this.f250357b = aVar;
        this.f250356a = creditForbearanceAgreementsContract$InputData;
        int i = 5;
        this.d = e4m.b.b(new qy7.f(aVar, this, 1, i));
        this.e = e4m.b.b(new qy7.f(aVar, this, 0, i));
    }

    @Override // z44.a
    public final y7 b() {
        return new y7(this.f250357b, this.f250358c, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // w44.a
    public final t7 s() {
        return new t7(this.f250357b, this.f250358c, 6);
    }
}
