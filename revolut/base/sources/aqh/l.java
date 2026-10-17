package aqh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f8443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.h f8445c;

    public l(TextLocalisedClause title, List items, aw0.h buttons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f8443a = title;
        this.f8444b = items;
        this.f8445c = buttons;
    }

    @Override // cli.p
    public final List c() {
        return this.f8444b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f8443a.equals(lVar.f8443a) && Intrinsics.f(this.f8444b, lVar.f8444b) && this.f8445c.equals(lVar.f8445c);
    }

    public final int hashCode() {
        return this.f8445c.hashCode() + p.a.d(this.f8443a.hashCode() * 31, 31, this.f8444b);
    }
}
