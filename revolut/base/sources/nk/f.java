package nk;

import androidx.lifecycle.ViewModel;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import nd.p;

/* JADX INFO: loaded from: classes17.dex */
public final class f extends ViewModel {
    public final CoroutineDispatcher k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ok.b f216613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r39.a f216614m;
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qk.b f216615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qk.b f216616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedHashSet f216617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Throwable f216618s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final hlm.c f216619t;
    public final e u;

    public f(CoroutineDispatcher dispatcher, ok.b deserializeLinkMessageUseCase, r39.a payloadEmitter, p broadcastLinkMessageUseCase) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(deserializeLinkMessageUseCase, "deserializeLinkMessageUseCase");
        Intrinsics.checkNotNullParameter(payloadEmitter, "payloadEmitter");
        Intrinsics.checkNotNullParameter(broadcastLinkMessageUseCase, "broadcastLinkMessageUseCase");
        this.k = dispatcher;
        this.f216613l = deserializeLinkMessageUseCase;
        this.f216614m = payloadEmitter;
        this.o = broadcastLinkMessageUseCase;
        this.f216615p = new qk.b();
        this.f216616q = new qk.b();
        this.f216617r = new LinkedHashSet();
        this.f216619t = hlm.d.a();
        this.u = new e(this);
    }
}
