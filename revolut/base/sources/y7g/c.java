package y7g;

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
    public final String f311512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f311513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f311514c;

    public /* synthetic */ c(int i, String str, int i2, String str2) {
        if (7 != (i & 7)) {
            j1.f(a.f311511a.getDescriptor(), i, 7);
            throw null;
        }
        this.f311512a = str;
        this.f311513b = i2;
        this.f311514c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f311512a, cVar.f311512a) && this.f311513b == cVar.f311513b && Intrinsics.f(this.f311514c, cVar.f311514c);
    }

    public final int hashCode() {
        return this.f311514c.hashCode() + j6.a.b(this.f311513b, this.f311512a.hashCode() * 31, 31);
    }
}
