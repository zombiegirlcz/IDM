package oaj;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import laj.d;
import o95.c;
import w4l.h;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final laj.a f223792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nw5.a f223793b;

    public a(laj.a repository, nw5.a cryptoCommodityRateInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(cryptoCommodityRateInteractor, "cryptoCommodityRateInteractor");
        this.f223792a = repository;
        this.f223793b = cryptoCommodityRateInteractor;
    }

    public static Flow a(a aVar) {
        aVar.getClass();
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        d dVar = (d) aVar.f223792a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new c(aVar, null, 2), dVar.d.b(Unit.f186387a, loadingStrategy));
    }
}
