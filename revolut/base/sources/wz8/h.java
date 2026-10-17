package wz8;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import wyc.u;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new u(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f301385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f301386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f301387c;

    public /* synthetic */ h(int i, e eVar, String str, List list) {
        if (6 != (i & 6)) {
            j1.f(f.f301384a.getDescriptor(), i, 6);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f301385a = null;
        } else {
            this.f301385a = eVar;
        }
        this.f301386b = str;
        this.f301387c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f301385a, hVar.f301385a) && Intrinsics.f(this.f301386b, hVar.f301386b) && Intrinsics.f(this.f301387c, hVar.f301387c);
    }

    public final int hashCode() {
        e eVar = this.f301385a;
        return this.f301387c.hashCode() + p.a.c((eVar == null ? 0 : eVar.hashCode()) * 31, 31, this.f301386b);
    }
}
