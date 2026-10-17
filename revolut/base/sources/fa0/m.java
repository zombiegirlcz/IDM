package fa0;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133111a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hb0.h f133112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f133113c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final na0.d f133114g;

    public m(k kVar, h hVar, hb0.h hVar2) {
        this.f133114g = hVar;
        this.f133112b = hVar2;
        int i = 14;
        this.f133113c = e4m.b.b(new ehe.o(kVar, hVar, this, 2, i));
        this.d = e4m.b.b(new ehe.o(kVar, hVar, this, 1, i));
        this.e = e4m.b.b(new ehe.o(kVar, hVar, this, 0, i));
        this.f = e4m.b.b(new ehe.o(kVar, hVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f133111a) {
        }
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f133111a) {
        }
        return ImmutableSet.of();
    }

    public final yc0.g m() {
        switch (this.f133111a) {
            case 0:
                return (yc0.g) ((j) this.f133114g).f133100y.get();
            default:
                return (yc0.g) ((h) this.f133114g).f133066y.get();
        }
    }

    public m(k kVar, j jVar, hb0.h hVar) {
        this.f133114g = jVar;
        this.f133112b = hVar;
        int i = 12;
        this.f133113c = e4m.b.b(new ehe.o(kVar, jVar, this, 2, i));
        this.d = e4m.b.b(new ehe.o(kVar, jVar, this, 1, i));
        this.e = e4m.b.b(new ehe.o(kVar, jVar, this, 0, i));
        this.f = e4m.b.b(new ehe.o(kVar, jVar, this, 3, i));
    }
}
