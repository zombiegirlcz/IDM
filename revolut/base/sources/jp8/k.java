package jp8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f177227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f177228b;

    public /* synthetic */ k(int i, String str, jo3.a aVar) {
        if (3 != (i & 3)) {
            j1.f(i.f177226a.getDescriptor(), i, 3);
            throw null;
        }
        this.f177227a = aVar;
        this.f177228b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f177227a, kVar.f177227a) && Intrinsics.f(this.f177228b, kVar.f177228b);
    }

    public final int hashCode() {
        return this.f177228b.hashCode() + (this.f177227a.hashCode() * 31);
    }
}
