package q8d;

import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q2e.i0;
import wf0.m0;
import wli.x;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends jki.g implements jki.h {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m0 f243066p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f243067q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lde.j f243068r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ie.a f243069s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f243070t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(jki.p stateMapper, m0 interactor, x deeplinkHandler, lde.j sharedHelpQuickActionsInteractor, ie.a cardsTroubleshooterInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(sharedHelpQuickActionsInteractor, "sharedHelpQuickActionsInteractor");
        Intrinsics.checkNotNullParameter(cardsTroubleshooterInteractor, "cardsTroubleshooterInteractor");
        this.f243066p = interactor;
        this.f243067q = deeplinkHandler;
        this.f243068r = sharedHelpQuickActionsInteractor;
        this.f243069s = cardsTroubleshooterInteractor;
        this.f243070t = new c(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, m0.a(this.f243066p), null, new i0(this, (Continuation) null, 21), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f243070t;
    }

    public final void y2(String str) {
        if (this.f243067q.y1(str)) {
            n2(new m(this, str, null, 0), new whi.b(6));
        }
    }
}
