package tji;

import android.app.Dialog;
import java.util.ArrayList;
import java.util.Iterator;
import knd.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tji.j;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f271790a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f271791b = q.b(16, 1, ukm.f.DROP_OLDEST);

    public abstract boolean a(l lVar);

    public abstract void b();

    public void c() {
    }

    public void d() {
    }

    public void e() {
        ArrayList arrayList = this.f271790a;
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((Dialog) it8.next()).dismiss();
        }
        arrayList.clear();
    }

    public void f() {
    }

    public final void g(m result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f271791b.k(new k(result));
    }

    public final Flow h(l dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        i(dialogModel);
        Iterator it8 = nhi.k.d.iterator();
        while (it8.hasNext()) {
            ((tta.b) it8.next()).a(dialogModel);
        }
        j.a aVar = j.a.f271792a;
        z1 z1Var = this.f271791b;
        z1Var.k(aVar);
        return new rv6.e(new rv6.e(new g0(z1Var, new qkg.a(), 1), 15), 14);
    }

    public abstract void i(l lVar);
}
