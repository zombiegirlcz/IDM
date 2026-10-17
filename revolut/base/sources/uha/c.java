package uha;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class c implements qf1.d {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new u9a.b(18)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f280166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f280167c;

    public /* synthetic */ c(int i, String str, k kVar, Double d5) {
        if (7 != (i & 7)) {
            j1.f(a.f280159a.getDescriptor(), i, 7);
            throw null;
        }
        this.f280165a = str;
        this.f280166b = kVar;
        this.f280167c = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f280165a, cVar.f280165a) && Intrinsics.f(this.f280166b, cVar.f280166b) && Intrinsics.f(this.f280167c, cVar.f280167c);
    }

    public final int hashCode() {
        int iHashCode = (this.f280166b.hashCode() + (this.f280165a.hashCode() * 31)) * 31;
        Double d5 = this.f280167c;
        return iHashCode + (d5 == null ? 0 : d5.hashCode());
    }

    public c(String itemId, k state, Double d5) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f280165a = itemId;
        this.f280166b = state;
        this.f280167c = d5;
    }
}
