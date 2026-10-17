package mx0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class s5 extends v5 {
    public final TextLocalisedClause e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(int i, TextLocalisedClause actionLabelText) {
        super(i, 50, actionLabelText);
        Intrinsics.checkNotNullParameter(actionLabelText, "actionLabelText");
        this.e = actionLabelText;
        this.f = i;
    }

    @Override // mx0.v5
    public final int a() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj2;
        return Intrinsics.f(this.e, s5Var.e) && this.f == s5Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + (this.e.hashCode() * 31);
    }
}
