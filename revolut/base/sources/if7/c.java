package if7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes22.dex */
@g
public final class c extends e {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] e = {null, null, j.c(k.PUBLICATION, new i83.b(27))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160963c;
    public final List d;

    public /* synthetic */ c(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(a.f160961a.getDescriptor(), i, 7);
            throw null;
        }
        this.f160962b = str;
        this.f160963c = str2;
        this.d = list;
    }

    @Override // if7.e
    public final String a() {
        return this.f160962b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f160962b, cVar.f160962b) && Intrinsics.f(this.f160963c, cVar.f160963c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(this.f160962b.hashCode() * 31, 31, this.f160963c);
    }
}
