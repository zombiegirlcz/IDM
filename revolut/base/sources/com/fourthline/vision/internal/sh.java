package com.fourthline.vision.internal;

import android.database.DatabaseUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class sh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36922c;

    public /* synthetic */ sh(Object obj2, Object obj3, int i) {
        this.f36920a = i;
        this.f36921b = obj2;
        this.f36922c = obj3;
    }

    private final void a() {
        long size;
        s0m.c this$0 = (s0m.c) this.f36921b;
        h1m.b payload = (h1m.b) this.f36922c;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(payload, "$payload");
        t0m.d dVar = this$0.f259006m;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (dVar.a()) {
            dVar.c();
            dVar.b(payload);
        } else {
            synchronized (dVar) {
                dVar.f267053a.add(payload);
            }
        }
        t0m.d dVar2 = this$0.f259006m;
        if (dVar2.a()) {
            dVar2.c();
            size = DatabaseUtils.queryNumEntries(dVar2.f267054b, "events");
        } else {
            size = dVar2.f267053a.size();
        }
        if (size < this$0.u.a() || !this$0.f259001c.compareAndSet(false, true)) {
            return;
        }
        try {
            this$0.c();
            this$0.a((g1m.e) this$0.f259015y.get());
        } catch (Throwable th10) {
            this$0.f259001c.set(false);
            String TAG = this$0.f258999a;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z0m.j.b(TAG, "Received error during emission process: %s", th10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0332  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.sh.run():void");
    }
}
