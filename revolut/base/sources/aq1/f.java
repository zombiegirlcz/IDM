package aq1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.FormsListScreenContract$InputData;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormsListScreenContract$InputData f8242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f8244c;
    public final e4m.e d;
    public final e4m.e e;

    public f(b bVar, d dVar, FormsListScreenContract$InputData formsListScreenContract$InputData) {
        this.f8243b = bVar;
        this.f8242a = formsListScreenContract$InputData;
        int i = 0;
        this.f8244c = e4m.b.b(new e(this, 1, i));
        this.d = e4m.b.b(new e(this, 0, i));
        this.e = e4m.b.b(new e(this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
