package ich;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import i2l.e0;
import i6f.h0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a f160288w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f160288w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f160288w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(this.f160288w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
            case 2:
                s sVar3 = new s(this.f160288w, continuation, 2);
                sVar3.v = obj2;
                return sVar3;
            default:
                s sVar4 = new s(this.f160288w, continuation, 3);
                sVar4.v = obj2;
                return sVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        int i = this.u;
        com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a aVar = this.f160288w;
        switch (i) {
            case 0:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    Object content = data2.getContent();
                    data = new Data(content != null ? ((zzg.g) content).f326735a : null, data2.getError(), data2.getLoading());
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                zzg.g gVar = (zzg.g) data2.getContent();
                zzg.f fVar = gVar != null ? gVar.f326736b : null;
                zzg.f fVar2 = zzg.f.FALLBACK;
                com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a aVar3 = this.f160288w;
                aVar3.H2(aVar3.A, new ard.t(data2, aVar3, data, (fVar == fVar2 || (aVar3.o.f95602a instanceof InstrumentsCollectionType.Related)) ? false : true, 10));
                break;
            case 1:
                List list = (List) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new e0(list, 6));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar = aVar.A;
                aVar.H2(yVar, new h0(data3, 18));
                List list2 = (List) data3.getContent();
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                if (!aVar.f226127l) {
                    aVar.H2(yVar, new e0(list2, 4));
                }
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.A, new h0(data4, 19));
                break;
        }
        return Unit.f186387a;
    }
}
