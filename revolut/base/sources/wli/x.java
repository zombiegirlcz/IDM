package wli;

import efm.d0;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements lg0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f298520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f298521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f298522c;

    public x(Function0 deeplinkCoordinatorProvider, Function0 newHandlerProvider, Function0 legacyHandlerProvider) {
        Intrinsics.checkNotNullParameter(deeplinkCoordinatorProvider, "deeplinkCoordinatorProvider");
        Intrinsics.checkNotNullParameter(newHandlerProvider, "newHandlerProvider");
        Intrinsics.checkNotNullParameter(legacyHandlerProvider, "legacyHandlerProvider");
        this.f298520a = yhm.j.b(deeplinkCoordinatorProvider);
        this.f298521b = yhm.j.b(newHandlerProvider);
        this.f298522c = yhm.j.b(legacyHandlerProvider);
    }

    @Override // lg0.b
    public final Object L1(String str, lg0.a aVar, Boolean bool, Continuation continuation) {
        return a(str).L1(str, aVar, bool, continuation);
    }

    @Override // lg0.b
    public final d0 Z0(String url2, lg0.a fallbackStrategy, Boolean bool) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(fallbackStrategy, "fallbackStrategy");
        return a(url2).Z0(url2, fallbackStrategy, bool);
    }

    public final lg0.b a(String it8) {
        cmi.m mVar = (cmi.m) ((cmi.n) this.f298520a.getValue());
        mVar.getClass();
        Intrinsics.checkNotNullParameter(it8, "url");
        zli.b bVar = null;
        if (mVar.m3()) {
            zli.b bVarB = mVar.f25292g.b(it8);
            if (bVarB == null) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Unit unit = Unit.f186387a;
            } else if (!mVar.f25294j.c(bVarB)) {
                Intrinsics.checkNotNullParameter(bVarB, "<unused var>");
                Intrinsics.checkNotNullParameter("not eligible", "<unused var>");
                Unit unit2 = Unit.f186387a;
            } else if (mVar.n3() || mVar.i.a(bVarB)) {
                bVar = bVarB;
            } else {
                Intrinsics.checkNotNullParameter(bVarB, "<unused var>");
                Intrinsics.checkNotNullParameter("not allowed by config", "<unused var>");
                Unit unit3 = Unit.f186387a;
            }
        }
        return bVar != null ? (lg0.b) this.f298521b.getValue() : (lg0.b) this.f298522c.getValue();
    }

    @Override // lg0.b
    public final boolean y1(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        return a(url2).y1(url2);
    }
}
