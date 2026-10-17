package jf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class r implements l1 {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f173704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173705c;
    public final String d;

    public /* synthetic */ r(String str, int i, String str2, String str3, double d) {
        if (15 != (i & 15)) {
            qlm.j1.f(p.f173701a.getDescriptor(), i, 15);
            throw null;
        }
        this.f173703a = str;
        this.f173704b = d;
        this.f173705c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f173703a, rVar.f173703a) && Double.compare(this.f173704b, rVar.f173704b) == 0 && Intrinsics.f(this.f173705c, rVar.f173705c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(m72.b.c(this.f173703a.hashCode() * 31, this.f173704b, 31), 31, this.f173705c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
