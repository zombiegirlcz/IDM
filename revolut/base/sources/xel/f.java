package xel;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f304713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f304714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f304715c;

    public f(c baseDocument, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(baseDocument, "baseDocument");
        this.f304713a = baseDocument;
        this.f304714b = z;
        this.f304715c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f304713a, fVar.f304713a) && this.f304714b == fVar.f304714b && this.f304715c == fVar.f304715c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f304715c) + j6.a.c(this.f304713a.hashCode() * 31, 31, this.f304714b);
    }
}
