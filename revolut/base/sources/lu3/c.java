package lu3;

import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferences;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f200018c;
    public final String d;
    public final String e;
    public final ConsentPreferences f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f200019g;

    public c(String title, String str, List items, String str2, String buttonText, ConsentPreferences consentPreferences, b bVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f200016a = title;
        this.f200017b = str;
        this.f200018c = items;
        this.d = str2;
        this.e = buttonText;
        this.f = consentPreferences;
        this.f200019g = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f200016a, cVar.f200016a) && Intrinsics.f(this.f200017b, cVar.f200017b) && Intrinsics.f(this.f200018c, cVar.f200018c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f200019g, cVar.f200019g);
    }

    public final int hashCode() {
        int iHashCode = this.f200016a.hashCode() * 31;
        String str = this.f200017b;
        int iD = p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f200018c);
        String str2 = this.d;
        int iC = p.a.c((iD + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        ConsentPreferences consentPreferences = this.f;
        int iHashCode2 = (iC + (consentPreferences == null ? 0 : consentPreferences.hashCode())) * 31;
        b bVar = this.f200019g;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
