package g29;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f139948c = {null, j.c(k.PUBLICATION, new fyh.k(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j19.a f139950b;

    public /* synthetic */ e(int i, String str, j19.a aVar) {
        if (3 != (i & 3)) {
            j1.f(c.f139947a.getDescriptor(), i, 3);
            throw null;
        }
        this.f139949a = str;
        this.f139950b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f139949a, eVar.f139949a) && this.f139950b == eVar.f139950b;
    }

    public final int hashCode() {
        return this.f139950b.hashCode() + (this.f139949a.hashCode() * 31);
    }

    public e(String id10, j19.a contentSource) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(contentSource, "contentSource");
        this.f139949a = id10;
        this.f139950b = contentSource;
    }
}
