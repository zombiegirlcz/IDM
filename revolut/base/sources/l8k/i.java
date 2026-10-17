package l8k;

import com.revolut.data.model.Data;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l5a.u;
import org.jetbrains.annotations.NotNull;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends jki.g implements jki.h {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f193007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tqi.g f193008q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c70.a f193009r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f01.a f193010s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f193011t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ang.f userInteractor, tqi.g shareNaviCommandFactory, c70.a clipboard, f01.a uiKitResources, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f193007p = userInteractor;
        this.f193008q = shareNaviCommandFactory;
        this.f193009r = clipboard;
        this.f193010s = uiKitResources;
        this.f193011t = new d(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(nim.a.w(this.f193007p.k(false), new u(19))), null, null, new l1g.e(this, (Continuation) null, 13), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f193011t;
    }
}
