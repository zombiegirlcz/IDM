package rxb;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import vxb.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f258114b;

    public /* synthetic */ c(l lVar, int i) {
        this.f258113a = i;
        this.f258114b = lVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f258113a) {
            case 0:
                l lVar = this.f258114b;
                synchronized (lVar.f) {
                    lVar.f258131g = null;
                    Unit unit = Unit.f186387a;
                }
                return;
            default:
                l lVar2 = this.f258114b;
                try {
                    lVar2.e.set(true);
                    lVar2.f258129b.h().b(new d0("isAllHistoryFetched", true));
                    return;
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return;
                }
        }
    }
}
