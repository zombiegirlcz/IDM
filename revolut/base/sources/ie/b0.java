package ie;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.revolut.RevolutApplication;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import java.util.concurrent.CountDownLatch;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m1b.b;
import no.f2;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Continuation, kfm.o, kfm.g, DeepLinkListener, kfm.p, ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f160511b;

    public /* synthetic */ b0(Object obj2, int i) {
        this.f160510a = i;
        this.f160511b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f160510a;
        Object obj3 = this.f160511b;
        switch (i) {
            case 4:
                ((kn.a) obj3).invoke(obj2);
                break;
            case 6:
                RevolutApplication.a aVar = RevolutApplication.Companion;
                ((jli.f) obj3).invoke(obj2);
                break;
            case 13:
                ((noi.d) obj3).invoke(obj2);
                break;
            case 15:
                ((noi.d) obj3).invoke(obj2);
                break;
            case 19:
                ((noi.m) obj3).invoke(obj2);
                break;
            case 20:
                ((jli.f) obj3).invoke(obj2);
                break;
            case 21:
                ((noi.m) obj3).invoke(obj2);
                break;
            case 22:
                ((jli.f) obj3).invoke(obj2);
                break;
            case 26:
                ((nwl.e) obj3).invoke(obj2);
                break;
            default:
                int i2 = CollapsingActionButton.f58976h;
                ((f2) obj3).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f160510a) {
            case 1:
                akl.s sVar = (akl.s) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) sVar.invoke(p0);
            case 2:
                an0.e eVar = (an0.e) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yhm.m) eVar.invoke(p0);
            case 3:
                jli.f fVar = (jli.f) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (kii.d) fVar.invoke(p0);
            case 4:
            case 5:
            case 6:
            case 7:
            case 11:
            case 13:
            case 14:
            case 15:
            case 19:
            case 20:
            case 21:
            case 22:
            case 26:
            default:
                nwl.e eVar2 = (nwl.e) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) eVar2.invoke(p0);
            case 8:
                jli.f fVar2 = (jli.f) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) fVar2.invoke(p0);
            case 9:
                akl.s sVar2 = (akl.s) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) sVar2.invoke(p0);
            case 10:
                bsi.b bVar = (bsi.b) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) bVar.invoke(p0);
            case 12:
                f2 f2Var = (f2) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) f2Var.invoke(p0);
            case 16:
                noi.m mVar = (noi.m) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) mVar.invoke(p0);
            case 17:
                jli.f fVar3 = (jli.f) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (do3.s) fVar3.invoke(p0);
            case 18:
                noi.m mVar2 = (noi.m) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) mVar2.invoke(p0);
            case 23:
                nwl.c cVar = (nwl.c) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) cVar.invoke(p0);
            case 24:
                nwl.f fVar4 = (nwl.f) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) fVar4.invoke(p0);
            case 25:
                jli.f fVar5 = (jli.f) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) fVar5.invoke(p0);
            case 27:
                jli.f fVar6 = (jli.f) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) fVar6.invoke(p0);
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj2) {
        ((AnalyticsListener) obj2).onSeekStarted((AnalyticsListener.EventTime) this.f160511b);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        IllegalStateException illegalStateException;
        l1b.g gVar = (l1b.g) this.f160511b;
        Intrinsics.checkNotNullParameter(deepLinkResult, "appsFlyerDeeplinkResult");
        n1b.c cVar = gVar.d;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(deepLinkResult, "deepLinkResult");
        int i = n1b.b.f211305a[deepLinkResult.getStatus().ordinal()];
        m1b.b aVar = b.a.f201328a;
        if (i == 1) {
            DeepLink deeplink = deepLinkResult.getDeepLink();
            Intrinsics.checkNotNullExpressionValue(deeplink, "getDeepLink(...)");
            try {
                l1b.i iVar = cVar.f211308b;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                String strA = iVar.a(deeplink.getDeepLinkValue(), deeplink.getStringValue("deep_link_sub1"));
                if (strA != null) {
                    aVar = new m1b.c(strA, cVar.a(strA));
                }
            } catch (Exception e) {
                aVar = new m1b.a(e);
            }
        } else if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            DeepLinkResult.Error error = deepLinkResult.getError();
            Intrinsics.checkNotNullExpressionValue(error, "getError(...)");
            int i2 = n1b.b.f211306b[error.ordinal()];
            if (i2 == 1) {
                illegalStateException = new IllegalStateException("Timeout error received in AppsFlyer result");
            } else if (i2 == 2) {
                illegalStateException = new IllegalStateException("Network error received in AppsFlyer result");
            } else if (i2 == 3) {
                illegalStateException = new IllegalStateException("Http status code error received in AppsFlyer result");
            } else if (i2 == 4) {
                illegalStateException = new IllegalStateException("Unexpected error received in AppsFlyer result");
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                illegalStateException = new IllegalStateException("Developer error error received in AppsFlyer result");
            }
            aVar = new m1b.a(illegalStateException);
        }
        gVar.k3(aVar);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f160510a) {
            case 7:
                jli.f fVar = (jli.f) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) fVar.invoke(p0)).booleanValue();
            default:
                noi.d dVar = (noi.d) this.f160511b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) dVar.invoke(p0)).booleanValue();
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.f160511b).countDown();
        return null;
    }
}
