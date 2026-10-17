package n8a;

import com.revolut.data.model.Data;
import com.revolut.feature.pix.api.model.PixKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f213318w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                g gVar = new g(3, 0, (Continuation) obj4);
                gVar.v = (Data) obj2;
                gVar.f213318w = (String) obj3;
                return gVar.invokeSuspend(Unit.f186387a);
            case 1:
                g gVar2 = new g(3, 1, (Continuation) obj4);
                gVar2.v = (Data) obj2;
                gVar2.f213318w = (String) obj3;
                return gVar2.invokeSuspend(Unit.f186387a);
            default:
                g gVar3 = new g(3, 2, (Continuation) obj4);
                gVar3.f213318w = (String) obj2;
                gVar3.v = (Data) obj3;
                return gVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList = null;
        switch (this.u) {
            case 0:
                Data data = this.v;
                String str = this.f213318w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    Object content = data.getContent();
                    return new Data(content != null ? new PixKeys(str, (List) content) : null, data.getError(), data.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data.getLoading());
                }
            case 1:
                Data data2 = this.v;
                String str2 = this.f213318w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new Pair(data2, str2);
            default:
                String str3 = this.f213318w;
                Data data3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) data3.getContent();
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        ogd.e eVar = (ogd.e) obj3;
                        if (kotlin.text.a0.H(eVar.f225109a.f86864b, str3, true) || jli.g.a(eVar.f225109a.f86865c, str3)) {
                            arrayList.add(obj3);
                        }
                    }
                }
                return Data.copy$default(data3, arrayList, null, false, 6, null);
        }
    }
}
