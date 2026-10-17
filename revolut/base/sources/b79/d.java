package b79;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f12941b;

    public /* synthetic */ d(m mVar, int i) {
        this.f12940a = i;
        this.f12941b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f12940a) {
            case 0:
                m mVar = this.f12941b;
                a79.m response = (a79.m) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                ArrayList arrayListL = mVar.f12961c.l(response.getMessages());
                mVar.i.b("time_based_cache");
                return arrayListL;
            case 1:
                m mVar2 = this.f12941b;
                String key = (String) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                Long l2 = (Long) mVar2.d.get(key);
                return Long.valueOf(l2 != null ? l2.longValue() : 0L);
            case 2:
                m mVar3 = this.f12941b;
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) mVar3.d.get("inbox_items");
            case 3:
                m mVar4 = this.f12941b;
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return mVar4.f12961c.m(mVar4.f12959a.a());
            default:
                m mVar5 = this.f12941b;
                s69.j params = (s69.j) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return params.f260172a == null ? mVar5.f : (List) mVar5.f12962g.c(params);
        }
    }
}
