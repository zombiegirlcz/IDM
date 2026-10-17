package m2l;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f202218c = {null, yhm.j.c(yhm.k.PUBLICATION, new m05.d(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f202220b;

    public /* synthetic */ o(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(m.f202217a.getDescriptor(), i, 3);
            throw null;
        }
        this.f202219a = str;
        this.f202220b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f202219a, oVar.f202219a) && Intrinsics.f(this.f202220b, oVar.f202220b);
    }

    public final int hashCode() {
        return this.f202220b.hashCode() + (this.f202219a.hashCode() * 31);
    }

    public o(String value, ArrayList styleElements) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(styleElements, "styleElements");
        this.f202219a = value;
        this.f202220b = styleElements;
    }
}
