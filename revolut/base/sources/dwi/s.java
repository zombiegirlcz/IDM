package dwi;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hwi.w f120458a;

    public s(hwi.w repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f120458a = repository;
    }

    public final efm.r a(boolean z, boolean z3) {
        hwi.w wVar = this.f120458a;
        if (z) {
            efm.r rVarDistinctUntilChanged = ((hwi.a0) wVar).e.f(Unit.f186387a, z3).switchMap(new dv5.n(new dug.a(this, 8), 11)).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
            return rVarDistinctUntilChanged;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return ((hwi.a0) wVar).e.f(Unit.f186387a, z3);
    }
}
