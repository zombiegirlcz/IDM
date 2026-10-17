package d73;

import a83.j0;
import amh.w;
import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f111777b;

    public /* synthetic */ b(l lVar, int i) {
        this.f111776a = i;
        this.f111777b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f111776a) {
            case 0:
                Boolean applyJuniorSorting = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(applyJuniorSorting, "applyJuniorSorting");
                if (applyJuniorSorting.booleanValue()) {
                    return rd0.e.c(new j0(new w(this.f111777b.d.e(), 3), 18), p0.f264003c);
                }
                od0.i.Companion.getClass();
                efm.r rVarJust = efm.r.just(od0.i.f224256b);
                Intrinsics.h(rVarJust);
                return rVarJust;
            case 1:
                Boolean juniorFeatureEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(juniorFeatureEnabled, "juniorFeatureEnabled");
                if (juniorFeatureEnabled.booleanValue()) {
                    return rd0.e.c(new j0(new i(this.f111777b.d.c(null, w4l.h.f294642c), 0), 20), p0.f264003c);
                }
                efm.r rVarJust2 = efm.r.just(f0.f322471a);
                Intrinsics.h(rVarJust2);
                return rVarJust2;
            default:
                Data it8 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f111777b.f111791b.i();
        }
    }
}
