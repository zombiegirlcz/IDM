package w5b;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f294908c;

    public /* synthetic */ l(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(j.f294881a.getDescriptor(), i, 7);
            throw null;
        }
        this.f294906a = str;
        this.f294907b = str2;
        this.f294908c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f294906a, lVar.f294906a) && Intrinsics.f(this.f294907b, lVar.f294907b) && Intrinsics.f(this.f294908c, lVar.f294908c);
    }

    public final int hashCode() {
        return this.f294908c.hashCode() + p.a.c(this.f294906a.hashCode() * 31, 31, this.f294907b);
    }
}
