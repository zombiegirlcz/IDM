package m98;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f203645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f203646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f203647c;

    public j(g navBarConfig, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f203645a = navBarConfig;
        this.f203646b = items;
        this.f203647c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f203646b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f203645a, jVar.f203645a) && this.f203646b.equals(jVar.f203646b) && this.f203647c == jVar.f203647c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203647c) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f203646b, this.f203645a.hashCode() * 31, 31);
    }
}
