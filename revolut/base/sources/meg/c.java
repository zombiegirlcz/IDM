package meg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f204664c;

    public c(String reference, String queryParam, ArrayList newValues) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(queryParam, "queryParam");
        Intrinsics.checkNotNullParameter(newValues, "newValues");
        this.f204662a = reference;
        this.f204663b = queryParam;
        this.f204664c = newValues;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f204662a, cVar.f204662a) && Intrinsics.f(this.f204663b, cVar.f204663b) && this.f204664c.equals(cVar.f204664c);
    }

    public final int hashCode() {
        return this.f204664c.hashCode() + p.a.c(this.f204662a.hashCode() * 31, 31, this.f204663b);
    }
}
