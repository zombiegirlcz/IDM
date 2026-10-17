package nq7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f218374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f218375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CdnImage f218376c;
    public final TextLocalisedClause d;
    public final TextLocalisedClause e;
    public final TextLocalisedClause f;

    public f(List items, TextLocalisedClause title, CdnImage titleImage, TextLocalisedClause description, TextLocalisedClause footer, TextLocalisedClause button) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleImage, "titleImage");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f218374a = items;
        this.f218375b = title;
        this.f218376c = titleImage;
        this.d = description;
        this.e = footer;
        this.f = button;
    }

    @Override // jki.n
    public final List c() {
        return this.f218374a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f218374a.equals(fVar.f218374a) && this.f218375b.equals(fVar.f218375b) && this.f218376c.equals(fVar.f218376c) && this.d.equals(fVar.d) && this.e.equals(fVar.e) && this.f.equals(fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + t61.a.a(t61.a.a((this.f218376c.hashCode() + t61.a.a(this.f218374a.hashCode() * 31, 31, this.f218375b)) * 31, 31, this.d), 31, this.e);
    }
}
