package ami;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f6455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f6456b;

    public l(d4m.a featureGateways) {
        Intrinsics.checkNotNullParameter(featureGateways, "featureGateways");
        this.f6455a = featureGateways;
        this.f6456b = new CopyOnWriteArrayList();
    }

    public final k a(zli.b bVar) {
        Set<xii.b> setH;
        CopyOnWriteArrayList<xii.b> copyOnWriteArrayList = this.f6456b;
        for (xii.b bVar2 : copyOnWriteArrayList) {
            for (String str : bVar2.a()) {
                lg0.e eVarQ = n14.e.Q(bVar, str);
                if (eVarQ != null) {
                    k kVar = new k(bVar2, str, eVarQ);
                    copyOnWriteArrayList.addIfAbsent(bVar2);
                    return kVar;
                }
            }
        }
        Iterator it8 = ((yhi.a) this.f6455a.get()).f314167a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                return null;
            }
            nhi.f fVar = (nhi.f) it8.next();
            aii.p pVar = fVar instanceof aii.p ? (aii.p) fVar : null;
            if (pVar != null && (setH = pVar.h()) != null) {
                for (xii.b bVar3 : setH) {
                    for (String str2 : bVar3.a()) {
                        lg0.e eVarQ2 = n14.e.Q(bVar, str2);
                        if (eVarQ2 != null) {
                            k kVar2 = new k(bVar3, str2, eVarQ2);
                            copyOnWriteArrayList.addIfAbsent(bVar3);
                            return kVar2;
                        }
                    }
                }
            }
        }
    }
}
