package msb;

import efm.r;
import eli.l;
import kotlin.jvm.internal.Intrinsics;
import ms0.j0;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tpi.j f208642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ujg.a f208643b;

    public a(tpi.j jVar, ujg.a twoFaRepository) {
        Intrinsics.checkNotNullParameter(twoFaRepository, "twoFaRepository");
        this.f208642a = jVar;
        this.f208643b = twoFaRepository;
    }

    public static r a(a aVar) {
        r rVarDoOnDispose = o70.a.f(((l) aVar.f208643b).e).doOnNext(new j0(new mqi.a(aVar, 5), 25)).unsubscribeOn(hfm.c.a()).map(new j0(new mqg.b(27), 26)).doOnDispose(new i1i.a(aVar, 16));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnDispose, "doOnDispose(...)");
        return rVarDoOnDispose;
    }
}
