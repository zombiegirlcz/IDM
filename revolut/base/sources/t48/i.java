package t48;

import com.revolut.feature.joint.impl.ui.invite_flow.models.InvitationType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvitationType f267918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f267919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f267920c;
    public final p d;
    public final g e;
    public final wi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f267921g;

    public i(InvitationType invitationType, List selectedPurposes, List terms, p pVar, g buttonsState, wi0.b bVar, h consentState) {
        Intrinsics.checkNotNullParameter(invitationType, "invitationType");
        Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(buttonsState, "buttonsState");
        Intrinsics.checkNotNullParameter(consentState, "consentState");
        this.f267918a = invitationType;
        this.f267919b = selectedPurposes;
        this.f267920c = terms;
        this.d = pVar;
        this.e = buttonsState;
        this.f = bVar;
        this.f267921g = consentState;
    }

    public static i a(i iVar, List list, List terms, p pVar, g buttonsState, wi0.b bVar, h consentState, int i) {
        List selectedPurposes = list;
        InvitationType invitationType = iVar.f267918a;
        if ((i & 2) != 0) {
            selectedPurposes = iVar.f267919b;
        }
        if ((i & 4) != 0) {
            terms = iVar.f267920c;
        }
        if ((i & 8) != 0) {
            pVar = iVar.d;
        }
        if ((i & 16) != 0) {
            buttonsState = iVar.e;
        }
        if ((i & 32) != 0) {
            bVar = iVar.f;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(invitationType, "invitationType");
        Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(buttonsState, "buttonsState");
        Intrinsics.checkNotNullParameter(consentState, "consentState");
        wi0.b bVar2 = bVar;
        g gVar = buttonsState;
        p pVar2 = pVar;
        return new i(invitationType, selectedPurposes, terms, pVar2, gVar, bVar2, consentState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f267918a, iVar.f267918a) && Intrinsics.f(this.f267919b, iVar.f267919b) && Intrinsics.f(this.f267920c, iVar.f267920c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && Intrinsics.f(this.f, iVar.f) && this.f267921g == iVar.f267921g;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.f267918a.hashCode() * 31, 31, this.f267919b), 31, this.f267920c);
        p pVar = this.d;
        int iHashCode = (this.e.hashCode() + ((iD + (pVar == null ? 0 : pVar.hashCode())) * 31)) * 31;
        wi0.b bVar = this.f;
        return this.f267921g.hashCode() + ((iHashCode + (bVar != null ? bVar.f297794a.hashCode() : 0)) * 31);
    }
}
