package z20;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u10.n f318906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okhttp3.c f318907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final skm.r f318908c;

    public d(u10.n entity, okhttp3.c body, skm.r transferCompleteSignal) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(transferCompleteSignal, "transferCompleteSignal");
        this.f318906a = entity;
        this.f318907b = body;
        this.f318908c = transferCompleteSignal;
    }
}
