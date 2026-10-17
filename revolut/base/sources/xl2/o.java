package xl2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f306920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f306921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f306922c;

    public o(long j2, ArrayList entities, boolean z) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        this.f306920a = z;
        this.f306921b = j2;
        this.f306922c = entities;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f306920a == oVar.f306920a && this.f306921b == oVar.f306921b && this.f306922c.equals(oVar.f306922c);
    }

    public final int hashCode() {
        return this.f306922c.hashCode() + a0.d.c(Boolean.hashCode(this.f306920a) * 31, 31, this.f306921b);
    }
}
