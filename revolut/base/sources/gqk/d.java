package gqk;

import ce.v;
import com.bumptech.glide.g;
import com.google.android.gms.internal.mlkit_vision_common.zzlx;
import com.google.firebase.messaging.t;
import com.google.mlkit.vision.common.InputImage;
import com.revolut.data.model.Data;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f145768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f145769c;

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f145767a = i;
        this.f145768b = obj2;
        this.f145769c = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f145767a;
        Object obj2 = this.f145768b;
        Object obj3 = this.f145769c;
        switch (i) {
            case 0:
                TimeoutException timeoutException = new TimeoutException(p.a.p("Source ", (String) obj2, " does not emit initial value"));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, timeoutException, h0Var);
                return (Data) obj3;
            case 1:
                jh.c cVar = (jh.c) obj2;
                InputImage inputImage = (InputImage) obj3;
                zzlx zzlxVarZze = zzlx.zze("detectorTaskWithResource#run");
                zzlxVarZze.zzb();
                try {
                    Object objD = cVar.f174103b.d(inputImage);
                    zzlxVarZze.close();
                    return objD;
                } catch (Throwable th10) {
                    try {
                        zzlxVarZze.close();
                        break;
                    } catch (Throwable th11) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th10, th11);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    throw th10;
                }
            default:
                v vVar = (v) obj3;
                String str = (String) obj2;
                t tVar = (t) vVar.e;
                ((Lock) tVar.f49544c).lock();
                try {
                    Object objA = ((ie.a) vVar.f).a(str, tVar.d(str).f246754c);
                    ((g) vVar.d).f26094a.put(str, objA);
                    return objA;
                } finally {
                    tVar.m();
                }
        }
    }

    public d(v vVar, String str) {
        this.f145767a = 2;
        this.f145768b = str;
        this.f145769c = vVar;
    }
}
