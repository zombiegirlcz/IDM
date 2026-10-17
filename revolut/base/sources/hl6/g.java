package hl6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f152990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f152991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f152992c;
    public final i d;
    public final h e;

    public g(Data clientsData, Data connectedAppsData, Data isIdealEnabledData, i jointDataSharingState, h jointAuthorisationNotificationsState) {
        Intrinsics.checkNotNullParameter(clientsData, "clientsData");
        Intrinsics.checkNotNullParameter(connectedAppsData, "connectedAppsData");
        Intrinsics.checkNotNullParameter(isIdealEnabledData, "isIdealEnabledData");
        Intrinsics.checkNotNullParameter(jointDataSharingState, "jointDataSharingState");
        Intrinsics.checkNotNullParameter(jointAuthorisationNotificationsState, "jointAuthorisationNotificationsState");
        this.f152990a = clientsData;
        this.f152991b = connectedAppsData;
        this.f152992c = isIdealEnabledData;
        this.d = jointDataSharingState;
        this.e = jointAuthorisationNotificationsState;
    }

    public static g a(g gVar, Data data, Data data2, Data data3, i iVar, h hVar, int i) {
        if ((i & 1) != 0) {
            data = gVar.f152990a;
        }
        Data clientsData = data;
        if ((i & 2) != 0) {
            data2 = gVar.f152991b;
        }
        Data connectedAppsData = data2;
        if ((i & 4) != 0) {
            data3 = gVar.f152992c;
        }
        Data isIdealEnabledData = data3;
        if ((i & 8) != 0) {
            iVar = gVar.d;
        }
        i jointDataSharingState = iVar;
        if ((i & 16) != 0) {
            hVar = gVar.e;
        }
        h jointAuthorisationNotificationsState = hVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(clientsData, "clientsData");
        Intrinsics.checkNotNullParameter(connectedAppsData, "connectedAppsData");
        Intrinsics.checkNotNullParameter(isIdealEnabledData, "isIdealEnabledData");
        Intrinsics.checkNotNullParameter(jointDataSharingState, "jointDataSharingState");
        Intrinsics.checkNotNullParameter(jointAuthorisationNotificationsState, "jointAuthorisationNotificationsState");
        return new g(clientsData, connectedAppsData, isIdealEnabledData, jointDataSharingState, jointAuthorisationNotificationsState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f152990a, gVar.f152990a) && Intrinsics.f(this.f152991b, gVar.f152991b) && Intrinsics.f(this.f152992c, gVar.f152992c) && this.d == gVar.d && this.e == gVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + kii.e.c(this.f152992c, kii.e.c(this.f152991b, this.f152990a.hashCode() * 31, 31), 31)) * 31);
    }
}
