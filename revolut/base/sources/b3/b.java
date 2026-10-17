package b3;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import com.bumptech.glide.c;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import e06.g;
import java.io.IOException;
import java.net.SocketTimeoutException;
import jvf.e;
import jvf.f;
import kmm.h;
import kmm.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mmm.m;
import vkm.t;
import vkm.v1;
import yji.l;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11972c;

    public /* synthetic */ b(Object obj2, long j2, int i) {
        this.f11970a = i;
        this.f11972c = obj2;
        this.f11971b = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        n nVar;
        switch (this.f11970a) {
            case 0:
                return AndroidTextPaint.setBrush_12SF9DM$lambda$0((Brush) this.f11972c, this.f11971b);
            case 1:
                h hVar = (h) this.f11972c;
                long j2 = this.f11971b;
                synchronized (hVar) {
                    try {
                        if (!hVar.v && (nVar = hVar.f185926l) != null) {
                            int i = hVar.f185935x ? hVar.f185934w : -1;
                            hVar.f185934w++;
                            hVar.f185935x = true;
                            Unit unit = Unit.f186387a;
                            if (i != -1) {
                                StringBuilder sb6 = new StringBuilder("sent ping but didn't receive pong within ");
                                sb6.append(hVar.d);
                                sb6.append("ms (after ");
                                h.d(hVar, new SocketTimeoutException(j6.a.v(sb6, " successful ping/pongs)", i - 1)), null, 2);
                            } else {
                                try {
                                    m payload = m.d;
                                    Intrinsics.checkNotNullParameter(payload, "payload");
                                    nVar.d(9, payload);
                                } catch (IOException e) {
                                    h.d(hVar, e, null, 2);
                                }
                            }
                            break;
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return Long.valueOf(j2);
            case 2:
                return new AnalyticsContext(m72.b.h("cache_cleaner", c.g(new g((String) this.f11972c, this.f11971b, 3)), AnalyticsContext.INSTANCE));
            default:
                com.revolut.feature.transport.impl.ui.activation.flow.a aVar = (com.revolut.feature.transport.impl.ui.activation.flow.a) this.f11972c;
                long j3 = this.f11971b;
                f fVar = aVar.f92513q;
                fVar.getClass();
                Continuation continuation = null;
                return l.a1(aVar, new t(new v1(new e(j3, fVar, continuation, 0)), new a0e.n(aVar, continuation, 13)), null, null, null, 7);
        }
    }
}
