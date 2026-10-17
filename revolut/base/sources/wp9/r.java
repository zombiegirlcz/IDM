package wp9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f299196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f299197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f299198c;
    public final Clause d;

    public r(c0 submitButtonState, z selectAllState, List navBarMenu, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(submitButtonState, "submitButtonState");
        Intrinsics.checkNotNullParameter(selectAllState, "selectAllState");
        Intrinsics.checkNotNullParameter(navBarMenu, "navBarMenu");
        this.f299196a = submitButtonState;
        this.f299197b = selectAllState;
        this.f299198c = navBarMenu;
        this.d = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f299196a == rVar.f299196a && this.f299197b == rVar.f299197b && Intrinsics.f(this.f299198c, rVar.f299198c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d((this.f299197b.hashCode() + (this.f299196a.hashCode() * 31)) * 31, 31, this.f299198c);
        Clause clause = this.d;
        return iD + (clause == null ? 0 : clause.hashCode());
    }
}
