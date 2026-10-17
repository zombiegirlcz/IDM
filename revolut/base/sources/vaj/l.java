package vaj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f287316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f287317c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{null, yhm.j.c(kVar, new v4a.a(20)), yhm.j.c(kVar, new v4a.a(21))};
    }

    public /* synthetic */ l(int i, String str, List list, List list2) {
        if (7 != (i & 7)) {
            j1.f(j.f287314a.getDescriptor(), i, 7);
            throw null;
        }
        this.f287315a = str;
        this.f287316b = list;
        this.f287317c = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f287315a, lVar.f287315a) && Intrinsics.f(this.f287316b, lVar.f287316b) && Intrinsics.f(this.f287317c, lVar.f287317c);
    }

    public final int hashCode() {
        return this.f287317c.hashCode() + p.a.d(this.f287315a.hashCode() * 31, 31, this.f287316b);
    }

    public l(ArrayList content, ArrayList links, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f287315a = name;
        this.f287316b = content;
        this.f287317c = links;
    }
}
