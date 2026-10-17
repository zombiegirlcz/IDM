package dx4;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f120583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3 f120584c;

    public e3(String title, ArrayList items, g3 g3Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f120582a = title;
        this.f120583b = items;
        this.f120584c = g3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj2;
        return Intrinsics.f(this.f120582a, e3Var.f120582a) && this.f120583b.equals(e3Var.f120583b) && Intrinsics.f(this.f120584c, e3Var.f120584c);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f120583b, this.f120582a.hashCode() * 31, 31);
        g3 g3Var = this.f120584c;
        return iB + (g3Var == null ? 0 : g3Var.hashCode());
    }
}
