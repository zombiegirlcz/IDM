package y20;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f310444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f310445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f310446c;
    public final List d;
    public final ArrayList e;

    public a(p scope, Integer num, ArrayList mergedGroups, List adoptedRowIds, ArrayList coloredRowIds) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(mergedGroups, "mergedGroups");
        Intrinsics.checkNotNullParameter(adoptedRowIds, "adoptedRowIds");
        Intrinsics.checkNotNullParameter(coloredRowIds, "coloredRowIds");
        this.f310444a = scope;
        this.f310445b = num;
        this.f310446c = mergedGroups;
        this.d = adoptedRowIds;
        this.e = coloredRowIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f310444a, aVar.f310444a) && Intrinsics.f(this.f310445b, aVar.f310445b) && this.f310446c.equals(aVar.f310446c) && Intrinsics.f(this.d, aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f310444a.hashCode() * 31;
        Integer num = this.f310445b;
        return this.e.hashCode() + p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f310446c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.d);
    }
}
