package cd8;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f23211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f23212c;

    public /* synthetic */ f(int i, String str, c cVar, c cVar2) {
        if (7 != (i & 7)) {
            j1.f(d.f23209a.getDescriptor(), i, 7);
            throw null;
        }
        this.f23210a = str;
        this.f23211b = cVar;
        this.f23212c = cVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f23210a, fVar.f23210a) && Intrinsics.f(this.f23211b, fVar.f23211b) && Intrinsics.f(this.f23212c, fVar.f23212c);
    }

    public final int hashCode() {
        int iHashCode = this.f23210a.hashCode() * 31;
        c cVar = this.f23211b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.f23208a.hashCode())) * 31;
        c cVar2 = this.f23212c;
        return iHashCode2 + (cVar2 != null ? cVar2.f23208a.hashCode() : 0);
    }

    public f(String juniorId, c cVar, c cVar2) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f23210a = juniorId;
        this.f23211b = cVar;
        this.f23212c = cVar2;
    }
}
