package y6f;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f311265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f311266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f311267c;

    public b(Clause title, Image icon, a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f311265a = title;
        this.f311266b = icon;
        this.f311267c = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static b a(b bVar, a aVar) {
        ?? title = bVar.f311265a;
        Image icon = bVar.f311266b;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new b(title, icon, aVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f311265a.equals(bVar.f311265a) && this.f311266b.equals(bVar.f311266b) && Intrinsics.f(this.f311267c, bVar.f311267c);
    }

    public final int hashCode() {
        int iC = a10.b.c(this.f311266b, this.f311265a.hashCode() * 31, 31);
        a aVar = this.f311267c;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }
}
