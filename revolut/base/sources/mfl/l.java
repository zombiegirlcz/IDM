package mfl;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f205030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f205031b;

    public l(Clause title, Clause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f205030a = title;
        this.f205031b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f205030a, lVar.f205030a) && Intrinsics.f(this.f205031b, lVar.f205031b);
    }

    public final int hashCode() {
        return this.f205031b.hashCode() + (this.f205030a.hashCode() * 31);
    }
}
