package hm2;

import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xmg.a f153520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc6.b f153521b;

    public d(xmg.a aVar, zc6.b bVar) {
        this.f153520a = aVar;
        this.f153521b = bVar;
    }

    public final gm2.b a() {
        return new gm2.b();
    }

    public final Optional b() {
        im2.f impl = new im2.f(this.f153520a.e(), ((zc6.a) this.f153521b).e());
        g.Companion.getClass();
        Intrinsics.checkNotNullParameter(impl, "impl");
        Optional optionalOf = Optional.of(impl);
        Intrinsics.checkNotNullExpressionValue(optionalOf, "of(...)");
        s.k(optionalOf);
        return optionalOf;
    }
}
