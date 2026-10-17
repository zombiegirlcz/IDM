package f7l;

import efm.d0;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132647a;

    public a(b sharedConfigurationRepository) {
        Intrinsics.checkNotNullParameter(sharedConfigurationRepository, "sharedConfigurationRepository");
        this.f132647a = sharedConfigurationRepository;
    }

    public final long a() {
        return ((k) this.f132647a).a();
    }

    public final e7l.f b() {
        return ((k) this.f132647a).b();
    }

    public final r c() {
        r rVarDistinctUntilChanged = ((ihm.b) ((k) this.f132647a).f132662g.getValue()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final r d(e7l.g configType, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((k) this.f132647a).c(configType, loadingStrategy);
    }

    public final r e(e7l.g configType, boolean z) {
        Intrinsics.checkNotNullParameter(configType, "configType");
        k kVar = (k) this.f132647a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(configType, "configType");
        return kVar.c(configType, z ? w4l.i.f294643c : w4l.h.f294642c);
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.Map] */
    public final r f(xi0.b targetCurrency, wi0.b bVar, c7l.e transferType, String str, String str2, Long l2, c7l.a aVar, c7l.a aVar2) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        k kVar = (k) this.f132647a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        w4l.f fVar = kVar.f132664j;
        String str3 = targetCurrency.f306286a;
        String str4 = bVar != null ? bVar.f297794a : null;
        Object obj2 = i7l.c.f159338a;
        Intrinsics.checkNotNullParameter(transferType, "<this>");
        return fVar.f(new g(str3, str4, u1.g(transferType, i7l.c.f159338a), str, str2, l2, aVar, aVar2), true);
    }

    public final Object g(boolean z, gim.c cVar) {
        k kVar = (k) this.f132647a;
        kVar.getClass();
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new i(kVar, z, null), cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final d0 h() {
        r rVarDistinctUntilChanged = ((ihm.b) ((k) this.f132647a).f132662g.getValue()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        d0 d0VarFirstOrError = rVarDistinctUntilChanged.firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
