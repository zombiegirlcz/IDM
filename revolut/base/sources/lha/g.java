package lha;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f195205c;
    public final f d;
    public final o e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f195206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f195207h;

    public g(String familyId, String legacyIndividualPlanId, String legacyFamilyPlanId, f fVar, o currentUserRole, ArrayList members, ArrayList invitations, boolean z) {
        Intrinsics.checkNotNullParameter(familyId, "familyId");
        Intrinsics.checkNotNullParameter(legacyIndividualPlanId, "legacyIndividualPlanId");
        Intrinsics.checkNotNullParameter(legacyFamilyPlanId, "legacyFamilyPlanId");
        Intrinsics.checkNotNullParameter(currentUserRole, "currentUserRole");
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(invitations, "invitations");
        this.f195203a = familyId;
        this.f195204b = legacyIndividualPlanId;
        this.f195205c = legacyFamilyPlanId;
        this.d = fVar;
        this.e = currentUserRole;
        this.f = members;
        this.f195206g = invitations;
        this.f195207h = z;
    }

    public final k a() {
        for (k kVar : this.f) {
            if (kVar.d == o.MANAGER) {
                return kVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f195203a, gVar.f195203a) && Intrinsics.f(this.f195204b, gVar.f195204b) && Intrinsics.f(this.f195205c, gVar.f195205c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && this.f.equals(gVar.f) && this.f195206g.equals(gVar.f195206g) && this.f195207h == gVar.f195207h;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f195203a.hashCode() * 31, 31, this.f195204b), 31, this.f195205c);
        f fVar = this.d;
        return Boolean.hashCode(this.f195207h) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f195206g, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (this.e.hashCode() + ((iC + (fVar == null ? 0 : fVar.f195202a.hashCode())) * 31)) * 31, 31), 31);
    }
}
