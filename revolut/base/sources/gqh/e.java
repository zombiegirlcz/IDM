package gqh;

import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_screener.NewScreenerScreenContract$Input;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends oki.h implements dli.b {

    @NotNull
    public static final b Companion = new b();
    public final NewScreenerScreenContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final moh.e f145727p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ugl.c f145728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f145729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2 f145730s;

    public e(j stateMapper, NewScreenerScreenContract$Input input, moh.e nameValidator, ugl.c screenerInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(nameValidator, "nameValidator");
        Intrinsics.checkNotNullParameter(screenerInteractor, "screenerInteractor");
        this.o = input;
        this.f145727p = nameValidator;
        this.f145728q = screenerInteractor;
        ugl.c.Companion.getClass();
        y yVarB = mra.d.b(this, new f((String) d0.d0(ugl.b.f280043b), 3), stateMapper, null, false, 12);
        this.f145729r = yVarB;
        this.f145730s = q.c(((f) ((j2) yVarB.f22677a).getValue()).f145731a);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new d(this, continuation, 1), new yi5.b(26));
        yji.l.a1(this, t1.d(this.f145730s, 300L), null, null, new gm6.j(this, continuation, 6), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f145729r;
    }
}
