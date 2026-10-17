package tgf;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f271177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f271178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f271179c;

    public k(aim.e items, List actions, TextLocalisedClause buttonText) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f271177a = items;
        this.f271178b = actions;
        this.f271179c = buttonText;
    }

    @Override // cli.p
    public final List c() {
        return this.f271177a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f271177a, kVar.f271177a) && Intrinsics.f(this.f271178b, kVar.f271178b) && this.f271179c.equals(kVar.f271179c);
    }

    public final int hashCode() {
        return this.f271179c.hashCode() + p.a.d(this.f271177a.hashCode() * 31, 31, this.f271178b);
    }
}
