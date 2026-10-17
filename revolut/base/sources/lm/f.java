package lm;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import com.revolut.RevolutApplication;
import kotlin.jvm.internal.Intrinsics;
import mri.x;

/* JADX INFO: loaded from: classes17.dex */
public final class f extends WorkerFactory {
    public f(RevolutApplication revolutApplication) {
    }

    @Override // androidx.work.WorkerFactory
    public final ListenableWorker createWorker(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        phm.a aVar = (phm.a) j6.a.j(hf0.b.d, k51.d.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return new x(e4m.b.a(((k51.b) ((k51.d) aVar2.b())).f181338s0)).createWorker(appContext, workerClassName, workerParameters);
        }
        throw new IllegalStateException(a0.d.q("Api ", k51.d.class, " is not found"));
    }
}
