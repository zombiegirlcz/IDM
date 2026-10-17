package n50;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f212512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v20.n f212513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f212514c;

    public u(Clause displayedClause, v20.n message, boolean z) {
        Intrinsics.checkNotNullParameter(displayedClause, "displayedClause");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f212512a = displayedClause;
        this.f212513b = message;
        this.f212514c = z;
    }

    @Override // n50.v
    public final v20.n a() {
        return this.f212513b;
    }

    @Override // n50.v
    public final boolean b() {
        return this.f212514c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f212512a, uVar.f212512a) && Intrinsics.f(this.f212513b, uVar.f212513b) && this.f212514c == uVar.f212514c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f212514c) + ((this.f212513b.hashCode() + (this.f212512a.hashCode() * 31)) * 31);
    }
}
