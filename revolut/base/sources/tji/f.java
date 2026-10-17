package tji;

import android.os.Looper;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import qfm.t2;
import sgm.j1;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f271786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f271787b;

    public f(d loadingDialogDisplayer, ArrayList delegates) {
        Intrinsics.checkNotNullParameter(loadingDialogDisplayer, "loadingDialogDisplayer");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f271786a = loadingDialogDisplayer;
        this.f271787b = delegates;
    }

    public final void a() {
        Iterator it8 = this.f271787b.iterator();
        while (it8.hasNext()) {
            ((i) it8.next()).b();
        }
    }

    public final void b(l dialogModel) {
        Object next;
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        Iterator it8 = this.f271787b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((i) next).a(dialogModel)) {
                    break;
                }
            }
        }
        i iVar = (i) next;
        if (iVar == null) {
            throw new IllegalStateException(a0.d.l(dialogModel.getClass(), "No displayer delegate found for "));
        }
        iVar.b();
    }

    public final void c() {
        View decorView;
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        d dVar = this.f271786a;
        if (looperMyLooper == mainLooper) {
            Window window = dVar.f271782a.getWindow();
            if (!((window == null || (decorView = window.getDecorView()) == null) ? false : decorView.isInLayout())) {
                int i = dVar.f271784c;
                if (i > 1) {
                    dVar.f271784c = i - 1;
                    return;
                }
                dVar.f271784c = 0;
                n nVar = dVar.d;
                if (nVar != null) {
                    nVar.dismiss();
                }
                dVar.d = null;
                return;
            }
        }
        dVar.e.post(new j1(dVar, 4));
    }

    public final rv6.e d(l dialogModel) {
        Object next;
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        Iterator it8 = this.f271787b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((i) next).a(dialogModel)) {
                break;
            }
        }
        i iVar = (i) next;
        if (iVar != null) {
            return (rv6.e) iVar.h(dialogModel);
        }
        throw new IllegalStateException(a0.d.l(dialogModel.getClass(), "No displayer delegate found for "));
    }

    public final void e(long j2) {
        View decorView;
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        d dVar = this.f271786a;
        if (looperMyLooper == mainLooper) {
            Window window = dVar.f271782a.getWindow();
            if (!((window == null || (decorView = window.getDecorView()) == null) ? false : decorView.isInLayout())) {
                d.a(dVar, j2);
                return;
            }
        }
        dVar.e.post(new t2(dVar, j2));
    }
}
