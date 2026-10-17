package zfe;

import android.content.Context;
import jge.j;
import jge.m;
import vc.s;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f321946a = new d();

    private d() {
    }

    public static e a(Context context) {
        phm.a aVar = (phm.a) kii.e.l(context, "context", context, j.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
        }
        e eVarG = ((m) ((j) aVar2.b()).e).g();
        s.j(eVarG);
        return eVarG;
    }
}
