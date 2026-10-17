package ny3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f220649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f220650c;
    public final boolean d;

    public m(String documentId, String title, a1 icon, boolean z) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f220648a = documentId;
        this.f220649b = title;
        this.f220650c = icon;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f220648a, mVar.f220648a) && Intrinsics.f(this.f220649b, mVar.f220649b) && this.f220650c == mVar.f220650c && this.d == mVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f220650c.hashCode() + p.a.c(this.f220648a.hashCode() * 31, 31, this.f220649b)) * 31);
    }
}
