package y19;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f310338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f310339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f310340c;
    public final ArrayList d;

    public e(dj0.d totalSaved, i type, ArrayList usedProducts, ArrayList unusedProducts) {
        Intrinsics.checkNotNullParameter(totalSaved, "totalSaved");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(usedProducts, "usedProducts");
        Intrinsics.checkNotNullParameter(unusedProducts, "unusedProducts");
        this.f310338a = totalSaved;
        this.f310339b = type;
        this.f310340c = usedProducts;
        this.d = unusedProducts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f310338a.equals(eVar.f310338a) && this.f310339b == eVar.f310339b && this.f310340c.equals(eVar.f310340c) && this.d.equals(eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f310340c, (this.f310339b.hashCode() + (this.f310338a.hashCode() * 31)) * 31, 31);
    }
}
