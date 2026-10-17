package mv9;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import noi.l;
import ss4.z;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f209171b;

    public /* synthetic */ c(k kVar, int i) {
        this.f209170a = i;
        this.f209171b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ArrayList arrayList;
        switch (this.f209170a) {
            case 0:
                List messages = (List) obj2;
                Intrinsics.checkNotNullParameter(messages, "messages");
                k kVar = this.f209171b;
                return new ufm.i(new ufm.i(kVar.d.a(messages), new h(9, new c(kVar, 4)), 0), new msb.e(10, new c(kVar, 1)), 1);
            case 1:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list = it8;
                kpj.f fVar = this.f209171b.f209191h;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(fVar.o((kv9.h) it9.next()));
                }
                return arrayList2;
            case 2:
                kv9.h message = (kv9.h) obj2;
                Intrinsics.checkNotNullParameter(message, "reactionDto");
                sv9.a aVar = this.f209171b.d;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                rfm.j jVar = new rfm.j(aVar.a(u.c(message)), new sp5.h(19, new z(13)), 2);
                Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
                return jVar;
            case 3:
                Data messages2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(messages2, "it");
                this.f209171b.f.getClass();
                Intrinsics.checkNotNullParameter(messages2, "messages");
                List list2 = (List) messages2.getContent();
                if (list2 != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!(((MessageItem) obj3).getF79535h() instanceof MessageType.Key)) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    arrayList = null;
                }
                return Data.copy$default(messages2, arrayList, null, false, 6, null);
            default:
                List messageDtos = (List) obj2;
                Intrinsics.checkNotNullParameter(messageDtos, "it");
                kdh.b bVar = this.f209171b.e;
                Intrinsics.checkNotNullParameter(messageDtos, "messageDtos");
                int i = 13;
                ufm.i iVar = new ufm.i(new ufm.c(new d73.a(messageDtos, 3), 2), new l(i, new nrd.g(bVar, i)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
        }
    }
}
