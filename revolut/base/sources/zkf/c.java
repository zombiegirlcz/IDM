package zkf;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f322952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f322953b;

    public c(f5j.a aVar, LinkedHashMap linkedHashMap) {
        this.f322952a = aVar;
        this.f322953b = linkedHashMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f322952a, cVar.f322952a) && Intrinsics.f(this.f322953b, cVar.f322953b);
    }

    public final int hashCode() {
        f5j.a aVar = this.f322952a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        Map map = this.f322953b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }
}
