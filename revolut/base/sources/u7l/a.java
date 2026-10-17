package u7l;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.event_appearance.api.models.EventAppearance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.r;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f277977b;

    public /* synthetic */ a(c cVar, int i) {
        this.f277976a = i;
        this.f277977b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        q7l.b bVar;
        Object next;
        switch (this.f277976a) {
            case 0:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return (data.getContent() != null || data.getLoading()) ? data : Data.copy$default(data, this.f277977b.e, null, false, 6, null);
            default:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                EventAppearance eventAppearance = (EventAppearance) rVar.f314201a;
                boolean zBooleanValue = ((Boolean) rVar.f314202b).booleanValue();
                p7l.a aVar = (p7l.a) rVar.f314203c;
                String str = eventAppearance.f104713a;
                c cVar = this.f277977b;
                LinkedHashMap linkedHashMap = cVar.d;
                Object obj3 = null;
                if (zBooleanValue) {
                    Collection collectionValues = linkedHashMap.values();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : collectionValues) {
                        q7l.b bVar2 = (q7l.b) obj4;
                        if (bVar2.c(aVar) && bVar2.d()) {
                            arrayList.add(obj4);
                        }
                    }
                    Iterator it8 = arrayList.iterator();
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (it8.hasNext()) {
                            int iA = ((q7l.b) next).a().a();
                            do {
                                Object next2 = it8.next();
                                int iA2 = ((q7l.b) next2).a().a();
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it8.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    bVar = (q7l.b) next;
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    q7l.b bVar3 = (q7l.b) linkedHashMap.get(str);
                    bVar = (bVar3 == null || !bVar3.c(aVar)) ? null : bVar3;
                    if (bVar == null) {
                        Iterator it9 = linkedHashMap.values().iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                Object next3 = it9.next();
                                q7l.b bVar4 = (q7l.b) next3;
                                if (bVar4.c(aVar) && !bVar4.d()) {
                                    obj3 = next3;
                                }
                            }
                        }
                        bVar = (q7l.b) obj3;
                        if (bVar == null) {
                            bVar = cVar.f277980a;
                        }
                    }
                }
                return bVar.e(aVar);
        }
    }
}
