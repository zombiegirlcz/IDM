package ke7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f183026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f183027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f183028c;
    public final Object d;
    public final Clause e;
    public final Image f;

    public p(f0 items, h callTimeAppearance, List actionButtons, Clause agentName, TextLocalisedClause textLocalisedClause, Image agentAvatar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(callTimeAppearance, "callTimeAppearance");
        Intrinsics.checkNotNullParameter(actionButtons, "actionButtons");
        Intrinsics.checkNotNullParameter(agentName, "agentName");
        Intrinsics.checkNotNullParameter(agentAvatar, "agentAvatar");
        this.f183026a = items;
        this.f183027b = callTimeAppearance;
        this.f183028c = actionButtons;
        this.d = agentName;
        this.e = textLocalisedClause;
        this.f = agentAvatar;
    }

    @Override // cli.p
    public final List c() {
        return this.f183026a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f183026a, pVar.f183026a) && this.f183027b.equals(pVar.f183027b) && Intrinsics.f(this.f183028c, pVar.f183028c) && this.d.equals(pVar.d) && Intrinsics.f(this.e, pVar.e) && this.f.equals(pVar.f);
    }

    public final int hashCode() {
        int iB = p.a.b(p.a.d((this.f183027b.hashCode() + (this.f183026a.hashCode() * 31)) * 31, 31, this.f183028c), 31, this.d);
        Clause clause = this.e;
        return this.f.hashCode() + ((iB + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
