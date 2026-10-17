package mri;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends WorkerFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f208150a;

    public x(d4m.a workerFactories) {
        Intrinsics.checkNotNullParameter(workerFactories, "workerFactories");
        this.f208150a = workerFactories;
    }

    @Override // androidx.work.WorkerFactory
    public final ListenableWorker createWorker(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Object next;
        phm.a aVar;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        try {
            Iterator it8 = ((Map) this.f208150a.get()).entrySet().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Class.forName(workerClassName).isAssignableFrom((Class) ((Map.Entry) next).getKey())) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null && (aVar = (phm.a) entry.getValue()) != null) {
                return ((k90.a) aVar.get()).a(appContext, workerParameters);
            }
            return null;
        } catch (ClassNotFoundException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, "Something went wrong during worker initialization process.See https://craigrussell.io/2019/04/a-workmanager-pitfall-modifying-a-scheduled-worker/", e, h0Var);
            return null;
        }
    }
}
