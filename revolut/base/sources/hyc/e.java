package hyc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f156781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f156782c;
    public final boolean d;

    public e(String type, a state, List restrictions, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        this.f156780a = type;
        this.f156781b = state;
        this.f156782c = restrictions;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f156780a, eVar.f156780a) && this.f156781b == eVar.f156781b && Intrinsics.f(this.f156782c, eVar.f156782c) && this.d == eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.d((this.f156781b.hashCode() + (this.f156780a.hashCode() * 31)) * 31, 31, this.f156782c);
    }
}
