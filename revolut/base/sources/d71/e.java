package d71;

import com.revolut.domain.models.support.TroubleshootingSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TroubleshootingSource f111754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111756c;
    public final String d;
    public final String e;

    public e(TroubleshootingSource source, String title, String link, String str, String str2) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f111754a = source;
        this.f111755b = title;
        this.f111756c = link;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f111754a == eVar.f111754a && Intrinsics.f(this.f111755b, eVar.f111755b) && Intrinsics.f(this.f111756c, eVar.f111756c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f111754a.hashCode() * 31, 31, this.f111755b), 31, this.f111756c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
