package a0h;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f385b;

    public b(a section, List assetTypesParameters) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(assetTypesParameters, "assetTypesParameters");
        this.f384a = section;
        this.f385b = assetTypesParameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f384a == bVar.f384a && Intrinsics.f(this.f385b, bVar.f385b);
    }

    public final int hashCode() {
        return this.f385b.hashCode() + (this.f384a.hashCode() * 31);
    }
}
