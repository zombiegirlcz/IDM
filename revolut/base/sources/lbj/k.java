package lbj;

import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f193702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f193703c;
    public final jo3.b d;
    public final jo3.b e;

    public k(jo3.b amount, String title, String description, jo3.b bVar, String shortDescription) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f193701a = title;
        this.f193702b = description;
        this.f193703c = shortDescription;
        this.d = amount;
        this.e = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f193701a, kVar.f193701a) && Intrinsics.f(this.f193702b, kVar.f193702b) && Intrinsics.f(this.f193703c, kVar.f193703c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iE = y.e(this.d, p.a.c(p.a.c(this.f193701a.hashCode() * 31, 31, this.f193702b), 31, this.f193703c), 31);
        jo3.b bVar = this.e;
        return iE + (bVar == null ? 0 : bVar.hashCode());
    }
}
