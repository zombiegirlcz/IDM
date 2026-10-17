package yj2;

import efm.d0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314391a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f314392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f314393c;

    public /* synthetic */ h(l lVar, boolean z) {
        this.f314393c = lVar;
        this.f314392b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f314391a) {
            case 0:
                Boolean isEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                boolean zBooleanValue = isEnabled.booleanValue();
                l lVar = this.f314393c;
                boolean z = this.f314392b;
                od0.i iVarA = od0.i.f224256b;
                if (!zBooleanValue) {
                    if (z) {
                        return lVar.b();
                    }
                    od0.i.Companion.getClass();
                    ufm.b bVarM = d0.m(iVarA);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                ufm.i iVar = new ufm.i(((z39.b) lVar.f314395b).f319221b.e().t(5000L, TimeUnit.MILLISECONDS), new a(16, new yi5.b(lVar, 18)), 1);
                od0.i.Companion.getClass();
                ufm.i iVar2 = new ufm.i(iVar.o(iVarA), new a(17, new h(z, lVar)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                if (z) {
                    iVarA = od0.h.a(l.e);
                }
                return ue0.e.F(iVar2, iVarA);
            default:
                od0.i locationOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(locationOptional, "locationOptional");
                if (locationOptional.d()) {
                    ufm.b bVarM2 = d0.m(locationOptional);
                    Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                    return bVarM2;
                }
                if (this.f314392b) {
                    return this.f314393c.b();
                }
                ufm.b bVarM3 = d0.m(locationOptional);
                Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
                return bVarM3;
        }
    }

    public /* synthetic */ h(boolean z, l lVar) {
        this.f314392b = z;
        this.f314393c = lVar;
    }
}
