package ea2;

import com.google.common.collect.ImmutableSet;
import dw3.v7;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124102a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cb2.d f124103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f124104c;
    public final e4m.e d;
    public final e4m.e e;

    public o(h hVar, k kVar, cb2.d dVar) {
        this.f124104c = hVar;
        this.f124103b = dVar;
        int i = 0;
        this.d = e4m.b.b(new p(hVar, this, 1, i));
        this.e = e4m.b.b(new p(hVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f124102a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f124102a) {
        }
        return ImmutableSet.of();
    }

    public o(h hVar, i iVar, cb2.d dVar) {
        this.f124104c = hVar;
        this.f124103b = dVar;
        int i = 29;
        this.d = e4m.b.b(new v7(hVar, this, 1, i));
        this.e = e4m.b.b(new v7(hVar, this, 0, i));
    }
}
