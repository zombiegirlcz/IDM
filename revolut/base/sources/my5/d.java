package my5;

import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import kotlin.jvm.internal.Intrinsics;
import mx0.bc;
import mx0.oc;
import nw5.j;
import ny5.u;
import te0.r;
import te0.s;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f210341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f210342b;

    public d(j cryptoStatsInteractor, u cryptoSorter, a state) {
        Intrinsics.checkNotNullParameter(cryptoStatsInteractor, "cryptoStatsInteractor");
        Intrinsics.checkNotNullParameter(cryptoSorter, "cryptoSorter");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f210341a = cryptoStatsInteractor;
        this.f210342b = state;
    }

    public final efm.b a() {
        a aVar = this.f210342b;
        efm.b bVarIgnoreElements = ((r) aVar.o()).b(((r) aVar.K()).get()).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    public final efm.b b(SortingType input) {
        Intrinsics.checkNotNullParameter(input, "input");
        a aVar = this.f210342b;
        SortingType sortingType = (SortingType) ((r) aVar.K()).get();
        if (!Intrinsics.f(((r) aVar.K()).get(), input)) {
            efm.b bVarIgnoreElements = ((r) aVar.K()).b(input).ignoreElements();
            Intrinsics.h(bVarIgnoreElements);
            return bVarIgnoreElements;
        }
        efm.b bVarIgnoreElements2 = ((r) aVar.K()).b(sortingType.b()).ignoreElements();
        Intrinsics.h(bVarIgnoreElements2);
        return bVarIgnoreElements2;
    }

    public final efm.r c() {
        efm.r rVarSwitchMap = w.l(((r) this.f210342b.o()).c(s.f270018a), this.f210341a.a(true)).switchMap(new bc(new oc(this, 5), 15));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }
}
