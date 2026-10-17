package zvc;

import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.impl.interactor.ConnectedWifi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f325643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectedWifi f325644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f325645c;

    public d() {
        this(0);
    }

    public static d a(d dVar, Data streetModeInfo, ConnectedWifi connectedWifi, boolean z, int i) {
        if ((i & 1) != 0) {
            streetModeInfo = dVar.f325643a;
        }
        if ((i & 2) != 0) {
            connectedWifi = dVar.f325644b;
        }
        if ((i & 4) != 0) {
            z = dVar.f325645c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(streetModeInfo, "streetModeInfo");
        return new d(streetModeInfo, connectedWifi, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f325643a, dVar.f325643a) && Intrinsics.f(this.f325644b, dVar.f325644b) && this.f325645c == dVar.f325645c;
    }

    public final int hashCode() {
        int iHashCode = this.f325643a.hashCode() * 31;
        ConnectedWifi connectedWifi = this.f325644b;
        return Boolean.hashCode(this.f325645c) + ((iHashCode + (connectedWifi == null ? 0 : connectedWifi.hashCode())) * 31);
    }

    public d(Data streetModeInfo, ConnectedWifi connectedWifi, boolean z) {
        Intrinsics.checkNotNullParameter(streetModeInfo, "streetModeInfo");
        this.f325643a = streetModeInfo;
        this.f325644b = connectedWifi;
        this.f325645c = z;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null), null, false);
    }
}
