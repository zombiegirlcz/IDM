package zmi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f323523c;

    public /* synthetic */ c(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(a.f323520a.getDescriptor(), i, 7);
            throw null;
        }
        this.f323521a = str;
        this.f323522b = str2;
        this.f323523c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f323521a, cVar.f323521a) && Intrinsics.f(this.f323522b, cVar.f323522b) && Intrinsics.f(this.f323523c, cVar.f323523c);
    }

    public final int hashCode() {
        return this.f323523c.hashCode() + p.a.c(this.f323521a.hashCode() * 31, 31, this.f323522b);
    }
}
