package hhj;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f152415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f152416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f152417c;

    public f(Clause title, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f152415a = items;
        this.f152416b = title;
        this.f152417c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f152415a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f152415a, fVar.f152415a) && Intrinsics.f(this.f152416b, fVar.f152416b) && this.f152417c == fVar.f152417c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152417c) + p.a.a(this.f152415a.hashCode() * 31, 31, this.f152416b);
    }
}
