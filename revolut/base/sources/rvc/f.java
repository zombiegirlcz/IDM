package rvc;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f257744b;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f257743a, fVar.f257743a) && Intrinsics.f(this.f257744b, fVar.f257744b);
    }

    public final int hashCode() {
        int iHashCode = this.f257743a.hashCode() * 31;
        Clause clause = this.f257744b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }

    public f(Clause clause, String locationName) {
        Intrinsics.checkNotNullParameter(locationName, "locationName");
        this.f257743a = locationName;
        this.f257744b = clause;
    }

    public /* synthetic */ f(int i) {
        this(null, "");
    }
}
