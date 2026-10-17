package ah;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.util.Log;
import c8.k;
import c8.n;
import ce.f;
import ce.v;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.OnFailureListener;
import cpi.g;
import dm0.d;
import e8.e0;
import g7.b;
import java.io.File;
import java.io.IOException;
import java.time.Clock;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;
import l8.o;
import lj.c;
import ulm.h0;
import zc.b0;
import zc.w;

/* JADX INFO: loaded from: classes.dex */
public final class a implements OnFailureListener, ck.a, b, ic.a, o, c, kfm.o, n, b0, re.a, ze.a, h0, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4846a;

    public /* synthetic */ a(int i) {
        this.f4846a = i;
    }

    @Override // g7.b
    public s7.a a() {
        throw new IllegalStateException("not implemented");
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        return obj2;
    }

    @Override // ic.a
    public long b() {
        return System.currentTimeMillis();
    }

    @Override // zc.b0
    public Object c(IBinder iBinder) {
        return w.l(iBinder);
    }

    @Override // lj.c
    public String d(String str) {
        return str;
    }

    @Override // g7.b
    public float e() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // l8.o
    public void f(Bitmap bitmap, f8.a aVar) {
    }

    @Override // l8.o
    public void g() {
    }

    @Override // c8.d
    public boolean h(Object obj2, File file, k kVar) throws Throwable {
        try {
            y8.b.e(((GifDrawable) ((e0) obj2).get()).f26125a.f233797a.a(), file);
            return true;
        } catch (IOException e) {
            return Log.isLoggable("GifEncoder", 5) ? false : false;
        }
    }

    @Override // g7.b
    public boolean i(float f) {
        throw new IllegalStateException("not implemented");
    }

    @Override // g7.b
    public boolean isEmpty() {
        return true;
    }

    @Override // lj.c
    public String j(String str) {
        return str;
    }

    @Override // g7.b
    public boolean k(float f) {
        return false;
    }

    @Override // ck.a
    public ak.a l(Future future, mj.a aVar) {
        return new g(future, aVar, 3);
    }

    @Override // ce.f
    public Object m(v vVar) {
        switch (this.f4846a) {
            case 20:
                return new dh.a();
            default:
                return new ch.b(0);
        }
    }

    @Override // re.a
    public StackTraceElement[] n(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // g7.b
    public float o() {
        return 1.0f;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc2) {
    }

    @Override // c8.n
    public c8.c p(k kVar) {
        return c8.c.SOURCE;
    }

    public String toString() {
        switch (this.f4846a) {
            case 9:
                return "IdentityFunction";
            case 10:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }

    public a(Clock clock, ij0.a configuration, d deviceIdProvider, qd0.b languageProvider, b1j.a pushTokenProvider, jj0.a requestAuthorizer, ck0.b userAgentProvider) {
        this.f4846a = 1;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(pushTokenProvider, "pushTokenProvider");
        Intrinsics.checkNotNullParameter(requestAuthorizer, "requestAuthorizer");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
    }
}
