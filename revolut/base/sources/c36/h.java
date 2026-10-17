package c36;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.defi.common.models.dto.d f20900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20901b;

    public /* synthetic */ h(int i, com.revolut.feature.defi.common.models.dto.d dVar, String str) {
        if (3 != (i & 3)) {
            j1.f(f.f20899a.getDescriptor(), i, 3);
            throw null;
        }
        this.f20900a = dVar;
        this.f20901b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f20900a, hVar.f20900a) && Intrinsics.f(this.f20901b, hVar.f20901b);
    }

    public final int hashCode() {
        return this.f20901b.hashCode() + (this.f20900a.hashCode() * 31);
    }
}
