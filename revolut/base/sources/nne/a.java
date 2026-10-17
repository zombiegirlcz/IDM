package nne;

import akg.n;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nme.c0;
import sne.g;
import vkm.d;
import w4l.k;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements wme.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f217613a;

    public a(g taxExemptionRepository) {
        Intrinsics.checkNotNullParameter(taxExemptionRepository, "taxExemptionRepository");
        this.f217613a = taxExemptionRepository;
    }

    public final n a(String str, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g gVar = this.f217613a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        d dVarB = gVar.d.b(new sne.d(str), loadingStrategy);
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(u0.m(dVarB, gVar.e.b(Unit.f186387a, loadingStrategy)), new c0(29));
    }
}
