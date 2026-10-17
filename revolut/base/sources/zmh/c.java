package zmh;

import aim.e;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import imh.g;
import imh.i;
import imh.j;
import imh.k;
import imh.l;
import imh.n;
import java.util.Set;
import knh.h;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f323517b = y0.b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f323518c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f323519a;

    static {
        xnh.a[] elements = {null, xnh.a.STOCKS, xnh.a.ETFS, xnh.a.BONDS, xnh.a.CFD};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f323518c = d.y0(elements);
    }

    public c(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f323519a = featureToggleInteractor;
    }

    public static void a(e eVar, j jVar, knh.a aVar, InstrumentsTrendCollectionId instrumentsTrendCollectionId, xnh.a aVar2) {
        b(eVar, jVar, new knh.b(instrumentsTrendCollectionId, aVar), y0.b(aVar2), null);
    }

    public static void b(e eVar, j jVar, h hVar, Set set, xnh.a aVar) {
        eVar.add(new g(jVar, new k(hVar), new n(set, aVar)));
    }

    public static void c(e eVar, i iVar, Set set, xnh.a aVar) {
        eVar.add(new g(iVar, new l(iVar.a()), new n(set, aVar)));
    }

    public static void d(e eVar, i iVar, xnh.a aVar) {
        c(eVar, iVar, y0.b(aVar), null);
    }
}
