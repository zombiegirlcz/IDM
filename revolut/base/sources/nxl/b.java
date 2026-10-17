package nxl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import mxl.j;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f220581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f220582c;

    public b(String groupId, String selectedDesignId, ArrayList designs) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(designs, "designs");
        Intrinsics.checkNotNullParameter(selectedDesignId, "selectedDesignId");
        this.f220580a = groupId;
        this.f220581b = designs;
        this.f220582c = selectedDesignId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f220580a, bVar.f220580a) && this.f220581b.equals(bVar.f220581b) && Intrinsics.f(this.f220582c, bVar.f220582c);
    }

    public final int hashCode() {
        return this.f220582c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f220581b, this.f220580a.hashCode() * 31, 31);
    }
}
