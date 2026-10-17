package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f294830c;

    public /* synthetic */ f(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(d.f294803a.getDescriptor(), i, 7);
            throw null;
        }
        this.f294828a = str;
        this.f294829b = str2;
        this.f294830c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f294828a, fVar.f294828a) && Intrinsics.f(this.f294829b, fVar.f294829b) && Intrinsics.f(this.f294830c, fVar.f294830c);
    }

    public final int hashCode() {
        return this.f294830c.hashCode() + p.a.c(this.f294828a.hashCode() * 31, 31, this.f294829b);
    }

    public f(String title, String ctaTitle, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f294828a = title;
        this.f294829b = ctaTitle;
        this.f294830c = items;
    }
}
