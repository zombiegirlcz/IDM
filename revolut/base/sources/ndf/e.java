package ndf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f214366b;

    public e(TextLocalisedClause textLocalisedClause, String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f214365a = url2;
        this.f214366b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f214365a, eVar.f214365a) && this.f214366b.equals(eVar.f214366b);
    }

    public final int hashCode() {
        return this.f214366b.hashCode() + (this.f214365a.hashCode() * 31);
    }
}
