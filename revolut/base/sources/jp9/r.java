package jp9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f177250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f177251c;
    public final long d;

    public /* synthetic */ r(int i, long j2, long j3, String str, String str2) {
        if (15 != (i & 15)) {
            j1.f(p.f177248a.getDescriptor(), i, 15);
            throw null;
        }
        this.f177249a = str;
        this.f177250b = str2;
        this.f177251c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f177249a, rVar.f177249a) && Intrinsics.f(this.f177250b, rVar.f177250b) && this.f177251c == rVar.f177251c && this.d == rVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + a0.d.c(p.a.c(this.f177249a.hashCode() * 31, 31, this.f177250b), 31, this.f177251c);
    }
}
