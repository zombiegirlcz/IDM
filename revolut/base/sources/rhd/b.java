package rhd;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f254402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f254403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bo3.a f254404c;

    public b(bo3.a aVar, ArrayList outlets, LinkedHashMap campaignOffers) {
        Intrinsics.checkNotNullParameter(outlets, "outlets");
        Intrinsics.checkNotNullParameter(campaignOffers, "campaignOffers");
        this.f254402a = outlets;
        this.f254403b = campaignOffers;
        this.f254404c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f254402a.equals(bVar.f254402a) && this.f254403b.equals(bVar.f254403b) && this.f254404c.equals(bVar.f254404c);
    }

    public final int hashCode() {
        return this.f254404c.hashCode() + r6.b.e(this.f254403b, this.f254402a.hashCode() * 31, 31);
    }
}
