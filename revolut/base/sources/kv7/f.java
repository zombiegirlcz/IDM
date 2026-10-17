package kv7;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f189985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f189986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f189987c;

    public f(TextLocalisedClause title, TextLocalisedClause button, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f189985a = title;
        this.f189986b = button;
        this.f189987c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f189987c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f189985a.equals(fVar.f189985a) && this.f189986b.equals(fVar.f189986b) && this.f189987c.equals(fVar.f189987c);
    }

    public final int hashCode() {
        return this.f189987c.hashCode() + t61.a.a(this.f189985a.hashCode() * 31, 31, this.f189986b);
    }
}
