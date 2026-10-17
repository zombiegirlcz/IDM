package ytc;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f316693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f316694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f316695c;
    public final ArrayList d;
    public final ArrayList e;

    public a(ArrayList devicesIds, ArrayList cardsIds, ArrayList simProfileIds, ArrayList excludedDevicesIds, ArrayList excludedCardsIds) {
        Intrinsics.checkNotNullParameter(devicesIds, "devicesIds");
        Intrinsics.checkNotNullParameter(cardsIds, "cardsIds");
        Intrinsics.checkNotNullParameter(simProfileIds, "simProfileIds");
        Intrinsics.checkNotNullParameter(excludedDevicesIds, "excludedDevicesIds");
        Intrinsics.checkNotNullParameter(excludedCardsIds, "excludedCardsIds");
        this.f316693a = devicesIds;
        this.f316694b = cardsIds;
        this.f316695c = simProfileIds;
        this.d = excludedDevicesIds;
        this.e = excludedCardsIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f316693a.equals(aVar.f316693a) && this.f316694b.equals(aVar.f316694b) && this.f316695c.equals(aVar.f316695c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f316695c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f316694b, this.f316693a.hashCode() * 31, 31), 31), 31);
    }
}
