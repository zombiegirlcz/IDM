package fhi;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f135243a;

    public f(TextLocalisedClause message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f135243a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f135243a, ((f) obj2).f135243a);
    }

    public final int hashCode() {
        return this.f135243a.hashCode();
    }
}
