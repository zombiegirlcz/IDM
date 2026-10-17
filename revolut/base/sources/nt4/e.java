package nt4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f218962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f218963b;

    public e(TextLocalisedClause screenTitle, List items) {
        Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f218962a = screenTitle;
        this.f218963b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f218963b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f218962a.equals(eVar.f218962a) && Intrinsics.f(this.f218963b, eVar.f218963b);
    }

    public final int hashCode() {
        return this.f218963b.hashCode() + (this.f218962a.hashCode() * 31);
    }
}
