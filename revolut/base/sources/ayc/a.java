package ayc;

import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreen$V2;
import com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params;
import gr2.y;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f11121b;

    public /* synthetic */ a(i iVar, int i) {
        this.f11120a = i;
        this.f11121b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        FincrimeHomeScreen$V2 fincrimeHomeScreen$V2;
        switch (this.f11120a) {
            case 0:
                List list = (List) obj2;
                ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("ticketIds", list);
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    e eVar = (e) this.f11121b.f11131c.get(i.d(new EntityConfigRepository$Params.Ticket((String) it8.next())));
                    if (eVar == null) {
                        return null;
                    }
                    arrayListY.add(eVar);
                }
                return arrayListY;
            case 1:
                String param = (String) obj2;
                Intrinsics.checkNotNullParameter(param, "param");
                return (e) v7.r("MEMORY_CACHE_CHARGEBACK_ENTITY_CONFIG_WRAPPER_KEY", param, this.f11121b.f11131c);
            case 2:
                String params = (String) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (e) j6.a.k(e.class, this.f11121b.f11129a, j6.a.q("MEMORY_CACHE_CHARGEBACK_ENTITY_CONFIG_WRAPPER_KEY", params));
            case 3:
                e wrapper = (e) obj2;
                Intrinsics.checkNotNullParameter(wrapper, "wrapper");
                y yVar = wrapper.f11125a;
                if (yVar == null) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                fr2.c cVarF = ((hr2.c) this.f11121b.e).f(yVar);
                if (!(cVarF instanceof FincrimeHomeScreen$V2)) {
                    throw new IllegalStateException(fr2.b.class.getName().concat(" is not supported for chargeback sections").toString());
                }
                od0.i.Companion.getClass();
                return od0.h.a(cVarF);
            case 4:
                y entityConfigDto = (y) obj2;
                Intrinsics.checkNotNullParameter(entityConfigDto, "entityConfigDto");
                return ((hr2.c) this.f11121b.e).f(entityConfigDto);
            case 5:
                List content = (List) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                ArrayList arrayList = new ArrayList();
                Iterator it9 = content.iterator();
                while (it9.hasNext()) {
                    y yVar2 = ((e) it9.next()).f11125a;
                    if (yVar2 != null) {
                        fr2.c cVarF2 = ((hr2.c) this.f11121b.e).f(yVar2);
                        if (!(cVarF2 instanceof FincrimeHomeScreen$V2)) {
                            throw new IllegalStateException("Unsupported landing page version for tickets");
                        }
                        fincrimeHomeScreen$V2 = (FincrimeHomeScreen$V2) cVarF2;
                    } else {
                        fincrimeHomeScreen$V2 = null;
                    }
                    if (fincrimeHomeScreen$V2 != null) {
                        arrayList.add(fincrimeHomeScreen$V2);
                    }
                }
                return arrayList;
            default:
                EntityConfigRepository$Params params2 = (EntityConfigRepository$Params) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                e eVar2 = (e) this.f11121b.f11131c.get(i.d(params2));
                if (eVar2 != null) {
                    return eVar2.f11125a;
                }
                return null;
        }
    }
}
