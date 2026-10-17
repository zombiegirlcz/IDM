package qu8;

import cli.y;
import com.revolut.feature.kyc.impl.cmd.screen.CmdControllerContract$InputData;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qsa.p;
import vkm.j2;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends oki.h implements e {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final List f249270t = v.k("invalid_request", "unauthorized_client", "unsupported_grant_type");
    public final CmdControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f80.a f249271p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yx8.a f249272q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kge.d f249273r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f249274s;

    public m(CmdControllerContract$InputData inputData, cli.n mapper, f80.a uriHelper, yx8.a webKycControllerExtension, kge.d redirectMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(webKycControllerExtension, "webKycControllerExtension");
        Intrinsics.checkNotNullParameter(redirectMapper, "redirectMapper");
        this.o = inputData;
        this.f249271p = uriHelper;
        this.f249272q = webKycControllerExtension;
        this.f249273r = redirectMapper;
        this.f249274s = mra.d.b(this, new d(false, false), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        if (this.o.f77612b == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Portal url doesn't contain redirect_uri parameter");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            I2(i.f249268a);
        }
        yji.l.a1(this, this.f249272q.d3(this.f249273r), null, null, new qp7.g(this, continuation, 8), 3);
    }

    public final void I2(j jVar) {
        y yVar = this.f249274s;
        if (((d) ((j2) yVar.f22677a).getValue()).f249263a) {
            return;
        }
        H2(yVar, new p(14));
        C2(jVar);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f249274s;
    }
}
