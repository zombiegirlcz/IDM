package snd;

import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lzi.j f264525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsAccountsSelection f264526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rnd.h f264527c;
    public final ArrayList d;
    public final rnd.g e;

    public d(lzi.j period, AnalyticsAccountsSelection accountsSelection, rnd.h accountMetadata, ArrayList mainWidgetsGroups, rnd.g gVar) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(accountsSelection, "accountsSelection");
        Intrinsics.checkNotNullParameter(accountMetadata, "accountMetadata");
        Intrinsics.checkNotNullParameter(mainWidgetsGroups, "mainWidgetsGroups");
        this.f264525a = period;
        this.f264526b = accountsSelection;
        this.f264527c = accountMetadata;
        this.d = mainWidgetsGroups;
        this.e = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f264525a.equals(dVar.f264525a) && Intrinsics.f(this.f264526b, dVar.f264526b) && Intrinsics.f(this.f264527c, dVar.f264527c) && this.d.equals(dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f264527c.hashCode() + ((this.f264526b.hashCode() + (this.f264525a.hashCode() * 31)) * 31)) * 31, 31);
        rnd.g gVar = this.e;
        return iB + (gVar == null ? 0 : gVar.hashCode());
    }
}
