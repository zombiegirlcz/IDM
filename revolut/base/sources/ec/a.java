package ec;

import ac.h;
import ag.p;
import android.graphics.drawable.Drawable;
import android.view.View;
import aw0.gb;
import java.util.logging.Logger;
import mx0.hd;
import zb.i;
import zb.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f124392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f124393c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f124391a = i;
        this.f124392b = obj2;
        this.f124393c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f124391a) {
            case 0:
                b bVar = (b) this.f124392b;
                j jVar = (j) this.f124393c;
                String str = jVar.f320780a;
                wb.j jVar2 = (wb.j) this.d;
                i iVar = (i) this.e;
                bVar.getClass();
                Logger logger = b.f;
                try {
                    h hVarA = bVar.f124396c.a(str);
                    if (hVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        jVar2.c(new IllegalArgumentException(str2));
                    } else {
                        ((gc.j) bVar.e).j(new p(bVar, 5, jVar, ((xb.c) hVarA).a(iVar)));
                        jVar2.c(null);
                    }
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    jVar2.c(e);
                    return;
                }
                break;
            default:
                ppi.c cVar = (ppi.c) this.f124392b;
                gb gbVar = (gb) this.f124393c;
                View view = (View) this.d;
                Drawable drawable = (Drawable) this.e;
                hd hdVar = cVar.k;
                if (hdVar != null) {
                    hd.b(hdVar, gbVar, view, new pe2.c(drawable, cVar, 22));
                }
                break;
        }
    }
}
