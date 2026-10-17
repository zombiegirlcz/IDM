package dt3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f117356b;

    public c(String text, b bVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f117355a = text;
        this.f117356b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f117355a, cVar.f117355a) && this.f117356b == cVar.f117356b;
    }

    public final int hashCode() {
        int iHashCode = this.f117355a.hashCode() * 31;
        b bVar = this.f117356b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
