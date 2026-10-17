package skm;

import kotlin.Unit;
import yhm.m;

/* JADX INFO: loaded from: classes14.dex */
public final class t0 extends i1 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ t0(Object obj2, int i) {
        this.e = i;
        this.f = obj2;
    }

    @Override // skm.i1
    public final boolean i() {
        switch (this.e) {
        }
        return false;
    }

    @Override // skm.i1
    public final void j(Throwable th10) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ((r0) obj2).dispose();
                break;
            default:
                m.Companion companion = yhm.m.INSTANCE;
                ((l) obj2).resumeWith(Unit.f186387a);
                break;
        }
    }
}
