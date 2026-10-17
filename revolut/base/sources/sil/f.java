package sil;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f263660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f263661b;

    public f(String title, ArrayList products) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(products, "products");
        this.f263660a = title;
        this.f263661b = products;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f263660a, fVar.f263660a) && this.f263661b.equals(fVar.f263661b);
    }

    public final int hashCode() {
        return this.f263661b.hashCode() + (this.f263660a.hashCode() * 31);
    }
}
