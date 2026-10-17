package obc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f223919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f223920b;

    public i(TextLocalisedClause title, TextLocalisedClause hint) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f223919a = title;
        this.f223920b = hint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f223919a.equals(iVar.f223919a) && this.f223920b.equals(iVar.f223920b);
    }

    public final int hashCode() {
        return this.f223920b.hashCode() + (this.f223919a.hashCode() * 31);
    }
}
