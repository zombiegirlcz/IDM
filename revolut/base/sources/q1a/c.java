package q1a;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f241411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f241412b;

    public c(ArrayList errors, boolean z) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f241411a = z;
        this.f241412b = errors;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f241411a == cVar.f241411a && this.f241412b.equals(cVar.f241412b);
    }

    public final int hashCode() {
        return this.f241412b.hashCode() + (Boolean.hashCode(this.f241411a) * 31);
    }
}
