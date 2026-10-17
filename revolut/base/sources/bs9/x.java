package bs9;

import aw0.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.a4;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final js9.b f18133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cs9.a f18134c;
    public final int d;
    public final j8 e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f18135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NavBarWithContainerBackground f18136h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a4 f18137j;

    public x(List items, js9.b buttonsConfig, cs9.a actionBarState, int i, j8 navBarModel, CompositeClause compositeClause, q keyboardAnimationState, NavBarWithContainerBackground navBarWithContainerBackground, ArrayList mentionPickerItems, a4 chatInput) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonsConfig, "buttonsConfig");
        Intrinsics.checkNotNullParameter(actionBarState, "actionBarState");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(keyboardAnimationState, "keyboardAnimationState");
        Intrinsics.checkNotNullParameter(mentionPickerItems, "mentionPickerItems");
        Intrinsics.checkNotNullParameter(chatInput, "chatInput");
        this.f18132a = items;
        this.f18133b = buttonsConfig;
        this.f18134c = actionBarState;
        this.d = i;
        this.e = navBarModel;
        this.f = compositeClause;
        this.f18135g = keyboardAnimationState;
        this.f18136h = navBarWithContainerBackground;
        this.i = mentionPickerItems;
        this.f18137j = chatInput;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        x xVar = oldState instanceof x ? (x) oldState : null;
        if (xVar != null) {
            q qVar = xVar.f18135g;
            q qVar2 = this.f18135g;
            if (qVar2 != qVar) {
                return new w(qVar2);
            }
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f18132a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f18132a, xVar.f18132a) && Intrinsics.f(this.f18133b, xVar.f18133b) && Intrinsics.f(this.f18134c, xVar.f18134c) && this.d == xVar.d && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f) && this.f18135g == xVar.f18135g && Intrinsics.f(this.f18136h, xVar.f18136h) && Intrinsics.f(this.i, xVar.i) && Intrinsics.f(this.f18137j, xVar.f18137j);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + j6.a.b(this.d, (this.f18134c.hashCode() + ((this.f18133b.hashCode() + (this.f18132a.hashCode() * 31)) * 31)) * 31, 31)) * 31;
        Clause clause = this.f;
        int iHashCode2 = (this.f18135g.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
        NavBarWithContainerBackground navBarWithContainerBackground = this.f18136h;
        return this.f18137j.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.i, (iHashCode2 + (navBarWithContainerBackground != null ? navBarWithContainerBackground.hashCode() : 0)) * 31, 31);
    }

    public x(List list, js9.b bVar, cs9.a aVar, int i, j8 j8Var, NavBarWithContainerBackground navBarWithContainerBackground, ArrayList arrayList, a4 a4Var) {
        this(list, bVar, aVar, i, j8Var, null, q.REVERSED_CONTENT, navBarWithContainerBackground, arrayList, a4Var);
    }
}
