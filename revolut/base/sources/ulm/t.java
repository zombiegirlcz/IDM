package ulm;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class t {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f281135c = new t(zhm.d0.i1(new q().f281123a), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f281136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final imm.e f281137b;

    public t(Set pins, imm.e eVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f281136a = pins;
        this.f281137b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r17, kotlin.jvm.functions.Function0 r18) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ulm.t.a(java.lang.String, kotlin.jvm.functions.Function0):void");
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(tVar.f281136a, this.f281136a) && Intrinsics.f(tVar.f281137b, this.f281137b);
    }

    public final int hashCode() {
        int iF = p.a.f(1517, 41, this.f281136a);
        imm.e eVar = this.f281137b;
        return iF + (eVar != null ? eVar.hashCode() : 0);
    }
}
