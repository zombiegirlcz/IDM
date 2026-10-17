package tpl;

import akl.b0;
import bjl.o0;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends oki.h implements l {

    @NotNull
    public static final p Companion = new p();
    public final c70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f273432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r70.c f273433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s70.a f273434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o0 f273435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f01.a f273436t;
    public final y u;

    public s(c70.a clipboard, b0 documentsRepository, r70.c hapticEngine, s70.a intentProvider, o0 revolutSsoAuthErrorHandler, f01.a uiKitResources, u stateMapper) {
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(documentsRepository, "documentsRepository");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(revolutSsoAuthErrorHandler, "revolutSsoAuthErrorHandler");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = clipboard;
        this.f273432p = documentsRepository;
        this.f273433q = hapticEngine;
        this.f273434r = intentProvider;
        this.f273435s = revolutSsoAuthErrorHandler;
        this.f273436t = uiKitResources;
        this.u = mra.d.b(this, new j(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        K2();
    }

    public final void I2(int i, String str) {
        this.o.c(null, str, true, new et0.k(this, i, 6));
    }

    public final String J2(int i, String str) {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(this.f273436t.b(new TextLocalisedClause(i, null, null, 14)).toString(), ": ", str);
    }

    public final void K2() {
        b0 b0Var = this.f273432p;
        b0Var.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        yji.l.a1(this, b0Var.d.b(Unit.f186387a, loadingStrategy), new r(this, continuation, 0), null, new r(this, continuation, 1), 2);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
