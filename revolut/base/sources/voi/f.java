package voi;

import sri.o;
import voi.i;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class f implements yk0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f290970b;

    public /* synthetic */ f(i iVar, int i) {
        this.f290969a = i;
        this.f290970b = iVar;
    }

    @Override // yk0.c
    public final Object get() {
        int i = this.f290969a;
        i iVar = this.f290970b;
        switch (i) {
            case 0:
                i.a aVar = i.Companion;
                return o.c(iVar, null, null, 14);
            default:
                i.a aVar2 = i.Companion;
                return iVar.d().b();
        }
    }
}
