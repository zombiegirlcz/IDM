package jh;

import ce.t;
import ce.v;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e implements OnFailureListener, ce.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f174106a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e f174107b = new e();

    @Override // ce.f
    public Object m(v vVar) {
        Set setG = vVar.g(t.a(d.class));
        e eVar = new e();
        new HashMap();
        new HashMap();
        Iterator it8 = setG.iterator();
        if (!it8.hasNext()) {
            return eVar;
        }
        a0.d.B(it8.next());
        throw null;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc2) {
        c.e.e("MobileVisionBase", "Error preloading model resource", exc2);
    }
}
