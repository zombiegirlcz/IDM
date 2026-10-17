package e03;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails;
import e7l.f;
import h30.l;
import h93.f0;
import h93.o;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f121380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f121381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f121382c;
    public final boolean d;
    public final f e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f121383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f121384h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AccountId f121385j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wy2.b f121386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WealthProtectionFeatureDetails f121387m;

    public b(f0 card, boolean z, boolean z3, boolean z4, f config, ArrayList securityItems, o oVar, boolean z6, boolean z11, AccountId accountId, boolean z12, wy2.b flowType, WealthProtectionFeatureDetails wealthProtectionFeatureDetails) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(securityItems, "securityItems");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f121380a = card;
        this.f121381b = z;
        this.f121382c = z3;
        this.d = z4;
        this.e = config;
        this.f = securityItems;
        this.f121383g = oVar;
        this.f121384h = z6;
        this.i = z11;
        this.f121385j = accountId;
        this.k = z12;
        this.f121386l = flowType;
        this.f121387m = wealthProtectionFeatureDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f121380a.equals(bVar.f121380a) && this.f121381b == bVar.f121381b && this.f121382c == bVar.f121382c && this.d == bVar.d && Intrinsics.f(this.e, bVar.e) && this.f.equals(bVar.f) && Intrinsics.f(this.f121383g, bVar.f121383g) && this.f121384h == bVar.f121384h && this.i == bVar.i && Intrinsics.f(this.f121385j, bVar.f121385j) && this.k == bVar.k && this.f121386l == bVar.f121386l && Intrinsics.f(this.f121387m, bVar.f121387m);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (this.e.hashCode() + j6.a.c(j6.a.c(j6.a.c(this.f121380a.hashCode() * 31, 31, this.f121381b), 31, this.f121382c), 31, this.d)) * 31, 31);
        o oVar = this.f121383g;
        int iHashCode = (this.f121386l.hashCode() + j6.a.c(l.b(this.f121385j, j6.a.c(j6.a.c((iB + (oVar == null ? 0 : oVar.hashCode())) * 31, 31, this.f121384h), 31, this.i), 31), 31, this.k)) * 31;
        WealthProtectionFeatureDetails wealthProtectionFeatureDetails = this.f121387m;
        return iHashCode + (wealthProtectionFeatureDetails != null ? wealthProtectionFeatureDetails.hashCode() : 0);
    }
}
