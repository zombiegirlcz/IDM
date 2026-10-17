package aw;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.UseCase;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class u implements xv.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bw.f f10210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f10211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f10212c;
    public final AtomicLong d;
    public final at4.b e;
    public ImageAnalysis f;

    public u(yw.h settings, bw.f converterAnalyzer, Executor executor) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(converterAnalyzer, "converterAnalyzer");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f10210a = converterAnalyzer;
        this.f10211b = executor;
        this.d = new AtomicLong(0L);
        this.e = new at4.b(settings, this, 9);
    }

    public final UseCase a() {
        Object objInvoke = this.e.invoke();
        this.f = (ImageAnalysis) objInvoke;
        Intrinsics.checkNotNullExpressionValue(objInvoke, "also(...)");
        return (UseCase) objInvoke;
    }
}
