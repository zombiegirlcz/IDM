package hy8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.vendors.shared.impl.uaepass.UaePassScreenContract$InputData;
import java.util.Set;
import xki.e;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UaePassScreenContract$InputData f156757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f156758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f156759c;
    public final e4m.e d;
    public final e4m.e e;

    public a(b bVar, UaePassScreenContract$InputData uaePassScreenContract$InputData) {
        this.f156758b = bVar;
        this.f156757a = uaePassScreenContract$InputData;
        int i = 16;
        this.f156759c = e4m.b.b(new hjg.b(bVar, this, 0, i));
        this.d = e4m.b.b(new hjg.b(bVar, this, 1, i));
        this.e = e4m.b.b(new hjg.b(bVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f156759c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
