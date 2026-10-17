package jz8;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class v extends s {

    @NotNull
    public static final u Companion = new u();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new jxi.a(17)), null};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f179674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f179675c;

    public /* synthetic */ v(int i, List list, String str) {
        if (3 != (i & 3)) {
            j1.f(t.f179662a.getDescriptor(), i, 3);
            throw null;
        }
        this.f179674b = list;
        this.f179675c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f179674b, vVar.f179674b) && Intrinsics.f(this.f179675c, vVar.f179675c);
    }

    public final int hashCode() {
        return this.f179675c.hashCode() + (this.f179674b.hashCode() * 31);
    }

    public v(String href, ArrayList children) {
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(href, "href");
        this.f179674b = children;
        this.f179675c = href;
    }
}
