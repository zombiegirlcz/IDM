package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f131672c;

    public /* synthetic */ o(int i, String str, boolean z, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(m.f131654a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131670a = str;
        this.f131671b = str2;
        if ((i & 4) == 0) {
            this.f131672c = false;
        } else {
            this.f131672c = z;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f131670a, oVar.f131670a) && Intrinsics.f(this.f131671b, oVar.f131671b) && this.f131672c == oVar.f131672c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131672c) + p.a.c(this.f131670a.hashCode() * 31, 31, this.f131671b);
    }

    public o(String start, String end2, boolean z) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f131670a = start;
        this.f131671b = end2;
        this.f131672c = z;
    }
}
