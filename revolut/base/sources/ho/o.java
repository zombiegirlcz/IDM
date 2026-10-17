package ho;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class o extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final frl.c f154187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final frl.b f154189c;
    public final Map d;

    public o(frl.c category, String label, frl.b action, Map params) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f154187a = category;
        this.f154188b = label;
        this.f154189c = action;
        this.d = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f154187a == oVar.f154187a && Intrinsics.f(this.f154188b, oVar.f154188b) && this.f154189c == oVar.f154189c && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f154189c.hashCode() + p.a.c(this.f154187a.hashCode() * 31, 31, this.f154188b)) * 31);
    }
}
