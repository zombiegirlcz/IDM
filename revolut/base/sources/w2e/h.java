package w2e;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.store.api.model.StoreMegaFiltersResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f294033w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f294033w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f294033w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f294033w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        int i = this.u;
        i iVar = this.f294033w;
        switch (i) {
            case 0:
                y yVar = iVar.f294036r;
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                StoreMegaFiltersResponse storeMegaFiltersResponse = (StoreMegaFiltersResponse) data.getContent();
                arrayList = storeMegaFiltersResponse != null ? storeMegaFiltersResponse.f88545a : null;
                iVar.H2(yVar, new j87.h(data, arrayList != null ? i.I2(iVar, ((a) ((j2) yVar.f22677a).getValue()).f294026b, iVar.f294035q.f139971a, arrayList) : ((a) ((j2) yVar.f22677a).getValue()).f294026b, arrayList, 1));
                break;
            default:
                y yVar2 = iVar.f294036r;
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                StoreMegaFiltersResponse storeMegaFiltersResponse2 = (StoreMegaFiltersResponse) data2.getContent();
                arrayList = storeMegaFiltersResponse2 != null ? storeMegaFiltersResponse2.f88545a : null;
                iVar.H2(yVar2, new j87.h(data2, arrayList != null ? i.I2(iVar, ((a) ((j2) yVar2.f22677a).getValue()).f294026b, iVar.f294035q.f139971a, arrayList) : ((a) ((j2) yVar2.f22677a).getValue()).f294026b, arrayList, 2));
                break;
        }
        return Unit.f186387a;
    }
}
