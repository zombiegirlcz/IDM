package cp6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo6.d f107877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107879c;
    public final TextLocalisedClause d;
    public final TextLocalisedClause e;

    public b(yo6.d referenceType, String feedbackId, int i, TextLocalisedClause shotText, TextLocalisedClause shotActionText) {
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        Intrinsics.checkNotNullParameter(feedbackId, "feedbackId");
        Intrinsics.checkNotNullParameter(shotText, "shotText");
        Intrinsics.checkNotNullParameter(shotActionText, "shotActionText");
        this.f107877a = referenceType;
        this.f107878b = feedbackId;
        this.f107879c = i;
        this.d = shotText;
        this.e = shotActionText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f107877a == bVar.f107877a && Intrinsics.f(this.f107878b, bVar.f107878b) && this.f107879c == bVar.f107879c && this.d.equals(bVar.d) && this.e.equals(bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + t61.a.a(j6.a.b(this.f107879c, p.a.c(this.f107877a.hashCode() * 31, 31, this.f107878b), 31), 31, this.d);
    }
}
