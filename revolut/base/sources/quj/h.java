package quj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f249467c = {null, yhm.j.c(yhm.k.PUBLICATION, new qu1.d(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f249469b;

    public /* synthetic */ h(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(f.f249466a.getDescriptor(), i, 3);
            throw null;
        }
        this.f249468a = str;
        this.f249469b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f249468a, hVar.f249468a) && Intrinsics.f(this.f249469b, hVar.f249469b);
    }

    public final int hashCode() {
        return this.f249469b.hashCode() + (this.f249468a.hashCode() * 31);
    }
}
