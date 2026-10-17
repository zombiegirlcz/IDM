package sij;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.jvm.internal.Intrinsics;
import sij.b;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimProfile f263640a;

    public a(EsimProfile esimProfile) {
        this.f263640a = esimProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f263640a, ((a) obj2).f263640a);
    }

    public final int hashCode() {
        EsimProfile esimProfile = this.f263640a;
        if (esimProfile == null) {
            return 0;
        }
        return esimProfile.hashCode();
    }
}
