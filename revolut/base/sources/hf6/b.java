package hf6;

import com.revolut.data.database.models.openbanking.ConsentEntity;
import com.revolut.data.database.models.openbanking.mapper.ConsentEntityMapperKt;
import com.revolut.domain.models.openbanking.ObaClient$AuthorizationFlow;
import if6.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f151756b;

    public /* synthetic */ b(i iVar, int i) {
        this.f151755a = i;
        this.f151756b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        byte[] bArrA;
        switch (this.f151755a) {
            case 0:
                i iVar = this.f151756b;
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return iVar.f;
            case 1:
                i iVar2 = this.f151756b;
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                List<ConsentEntity> allActive = iVar2.f151761b.getAllActive();
                ArrayList arrayList = new ArrayList(w.t(allActive, 10));
                Iterator<T> it10 = allActive.iterator();
                while (it10.hasNext()) {
                    arrayList.add(ConsentEntityMapperKt.toDomain((ConsentEntity) it10.next()));
                }
                return arrayList;
            case 2:
                i iVar3 = this.f151756b;
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (List) iVar3.d.get("AU_CONSENTS_CACHE_KEY");
            default:
                i iVar4 = this.f151756b;
                k dto = (k) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                tl0.a base64Wrapper = iVar4.f151762c;
                Intrinsics.checkNotNullParameter(dto, "<this>");
                Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
                String name = dto.getName();
                String picture = dto.getPicture();
                ObaClient$AuthorizationFlow obaClient$AuthorizationFlowValueOf = null;
                if (picture != null) {
                    try {
                        bArrA = base64Wrapper.a(d0.v0(picture, "base64,", picture));
                    } catch (Exception e) {
                        gom.e.f145194a.e(e);
                        bArrA = null;
                    }
                    break;
                } else {
                    bArrA = null;
                }
                try {
                    obaClient$AuthorizationFlowValueOf = ObaClient$AuthorizationFlow.valueOf(dto.getAuthorisationFlow());
                    break;
                } catch (Exception e2) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
                }
                if (obaClient$AuthorizationFlowValueOf == null) {
                    obaClient$AuthorizationFlowValueOf = ObaClient$AuthorizationFlow.DEFAULT;
                }
                return new x61.f(name, bArrA, obaClient$AuthorizationFlowValueOf);
        }
    }
}
