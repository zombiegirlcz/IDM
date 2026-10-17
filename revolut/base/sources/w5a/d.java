package w5a;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@g
public final class d {

    @NotNull
    public static final c Companion = new c();
    public static final Lazy[] d = {null, null, j.c(k.PUBLICATION, new w56.a(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f294766c;

    public /* synthetic */ d(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(b.f294763a.getDescriptor(), i, 7);
            throw null;
        }
        this.f294764a = str;
        this.f294765b = str2;
        this.f294766c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f294764a, dVar.f294764a) && Intrinsics.f(this.f294765b, dVar.f294765b) && Intrinsics.f(this.f294766c, dVar.f294766c);
    }

    public final int hashCode() {
        return this.f294766c.hashCode() + p.a.c(this.f294764a.hashCode() * 31, 31, this.f294765b);
    }
}
