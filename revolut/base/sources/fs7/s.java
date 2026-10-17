package fs7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f137641c = {null, yhm.j.c(yhm.k.PUBLICATION, new fnk.a(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f137643b;

    public s(int i, String str, List list) {
        if (1 != (i & 1)) {
            j1.f(q.f137640a.getDescriptor(), i, 1);
            throw null;
        }
        this.f137642a = str;
        if ((i & 2) == 0) {
            this.f137643b = f0.f322471a;
        } else {
            this.f137643b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f137642a, sVar.f137642a) && Intrinsics.f(this.f137643b, sVar.f137643b);
    }

    public final int hashCode() {
        String str = this.f137642a;
        return this.f137643b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public s(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f137642a = str;
        this.f137643b = items;
    }
}
