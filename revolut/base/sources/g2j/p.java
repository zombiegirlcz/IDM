package g2j;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140126a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DualChooserContract$InputData f140127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final od0.i f140128c;
    public final f d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f140129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f140130h;
    public final e4m.e i;

    public p(f fVar, h hVar, DualChooserContract$InputData dualChooserContract$InputData, od0.i iVar) {
        this.d = fVar;
        this.f140127b = dualChooserContract$InputData;
        this.f140128c = iVar;
        int i = 8;
        this.e = e4m.b.b(new fta.e(fVar, this, 2, i));
        this.f = e4m.b.b(new fta.e(fVar, this, 1, i));
        this.f140129g = e4m.b.b(new fta.e(fVar, this, 0, i));
        this.f140130h = e4m.b.b(new fta.e(fVar, this, 3, i));
        this.i = e4m.b.b(new fta.e(fVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f140126a) {
        }
        return ImmutableSet.of((yji.n) this.f140130h.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f140126a) {
        }
        return ImmutableSet.of((yji.d) this.f140129g.get());
    }

    public p(f fVar, DualChooserContract$InputData dualChooserContract$InputData, od0.i iVar) {
        this.d = fVar;
        this.f140127b = dualChooserContract$InputData;
        this.f140128c = iVar;
        int i = 9;
        this.e = e4m.b.b(new fta.e(fVar, this, 2, i));
        this.f = e4m.b.b(new fta.e(fVar, this, 1, i));
        this.f140129g = e4m.b.b(new fta.e(fVar, this, 0, i));
        this.f140130h = e4m.b.b(new fta.e(fVar, this, 3, i));
        this.i = e4m.b.b(new fta.e(fVar, this, 4, i));
    }
}
