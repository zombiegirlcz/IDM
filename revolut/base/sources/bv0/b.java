package bv0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f18924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f18925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18926c;
    public final a d;

    public b(Image image, Clause clause, boolean z, a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f18924a = image;
        this.f18925b = clause;
        this.f18926c = z;
        this.d = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f18924a, bVar.f18924a) && Intrinsics.f(this.f18925b, bVar.f18925b) && this.f18926c == bVar.f18926c && this.d == bVar.d;
    }

    public final int hashCode() {
        Image image = this.f18924a;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Clause clause = this.f18925b;
        return this.d.hashCode() + j6.a.c((iHashCode + (clause != null ? clause.hashCode() : 0)) * 961, 31, this.f18926c);
    }

    public /* synthetic */ b(Clause clause, Image image) {
        this(image, clause, a.ACTIVE_SYSTEM_THEME);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Image image, Clause clause, a state) {
        this(image, clause, true, state);
        Intrinsics.checkNotNullParameter(state, "state");
    }
}
