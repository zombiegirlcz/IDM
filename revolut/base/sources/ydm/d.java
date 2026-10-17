package ydm;

import io.ktor.client.engine.HttpClientEngine;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import skm.b0;
import skm.c2;
import skm.g1;
import skm.h1;
import skm.p0;
import skm.s;
import skm.z;
import zhm.h0;

/* JADX INFO: loaded from: classes23.dex */
public abstract class d implements HttpClientEngine {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f312717c = AtomicIntegerFieldUpdater.newUpdater(d.class, "closed");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f312718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f312719b;

    @NotNull
    private volatile /* synthetic */ int closed;

    public d() {
        Intrinsics.checkNotNullParameter("ktor-okhttp", "engineName");
        this.closed = 0;
        final int i = 0;
        this.f312718a = yhm.j.b(new Function0(this) { // from class: ydm.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f312716b;

            {
                this.f312716b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                d dVar = this.f312716b;
                switch (i2) {
                    case 0:
                        ((io.ktor.client.engine.okhttp.a) dVar).d.getClass();
                        p0 p0Var = p0.f264001a;
                        return elm.f.f127540b;
                    default:
                        return kotlin.coroutines.e.d(new c2(null), new oem.f(z.f264021a)).plus((CoroutineDispatcher) dVar.f312718a.getValue()).plus(new b0("ktor-okhttp-context"));
                }
            }
        });
        final int i2 = 1;
        this.f312719b = yhm.j.b(new Function0(this) { // from class: ydm.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f312716b;

            {
                this.f312716b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                d dVar = this.f312716b;
                switch (i22) {
                    case 0:
                        ((io.ktor.client.engine.okhttp.a) dVar).d.getClass();
                        p0 p0Var = p0.f264001a;
                        return elm.f.f127540b;
                    default:
                        return kotlin.coroutines.e.d(new c2(null), new oem.f(z.f264021a)).plus((CoroutineDispatcher) dVar.f312718a.getValue()).plus(new b0("ktor-okhttp-context"));
                }
            }
        });
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public Set N3() {
        return h0.f322473a;
    }

    public void close() {
        if (f312717c.compareAndSet(this, 0, 1)) {
            CoroutineContext.Element element = getCoroutineContext().get(g1.f263979a);
            s sVar = element instanceof s ? (s) element : null;
            if (sVar == null) {
                return;
            }
            ((h1) sVar).h0();
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return (CoroutineContext) this.f312719b.getValue();
    }
}
