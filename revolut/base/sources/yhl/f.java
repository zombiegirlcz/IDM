package yhl;

import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import w4l.k;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements ugl.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final prl.e f314178a;

    public f(prl.e screenerRepository) {
        Intrinsics.checkNotNullParameter(screenerRepository, "screenerRepository");
        this.f314178a = screenerRepository;
    }

    public final vkm.d b(List instrumentTypes, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
        w4l.h loadingStrategy2 = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
        return ((x4l.c) this.f314178a.d).b(instrumentTypes, loadingStrategy2);
    }

    public final vkm.d c(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((x4l.c) this.f314178a.f239326c).b(Unit.f186387a, loadingStrategy);
    }

    public final Object d(String str, String str2, String str3, List list, ArrayList arrayList, ScreenerSortingOptions screenerSortingOptions, i iVar) throws Throwable {
        rhl.a aVar = new rhl.a(this.f314178a, str, str2, str3, list, arrayList, screenerSortingOptions, (Continuation) null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, aVar, iVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }
}
