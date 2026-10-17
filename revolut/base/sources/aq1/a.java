package aq1;

import afj.r2;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.all_forms.AllFormsScreenContract$InputData;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AllFormsScreenContract$InputData f8229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f8231c = e4m.b.b(new r2(this, 1, 29));
    public final e4m.e d = e4m.b.b(new r2(this, 0, 29));
    public final e4m.e e = e4m.b.b(new r2(this, 2, 29));

    public a(b bVar, d dVar, AllFormsScreenContract$InputData allFormsScreenContract$InputData) {
        this.f8230b = bVar;
        this.f8229a = allFormsScreenContract$InputData;
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
