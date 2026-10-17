package v06;

import android.net.Uri;
import cmi.n;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import sri.m;
import up5.s;
import uyh.t;
import uyh.w;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends pri.b implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f284764h;
    public final q06.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q06.m f284765j;
    public final com.revolut.analytics.tracking.v3.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f284766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w51.a f284767m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qpa.a f284768n;
    public final ami.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f284769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f284770q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f284771r;

    public j(m navigator, q06.d deeplinkParser, q06.m deeplinkRouterUnauthorized, com.revolut.analytics.tracking.v3.c deeplinkEventsTracker, n deeplinkCoordinator, w51.a appEntryPointInteractor, qpa.a pushControlInteractor, ami.n preAuthDeeplinkSideEffectRegistry, d deeplinkData, b deeplinkPreprocessor, a deeplinkQueryEncoder) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(deeplinkRouterUnauthorized, "deeplinkRouterUnauthorized");
        Intrinsics.checkNotNullParameter(deeplinkEventsTracker, "deeplinkEventsTracker");
        Intrinsics.checkNotNullParameter(deeplinkCoordinator, "deeplinkCoordinator");
        Intrinsics.checkNotNullParameter(appEntryPointInteractor, "appEntryPointInteractor");
        Intrinsics.checkNotNullParameter(pushControlInteractor, "pushControlInteractor");
        Intrinsics.checkNotNullParameter(preAuthDeeplinkSideEffectRegistry, "preAuthDeeplinkSideEffectRegistry");
        Intrinsics.checkNotNullParameter(deeplinkData, "deeplinkData");
        Intrinsics.checkNotNullParameter(deeplinkPreprocessor, "deeplinkPreprocessor");
        Intrinsics.checkNotNullParameter(deeplinkQueryEncoder, "deeplinkQueryEncoder");
        this.f284764h = navigator;
        this.i = deeplinkParser;
        this.f284765j = deeplinkRouterUnauthorized;
        this.k = deeplinkEventsTracker;
        this.f284766l = deeplinkCoordinator;
        this.f284767m = appEntryPointInteractor;
        this.f284768n = pushControlInteractor;
        this.o = preAuthDeeplinkSideEffectRegistry;
        this.f284769p = deeplinkData;
        this.f284770q = deeplinkPreprocessor;
        this.f284771r = deeplinkQueryEncoder;
    }

    public final ufm.n N(String str, String str2) {
        ufm.f fVar = new ufm.f(ufm.m.f279897a, new uz7.f(7, new w(this, 3, str, str2)), 2);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSubscribe(...)");
        return o70.a.e(fVar);
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        String string;
        d0 d0VarD;
        f view = (f) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        int i = 1;
        this.f284767m.f294677a = true;
        String pushTag = this.f284769p.f284758c;
        if (pushTag != null) {
            qpa.a aVar2 = this.f284768n;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(pushTag, "pushTag");
            tpa.a aVar3 = aVar2.f248319a;
            aVar3.getClass();
            Intrinsics.checkNotNullParameter(pushTag, "pushTag");
            aVar3.f273324a.cancel(pushTag, 0);
        }
        a aVar4 = this.f284771r;
        String str = this.f284769p.f284756a;
        aVar4.getClass();
        if (str != null) {
            try {
                Uri uri2 = Uri.parse(str);
                String encodedQuery = uri2.getEncodedQuery();
                if (encodedQuery == null) {
                    string = str;
                } else {
                    Uri.Builder builderBuildUpon = uri2.buildUpon();
                    String strEncode = Uri.encode(a.f284753a.replace(encodedQuery, "%25"), "%:/?@!$&'()*+,;=");
                    Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
                    string = builderBuildUpon.encodedQuery(strEncode).build().toString();
                }
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                string = null;
            }
            if (string != null) {
                str = string;
            }
        }
        n nVar = this.f284766l;
        m navigator = this.f284764h;
        cmi.m mVar = (cmi.m) nVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        wli.w wVar = (wli.w) mVar.f;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        m mVar2 = wVar.f298519a;
        if (mVar2 != null && !mVar2.equals(navigator)) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "TrampolineActivityNavigatorHolder", "Overwriting existing navigator", null, h0Var2);
        }
        wVar.f298519a = navigator;
        if (str == null) {
            d0VarD = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(d0VarD, "just(...)");
        } else {
            d0VarD = ue0.e.D(te0.w.o0(p0.f264003c, new i(this, str, null, 0)), new t(18));
        }
        ufm.i iVar = new ufm.i(d0VarD, new uz7.f(8, new h(this, str, i)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        ufm.n nVarI = o70.a.i(iVar);
        uu9.b bVar = new uu9.b(this, 19);
        Function1 function1K = K();
        ufm.i iVar2 = new ufm.i(nVarI, new qr0.i(new s(new BreadcrumbException(), 24)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
        ofm.i iVar3 = new ofm.i(new m3l.d(27, bVar), new m3l.d(27, function1K), 0);
        iVar2.q(iVar3);
        Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
        te0.w.j0(this.f239031a, iVar3);
    }

    @Override // pri.b, pri.e
    public final void l() {
        cmi.m mVar = (cmi.m) this.f284766l;
        mVar.getClass();
        m navigator = this.f284764h;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        wli.w wVar = (wli.w) mVar.f;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        m mVar2 = wVar.f298519a;
        if (mVar2 != null) {
            if (mVar2.equals(navigator)) {
                wVar.f298519a = null;
            } else {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "TrampolineActivityNavigatorHolder", "Unexpected navigator instance", null, h0Var);
            }
        }
        super.l();
    }
}
