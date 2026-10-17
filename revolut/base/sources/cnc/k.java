package cnc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f25396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f25397b;

    public k(j header, ArrayList items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f25396a = header;
        this.f25397b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f25397b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f25396a.equals(kVar.f25396a) && this.f25397b.equals(kVar.f25397b);
    }

    public final int hashCode() {
        return this.f25397b.hashCode() + (this.f25396a.hashCode() * 31);
    }
}
