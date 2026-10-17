package vc;

import android.content.Context;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlow;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j implements wc.n, tji.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f287589a;

    public /* synthetic */ j(Object obj2) {
        this.f287589a = obj2;
    }

    public Pattern a(String str) {
        Object obj2;
        icm.m mVar = (icm.m) this.f287589a;
        synchronized (mVar) {
            obj2 = ((zem.a) mVar.f160343b).get(str);
        }
        Pattern pattern = (Pattern) obj2;
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        icm.m mVar2 = (icm.m) this.f287589a;
        synchronized (mVar2) {
            ((zem.a) mVar2.f160343b).put(str, patternCompile);
        }
        return patternCompile;
    }

    @Override // tji.o
    public tji.n b(long j2) {
        return new usc.a(((KompotFlow) this.f287589a).Z.a(j2), 7);
    }

    @Override // wc.n
    public Object zza() {
        Context context = ((r8.o) ((qm.e) this.f287589a).f247740b).f252294a;
        return new i(context, context.getPackageName());
    }

    public j(int i) {
        icm.m mVar = new icm.m();
        mVar.f160342a = i;
        mVar.f160343b = new zem.a(mVar, a0.d.D(i, 4, 3, 1));
        this.f287589a = mVar;
    }

    public j(vlm.i threadFactory) {
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
        this.f287589a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }
}
