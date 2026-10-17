package hm9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payees.api.models.PayeesInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements xki.c, xm9.a, zm9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayeesInputData f153556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f153557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f153558c = this;
    public final e4m.e d = e4m.b.b(new d(this, 0));

    public e(b bVar, PayeesInputData payeesInputData) {
        this.f153557b = bVar;
        this.f153556a = payeesInputData;
    }

    @Override // zm9.a
    public final i b() {
        return new i(this.f153557b, this.f153558c, 1);
    }

    @Override // xm9.a
    public final k c() {
        return new k(this.f153557b, this.f153558c, 1);
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
