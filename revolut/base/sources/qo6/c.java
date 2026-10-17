package qo6;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f248052g = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new qni.a(2)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f248054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f248055c;
    public final List d;
    public final s e;
    public final String f;

    public /* synthetic */ c(int i, String str, String str2, String str3, List list, s sVar, String str4) {
        if (63 != (i & 63)) {
            j1.f(a.f248051a.getDescriptor(), i, 63);
            throw null;
        }
        this.f248053a = str;
        this.f248054b = str2;
        this.f248055c = str3;
        this.d = list;
        this.e = sVar;
        this.f = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f248053a, cVar.f248053a) && Intrinsics.f(this.f248054b, cVar.f248054b) && Intrinsics.f(this.f248055c, cVar.f248055c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f248053a.hashCode() * 31, 31, this.f248054b);
        String str = this.f248055c;
        int iHashCode = (this.e.hashCode() + p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
