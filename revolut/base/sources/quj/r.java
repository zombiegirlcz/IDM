package quj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f249488c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ r(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        if (63 != (i & 63)) {
            j1.f(p.f249485a.getDescriptor(), i, 63);
            throw null;
        }
        this.f249486a = str;
        this.f249487b = str2;
        this.f249488c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f249486a, rVar.f249486a) && Intrinsics.f(this.f249487b, rVar.f249487b) && Intrinsics.f(this.f249488c, rVar.f249488c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f249486a.hashCode() * 31, 31, this.f249487b), 31, this.f249488c), 31, this.d), 31, this.e);
    }
}
