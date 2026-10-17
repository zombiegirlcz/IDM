package v17;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements jki.p {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t17.j f285265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t17.m f285266b;

    public t(t17.j filterContentProvider, t17.m selectableFilterChipsMapper) {
        Intrinsics.checkNotNullParameter(filterContentProvider, "filterContentProvider");
        Intrinsics.checkNotNullParameter(selectableFilterChipsMapper, "selectableFilterChipsMapper");
        this.f285265a = filterContentProvider;
        this.f285266b = selectableFilterChipsMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        k domainState = (k) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new n((List) iii.c.f(domainState.f285245b, new v0k.g(13), new uyh.s(22), new tvh.e(this, domainState, 19)), domainState.f285244a.b() > 0 ? u.c(new TextNavBarMenuItem("RESET_BUTTON_ID", new TextLocalisedClause(R$string.freelancer_common_action_reset, null, null, 14), null, null, 12)) : f0.f322471a);
    }
}
