package vkj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPorting f289970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289971b;

    public f(EsimPhoneNumberPorting esimPhoneNumberPorting, String portingId) {
        Intrinsics.checkNotNullParameter(portingId, "portingId");
        this.f289970a = esimPhoneNumberPorting;
        this.f289971b = portingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f289970a, fVar.f289970a) && Intrinsics.f(this.f289971b, fVar.f289971b);
    }

    public final int hashCode() {
        EsimPhoneNumberPorting esimPhoneNumberPorting = this.f289970a;
        return this.f289971b.hashCode() + ((esimPhoneNumberPorting == null ? 0 : esimPhoneNumberPorting.hashCode()) * 31);
    }
}
