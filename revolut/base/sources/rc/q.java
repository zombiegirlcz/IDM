package rc;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import zc.y;

/* JADX INFO: loaded from: classes16.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f253169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f253171c;
    public final nd.m d;
    public final zc.c e;

    public q(Context context, y yVar, nd.m mVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f253171c = taskCompletionSource;
        this.f253170b = context.getPackageName();
        this.f253169a = yVar;
        this.d = mVar;
        zc.c cVar = new zc.c(context, yVar, "ExpressIntegrityService", r.f253172a, new nd.l());
        this.e = cVar;
        cVar.a().post(new l(this, taskCompletionSource, context));
    }

    public static Bundle a(q qVar, w wVar, long j2, long j3) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", qVar.f253170b);
        bundle.putLong("cloud.prj", j2);
        bundle.putString("nonce", wVar.f253179a);
        bundle.putLong("warm.up.sid", j3);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(wVar.f253180b));
        ArrayList arrayList = new ArrayList();
        vc.o.c(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(vc.o.b(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle b(q qVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", qVar.f253170b);
        bundle.putLong("cloud.prj", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        vc.o.c(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(vc.o.b(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean c(q qVar) {
        return qVar.f253171c.getTask().isSuccessful() && ((Integer) qVar.f253171c.getTask().getResult()).intValue() < 83420000;
    }

    public static /* bridge */ /* synthetic */ boolean d(q qVar) {
        return qVar.f253171c.getTask().isSuccessful() && ((Integer) qVar.f253171c.getTask().getResult()).intValue() == 0;
    }
}
