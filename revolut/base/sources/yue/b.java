package yue;

import com.revolut.data.network.services.TopupService;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import wf0.r0;
import wtc.b0;
import x4l.c;
import ya6.y;
import yi3.d;
import yuc.p;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopupService f317016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f317017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f317018c;

    public b(TopupService service, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f317016a = service;
        this.f317017b = memoryCache;
        this.f317018c = new c(new b0(this, null, 14), new p(this, 2), new d(this, 21), new r0(2, 27, null), new y(3, 2, null));
    }
}
