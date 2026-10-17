package so6;

import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f264789c;
    public final ThirdPartyBrazil d;
    public final ArrayList e;
    public final String f;

    public a(String consentId, String alias, String str, ThirdPartyBrazil thirdParty, ArrayList groups, String str2) {
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.f264787a = consentId;
        this.f264788b = alias;
        this.f264789c = str;
        this.d = thirdParty;
        this.e = groups;
        this.f = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f264787a, aVar.f264787a) && Intrinsics.f(this.f264788b, aVar.f264788b) && Intrinsics.f(this.f264789c, aVar.f264789c) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f264787a.hashCode() * 31, 31, this.f264788b);
        String str = this.f264789c;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
        String str2 = this.f;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }
}
