package rw0;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f257798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f257799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f257800c;
    public final d d;
    public final TextLocalisedClause e;
    public final g f;

    public e(TextClause headingText, int i, TimeClause subheadingText, d firstSubtitleText, TextLocalisedClause secondSubtitleText, g state) {
        Intrinsics.checkNotNullParameter(headingText, "headingText");
        Intrinsics.checkNotNullParameter(subheadingText, "subheadingText");
        Intrinsics.checkNotNullParameter(firstSubtitleText, "firstSubtitleText");
        Intrinsics.checkNotNullParameter(secondSubtitleText, "secondSubtitleText");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f257798a = headingText;
        this.f257799b = i;
        this.f257800c = subheadingText;
        this.d = firstSubtitleText;
        this.e = secondSubtitleText;
        this.f = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f257798a.equals(eVar.f257798a) && this.f257799b == eVar.f257799b && this.f257800c.equals(eVar.f257800c) && this.d.equals(eVar.d) && this.e.equals(eVar.e) && this.f == eVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + t61.a.a((this.d.hashCode() + h30.l.d(this.f257800c, j6.a.b(this.f257799b, this.f257798a.hashCode() * 31, 31), 31)) * 31, 31, this.e);
    }
}
