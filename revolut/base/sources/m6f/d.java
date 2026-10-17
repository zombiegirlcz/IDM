package m6f;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f203055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f203056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f203057c;
    public final ArrayList d;
    public final g e;

    public d(q assetsSection, List sectorsSection, List regionsSection, ArrayList topHoldingAllocations, g allocationWidgetType) {
        Intrinsics.checkNotNullParameter(assetsSection, "assetsSection");
        Intrinsics.checkNotNullParameter(sectorsSection, "sectorsSection");
        Intrinsics.checkNotNullParameter(regionsSection, "regionsSection");
        Intrinsics.checkNotNullParameter(topHoldingAllocations, "topHoldingAllocations");
        Intrinsics.checkNotNullParameter(allocationWidgetType, "allocationWidgetType");
        this.f203055a = assetsSection;
        this.f203056b = sectorsSection;
        this.f203057c = regionsSection;
        this.d = topHoldingAllocations;
        this.e = allocationWidgetType;
    }

    public static d a(d dVar, q assetsSection) {
        List sectorsSection = dVar.f203056b;
        List regionsSection = dVar.f203057c;
        ArrayList topHoldingAllocations = dVar.d;
        g allocationWidgetType = dVar.e;
        Intrinsics.checkNotNullParameter(assetsSection, "assetsSection");
        Intrinsics.checkNotNullParameter(sectorsSection, "sectorsSection");
        Intrinsics.checkNotNullParameter(regionsSection, "regionsSection");
        Intrinsics.checkNotNullParameter(topHoldingAllocations, "topHoldingAllocations");
        Intrinsics.checkNotNullParameter(allocationWidgetType, "allocationWidgetType");
        return new d(assetsSection, sectorsSection, regionsSection, topHoldingAllocations, allocationWidgetType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f203055a.equals(dVar.f203055a) && Intrinsics.f(this.f203056b, dVar.f203056b) && Intrinsics.f(this.f203057c, dVar.f203057c) && this.d.equals(dVar.d) && this.e.equals(dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.d(p.a.d(this.f203055a.hashCode() * 31, 31, this.f203056b), 31, this.f203057c), 31);
    }
}
