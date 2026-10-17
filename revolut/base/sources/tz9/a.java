package tz9;

import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f275898a;

    public a(CompositeClause text) {
        Intrinsics.checkNotNullParameter("MONEY_QUICK_ACTION_SUGGESTION_ID", "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f275898a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f275898a.equals(((a) obj2).f275898a);
    }

    public final int hashCode() {
        return this.f275898a.hashCode() + 77595298;
    }
}
