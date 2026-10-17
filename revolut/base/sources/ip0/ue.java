package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ue implements qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f166646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f166647b;

    public ue(Clause text, Object obj2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f166646a = text;
        this.f166647b = obj2;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF53520g() {
        return this.f166647b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ue)) {
            return false;
        }
        ue ueVar = (ue) obj2;
        return this.f166646a.equals(ueVar.f166646a) && Intrinsics.f(this.f166647b, ueVar.f166647b);
    }

    public final int hashCode() {
        int iHashCode = this.f166646a.hashCode() * 31;
        Object obj2 = this.f166647b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
