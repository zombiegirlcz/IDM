package gig;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f144192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f144193b;

    public h(TextLocalisedClause toolbarTitle, List pages) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f144192a = toolbarTitle;
        this.f144193b = pages;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f144192a.equals(hVar.f144192a) && Intrinsics.f(this.f144193b, hVar.f144193b);
    }

    public final int hashCode() {
        return this.f144193b.hashCode() + (this.f144192a.hashCode() * 31);
    }
}
