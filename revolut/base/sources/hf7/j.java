package hf7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.k;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class j {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f151775c = {null, yhm.j.c(k.PUBLICATION, new d(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f151777b;

    public /* synthetic */ j(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(e.f151770a.getDescriptor(), i, 3);
            throw null;
        }
        this.f151776a = str;
        this.f151777b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f151776a, jVar.f151776a) && Intrinsics.f(this.f151777b, jVar.f151777b);
    }

    public final int hashCode() {
        String str = this.f151776a;
        return this.f151777b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
