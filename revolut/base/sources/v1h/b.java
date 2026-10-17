package v1h;

import bdh.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bdh.b f285316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f285317b;

    public b(bdh.b controllerExtension, c controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f285316a = controllerExtension;
        this.f285317b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f285316a.equals(bVar.f285316a) && this.f285317b.equals(bVar.f285317b);
    }

    public final int hashCode() {
        return this.f285317b.hashCode() + (this.f285316a.hashCode() * 31);
    }
}
