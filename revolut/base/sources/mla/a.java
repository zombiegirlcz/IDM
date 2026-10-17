package mla;

import com.revolut.retail.common.ui.api.Toggles;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import lal.j;
import mp.r;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lla.a f206656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rk0.c f206657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f206658c;
    public final j d;
    public final j e;

    public a(rk0.c cVar, lla.a aVar) {
        this.f206656a = aVar;
        this.f206657b = cVar;
        int i = 25;
        this.f206658c = e4m.b.b(new j(this, 1, i));
        this.d = new j(this, 0, i);
        this.e = new j(this, 2, i);
    }

    public final eq0.a a() {
        kla.a aVarA = this.f206656a.a();
        j jVar = this.d;
        j jVar2 = this.e;
        ch.b factory = new ch.b(jVar, jVar2, aVarA);
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        return ((jte.d) aVarA.f185415a).c(Toggles.ProductIntrosDebugMode.f98582a) ? (eq0.a) jVar.get() : (eq0.a) jVar2.get();
    }

    public final r b() {
        return new r(a());
    }
}
