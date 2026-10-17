package aw0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f10276a;

    public d1(TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f10276a = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d1) && this.f10276a.equals(((d1) obj2).f10276a);
    }

    public final int hashCode() {
        return this.f10276a.hashCode() * 31;
    }
}
