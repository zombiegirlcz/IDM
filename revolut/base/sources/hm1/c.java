package hm1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bills.billers.api.navigation.BillerSearchNavigation$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillerSearchNavigation$InputData f153495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f153496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f153497c;
    public final e4m.e d;

    public c(d dVar, BillerSearchNavigation$InputData billerSearchNavigation$InputData) {
        this.f153495a = billerSearchNavigation$InputData;
        int i = 1;
        this.f153496b = e4m.b.b(new hjg.b(dVar, this, 1, i));
        this.f153497c = e4m.b.b(new hjg.b(dVar, this, 2, i));
        this.d = e4m.b.b(new hjg.b(dVar, this, 0, i));
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
