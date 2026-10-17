package u7g;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f277749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f277750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f277751c;

    public /* synthetic */ c(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(a.f277748a.getDescriptor(), i, 7);
            throw null;
        }
        this.f277749a = str;
        this.f277750b = str2;
        this.f277751c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f277749a, cVar.f277749a) && Intrinsics.f(this.f277750b, cVar.f277750b) && Intrinsics.f(this.f277751c, cVar.f277751c);
    }

    public final int hashCode() {
        return this.f277751c.hashCode() + p.a.c(this.f277749a.hashCode() * 31, 31, this.f277750b);
    }
}
