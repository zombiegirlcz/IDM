package fz6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f139118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f139119b;

    public l(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f139118a = title;
        this.f139119b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f139118a.equals(lVar.f139118a) && this.f139119b.equals(lVar.f139119b);
    }

    public final int hashCode() {
        return this.f139119b.hashCode() + (this.f139118a.hashCode() * 31);
    }
}
