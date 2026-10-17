package af1;

import java.util.Arrays;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i80.a f3819a;

    public c(i80.a aVar) {
        this.f3819a = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f3819a, ((c) obj2).f3819a);
    }

    public final int hashCode() {
        i80.a aVar = this.f3819a;
        if (aVar == null) {
            return 0;
        }
        return Arrays.deepHashCode(aVar.f159408a);
    }
}
