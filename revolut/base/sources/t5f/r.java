package t5f;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new szl.a(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f268102c;

    public /* synthetic */ r(int i, String str, String str2, n nVar) {
        if (5 != (i & 5)) {
            j1.f(p.f268099a.getDescriptor(), i, 5);
            throw null;
        }
        this.f268100a = str;
        if ((i & 2) == 0) {
            this.f268101b = null;
        } else {
            this.f268101b = str2;
        }
        this.f268102c = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f268100a, rVar.f268100a) && Intrinsics.f(this.f268101b, rVar.f268101b) && Intrinsics.f(this.f268102c, rVar.f268102c);
    }

    public final int hashCode() {
        int iHashCode = this.f268100a.hashCode() * 31;
        String str = this.f268101b;
        return this.f268102c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public r(String title, String str, n content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f268100a = title;
        this.f268101b = str;
        this.f268102c = content;
    }
}
