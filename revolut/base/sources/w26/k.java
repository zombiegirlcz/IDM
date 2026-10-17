package w26;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f293961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f293962c;

    public /* synthetic */ k(int i, String str, jo3.a aVar, jo3.a aVar2) {
        if (7 != (i & 7)) {
            j1.f(i.f293959a.getDescriptor(), i, 7);
            throw null;
        }
        this.f293960a = str;
        this.f293961b = aVar;
        this.f293962c = aVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f293960a, kVar.f293960a) && Intrinsics.f(this.f293961b, kVar.f293961b) && Intrinsics.f(this.f293962c, kVar.f293962c);
    }

    public final int hashCode() {
        return this.f293962c.hashCode() + v7.j(this.f293961b, this.f293960a.hashCode() * 31, 31);
    }
}
