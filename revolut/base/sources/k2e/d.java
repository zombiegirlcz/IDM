package k2e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreBrandDetailFlowContract$InputData f180493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f180494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f180495c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f180496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f180497h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f180498j;

    public d(j jVar, StoreBrandDetailFlowContract$InputData storeBrandDetailFlowContract$InputData) {
        this.f180494b = jVar;
        this.f180493a = storeBrandDetailFlowContract$InputData;
        int i = 8;
        this.f180495c = e4m.b.b(new jqa.h(jVar, this, 1, i));
        this.d = e4m.b.b(new jqa.h(jVar, this, 0, i));
        this.e = e4m.b.b(new jqa.h(jVar, this, 3, i));
        this.f = e4m.b.b(new jqa.h(jVar, this, 4, i));
        this.f180496g = e4m.b.b(new jqa.h(jVar, this, 5, i));
        this.f180497h = e4m.b.b(new jqa.h(jVar, this, 6, i));
        this.i = e4m.b.b(new jqa.h(jVar, this, 2, i));
        this.f180498j = e4m.b.b(new jqa.h(jVar, this, 7, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
