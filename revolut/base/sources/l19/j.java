package l19;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new kw4.b(12)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f191498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f191499c;
    public final String d;

    public /* synthetic */ j(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            j1.f(h.f191496a.getDescriptor(), i, 15);
            throw null;
        }
        this.f191497a = str;
        this.f191498b = str2;
        this.f191499c = list;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f191497a, jVar.f191497a) && Intrinsics.f(this.f191498b, jVar.f191498b) && Intrinsics.f(this.f191499c, jVar.f191499c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.c(this.f191497a.hashCode() * 31, 31, this.f191498b), 31, this.f191499c);
    }
}
