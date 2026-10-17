package p01;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class u implements k01.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f231456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k01.c f231457b;

    public u(TextLocalisedClause text, k01.c cVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f231456a = text;
        this.f231457b = cVar;
    }

    @Override // k01.e
    public final Object a(jid.z zVar, Continuation continuation) {
        return new t(zVar.s(this.f231456a), this.f231457b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f231456a.equals(uVar.f231456a) && this.f231457b.equals(uVar.f231457b);
    }

    public final int hashCode() {
        return this.f231457b.f179898a.hashCode() + (this.f231456a.hashCode() * 31);
    }
}
