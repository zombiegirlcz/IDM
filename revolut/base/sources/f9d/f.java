package f9d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f132921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f132922b;

    public f(RowDelegate.Model transaction, List actions) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f132921a = transaction;
        this.f132922b = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f132921a.equals(fVar.f132921a) && Intrinsics.f(this.f132922b, fVar.f132922b);
    }

    public final int hashCode() {
        return this.f132922b.hashCode() + (this.f132921a.hashCode() * 31);
    }
}
