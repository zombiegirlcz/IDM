package oqk;

import kotlin.jvm.internal.Intrinsics;
import ood.o0;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f227923a;

    public b(mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f227923a = personalisationStorage;
    }

    public final int a() {
        Intrinsics.checkNotNullParameter("MAIN_WIDGET_COUNT_VISIBLE_TRANSACTIONS", "id");
        Double d = (Double) this.f227923a.a(new tk0.c("MAIN_WIDGET_COUNT_VISIBLE_TRANSACTIONS"));
        if (d != null) {
            return (int) d.doubleValue();
        }
        return 2;
    }

    public final efm.r b() {
        Intrinsics.checkNotNullParameter("MAIN_WIDGET_COUNT_VISIBLE_TRANSACTIONS", "id");
        efm.r map = nim.a.w(pw5.a.z(this.f227923a, new tk0.c("MAIN_WIDGET_COUNT_VISIBLE_TRANSACTIONS")), a.f).map(new oq3.f(8, new o0(26)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final pfm.r c(int i) {
        Intrinsics.checkNotNullParameter("MAIN_WIDGET_COUNT_VISIBLE_TRANSACTIONS", "id");
        return te0.w.g0(pw5.a.A(this.f227923a, new tk0.c("MAIN_WIDGET_COUNT_VISIBLE_TRANSACTIONS"), Double.valueOf(i)));
    }
}
