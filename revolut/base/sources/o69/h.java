package o69;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f222534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f222535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bo3.a f222536c;
    public final boolean d;

    public h(ArrayList outlets, LinkedHashMap campaignOffers, bo3.a aVar, boolean z) {
        Intrinsics.checkNotNullParameter(outlets, "outlets");
        Intrinsics.checkNotNullParameter(campaignOffers, "campaignOffers");
        this.f222534a = outlets;
        this.f222535b = campaignOffers;
        this.f222536c = aVar;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f222534a.equals(hVar.f222534a) && this.f222535b.equals(hVar.f222535b) && this.f222536c.equals(hVar.f222536c) && this.d == hVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f222536c.hashCode() + r6.b.e(this.f222535b, this.f222534a.hashCode() * 31, 31)) * 31);
    }
}
