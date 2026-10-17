package eik;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f126670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f126671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f126672c;

    public h(Clause referredPlanName, List recipientErrors, List recipientContacts) {
        Intrinsics.checkNotNullParameter(recipientErrors, "recipientErrors");
        Intrinsics.checkNotNullParameter(recipientContacts, "recipientContacts");
        Intrinsics.checkNotNullParameter(referredPlanName, "referredPlanName");
        this.f126670a = recipientErrors;
        this.f126671b = recipientContacts;
        this.f126672c = referredPlanName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f126670a, hVar.f126670a) && Intrinsics.f(this.f126671b, hVar.f126671b) && Intrinsics.f(this.f126672c, hVar.f126672c);
    }

    public final int hashCode() {
        return this.f126672c.hashCode() + p.a.d(this.f126670a.hashCode() * 31, 31, this.f126671b);
    }
}
