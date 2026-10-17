package mlj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttributesValidation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f206986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f206987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPortingAttributesValidation f206988c;
    public final boolean d;

    public i(String text, String str, EsimPhoneNumberPortingAttributesValidation esimPhoneNumberPortingAttributesValidation, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f206986a = text;
        this.f206987b = str;
        this.f206988c = esimPhoneNumberPortingAttributesValidation;
        this.d = z;
    }

    public static i a(i iVar, boolean z) {
        String text = iVar.f206986a;
        String str = iVar.f206987b;
        EsimPhoneNumberPortingAttributesValidation esimPhoneNumberPortingAttributesValidation = iVar.f206988c;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        return new i(text, str, esimPhoneNumberPortingAttributesValidation, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f206986a, iVar.f206986a) && Intrinsics.f(this.f206987b, iVar.f206987b) && Intrinsics.f(this.f206988c, iVar.f206988c) && this.d == iVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f206986a.hashCode() * 31;
        String str = this.f206987b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EsimPhoneNumberPortingAttributesValidation esimPhoneNumberPortingAttributesValidation = this.f206988c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (esimPhoneNumberPortingAttributesValidation != null ? esimPhoneNumberPortingAttributesValidation.hashCode() : 0)) * 31);
    }
}
