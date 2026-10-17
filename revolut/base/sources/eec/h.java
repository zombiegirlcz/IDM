package eec;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f125171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f125172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f125173c;
    public final List d;

    public h(lw0.a headerModel, TextLocalisedClause firstButtonText, TextLocalisedClause secondButtonText, List items) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        Intrinsics.checkNotNullParameter(firstButtonText, "firstButtonText");
        Intrinsics.checkNotNullParameter(secondButtonText, "secondButtonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f125171a = headerModel;
        this.f125172b = firstButtonText;
        this.f125173c = secondButtonText;
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
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f125171a.equals(hVar.f125171a) && this.f125172b.equals(hVar.f125172b) && this.f125173c.equals(hVar.f125173c) && this.d.equals(hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f125171a.hashCode() * 31, 31, this.f125172b), 31, this.f125173c);
    }
}
