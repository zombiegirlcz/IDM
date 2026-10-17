package iad;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f159991a;

    public e(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f159991a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f159991a.equals(((e) obj2).f159991a);
    }

    public final int hashCode() {
        return this.f159991a.hashCode();
    }
}
