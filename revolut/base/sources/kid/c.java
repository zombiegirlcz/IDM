package kid;

import h4g.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.i1;
import ulm.j1;
import ulm.y0;
import yhm.j;
import zhm.d0;
import zhm.q0;
import zlm.h;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Interceptor {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f184218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f184219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f184220c;

    public c(g shopsFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        this.f184218a = shopsFeatureAvailabilityInteractor;
        final int i = 0;
        this.f184219b = j.b(new Function0(this) { // from class: kid.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f184217b;

            {
                this.f184217b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Boolean.valueOf(this.f184217b.f184218a.e());
                    default:
                        Lazy lazy = this.f184217b.f184219b;
                        String[] elements = {((Boolean) lazy.getValue()).booleanValue() ? "POINTS" : null, ((Boolean) lazy.getValue()).booleanValue() ? "TOP_DEALS" : null};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return q0.c(new Pair("X-Shops-Features", d.L(elements)));
                }
            }
        });
        final int i2 = 1;
        this.f184220c = j.b(new Function0(this) { // from class: kid.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f184217b;

            {
                this.f184217b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(this.f184217b.f184218a.e());
                    default:
                        Lazy lazy = this.f184217b.f184219b;
                        String[] elements = {((Boolean) lazy.getValue()).booleanValue() ? "POINTS" : null, ((Boolean) lazy.getValue()).booleanValue() ? "TOP_DEALS" : null};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return q0.c(new Pair("X-Shops-Features", d.L(elements)));
                }
            }
        });
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        h hVar = (h) chain;
        j1 j1Var = hVar.e;
        i1 i1VarB = j1Var.b();
        i1VarB.c(j1Var.f281096b, j1Var.d);
        Map map = (Map) this.f184220c.getValue();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (!list.isEmpty()) {
                i1VarB.a(str, d0.k0(list, ",", null, null, 0, null, 62));
            }
            arrayList.add(Unit.f186387a);
        }
        return hVar.b(new j1(i1VarB));
    }
}
