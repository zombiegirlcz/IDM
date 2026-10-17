package x0m;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class e {
    public final synchronized f a(Context context, long j2, long j3, TimeUnit timeUnit, Runnable[] runnableArr, boolean z) {
        f fVar;
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            fVar = new f(j2, j3, timeUnit, context, z);
            Runnable[] runnableArr2 = {null, null, null, null};
            if (runnableArr != null && runnableArr.length == 4) {
                runnableArr2 = runnableArr;
            }
            fVar.k = runnableArr2[0];
            fVar.f301669l = runnableArr2[1];
            fVar.f301670m = runnableArr2[2];
            fVar.f301671n = runnableArr2[3];
        } catch (Throwable th10) {
            throw th10;
        }
        return fVar;
    }
}
