package qr4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f248650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f248651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f248652c;

    public d(TextLocalisedClause buttonLabel, List items, lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f248650a = header;
        this.f248651b = buttonLabel;
        this.f248652c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f248652c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f248650a.equals(dVar.f248650a) && this.f248651b.equals(dVar.f248651b) && this.f248652c.equals(dVar.f248652c);
    }

    public final int hashCode() {
        return this.f248652c.hashCode() + t61.a.a(this.f248650a.hashCode() * 31, 31, this.f248651b);
    }
}
