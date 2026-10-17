package oai;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_retail_user_declarations.email.screen.EmailScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmailScreenContract$InputData f223716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f223717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f223718c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f223719g;

    public j(i0 i0Var, i iVar, ViewController viewController, EmailScreenContract$InputData emailScreenContract$InputData) {
        this.f223716a = emailScreenContract$InputData;
        this.f223717b = e4m.b.b(e4m.c.a(viewController));
        int i = 15;
        this.f223718c = e4m.b.b(new o41.b(i0Var, this, 1, i));
        this.d = e4m.b.b(new o41.b(i0Var, this, 0, i));
        this.e = e4m.b.b(new o41.b(i0Var, this, 4, i));
        this.f = e4m.b.b(new o41.b(i0Var, this, 3, i));
        this.f223719g = e4m.b.b(new o41.b(i0Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
