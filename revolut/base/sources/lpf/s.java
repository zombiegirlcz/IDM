package lpf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer.core.api.ui.reference.ReferenceInputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199080a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReferenceInputData f199081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199082c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f199083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f199084h;
    public final e4m.e i;

    public s(i iVar, f fVar, BaseScreen baseScreen, ReferenceInputData referenceInputData) {
        this.f199081b = referenceInputData;
        this.f199082c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 9;
        this.d = e4m.b.b(new ljl.y(this, 1, i));
        this.e = e4m.b.b(new ljl.y(this, 0, i));
        this.f = e4m.b.b(new ljl.y(this, 3, i));
        this.f199083g = e4m.b.b(new ljl.y(this, 2, i));
        this.f199084h = e4m.b.b(new ljl.y(this, 5, i));
        this.i = e4m.b.b(new ljl.y(this, 4, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f199080a) {
        }
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f199080a) {
        }
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f199083g.get());
    }

    public s(i iVar, BaseScreen baseScreen, ReferenceInputData referenceInputData) {
        this.f199081b = referenceInputData;
        this.f199082c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 10;
        this.d = e4m.b.b(new ljl.y(this, 1, i));
        this.e = e4m.b.b(new ljl.y(this, 0, i));
        this.f = e4m.b.b(new ljl.y(this, 3, i));
        this.f199083g = e4m.b.b(new ljl.y(this, 2, i));
        this.f199084h = e4m.b.b(new ljl.y(this, 5, i));
        this.i = e4m.b.b(new ljl.y(this, 4, i));
    }
}
