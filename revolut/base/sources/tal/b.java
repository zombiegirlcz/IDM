package tal;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f269364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f269365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f269366c;

    public b(Clause clause, LargeActionButton.ButtonStyle.DefaultFilledButton style, boolean z) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f269364a = clause;
        this.f269365b = style;
        this.f269366c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f269364a.equals(bVar.f269364a) && Intrinsics.f(this.f269365b, bVar.f269365b) && this.f269366c == bVar.f269366c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f269366c) + r6.b.d(this.f269365b, this.f269364a.hashCode() * 31, 31);
    }
}
