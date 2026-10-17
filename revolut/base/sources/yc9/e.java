package yc9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f312571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f312572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f312573c;
    public final TextLocalisedClause d;

    public e(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause primaryActionClause, Image content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(primaryActionClause, "primaryActionClause");
        this.f312571a = title;
        this.f312572b = description;
        this.f312573c = content;
        this.d = primaryActionClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f312571a.equals(eVar.f312571a) && this.f312572b.equals(eVar.f312572b) && Intrinsics.f(this.f312573c, eVar.f312573c) && this.d.equals(eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a10.b.c(this.f312573c, t61.a.a(this.f312571a.hashCode() * 31, 31, this.f312572b), 31);
    }
}
