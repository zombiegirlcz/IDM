package lk0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f196171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f196172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f196173c;
    public final String d;
    public final Throwable e;

    public e(List content, f params, boolean z, String str, Throwable th10) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f196171a = content;
        this.f196172b = params;
        this.f196173c = z;
        this.d = str;
        this.e = th10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f196171a, eVar.f196171a) && Intrinsics.f(this.f196172b, eVar.f196172b) && this.f196173c == eVar.f196173c && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f196172b.hashCode() + (this.f196171a.hashCode() * 31)) * 31, 31, this.f196173c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th10 = this.e;
        return iHashCode + (th10 != null ? th10.hashCode() : 0);
    }

    public /* synthetic */ e(List list, f fVar, boolean z, String str, Throwable th10, int i) {
        this(list, fVar, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : th10);
    }
}
