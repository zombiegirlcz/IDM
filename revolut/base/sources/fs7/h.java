package fs7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f137626c = {null, yhm.j.c(yhm.k.PUBLICATION, new fnk.a(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f137628b;

    public h(int i, String str, List list) {
        if (1 != (i & 1)) {
            j1.f(f.f137625a.getDescriptor(), i, 1);
            throw null;
        }
        this.f137627a = str;
        if ((i & 2) == 0) {
            this.f137628b = f0.f322471a;
        } else {
            this.f137628b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f137627a, hVar.f137627a) && Intrinsics.f(this.f137628b, hVar.f137628b);
    }

    public final int hashCode() {
        String str = this.f137627a;
        return this.f137628b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public h(String str, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f137627a = str;
        this.f137628b = items;
    }
}
