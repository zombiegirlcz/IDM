package rld;

import cli.y;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.SlotManagerPromptControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;
import org.jetbrains.annotations.NotNull;
import wli.x;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends oki.h implements dli.b {

    @NotNull
    public static final j Companion = new j();
    public final SlotManagerPromptControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f255025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final skd.i f255026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d0 f255027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f80.a f255028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f255029t;
    public final b u;
    public final y v;

    public m(cli.n stateMapper, SlotManagerPromptControllerContract$InputData inputData, x deeplinkHandler, skd.i slotInteractor, d0 mainApplicationSlotContextProvider, f80.a uriHelper, a outcomes, b uriEnricher, rea.j tokenFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(slotInteractor, "slotInteractor");
        Intrinsics.checkNotNullParameter(mainApplicationSlotContextProvider, "mainApplicationSlotContextProvider");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(outcomes, "outcomes");
        Intrinsics.checkNotNullParameter(uriEnricher, "uriEnricher");
        Intrinsics.checkNotNullParameter(tokenFactory, "tokenFactory");
        this.o = inputData;
        this.f255025p = deeplinkHandler;
        this.f255026q = slotInteractor;
        this.f255027r = mainApplicationSlotContextProvider;
        this.f255028s = uriHelper;
        this.f255029t = outcomes;
        this.u = uriEnricher;
        this.v = mra.d.b(this, new h(inputData.f87376a, wp5.y.u((i90.b) tokenFactory.f253576b, "toString(...)")), stateMapper, new n(), false, 8);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new l(this, akd.a.VIEW, continuation, 1), new yi5.b(26));
        l2(new rbh.k(this, continuation, 8), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
