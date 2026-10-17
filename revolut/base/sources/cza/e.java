package cza;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f110173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f110174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f110175c;

    public e(TextClause toolbarTitle, TextLocalisedClause button, aim.e items) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f110173a = toolbarTitle;
        this.f110174b = button;
        this.f110175c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f110175c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f110173a.equals(eVar.f110173a) && this.f110174b.equals(eVar.f110174b) && Intrinsics.f(this.f110175c, eVar.f110175c);
    }

    public final int hashCode() {
        return this.f110175c.hashCode() + t61.a.a(this.f110173a.hashCode() * 31, 31, this.f110174b);
    }
}
