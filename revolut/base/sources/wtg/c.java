package wtg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f299942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f299943c;

    public /* synthetic */ c(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(a.f299939a.getDescriptor(), i, 7);
            throw null;
        }
        this.f299941a = str;
        this.f299942b = str2;
        this.f299943c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f299941a, cVar.f299941a) && Intrinsics.f(this.f299942b, cVar.f299942b) && Intrinsics.f(this.f299943c, cVar.f299943c);
    }

    public final int hashCode() {
        return this.f299943c.hashCode() + p.a.c(this.f299941a.hashCode() * 31, 31, this.f299942b);
    }
}
