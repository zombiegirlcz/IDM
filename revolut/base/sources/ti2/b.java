package ti2;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
import gom.e;
import ie.r;
import ie.u;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import rd0.d;
import th0.l;
import zhm.p;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends nri.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f271406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sf0.c f271407c;
    public final vo8.b d;

    public b(sf0.c loggableThrowableMapper, vo8.b rawDeviceAgentIdValue) {
        Intrinsics.checkNotNullParameter(loggableThrowableMapper, "loggableThrowableMapper");
        Intrinsics.checkNotNullParameter(rawDeviceAgentIdValue, "rawDeviceAgentIdValue");
        this.f271406b = true;
        this.f271407c = loggableThrowableMapper;
        this.d = rawDeviceAgentIdValue;
    }

    @Override // nri.a
    public final void i3() {
        ((th0.a) l.Companion.c()).getClass();
        sh0.a aVar = new sh0.a();
        boolean z = this.f271406b;
        r rVar = ee.c.a().f125046a;
        Boolean boolValueOf = Boolean.valueOf(z);
        u uVar = rVar.f160556b;
        synchronized (uVar) {
            uVar.f = false;
            uVar.f160574g = boolValueOf;
            SharedPreferences.Editor editorEdit = uVar.f160571a.edit();
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", z);
            editorEdit.apply();
            synchronized (uVar.f160573c) {
                try {
                    if (uVar.a()) {
                        if (!uVar.e) {
                            uVar.d.trySetResult(null);
                            uVar.e = true;
                        }
                    } else if (uVar.e) {
                        uVar.d = new TaskCompletionSource();
                        uVar.e = false;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
        if (this.f271406b) {
            u70.c cVar = new u70.c(aVar, this.d, this.f271407c, new a90.a());
            e.f145194a.c(cVar);
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            u70.c[] argumentListeners = {cVar};
            Intrinsics.checkNotNullParameter(argumentListeners, "argumentListeners");
            d.f253311a.addAllAbsent(p.c(argumentListeners));
            cVar.init();
        }
    }
}
