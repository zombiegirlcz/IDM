package xsf;

import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoFooter;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f308470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f308471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f308472c;
    public final AdditionalInfoFooter d;
    public final String e;
    public final String f;

    public m(dj0.d amount, List fields, Map userInputs, AdditionalInfoFooter additionalInfoFooter, String str, String str2) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(userInputs, "userInputs");
        this.f308470a = amount;
        this.f308471b = fields;
        this.f308472c = userInputs;
        this.d = additionalInfoFooter;
        this.e = str;
        this.f = str2;
    }

    public static m a(m mVar, Map userInputs) {
        dj0.d amount = mVar.f308470a;
        List fields = mVar.f308471b;
        AdditionalInfoFooter additionalInfoFooter = mVar.d;
        String str = mVar.e;
        String str2 = mVar.f;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(userInputs, "userInputs");
        return new m(amount, fields, userInputs, additionalInfoFooter, str, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f308470a, mVar.f308470a) && Intrinsics.f(this.f308471b, mVar.f308471b) && Intrinsics.f(this.f308472c, mVar.f308472c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f);
    }

    public final int hashCode() {
        int iE = p.a.e(p.a.d(this.f308470a.hashCode() * 31, 31, this.f308471b), 31, this.f308472c);
        AdditionalInfoFooter additionalInfoFooter = this.d;
        int iHashCode = (iE + (additionalInfoFooter == null ? 0 : additionalInfoFooter.hashCode())) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
