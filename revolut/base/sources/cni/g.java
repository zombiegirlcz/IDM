package cni;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f25436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f25437b;

    public g(Data consentInfo, Set deselectedScopeIds) {
        Intrinsics.checkNotNullParameter(consentInfo, "consentInfo");
        Intrinsics.checkNotNullParameter(deselectedScopeIds, "deselectedScopeIds");
        this.f25436a = consentInfo;
        this.f25437b = deselectedScopeIds;
    }

    public static g a(g gVar, Data consentInfo, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            consentInfo = gVar.f25436a;
        }
        Set deselectedScopeIds = linkedHashSet;
        if ((i & 2) != 0) {
            deselectedScopeIds = gVar.f25437b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(consentInfo, "consentInfo");
        Intrinsics.checkNotNullParameter(deselectedScopeIds, "deselectedScopeIds");
        return new g(consentInfo, deselectedScopeIds);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f25436a, gVar.f25436a) && Intrinsics.f(this.f25437b, gVar.f25437b);
    }

    public final int hashCode() {
        return this.f25437b.hashCode() + (this.f25436a.hashCode() * 31);
    }
}
