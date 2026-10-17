package dca;

import android.content.Context;
import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends oki.h implements n {
    public final MutableStateFlow o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s8a.l f112840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f112841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tqi.g f112842r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yy0.f f112843s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f112844t;
    public final zk0.b u;
    public final l80.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f112845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f112846x;

    public r(t stateMapper, MutableStateFlow sharedParamsFlow, s8a.l interactor, c70.a clipboard, tqi.g shareNaviCommandFactory, yy0.f imageDisplayer, Context context, zk0.b fileSystemRepository, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(sharedParamsFlow, "sharedParamsFlow");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.o = sharedParamsFlow;
        this.f112840p = interactor;
        this.f112841q = clipboard;
        this.f112842r = shareNaviCommandFactory;
        this.f112843s = imageDisplayer;
        this.f112844t = context;
        this.u = fileSystemRepository;
        this.v = dateProvider;
        this.f112845w = mra.d.b(this, h.f112830a, stateMapper, null, false, 12);
        z1 z1VarB = vkm.q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f112846x = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f112846x, new p(continuation, this, 0)), null, null, new d8j.c(this, continuation, 10), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f112845w;
    }
}
