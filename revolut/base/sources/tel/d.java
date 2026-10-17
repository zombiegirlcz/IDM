package tel;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f270123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f270124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f270125c;

    public d(ArrayList projections, ArrayList steps, dj0.d defaultInvestment) {
        Intrinsics.checkNotNullParameter(projections, "projections");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(defaultInvestment, "defaultInvestment");
        this.f270123a = projections;
        this.f270124b = steps;
        this.f270125c = defaultInvestment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f270123a.equals(dVar.f270123a) && this.f270124b.equals(dVar.f270124b) && this.f270125c.equals(dVar.f270125c);
    }

    public final int hashCode() {
        return this.f270125c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f270124b, this.f270123a.hashCode() * 31, 31);
    }
}
