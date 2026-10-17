package dw7;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f120339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f120340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f120341c;
    public final List d;

    public f(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause button, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f120339a = title;
        this.f120340b = description;
        this.f120341c = button;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f120339a.equals(fVar.f120339a) && this.f120340b.equals(fVar.f120340b) && this.f120341c.equals(fVar.f120341c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f120339a.hashCode() * 31, 31, this.f120340b), 31, this.f120341c);
    }
}
