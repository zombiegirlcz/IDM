package slj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPorting f264212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264213b;

    public f(EsimPhoneNumberPorting esimPhoneNumberPorting, String portingId) {
        Intrinsics.checkNotNullParameter(portingId, "portingId");
        this.f264212a = esimPhoneNumberPorting;
        this.f264213b = portingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f264212a, fVar.f264212a) && Intrinsics.f(this.f264213b, fVar.f264213b);
    }

    public final int hashCode() {
        EsimPhoneNumberPorting esimPhoneNumberPorting = this.f264212a;
        return this.f264213b.hashCode() + ((esimPhoneNumberPorting == null ? 0 : esimPhoneNumberPorting.hashCode()) * 31);
    }
}
