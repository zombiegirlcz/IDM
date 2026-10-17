package d56;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.defi.common.models.dto.d f111376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.defi.common.models.dto.b f111377c;

    public /* synthetic */ j(int i, String str, com.revolut.feature.defi.common.models.dto.d dVar, com.revolut.feature.defi.common.models.dto.b bVar) {
        if (7 != (i & 7)) {
            j1.f(h.f111374a.getDescriptor(), i, 7);
            throw null;
        }
        this.f111375a = str;
        this.f111376b = dVar;
        this.f111377c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f111375a, jVar.f111375a) && Intrinsics.f(this.f111376b, jVar.f111376b) && Intrinsics.f(this.f111377c, jVar.f111377c);
    }

    public final int hashCode() {
        return this.f111377c.hashCode() + ((this.f111376b.hashCode() + (this.f111375a.hashCode() * 31)) * 31);
    }
}
