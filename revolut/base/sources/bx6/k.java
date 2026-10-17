package bx6;

import bt9.t;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o07.k f19506a;

    public k(o07.k freelancerProcessingFeeItemMapper) {
        Intrinsics.checkNotNullParameter(freelancerProcessingFeeItemMapper, "freelancerProcessingFeeItemMapper");
        this.f19506a = freelancerProcessingFeeItemMapper;
    }

    public static RowDelegate.Model a(int i, TextLocalisedClause textLocalisedClause, String str) {
        boolean z = false;
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(i, Integer.valueOf(R$attr.uikit_colorForeground), Integer.valueOf(R$attr.uikit_colorBackground), null, 8), z, z, 6), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f19495a, new t(26), new bw4.t(11), new b88.o(this, 23));
    }
}
