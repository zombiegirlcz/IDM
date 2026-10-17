package yu7;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f316902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f316903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f316904c;

    public i(aim.e items, TextLocalisedClause title, TextLocalisedClause button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f316902a = title;
        this.f316903b = button;
        this.f316904c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f316904c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f316902a.equals(iVar.f316902a) && this.f316903b.equals(iVar.f316903b) && Intrinsics.f(this.f316904c, iVar.f316904c);
    }

    public final int hashCode() {
        return this.f316904c.hashCode() + t61.a.a(this.f316902a.hashCode() * 31, 31, this.f316903b);
    }
}
