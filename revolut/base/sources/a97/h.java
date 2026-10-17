package a97;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2374b;

    public h(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        List mandatoryTypes = u.c(type);
        f0 optionalTypes = f0.f322471a;
        Intrinsics.checkNotNullParameter(mandatoryTypes, "mandatoryTypes");
        Intrinsics.checkNotNullParameter(optionalTypes, "optionalTypes");
        this.f2373a = mandatoryTypes;
        this.f2374b = optionalTypes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f2373a, hVar.f2373a) && Intrinsics.f(this.f2374b, hVar.f2374b);
    }

    public final int hashCode() {
        return this.f2374b.hashCode() + (this.f2373a.hashCode() * 31);
    }
}
