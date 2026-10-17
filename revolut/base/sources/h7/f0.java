package h7;

import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class f0 implements d7.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ skm.l f149781b;

    public /* synthetic */ f0(skm.l lVar, int i) {
        this.f149780a = i;
        this.f149781b = lVar;
    }

    @Override // d7.d0
    public final void onResult(Object obj2) {
        int i = this.f149780a;
        skm.l lVar = this.f149781b;
        switch (i) {
            case 0:
                if (!lVar.y()) {
                    m.Companion companion = yhm.m.INSTANCE;
                    lVar.resumeWith(obj2);
                }
                break;
            default:
                Throwable th10 = (Throwable) obj2;
                if (!lVar.y()) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    Intrinsics.h(th10);
                    lVar.resumeWith(yhm.o.a(th10));
                }
                break;
        }
    }
}
