package h29;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f148751c = {null, yhm.j.c(yhm.k.PUBLICATION, new gx2.a(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f148753b;

    public /* synthetic */ k(int i, String str, List list) {
        if (2 != (i & 2)) {
            j1.f(i.f148750a.getDescriptor(), i, 2);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f148752a = null;
        } else {
            this.f148752a = str;
        }
        this.f148753b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f148752a, kVar.f148752a) && Intrinsics.f(this.f148753b, kVar.f148753b);
    }

    public final int hashCode() {
        String str = this.f148752a;
        return this.f148753b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
