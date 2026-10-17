package r18;

import com.revolut.data.model.Data;
import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a18.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            m mVar = this.v;
            Data data = (Data) ((j2) mVar.f250923p.f22677a).getValue();
            FeedFilter feedFilter = (data == null || (aVar = (a18.a) data.getContent()) == null) ? null : aVar.f558b;
            FeedFilter.ByAssetFilter byAssetFilter = feedFilter instanceof FeedFilter.ByAssetFilter ? (FeedFilter.ByAssetFilter) feedFilter : null;
            if (byAssetFilter == null) {
                return Unit.f186387a;
            }
            jt0.b bVar = mVar.f250920l;
            m.Companion.getClass();
            List list = m.f250919r;
            Set set = byAssetFilter.f76423a;
            this.u = 1;
            Object objG = ((k18.c) bVar.f178266c).g(list, set, 50, this);
            if (objG != aVar2) {
                objG = Unit.f186387a;
            }
            if (objG == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
