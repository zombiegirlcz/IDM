package wt4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f299768a;

    public a(TextLocalisedClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f299768a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f299768a.equals(((a) obj2).f299768a);
    }

    public final int hashCode() {
        return this.f299768a.hashCode();
    }
}
