package bwf;

import com.revolut.feature.transport.impl.common.TransportHubLocation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransportHubLocation f19328c;

    public f(List steps, String selectedStepId, TransportHubLocation location) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(selectedStepId, "selectedStepId");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f19326a = steps;
        this.f19327b = selectedStepId;
        this.f19328c = location;
    }

    public static f a(f fVar, String selectedStepId, TransportHubLocation location, int i) {
        List steps = fVar.f19326a;
        if ((i & 2) != 0) {
            selectedStepId = fVar.f19327b;
        }
        if ((i & 4) != 0) {
            location = fVar.f19328c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(selectedStepId, "selectedStepId");
        Intrinsics.checkNotNullParameter(location, "location");
        return new f(steps, selectedStepId, location);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f19326a, fVar.f19326a) && Intrinsics.f(this.f19327b, fVar.f19327b) && Intrinsics.f(this.f19328c, fVar.f19328c);
    }

    public final int hashCode() {
        return this.f19328c.hashCode() + p.a.c(this.f19326a.hashCode() * 31, 31, this.f19327b);
    }
}
