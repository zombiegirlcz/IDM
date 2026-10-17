package zkj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttributesValidation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimPhoneNumberPortingAttributesValidation f323057b;

    public b(String str, EsimPhoneNumberPortingAttributesValidation esimPhoneNumberPortingAttributesValidation) {
        this.f323056a = str;
        this.f323057b = esimPhoneNumberPortingAttributesValidation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f323056a, bVar.f323056a) && Intrinsics.f(this.f323057b, bVar.f323057b);
    }

    public final int hashCode() {
        String str = this.f323056a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        EsimPhoneNumberPortingAttributesValidation esimPhoneNumberPortingAttributesValidation = this.f323057b;
        return iHashCode + (esimPhoneNumberPortingAttributesValidation != null ? esimPhoneNumberPortingAttributesValidation.hashCode() : 0);
    }
}
