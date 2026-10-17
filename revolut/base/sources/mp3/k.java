package mp3;

import dx4.a1;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f207736c = {yhm.j.c(yhm.k.PUBLICATION, new mp.e(29)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f207737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f207738b;

    public /* synthetic */ k(int i, a1 a1Var, String str) {
        if (3 != (i & 3)) {
            j1.f(i.f207735a.getDescriptor(), i, 3);
            throw null;
        }
        this.f207737a = a1Var;
        this.f207738b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f207737a == kVar.f207737a && Intrinsics.f(this.f207738b, kVar.f207738b);
    }

    public final int hashCode() {
        a1 a1Var = this.f207737a;
        return this.f207738b.hashCode() + ((a1Var == null ? 0 : a1Var.hashCode()) * 31);
    }

    public k(a1 a1Var, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f207737a = a1Var;
        this.f207738b = text;
    }
}
