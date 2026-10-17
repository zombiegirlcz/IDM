package a66;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1547c;

    public /* synthetic */ c(int i, String str, String str2, String str3) {
        if (5 != (i & 5)) {
            j1.f(a.f1544a.getDescriptor(), i, 5);
            throw null;
        }
        this.f1545a = str;
        if ((i & 2) == 0) {
            this.f1546b = "HPKE";
        } else {
            this.f1546b = str2;
        }
        this.f1547c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f1545a, cVar.f1545a) && Intrinsics.f(this.f1546b, cVar.f1546b) && Intrinsics.f(this.f1547c, cVar.f1547c);
    }

    public final int hashCode() {
        return this.f1547c.hashCode() + p.a.c(this.f1545a.hashCode() * 31, 31, this.f1546b);
    }
}
