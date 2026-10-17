package dda;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f113181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f113182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f113183c;
    public final List d;

    public k(wi0.b bVar, wi0.b selected, ArrayList all2, List available) {
        Intrinsics.checkNotNullParameter(bVar, "default");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(all2, "all");
        Intrinsics.checkNotNullParameter(available, "available");
        this.f113181a = bVar;
        this.f113182b = selected;
        this.f113183c = all2;
        this.d = available;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f113181a.equals(kVar.f113181a) && this.f113182b.equals(kVar.f113182b) && this.f113183c.equals(kVar.f113183c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f113183c, p.a.c(this.f113181a.f297794a.hashCode() * 31, 31, this.f113182b.f297794a), 31);
    }
}
