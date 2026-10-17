package wsg;

import atg.v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f299716b;

    public /* synthetic */ d(n nVar, int i) {
        this.f299715a = i;
        this.f299716b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f299715a) {
            case 0:
                String registeredIdentityId = (String) obj2;
                Intrinsics.checkNotNullParameter(registeredIdentityId, "it");
                v vVar = (v) this.f299716b.f299736b;
                Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.w(u1.d(vVar.k(registeredIdentityId, loadingStrategy), vVar.n("PARAM_ALL_WALLETS", loadingStrategy)), new arf.h(15));
            default:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ez5.b bVar = this.f299716b.e;
                dz5.b bVar2 = dz5.b.EXTERNAL_POCKETS;
                List<io3.d> list = pockets;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (io3.d dVar : list) {
                    arrayList.add(new Pair(dVar.f163145a, dVar));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r0.x(arrayList, linkedHashMap);
                return ez5.b.a(bVar, bVar2, linkedHashMap, new com.google.android.material.color.utilities.g(12), null, 8);
        }
    }
}
