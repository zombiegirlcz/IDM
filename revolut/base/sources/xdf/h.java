package xdf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f304434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l4l.a f304435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f304436c;

    public h(TextLocalisedClause title, l4l.a source, List pockets) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        this.f304434a = title;
        this.f304435b = source;
        this.f304436c = pockets;
    }

    public static h a(h hVar, List pockets) {
        TextLocalisedClause title = hVar.f304434a;
        l4l.a source = hVar.f304435b;
        hVar.getClass();
        hVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        return new h(title, source, pockets);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f304434a.equals(hVar.f304434a) && this.f304435b == hVar.f304435b && Intrinsics.f(this.f304436c, hVar.f304436c);
    }

    public final int hashCode() {
        return this.f304436c.hashCode() + j6.a.c((this.f304435b.hashCode() + (this.f304434a.hashCode() * 31)) * 31, 31, true);
    }
}
