package vu4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f292252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f292253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f292254c;

    public d(TextLocalisedClause buttonLabel, List items, lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f292252a = header;
        this.f292253b = buttonLabel;
        this.f292254c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f292254c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f292252a.equals(dVar.f292252a) && this.f292253b.equals(dVar.f292253b) && this.f292254c.equals(dVar.f292254c);
    }

    public final int hashCode() {
        return this.f292254c.hashCode() + t61.a.a(this.f292252a.hashCode() * 31, 31, this.f292253b);
    }
}
