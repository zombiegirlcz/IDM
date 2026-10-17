package i7d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f159272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f159273c;

    public j(String analyticsContextId, TextLocalisedClause buttonTitle, e destination) {
        Intrinsics.checkNotNullParameter(analyticsContextId, "analyticsContextId");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f159271a = analyticsContextId;
        this.f159272b = buttonTitle;
        this.f159273c = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f159271a.equals(jVar.f159271a) && this.f159272b.equals(jVar.f159272b) && this.f159273c.equals(jVar.f159273c);
    }

    public final int hashCode() {
        return this.f159273c.hashCode() + t61.a.a(this.f159271a.hashCode() * 31, 31, this.f159272b);
    }
}
