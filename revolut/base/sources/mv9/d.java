package mv9;

import androidx.room.util.DBUtil;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f209173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessageItem f209174c;

    public /* synthetic */ d(k kVar, MessageItem messageItem, int i) {
        this.f209172a = i;
        this.f209173b = kVar;
        this.f209174c = messageItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f209172a) {
            case 0:
                kv9.h hVar = (kv9.h) obj2;
                k kVar = this.f209173b;
                gv9.c cVar = kVar.f209188b;
                String str = this.f209174c.f79531a;
                kpj.f fVar = kVar.f209191h;
                Intrinsics.h(hVar);
                gv9.j jVar = (gv9.j) cVar;
                DBUtil.performBlocking(jVar.f147114a, false, true, new gv9.h(jVar, fVar.o(hVar), str));
                return Unit.f186387a;
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return gv9.c.a(this.f209173b.f209188b, this.f209174c.f79531a, dv9.d.ERROR.getId(), null, null, null, 28);
        }
    }
}
