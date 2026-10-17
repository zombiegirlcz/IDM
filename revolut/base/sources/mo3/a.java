package mo3;

import android.content.Context;
import android.view.View;
import ce.b;
import ce.n;
import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit_core.R$id;
import com.revolut.feature.remote_stories.models.keys.RemoteStoriesKey;
import efm.c0;
import efm.k;
import efm.r;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import ise.d0;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import jfb.v0;
import jhi.c;
import jhi.d;
import jhi.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mfm.f;
import mza.i;
import nkm.y;
import tcg.q;
import v3e.s;
import xjg.j;
import zfm.h;
import zsc.p;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile q f207541a;

    public static final String a(j jVar) {
        no.j jVar2;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        switch (zjg.a.f322820a[jVar.ordinal()]) {
            case 1:
                jVar2 = no.j.PURPLE;
                break;
            case 2:
                jVar2 = no.j.TEAL;
                break;
            case 3:
                jVar2 = no.j.ORANGE;
                break;
            case 4:
                jVar2 = no.j.PINK;
                break;
            case 5:
                jVar2 = no.j.DEEP_BLUE;
                break;
            case 6:
                jVar2 = no.j.DYNAMIC;
                break;
            case 7:
                jVar2 = no.j.CYBERPUNK;
                break;
            case 8:
                jVar2 = no.j.DEFAULT;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return jVar2.a();
    }

    public static final void b(int i) {
        new Integer(i);
    }

    public static c0 c(Callable callable) {
        try {
            Object objCall = callable.call();
            f.b(objCall, "Scheduler Callable result can't be null");
            return (c0) objCall;
        } catch (Throwable th10) {
            throw h.d(th10);
        }
    }

    public static b d(String str, String str2) {
        yf.a aVar = new yf.a(str, str2);
        ce.a aVarB = b.b(yf.a.class);
        aVarB.e = 1;
        aVarB.f = new ag.j(aVar, 6);
        return aVarB.b();
    }

    public static final jhi.b e(Flow flow, Function2 nullContentHandler, Function2 consumeErrors) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(nullContentHandler, "nullContentHandler");
        Intrinsics.checkNotNullParameter(consumeErrors, "consumeErrors");
        return f(flow, nullContentHandler, new c(), consumeErrors);
    }

    public static final jhi.b f(Flow flow, Function2 nullContentHandler, Function3 contentMapper, Function2 consumeErrors) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(contentMapper, "contentMapper");
        Intrinsics.checkNotNullParameter(nullContentHandler, "nullContentHandler");
        Intrinsics.checkNotNullParameter(consumeErrors, "consumeErrors");
        return new jhi.b(flow, contentMapper, nullContentHandler, consumeErrors);
    }

    public static /* synthetic */ jhi.b g(Flow flow, Function2 function2, Function2 function22, int i) {
        if ((i & 1) != 0) {
            function2 = d.f174258a;
        }
        if ((i & 2) != 0) {
            function22 = new v0(3);
        }
        return e(flow, function2, function22);
    }

    public static /* synthetic */ jhi.b h(Flow flow, Function3 function3, Function2 function2, int i) {
        Function2 function22 = (i & 2) != 0 ? e.f174259a : d0.f168193a;
        if ((i & 4) != 0) {
            function2 = new akg.d(22);
        }
        return f(flow, function22, function3, function2);
    }

    public static b i(String str, pd.h hVar) {
        ce.a aVarB = b.b(yf.a.class);
        aVarB.e = 1;
        aVarB.a(n.c(Context.class));
        aVarB.f = new ae.a(str, hVar, 17);
        return aVarB.b();
    }

    public static final cp0.b j(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag2 = view.getTag(R$id.internal_view_tag_clause_adapter);
        if (tag2 instanceof cp0.b) {
            return (cp0.b) tag2;
        }
        return null;
    }

    public static final String k(p7l.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String[] elements = {aVar.f233790a, aVar.f233791b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return y.u(y.o(kotlin.collections.d.E(elements), new jli.f(25)), " ", null, 62);
    }

    public static final String l(mza.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        i iVar = cVar.f210728a;
        Locale locale = cVar.f210729b;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        StringBuilder sb6 = new StringBuilder("storyId = ");
        sb6.append(iVar.f210742a);
        sb6.append(" substitutionData = ");
        for (Map.Entry entry : iVar.f210743b.entrySet()) {
            v0.a.t(CoreConstants.DASH_CHAR, p.SPACE_CHAR, (String) entry.getKey(), (String) entry.getValue(), sb6);
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return com.google.android.gms.internal.mlkit_vision_face.a.p(string, " ", locale.getLanguage(), "-", locale.getCountry());
    }

    public static void m(Throwable th10) {
        q qVar = f207541a;
        if (th10 == null) {
            th10 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th10 instanceof OnErrorNotImplementedException) && !(th10 instanceof MissingBackpressureException) && !(th10 instanceof IllegalStateException) && !(th10 instanceof NullPointerException) && !(th10 instanceof IllegalArgumentException) && !(th10 instanceof CompositeException)) {
            th10 = new UndeliverableException(th10);
        }
        if (qVar != null) {
            try {
                qVar.accept(th10);
                return;
            } catch (Throwable th11) {
                th11.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th11);
            }
        }
        th10.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th10);
    }

    public static final r n(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        r rVarTakeUntil = rVar.takeUntil(new s(new qza.q(17), 2));
        Intrinsics.checkNotNullExpressionValue(rVarTakeUntil, "takeUntil(...)");
        return rVarTakeUntil;
    }

    public static final dj0.d o(jo3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        long jA = aVar.getAmount();
        xi0.a aVar2 = xi0.b.Companion;
        String strB = aVar.getCurrency();
        aVar2.getClass();
        return new dj0.d(jA, xi0.a.a(strB));
    }

    public static final jo3.a p(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new jo3.a(dVar.f115082a, dVar.f115083b.f306286a);
    }

    public static final String q(RemoteStoriesKey remoteStoriesKey) {
        Intrinsics.checkNotNullParameter(remoteStoriesKey, "<this>");
        String[] elements = {remoteStoriesKey.getProductName(), remoteStoriesKey.z1(), remoteStoriesKey.e8()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.d0.k0(kotlin.collections.d.L(elements), ".", null, null, 0, null, 62);
    }

    public static final r r(r rVar, tpi.j progressView) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        tpi.i iVar = (tpi.i) progressView;
        iVar.getClass();
        return rVar.compose(new tpi.b(iVar, 5));
    }

    public static final r s(r rVar, tpi.j progressView) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        tpi.i iVar = (tpi.i) progressView;
        iVar.getClass();
        return rVar.compose(new tpi.b(iVar, 6));
    }

    public static r t(r rVar, tpi.j progressView) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        tpi.i iVar = (tpi.i) progressView;
        iVar.getClass();
        return rVar.compose(new tpi.b(iVar, 2));
    }

    public static final efm.b u(efm.b bVar, tpi.j progressView, boolean z) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        tpi.i iVar = (tpi.i) progressView;
        iVar.getClass();
        return bVar.h(new com.google.firebase.messaging.r(iVar, z));
    }

    public static final k v(k kVar, tpi.j progressView) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        tpi.i iVar = (tpi.i) progressView;
        iVar.getClass();
        return kVar.d(new tpi.b(iVar, 4));
    }

    public static efm.d0 w(efm.d0 d0Var, tpi.j progressView) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        tpi.i iVar = (tpi.i) progressView;
        iVar.getClass();
        return d0Var.g(new tpi.b(iVar, 1));
    }
}
