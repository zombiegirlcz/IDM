package ex0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import et0.w;
import java.util.List;
import kotlin.Unit;
import vc.p;
import vc.t;
import wc.d;

/* JADX INFO: loaded from: classes.dex */
public final class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f130330b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f130329a = i;
        this.f130330b = obj2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        switch (this.f130329a) {
            case 0:
                if (intent == null || (action = intent.getAction()) == null) {
                    return;
                }
                int iHashCode = action.hashCode();
                if (iHashCode != -1513032534) {
                    if (iHashCode != 502473491) {
                        if (iHashCode != 505380757 || !action.equals("android.intent.action.TIME_SET")) {
                            return;
                        }
                    } else if (!action.equals("android.intent.action.TIMEZONE_CHANGED")) {
                        return;
                    }
                } else if (!action.equals("android.intent.action.TIME_TICK")) {
                    return;
                }
                ((c) this.f130330b).f130332b.onNext(Unit.f186387a);
                return;
            default:
                t tVar = (t) this.f130330b;
                Bundle bundleExtra = intent.getBundleExtra("session_state");
                if (bundleExtra == null) {
                    return;
                }
                vc.c cVarE = vc.c.e(bundleExtra);
                tVar.f287603a.b("ListenerRegistryBroadcastReceiver.onReceive: %s", cVarE);
                d dVarA = ((p) tVar.f287607h).a();
                if (cVarE.c() != 3 || dVarA == null) {
                    tVar.c(cVarE);
                    return;
                }
                List listD = cVarE.d();
                uvl.c cVar = new uvl.c(tVar, cVarE, intent, context);
                if (uc.a.e.get() == null) {
                    throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
                }
                dVarA.d.execute(new w((Object) dVarA, (Object) listD, (Object) cVar, false, 11));
                return;
        }
    }
}
