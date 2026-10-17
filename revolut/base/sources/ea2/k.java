package ea2;

import com.google.common.collect.ImmutableSet;
import dw3.p3;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements xki.c, gb2.a, db2.a, ta2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f124090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f124091b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f124092c = e4m.b.b(new p3(9));

    public k(h hVar) {
        this.f124090a = hVar;
    }

    @Override // ta2.a
    public final l b() {
        return new l(this.f124090a, this.f124091b, 0);
    }

    @Override // db2.a
    public final n c() {
        return new n(this.f124090a, this.f124091b, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // gb2.a
    public final q j() {
        return new q(this.f124090a, this.f124091b, 1);
    }
}
