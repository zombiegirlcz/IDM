package v7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new v4a.a(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f286639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f286640c;
    public final String d;
    public final List e;

    public /* synthetic */ f(int i, String str, String str2, String str3, String str4, List list) {
        if (31 != (i & 31)) {
            j1.f(d.f286637a.getDescriptor(), i, 31);
            throw null;
        }
        this.f286638a = str;
        this.f286639b = str2;
        this.f286640c = str3;
        this.d = str4;
        this.e = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f286638a, fVar.f286638a) && Intrinsics.f(this.f286639b, fVar.f286639b) && Intrinsics.f(this.f286640c, fVar.f286640c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f286638a.hashCode() * 31, 31, this.f286639b), 31, this.f286640c), 31, this.d);
    }
}
