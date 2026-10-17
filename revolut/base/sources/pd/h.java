package pd;

import androidx.arch.core.util.Function;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.work.impl.model.WorkSpec;
import ce.t;
import ce.v;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesActivity;
import efm.w;
import efm.x;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kfm.o;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import le.o2;
import pza.k;
import qza.q;
import wb.j;
import xf.i0;
import yhm.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements wb.g, o, DrmSessionManager.DrmSessionReference, ce.f, x, kfm.c, kfm.h, kfm.g, Consumer, Function, j, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235029a;

    public /* synthetic */ h(int i) {
        this.f235029a = i;
    }

    @Override // kfm.h
    public Object a(Object _a, Object _b, Object _c) {
        Intrinsics.checkNotNullParameter(_a, "_a");
        Intrinsics.checkNotNullParameter(_b, "_b");
        Intrinsics.checkNotNullParameter(_c, "_c");
        return new r(_a, _b, _c);
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f235029a) {
            case 17:
                Unit unit = Unit.f186387a;
                break;
            default:
                ((ExecutorService) obj2).shutdown();
                break;
        }
    }

    @Override // efm.x
    public w apply(efm.r it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.distinctUntilChanged();
    }

    @Override // wb.j
    public void c(Exception exc2) {
    }

    @Override // ce.f
    public Object m(v vVar) {
        switch (this.f235029a) {
            case 9:
                return AbtRegistrar.lambda$getComponents$0(vVar);
            case 10:
                return TransportRegistrar.lambda$getComponents$0(vVar);
            case 11:
                return TransportRegistrar.lambda$getComponents$1(vVar);
            case 12:
                return TransportRegistrar.lambda$getComponents$2(vVar);
            default:
                Set setG = vVar.g(t.a(yf.a.class));
                yf.c cVar = yf.c.c;
                if (cVar == null) {
                    synchronized (yf.c.class) {
                        try {
                            cVar = yf.c.c;
                            if (cVar == null) {
                                cVar = new yf.c(0);
                                yf.c.c = cVar;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return new yf.b(setG, cVar);
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
    public void release() {
        DrmSessionManager.DrmSessionReference.lambda$static$0();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj2) {
        return Tasks.forResult(null);
    }

    public /* synthetic */ h(q qVar) {
        this.f235029a = 17;
    }

    @Override // wb.g
    public Object apply(Object p0) {
        switch (this.f235029a) {
            case 4:
                pe.a.f235268b.getClass();
                return me.b.f204589a.a((o2) p0).getBytes(Charset.forName("UTF-8"));
            case 5:
                pza.f fVar = pza.f.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (mza.d) fVar.invoke(p0);
            case 6:
                k kVar = k.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) kVar.invoke(p0);
            case 8:
                KProperty[] kPropertyArr = RemoteStoriesActivity.f81953v0;
                Intrinsics.checkNotNullParameter(p0, "it");
                return Unit.f186387a;
            case 18:
                return ((i0) p0).toByteArray();
            default:
                return WorkSpec.WORK_INFO_MAPPER$lambda$1((List) p0);
        }
    }

    @Override // kfm.c
    public Object apply(Object _a, Object _b) {
        switch (this.f235029a) {
            case 14:
                Intrinsics.checkNotNullParameter(_a, "_a");
                Intrinsics.checkNotNullParameter(_b, "_b");
                break;
            default:
                Intrinsics.checkNotNullParameter(_a, "_a");
                Intrinsics.checkNotNullParameter(_b, "_b");
                break;
        }
        return new Pair(_a, _b);
    }
}
