package ym9;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f314886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f314887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f314888c;

    public e(TextLocalisedClause title, TextLocalisedClause description, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f314886a = items;
        this.f314887b = title;
        this.f314888c = description;
    }

    @Override // cli.p
    public final List c() {
        return this.f314886a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f314886a.equals(eVar.f314886a) && this.f314887b.equals(eVar.f314887b) && this.f314888c.equals(eVar.f314888c);
    }

    public final int hashCode() {
        return this.f314888c.hashCode() + t61.a.a(this.f314886a.hashCode() * 31, 31, this.f314887b);
    }
}
