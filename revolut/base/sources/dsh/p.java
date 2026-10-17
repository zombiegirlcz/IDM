package dsh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f117338c;
    public final t d;

    public p(String id10, String widgetType, e config, t state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f117336a = id10;
        this.f117337b = widgetType;
        this.f117338c = config;
        this.d = state;
    }

    public static p a(p pVar, e config, t state, int i) {
        String id10 = pVar.f117336a;
        String widgetType = pVar.f117337b;
        if ((i & 4) != 0) {
            config = pVar.f117338c;
        }
        if ((i & 8) != 0) {
            state = pVar.d;
        }
        pVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(state, "state");
        return new p(id10, widgetType, config, state);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f117336a, pVar.f117336a) && Intrinsics.f(this.f117337b, pVar.f117337b) && Intrinsics.f(this.f117338c, pVar.f117338c) && this.d == pVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + r6.b.e(this.f117338c.f117319a, p.a.c(this.f117336a.hashCode() * 31, 31, this.f117337b), 31);
    }
}
