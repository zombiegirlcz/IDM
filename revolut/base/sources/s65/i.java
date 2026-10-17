package s65;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f260139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f260140b;

    public i(TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f260139a = title;
        this.f260140b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f260139a.equals(iVar.f260139a) && this.f260140b.equals(iVar.f260140b);
    }

    public final int hashCode() {
        return this.f260140b.hashCode() + (this.f260139a.hashCode() * 31);
    }
}
