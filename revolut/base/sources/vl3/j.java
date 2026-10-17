package vl3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.contacts.impl.ui.contact.screen.details.ContactDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import us6.r2;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContactDetailsScreenContract$InputData f290195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f290196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f290197c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f290198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f290199h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f290200j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f290201l;

    public j(k kVar, l lVar, ViewController viewController, ContactDetailsScreenContract$InputData contactDetailsScreenContract$InputData) {
        this.f290196b = kVar;
        this.f290195a = contactDetailsScreenContract$InputData;
        int i = 24;
        this.f290197c = e4m.b.b(new r2(kVar, this, 1, i));
        this.d = e4m.b.b(new r2(kVar, this, 0, i));
        this.e = e4m.b.b(new r2(kVar, this, 3, i));
        this.f = e4m.b.b(new r2(kVar, this, 2, i));
        this.f290198g = e4m.b.b(e4m.c.a(viewController));
        int i2 = 24;
        this.f290199h = e4m.b.b(new r2(kVar, this, 7, i2));
        this.i = e4m.b.b(new r2(kVar, this, 6, i2));
        this.f290200j = e4m.b.b(new r2(kVar, this, 5, i2));
        this.k = e4m.b.b(new r2(kVar, this, 8, i2));
        this.f290201l = e4m.b.b(new r2(kVar, this, 4, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get(), (yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
