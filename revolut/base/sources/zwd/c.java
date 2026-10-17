package zwd;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nkm.d0;
import nkm.y;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e[] f325952a;

    public c(e... validators) {
        Intrinsics.checkNotNullParameter(validators, "validators");
        this.f325952a = validators;
    }

    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        Object objInvoke;
        d0 d0VarX = y.x(kotlin.collections.d.E(this.f325952a), new sx4.b(obj2, 26));
        Iterator it8 = d0VarX.f216835a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                objInvoke = null;
                break;
            }
            objInvoke = d0VarX.f216836b.invoke(it8.next());
            if (!((List) objInvoke).isEmpty()) {
                break;
            }
        }
        List list = (List) objInvoke;
        if (list == null) {
            list = f0.f322471a;
        }
        return new yqi.d(obj2, list);
    }
}
