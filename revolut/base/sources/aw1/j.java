package aw1;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f10655a;

    public j(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f10655a = alias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f10655a, ((j) obj2).f10655a);
    }

    public final int hashCode() {
        return this.f10655a.hashCode();
    }
}
