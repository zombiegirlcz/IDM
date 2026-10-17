package atg;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f9041b;

    public /* synthetic */ a(h hVar, int i) {
        this.f9040a = i;
        this.f9041b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        fo3.d dVar;
        switch (this.f9040a) {
            case 0:
                ro3.k walletDto = (ro3.k) obj2;
                Intrinsics.checkNotNullParameter(walletDto, "walletDto");
                h hVar = this.f9041b;
                go3.b bVar = hVar.f9051b;
                return hVar.h(new Pair(((go3.d) bVar).a(walletDto), ((go3.d) bVar).f(walletDto)));
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f9041b.c();
            case 2:
                String str = (String) obj2;
                String strT = a10.b.t(str, "walletId", "WALLET_", str);
                String strQ = j6.a.q("POCKETS_", str);
                h hVar2 = this.f9041b;
                ne0.d dVar2 = hVar2.f9052c;
                dVar2.remove(strT);
                dVar2.remove(strQ);
                xe0.e eVar = hVar2.d;
                eVar.I0(strT);
                eVar.I0(strQ);
                return Unit.f186387a;
            case 3:
                h hVar3 = this.f9041b;
                go3.b bVar2 = hVar3.f9051b;
                Map walletsDto = (Map) obj2;
                Intrinsics.checkNotNullParameter(walletsDto, "walletsDto");
                ArrayList arrayList = new ArrayList(walletsDto.size());
                for (Map.Entry entry : walletsDto.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    fo3.d[] dVarArrValues = fo3.d.values();
                    int length = dVarArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            dVar = dVarArrValues[i];
                            if (!a0.z(dVar.name(), str2, true)) {
                                i++;
                            }
                        } else {
                            dVar = null;
                        }
                    }
                    if (dVar == null) {
                        dVar = fo3.d.UNKNOWN;
                    }
                    List<ro3.k> list2 = list;
                    ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                    for (ro3.k kVar : list2) {
                        arrayList2.add(hVar3.h(new Pair(((go3.d) bVar2).a(kVar), ((go3.d) bVar2).f(kVar))));
                    }
                    arrayList.add(new Pair(dVar, arrayList2));
                }
                return r0.t(arrayList);
            default:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return this.f9041b.b();
        }
    }
}
