package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class na {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10441b;

    public na(Clause title, Clause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f10440a = title;
        this.f10441b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof na)) {
            return false;
        }
        na naVar = (na) obj2;
        return this.f10440a.equals(naVar.f10440a) && this.f10441b.equals(naVar.f10441b);
    }

    public final int hashCode() {
        return this.f10441b.hashCode() + (this.f10440a.hashCode() * 31);
    }
}
