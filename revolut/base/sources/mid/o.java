package mid;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bo3.a f205736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f205737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f205738c;

    public o(bo3.a mapBox, ArrayList outlets, LinkedHashMap campaignOffers) {
        Intrinsics.checkNotNullParameter(mapBox, "mapBox");
        Intrinsics.checkNotNullParameter(outlets, "outlets");
        Intrinsics.checkNotNullParameter(campaignOffers, "campaignOffers");
        this.f205736a = mapBox;
        this.f205737b = outlets;
        this.f205738c = campaignOffers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f205736a.equals(oVar.f205736a) && this.f205737b.equals(oVar.f205737b) && this.f205738c.equals(oVar.f205738c);
    }

    public final int hashCode() {
        return this.f205738c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f205737b, this.f205736a.hashCode() * 31, 31);
    }
}
