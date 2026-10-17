package ohe;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import ofa.n;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f225358c = {j.c(k.PUBLICATION, new n(16)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yfe.h f225359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f225360b;

    public /* synthetic */ e(int i, yfe.h hVar, boolean z) {
        if (1 != (i & 1)) {
            j1.f(c.f225357a.getDescriptor(), i, 1);
            throw null;
        }
        this.f225359a = hVar;
        if ((i & 2) == 0) {
            this.f225360b = false;
        } else {
            this.f225360b = z;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f225359a, eVar.f225359a) && this.f225360b == eVar.f225360b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f225360b) + (this.f225359a.hashCode() * 31);
    }

    public e(yfe.h snapshot, boolean z) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.f225359a = snapshot;
        this.f225360b = z;
    }
}
