package vsf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f291787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f291788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ttf.d f291789c;

    public j(TextLocalisedClause title, TextLocalisedClause subtitle, ttf.d parcel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f291787a = title;
        this.f291788b = subtitle;
        this.f291789c = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f291787a.equals(jVar.f291787a) && this.f291788b.equals(jVar.f291788b) && this.f291789c == jVar.f291789c;
    }

    public final int hashCode() {
        return this.f291789c.hashCode() + t61.a.a(this.f291787a.hashCode() * 31, 31, this.f291788b);
    }
}
