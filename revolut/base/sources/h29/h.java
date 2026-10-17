package h29;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f148748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148749c;
    public final String d;

    public /* synthetic */ h(int i, String str, f fVar, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(a.f148741a.getDescriptor(), i, 7);
            throw null;
        }
        this.f148747a = str;
        this.f148748b = fVar;
        this.f148749c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f148747a, hVar.f148747a) && Intrinsics.f(this.f148748b, hVar.f148748b) && Intrinsics.f(this.f148749c, hVar.f148749c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f148748b.hashCode() + (this.f148747a.hashCode() * 31)) * 31, 31, this.f148749c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
