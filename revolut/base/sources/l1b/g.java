package l1b;

import android.content.Context;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerLib;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import jqa.m;
import knd.h0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import m1b.b;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends nri.a implements h1b.b {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppsFlyerLib f191518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f191519c;
    public final n1b.c d;
    public final CoroutineScope e;
    public final ang.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f191520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f191521h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j2 f191522j;
    public final AtomicBoolean k;

    public g(Context context, AppsFlyerLib appsFlyerLib, m deeplinkHandler, n1b.c mapper, CoroutineScope scope, ang.f userInteractor, l repository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appsFlyerLib, "appsFlyerLib");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f191518b = appsFlyerLib;
        this.f191519c = deeplinkHandler;
        this.d = mapper;
        this.e = scope;
        this.f = userInteractor;
        this.f191520g = repository;
        this.f191521h = context.getApplicationContext();
        this.f191522j = q.c(null);
        this.k = new AtomicBoolean(false);
    }

    public static final void j3(g gVar, String str) {
        String str2 = gVar.i;
        if (str2 == null || !str.equals(str2)) {
            gVar.i = str;
            wi0.b.Companion.getClass();
            wi0.b bVarA = wi0.a.a(str);
            gVar.f191518b.setConsentData((com.bumptech.glide.d.p(bVarA) || bVarA.equals(wi0.b.p0)) ? AppsFlyerConsent.INSTANCE.forGDPRUser(true, true) : AppsFlyerConsent.INSTANCE.forNonGDPRUser());
        }
    }

    @Override // nri.a
    public final void i3() {
        p0 p0Var = p0.f264001a;
        e0.C(this.e, elm.f.f127540b, null, new f(this, null), 2);
    }

    public final void k3(m1b.b bVar) {
        Continuation continuation = null;
        if (bVar instanceof m1b.c) {
            m1b.c cVar = (m1b.c) bVar;
            e0.C(this.e, null, null, new h0(cVar, this, cVar.f201329a, continuation, 18), 3);
            this.k.set(true);
            return;
        }
        if (bVar instanceof b.a) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "AppsFlyerDeeplinkObserver", "handleNotFoundDeepLink... deeplink was not found", null, h0Var);
        } else {
            if (!(bVar instanceof m1b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalStateException illegalStateException = new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.n("AppsFlyer DeepLink was not received due to error = ", ((m1b.a) bVar).a()));
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "AppsFlyerDeeplinkObserver", null, illegalStateException, h0Var2);
        }
    }
}
