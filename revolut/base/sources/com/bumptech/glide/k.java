package com.bumptech.glide;

import android.content.Context;
import hcm.t;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26101b;

    public /* synthetic */ k(Object obj2, int i) {
        this.f26100a = i;
        this.f26101b = obj2;
    }

    private final void a() {
        ((t) this.f26101b).getClass();
        t tVar = (t) this.f26101b;
        tVar.o.execute(tVar.f151323t);
        synchronized (((t) this.f26101b).k) {
            t tVar2 = (t) this.f26101b;
            tVar2.C = Integer.MAX_VALUE;
            tVar2.s();
        }
        ((t) this.f26101b).getClass();
    }

    private final void b() {
        Context context = (Context) this.f26101b;
        AtomicReference atomicReference = uc.a.e;
        try {
            vc.t tVarB = vc.t.b(context);
            synchronized (tVarB) {
                tVarB.f = true;
                tVarB.a();
            }
        } catch (SecurityException unused) {
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0409 A[Catch: Exception -> 0x040c, TRY_LEAVE, TryCatch #17 {Exception -> 0x040c, blocks: (B:167:0x0404, B:169:0x0409), top: B:308:0x0404 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0404 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.k.run():void");
    }
}
