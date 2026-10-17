package iha;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f161321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f161322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f161323c;

    public g(ArrayList benefits, List cardsToTerminate, List partnersPerkIds) {
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        Intrinsics.checkNotNullParameter(cardsToTerminate, "cardsToTerminate");
        Intrinsics.checkNotNullParameter(partnersPerkIds, "partnersPerkIds");
        this.f161321a = benefits;
        this.f161322b = cardsToTerminate;
        this.f161323c = partnersPerkIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f161321a.equals(gVar.f161321a) && Intrinsics.f(this.f161322b, gVar.f161322b) && Intrinsics.f(this.f161323c, gVar.f161323c);
    }

    public final int hashCode() {
        return this.f161323c.hashCode() + p.a.d(this.f161321a.hashCode() * 31, 31, this.f161322b);
    }
}
