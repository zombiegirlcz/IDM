package nu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219198b;

    public d(String planId, String title) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f219197a = planId;
        this.f219198b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f219197a, dVar.f219197a) && Intrinsics.f(this.f219198b, dVar.f219198b);
    }

    public final int hashCode() {
        return this.f219198b.hashCode() + (this.f219197a.hashCode() * 31);
    }
}
