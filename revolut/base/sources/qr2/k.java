package qr2;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class k {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new qni.a(13)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f248621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f248622c;
    public final j d;

    public /* synthetic */ k(int i, String str, String str2, List list, j jVar) {
        if (15 != (i & 15)) {
            j1.f(a.f248611a.getDescriptor(), i, 15);
            throw null;
        }
        this.f248620a = str;
        this.f248621b = str2;
        this.f248622c = list;
        this.d = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f248620a, kVar.f248620a) && Intrinsics.f(this.f248621b, kVar.f248621b) && Intrinsics.f(this.f248622c, kVar.f248622c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f248620a.hashCode() * 31;
        String str = this.f248621b;
        return this.d.hashCode() + p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f248622c);
    }
}
