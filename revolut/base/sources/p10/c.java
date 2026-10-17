package p10;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yji.n;
import zhm.f0;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f231597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yji.d f231598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f231599c;

    public c(List delegates, yji.d controllerExtension, n controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f231597a = delegates;
        this.f231598b = controllerExtension;
        this.f231599c = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f231597a, cVar.f231597a) && Intrinsics.f(this.f231598b, cVar.f231598b) && Intrinsics.f(this.f231599c, cVar.f231599c);
    }

    public final int hashCode() {
        return this.f231599c.hashCode() + ((this.f231598b.hashCode() + (this.f231597a.hashCode() * 31)) * 31);
    }

    public c() {
        this(f0.f322471a, d.f231600c, e.f231601l);
    }
}
