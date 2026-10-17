package u22;

import cli.j;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f276540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmContact f276541b;

    public b(List accounts, ApmContact apmContact) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        this.f276540a = accounts;
        this.f276541b = apmContact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f276540a, bVar.f276540a) && Intrinsics.f(this.f276541b, bVar.f276541b);
    }

    public final int hashCode() {
        int iHashCode = this.f276540a.hashCode() * 31;
        ApmContact apmContact = this.f276541b;
        return iHashCode + (apmContact == null ? 0 : apmContact.hashCode());
    }
}
