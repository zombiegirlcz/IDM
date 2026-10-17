package nne;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import sne.g;
import vkm.d;
import w4l.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f217614a;

    public b(g taxExemptionRepository) {
        Intrinsics.checkNotNullParameter(taxExemptionRepository, "taxExemptionRepository");
        this.f217614a = taxExemptionRepository;
    }

    public static d a(b bVar) {
        bVar.getClass();
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g gVar = bVar.f217614a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return gVar.e.b(Unit.f186387a, loadingStrategy);
    }
}
