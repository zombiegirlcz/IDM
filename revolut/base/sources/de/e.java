package de;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f113274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f113275c;
    public final /* synthetic */ i4b.f d;

    public /* synthetic */ e(f fVar, Runnable runnable, i4b.f fVar2, int i) {
        this.f113273a = i;
        this.f113274b = fVar;
        this.f113275c = runnable;
        this.d = fVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f113273a) {
            case 0:
                ExecutorService executorService = this.f113274b.f113276a;
                final int i = 0;
                final Runnable runnable = this.f113275c;
                final i4b.f fVar = this.d;
                executorService.execute(new Runnable() { // from class: de.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    fVar.n(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    fVar.n(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i4b.f fVar2 = fVar;
                                try {
                                    runnable2.run();
                                    fVar2.m(null);
                                    return;
                                } catch (Exception e4) {
                                    fVar2.n(e4);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f113274b.f113276a;
                final int i2 = 2;
                final Runnable runnable2 = this.f113275c;
                final i4b.f fVar2 = this.d;
                executorService2.execute(new Runnable() { // from class: de.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    fVar2.n(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    fVar2.n(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i4b.f fVar22 = fVar2;
                                try {
                                    runnable22.run();
                                    fVar22.m(null);
                                    return;
                                } catch (Exception e4) {
                                    fVar22.n(e4);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f113274b.f113276a;
                final int i3 = 1;
                final Runnable runnable3 = this.f113275c;
                final i4b.f fVar3 = this.d;
                executorService3.execute(new Runnable() { // from class: de.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    fVar3.n(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    fVar3.n(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i4b.f fVar22 = fVar3;
                                try {
                                    runnable22.run();
                                    fVar22.m(null);
                                    return;
                                } catch (Exception e4) {
                                    fVar22.n(e4);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
