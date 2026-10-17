package d27;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f110732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f110733b;

    public b0(TextLocalisedClause title, List actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f110732a = title;
        this.f110733b = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f110732a.equals(b0Var.f110732a) && Intrinsics.f(this.f110733b, b0Var.f110733b);
    }

    public final int hashCode() {
        return this.f110733b.hashCode() + (this.f110732a.hashCode() * 31);
    }
}
