package p62;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class s implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v02.a f233215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f233216b;

    public s(v02.a aliasMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(aliasMapper, "aliasMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f233215a = aliasMapper;
        this.f233216b = featureToggleInteractor;
    }

    public final RowDelegate.Model a(Alias alias, Clause clause, AccentCircleBadge accentCircleBadge, pf pfVar, boolean z) {
        AliasType aliasType = alias.f61878a;
        j12.a aVar = (j12.a) this.f233215a;
        RowDelegate.Model model = new RowDelegate.Model(j6.a.q("ITEM_ALIAS_ID_", alias.f61879b), new RowDelegate.Model.MainImage.Image40(new GlyphImage(aVar.a(alias.f61878a), null, null, 6), accentCircleBadge, null, false, null, false, 60), aVar.c(aliasType), null, 0, clause, null, null, 0, pfVar, z, null, false, null, null, null, null, null, null, alias, null, 0, 0, 0, 0, 532673496);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i((List) iii.c.f(domainState.f233204a, new p5a.m(4), new p4a.g(11), new p40.n(this, 2)));
    }
}
