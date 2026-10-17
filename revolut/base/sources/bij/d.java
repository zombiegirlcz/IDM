package bij;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f15509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f15510b;

    public d(Data esimInstallationState, Data connectivityTroubleshootingProfileId) {
        Intrinsics.checkNotNullParameter(esimInstallationState, "esimInstallationState");
        Intrinsics.checkNotNullParameter(connectivityTroubleshootingProfileId, "connectivityTroubleshootingProfileId");
        this.f15509a = esimInstallationState;
        this.f15510b = connectivityTroubleshootingProfileId;
    }

    public static d a(d dVar, Data esimInstallationState, Data connectivityTroubleshootingProfileId, int i) {
        if ((i & 1) != 0) {
            esimInstallationState = dVar.f15509a;
        }
        if ((i & 2) != 0) {
            connectivityTroubleshootingProfileId = dVar.f15510b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(esimInstallationState, "esimInstallationState");
        Intrinsics.checkNotNullParameter(connectivityTroubleshootingProfileId, "connectivityTroubleshootingProfileId");
        return new d(esimInstallationState, connectivityTroubleshootingProfileId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f15509a, dVar.f15509a) && Intrinsics.f(this.f15510b, dVar.f15510b);
    }

    public final int hashCode() {
        return this.f15510b.hashCode() + (this.f15509a.hashCode() * 31);
    }
}
