package kqh;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f188409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f188410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f188411c;
    public final boolean d;

    public f(g flowType, Data instrumentGroups, Map instrumentCounts, boolean z) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(instrumentGroups, "instrumentGroups");
        Intrinsics.checkNotNullParameter(instrumentCounts, "instrumentCounts");
        this.f188409a = flowType;
        this.f188410b = instrumentGroups;
        this.f188411c = instrumentCounts;
        this.d = z;
    }

    public static f a(f fVar, Data instrumentGroups, Map instrumentCounts, boolean z, int i) {
        g flowType = fVar.f188409a;
        if ((i & 2) != 0) {
            instrumentGroups = fVar.f188410b;
        }
        if ((i & 4) != 0) {
            instrumentCounts = fVar.f188411c;
        }
        if ((i & 8) != 0) {
            z = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(instrumentGroups, "instrumentGroups");
        Intrinsics.checkNotNullParameter(instrumentCounts, "instrumentCounts");
        return new f(flowType, instrumentGroups, instrumentCounts, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f188409a == fVar.f188409a && Intrinsics.f(this.f188410b, fVar.f188410b) && Intrinsics.f(this.f188411c, fVar.f188411c) && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.e(kii.e.c(this.f188410b, this.f188409a.hashCode() * 31, 31), 31, this.f188411c);
    }
}
