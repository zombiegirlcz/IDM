package ag;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.android.gms.wallet.WalletConstants;
import com.google.firebase.messaging.d0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.shared.feature.event_appearance.api.models.WelcomeAppearance;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import nn3.z;
import no.f2;
import tfm.n4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4681c;

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f4679a = i;
        this.f4680b = obj2;
        this.f4681c = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i;
        switch (this.f4679a) {
            case 0:
                e eVar = (e) this.f4680b;
                g gVar = (g) this.f4681c;
                v vVar = eVar.f4683b;
                synchronized (vVar) {
                    FileOutputStream fileOutputStreamOpenFileOutput = vVar.f4743a.openFileOutput(vVar.f4744b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(gVar.f4689a.toString().getBytes("UTF-8"));
                    } finally {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
                return null;
            case 1:
                Context context = (Context) this.f4680b;
                Intent intent = (Intent) this.f4681c;
                com.google.firebase.messaging.t tVarH = com.google.firebase.messaging.t.h();
                tVarH.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                }
                ((ArrayDeque) tVarH.e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (tVarH) {
                    try {
                        str = (String) tVarH.f49543b;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        tVarH.f49543b = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        tVarH.f49543b = serviceInfo.name;
                                    }
                                    str = (String) tVarH.f49543b;
                                }
                                String str3 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name;
                            }
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        "Restricting intent to a specific service: ".concat(str);
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    i = (tVarH.k(context) ? d0.c(context, intent2) : context.startService(intent2)) == null ? WalletConstants.ERROR_CODE_INVALID_PARAMETERS : -1;
                } catch (IllegalStateException e) {
                    String str4 = "Failed to start service while in background: " + e;
                    i = WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE;
                } catch (SecurityException e2) {
                    i = 401;
                }
                return Integer.valueOf(i);
            case 2:
                efm.r rVar = (efm.r) this.f4680b;
                com.revolut.retail.analytics.tracking.impl.b bVar = (com.revolut.retail.analytics.tracking.impl.b) this.f4681c;
                return rVar.withLatestFrom(((cn0.g) bVar.e).g().distinctUntilChanged((kfm.d) new njf.c(new nmb.v(19), 27)).switchMap(new njf.c(new z(bVar, 23), 28)), new njf.c(new nmb.v(18), 29)).filter(new noi.l(0, new nnf.h(19))).map(new noi.l(1, new nnf.h(20)));
            case 3:
                Long l2 = (Long) ((pza.l) this.f4680b).f240931b.T2(j6.a.q("remoteStoriesMetadata", mo3.a.l((mza.c) this.f4681c)), Long.TYPE);
                return Long.valueOf(l2 != null ? l2.longValue() : Long.MIN_VALUE);
            case 4:
                return new WelcomeAppearance((Clause) this.f4680b, (Image) this.f4681c, (UrlVideo) null);
            case 5:
                ufm.g gVar2 = (ufm.g) this.f4680b;
                Object obj2 = this.f4681c;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) gVar2.f279886c;
                Object obj3 = concurrentHashMap.get(obj2);
                if (obj3 == null) {
                    n4 n4VarE = ((efm.r) ((f2) gVar2.f279885b).invoke(obj2)).doFinally(new v3e.t(gVar2, obj2, 13)).replay(1).e();
                    Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(obj2, n4VarE);
                    obj3 = objPutIfAbsent == null ? n4VarE : objPutIfAbsent;
                }
                return (efm.w) obj3;
            default:
                return Boolean.valueOf(((y80.a) this.f4680b).c((String) this.f4681c));
        }
    }
}
