package usj;

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
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new us4.b(1)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f282954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f282955c;

    public /* synthetic */ l(int i, String str, List list, boolean z) {
        if (7 != (i & 7)) {
            j1.f(j.f282952a.getDescriptor(), i, 7);
            throw null;
        }
        this.f282953a = str;
        this.f282954b = list;
        this.f282955c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f282953a, lVar.f282953a) && Intrinsics.f(this.f282954b, lVar.f282954b) && this.f282955c == lVar.f282955c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f282955c) + p.a.d(this.f282953a.hashCode() * 31, 31, this.f282954b);
    }
}
