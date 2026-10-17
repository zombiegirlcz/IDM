package pf6;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f235478c = {null, yhm.j.c(yhm.k.PUBLICATION, new pdg.d(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f235480b;

    public /* synthetic */ h(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(f.f235477a.getDescriptor(), i, 3);
            throw null;
        }
        this.f235479a = str;
        this.f235480b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f235479a, hVar.f235479a) && Intrinsics.f(this.f235480b, hVar.f235480b);
    }

    public final int hashCode() {
        return this.f235480b.hashCode() + (this.f235479a.hashCode() * 31);
    }
}
