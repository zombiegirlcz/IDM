package il7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f162093c = {null, yhm.j.c(yhm.k.PUBLICATION, new igb.j(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f162095b;

    public /* synthetic */ c(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(a.f162089a.getDescriptor(), i, 3);
            throw null;
        }
        this.f162094a = str;
        this.f162095b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f162094a, cVar.f162094a) && Intrinsics.f(this.f162095b, cVar.f162095b);
    }

    public final int hashCode() {
        return this.f162095b.hashCode() + (this.f162094a.hashCode() * 31);
    }

    public c(String title, ArrayList benefits) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.f162094a = title;
        this.f162095b = benefits;
    }
}
