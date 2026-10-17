package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f188512b;

    public j(g extraMetadata) {
        Intrinsics.checkNotNullParameter("DIAGNOSTIC", "scanType");
        Intrinsics.checkNotNullParameter(extraMetadata, "extraMetadata");
        this.f188511a = "DIAGNOSTIC";
        this.f188512b = extraMetadata;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f188511a, jVar.f188511a) && Intrinsics.f(this.f188512b, jVar.f188512b);
    }

    public final int hashCode() {
        return this.f188512b.f188498a.hashCode() + (this.f188511a.hashCode() * 31);
    }

    public /* synthetic */ j(int i, String str, g gVar) {
        if (2 != (i & 2)) {
            qlm.j1.f(h.f188506a.getDescriptor(), i, 2);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f188511a = "DIAGNOSTIC";
        } else {
            this.f188511a = str;
        }
        this.f188512b = gVar;
    }
}
