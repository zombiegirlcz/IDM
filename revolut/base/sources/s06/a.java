package s06;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wli.d f258844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f258845b;

    public a(wli.d registry, p dummyActionPerformer) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(dummyActionPerformer, "dummyActionPerformer");
        this.f258844a = registry;
        this.f258845b = dummyActionPerformer;
    }

    public final jf0.d a(jf0.c deeplink) {
        jf0.d dVar;
        IllegalArgumentException illegalArgumentException;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        wli.d dVar2 = this.f258844a;
        List list = (List) dVar2.a().get(deeplink.e(1));
        jf0.d dVar3 = null;
        if (list != null) {
            Iterator it8 = list.iterator();
            do {
                jf0.d dVar4 = null;
                while (it8.hasNext()) {
                    b60.c cVarA = ((zli.c) it8.next()).a();
                    jf0.d dVar5 = cVarA instanceof jf0.d ? (jf0.d) cVarA : null;
                    if (dVar5 == null || !dVar5.a(deeplink)) {
                        dVar5 = null;
                    }
                    if (dVar4 == null || dVar5 == null || dVar4.getClass().equals(dVar5.getClass())) {
                        dVar4 = dVar5;
                    } else {
                        illegalArgumentException = new IllegalArgumentException("DeeplinkActionPerformer conflicting for path " + deeplink.f173629c + ". " + dVar4.getClass() + " " + dVar5.getClass() + " ");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                        od0.a aVar = od0.a.f224253a;
                        if (!od0.a.f() || od0.a.d()) {
                            illegalArgumentException = null;
                        }
                    }
                }
                if (dVar4 != null) {
                    return dVar4;
                }
            } while (illegalArgumentException == null);
            throw illegalArgumentException;
        }
        Iterator it9 = dVar2.a().values().iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Iterator it10 = ((List) it9.next()).iterator();
            while (true) {
                if (!it10.hasNext()) {
                    dVar = null;
                    break;
                }
                b60.c cVarA2 = ((zli.c) it10.next()).a();
                dVar = cVarA2 instanceof jf0.d ? (jf0.d) cVarA2 : null;
                if (dVar == null || !dVar.a(deeplink)) {
                    dVar = null;
                }
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                dVar3 = dVar;
                break;
            }
        }
        return dVar3 == null ? this.f258845b : dVar3;
    }
}
