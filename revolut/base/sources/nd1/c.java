package nd1;

import efm.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final id1.n f214281a;

    public c(id1.n catalogueRepository) {
        Intrinsics.checkNotNullParameter(catalogueRepository, "catalogueRepository");
        this.f214281a = catalogueRepository;
    }

    public final r a() {
        return this.f214281a.d.f(Unit.f186387a, true);
    }

    public final r b() {
        return this.f214281a.e.f(Unit.f186387a, true);
    }

    public final r c(boolean z) {
        return this.f214281a.f.f(Unit.f186387a, z);
    }
}
