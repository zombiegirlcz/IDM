package uvk;

import cli.y;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_groups.AddKeyStatsViewGroupsScreenContract$Input;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nd.p;
import qee.s;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends oki.h implements dli.b {
    public final AddKeyStatsViewGroupsScreenContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f283485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final su9.c f283486q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final awk.g f283487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f283488s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f283489t;

    public o(s mapper, AddKeyStatsViewGroupsScreenContract$Input input, p statsGroupInfoProvider, su9.c assetStatsSearchResultProvider, awk.g keyStatsItemExtension) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(statsGroupInfoProvider, "statsGroupInfoProvider");
        Intrinsics.checkNotNullParameter(assetStatsSearchResultProvider, "assetStatsSearchResultProvider");
        Intrinsics.checkNotNullParameter(keyStatsItemExtension, "keyStatsItemExtension");
        this.o = input;
        this.f283485p = statsGroupInfoProvider;
        this.f283486q = assetStatsSearchResultProvider;
        this.f283487r = keyStatsItemExtension;
        y yVarB = mra.d.b(this, new e(0), mapper, null, false, 12);
        this.f283488s = yVarB;
        this.f283489t = q.c(((e) ((j2) yVarB.f22677a).getValue()).f283476c);
    }

    @Override // yji.l
    public final void I1() {
        H2(this.f283488s, new uu9.b(this, 6));
        Continuation continuation = null;
        yji.l.a1(this, (j2) ((awk.l) this.f283487r).f10810n.f22677a, null, null, new n(this, continuation, 0), 3);
        yji.l.b1(this, this.f283489t, null, new n(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f283488s;
    }
}
