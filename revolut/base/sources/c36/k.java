package c36;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.defi.common.models.dto.d f20903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f20904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.defi.common.models.dto.d f20905c;

    public /* synthetic */ k(int i, com.revolut.feature.defi.common.models.dto.d dVar, h hVar, com.revolut.feature.defi.common.models.dto.d dVar2) {
        if (7 != (i & 7)) {
            j1.f(i.f20902a.getDescriptor(), i, 7);
            throw null;
        }
        this.f20903a = dVar;
        this.f20904b = hVar;
        this.f20905c = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f20903a, kVar.f20903a) && Intrinsics.f(this.f20904b, kVar.f20904b) && Intrinsics.f(this.f20905c, kVar.f20905c);
    }

    public final int hashCode() {
        return this.f20905c.hashCode() + ((this.f20904b.hashCode() + (this.f20903a.hashCode() * 31)) * 31);
    }
}
