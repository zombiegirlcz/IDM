package e3e;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3e.d f122255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f122256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f122257c;

    public h(f3e.d boundaries, ArrayList outlets, LinkedHashMap offersByCampaignId) {
        Intrinsics.checkNotNullParameter(boundaries, "boundaries");
        Intrinsics.checkNotNullParameter(outlets, "outlets");
        Intrinsics.checkNotNullParameter(offersByCampaignId, "offersByCampaignId");
        this.f122255a = boundaries;
        this.f122256b = outlets;
        this.f122257c = offersByCampaignId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f122255a.equals(hVar.f122255a) && this.f122256b.equals(hVar.f122256b) && this.f122257c.equals(hVar.f122257c);
    }

    public final int hashCode() {
        return this.f122257c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f122256b, this.f122255a.hashCode() * 31, 31);
    }
}
