package rlh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f255073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f255074b;

    public v(TextLocalisedClause title, TextLocalisedClause secondDescription) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        this.f255073a = title;
        this.f255074b = secondDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f255073a.equals(vVar.f255073a) && this.f255074b.equals(vVar.f255074b);
    }

    public final int hashCode() {
        return this.f255074b.hashCode() + (this.f255073a.hashCode() * 31);
    }
}
