package dkj;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f115572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f115573b;

    public h(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f115572a = title;
        this.f115573b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f115572a.equals(hVar.f115572a) && this.f115573b.equals(hVar.f115573b);
    }

    public final int hashCode() {
        return this.f115573b.hashCode() + (this.f115572a.hashCode() * 31);
    }
}
