package ttj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class j1 {

    @NotNull
    public static final i1 Companion = new i1();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f274357g = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ts1.h(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f274360c;
    public final String d;
    public final String e;
    public final List f;

    public /* synthetic */ j1(int i, String str, String str2, String str3, String str4, String str5, List list) {
        if (63 != (i & 63)) {
            qlm.j1.f(h1.f274350a.getDescriptor(), i, 63);
            throw null;
        }
        this.f274358a = str;
        this.f274359b = str2;
        this.f274360c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.f274358a, j1Var.f274358a) && Intrinsics.f(this.f274359b, j1Var.f274359b) && Intrinsics.f(this.f274360c, j1Var.f274360c) && Intrinsics.f(this.d, j1Var.d) && Intrinsics.f(this.e, j1Var.e) && Intrinsics.f(this.f, j1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f274358a.hashCode() * 31, 31, this.f274359b), 31, this.f274360c), 31, this.d), 31, this.e);
    }
}
