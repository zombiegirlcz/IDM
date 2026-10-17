package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements v7d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedFaqDestination.InputData f252173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f252174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f252175c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f252176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f252177h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f252178j;

    public t(l lVar, SharedFaqDestination.InputData inputData) {
        this.f252174b = lVar;
        this.f252173a = inputData;
        this.d = e4m.b.b(new s(lVar, this, 0));
        this.e = e4m.b.b(new s(lVar, this, 1));
        this.f = e4m.b.b(new s(lVar, this, 2));
        this.f252176g = e4m.b.b(new s(lVar, this, 3));
        this.f252177h = e4m.b.b(new s(lVar, this, 4));
        this.i = e4m.b.b(new s(lVar, this, 5));
        this.f252178j = e4m.b.b(new s(lVar, this, 6));
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
