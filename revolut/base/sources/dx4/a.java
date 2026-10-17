package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120542a;

    public a(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f120542a = actionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f120542a, ((a) obj2).f120542a);
    }

    public final int hashCode() {
        return this.f120542a.hashCode();
    }

    @Override // dx4.l
    public final String j() {
        return p.a.p("Custom(actionId=", this.f120542a, ")");
    }
}
