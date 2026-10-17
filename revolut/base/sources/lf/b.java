package lf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import df.e;
import java.util.concurrent.ConcurrentHashMap;
import pd.g;
import pd.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qf.a f194619b = qf.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f194620a = new ConcurrentHashMap();

    public b(g gVar, cf.b bVar, e eVar, cf.b bVar2, RemoteConfigManager remoteConfigManager, nf.a aVar, SessionManager sessionManager) {
        Bundle bundle;
        if (gVar == null) {
            new com.google.firebase.perf.util.e(new Bundle());
            return;
        }
        i iVar = gVar.f235025c;
        wf.e eVar2 = wf.e.f296850s;
        eVar2.d = gVar;
        gVar.a();
        eVar2.f296860p = iVar.f235033g;
        eVar2.f = eVar;
        eVar2.f296854g = bVar2;
        eVar2.i.execute(new androidx.view.d(eVar2, 24));
        gVar.a();
        Context context = gVar.f235023a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            String str = "No perf enable meta data found " + e.getMessage();
            bundle = null;
        }
        com.google.firebase.perf.util.e eVar3 = bundle != null ? new com.google.firebase.perf.util.e(bundle) : new com.google.firebase.perf.util.e();
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        aVar.f214766b = eVar3;
        nf.a.d.f245203b = jh.d.i(context);
        aVar.f214767c.c(context);
        sessionManager.setApplicationContext(context);
        Boolean boolG = aVar.g();
        qf.a aVar2 = f194619b;
        if (aVar2.f245203b) {
            if (boolG != null ? boolG.booleanValue() : g.c().h()) {
                gVar.a();
                "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(rd0.e.j(iVar.f235033g, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (aVar2.f245203b) {
                    aVar2.f245202a.getClass();
                }
            }
        }
    }
}
