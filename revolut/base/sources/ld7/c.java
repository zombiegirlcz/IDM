package ld7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f194039c = {null, j.c(k.PUBLICATION, new l92.h(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f194041b;

    public /* synthetic */ c(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(a.f194038a.getDescriptor(), i, 3);
            throw null;
        }
        this.f194040a = str;
        this.f194041b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f194040a, cVar.f194040a) && Intrinsics.f(this.f194041b, cVar.f194041b);
    }

    public final int hashCode() {
        return this.f194041b.hashCode() + (this.f194040a.hashCode() * 31);
    }

    public c(String text, ArrayList links) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f194040a = text;
        this.f194041b = links;
    }
}
