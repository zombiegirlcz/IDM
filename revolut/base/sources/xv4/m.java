package xv4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f309193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f309194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f309195c;

    public m(TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f309193a = textLocalisedClause;
        this.f309194b = z;
        this.f309195c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f309195c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f309193a, mVar.f309193a) && this.f309194b == mVar.f309194b && Intrinsics.f(this.f309195c, mVar.f309195c);
    }

    public final int hashCode() {
        Clause clause = this.f309193a;
        return this.f309195c.hashCode() + j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f309194b);
    }
}
