package ml7;

import a0.d;
import com.google.gson.reflect.TypeToken;
import il7.x;
import java.lang.reflect.Type;
import java.util.List;
import kl7.j0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Type f206642c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f206643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f206644b;

    static {
        Type type = new TypeToken<List<? extends x>>() { // from class: com.revolut.feature.insurance_car.impl.data.repository.dod.DrivingScoreDataPointParam$Companion$ENTITY_LIST$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f206642c = type;
    }

    public c(String policyId, j0 window) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(window, "window");
        this.f206643a = policyId;
        this.f206644b = window;
    }

    public final String a() {
        return d.s("DRIVING_SCORE_DATA_POINT_ITEMS_PREFIX_", this.f206643a, "_", this.f206644b.getCode());
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f206643a, cVar.f206643a) && this.f206644b == cVar.f206644b;
    }

    public final int hashCode() {
        return this.f206644b.hashCode() + (this.f206643a.hashCode() * 31);
    }
}
