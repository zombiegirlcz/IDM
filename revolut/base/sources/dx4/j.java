package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r5 f120639a;

    public j(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f120639a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f120639a, ((j) obj2).f120639a);
    }

    public final int hashCode() {
        return this.f120639a.hashCode();
    }

    @Override // dx4.l
    public final String j() {
        r5 r5Var = this.f120639a;
        return j6.a.s("ShowVariantSelectionPopup(parameterKey=", r5Var.f120755a, ", title=", r5Var.f120756b, ")");
    }
}
