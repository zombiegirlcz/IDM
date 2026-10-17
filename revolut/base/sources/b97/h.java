package b97;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wa7.m;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f13690b;

    public /* synthetic */ h(l lVar, int i) {
        this.f13689a = i;
        this.f13690b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f13689a) {
            case 0:
                List records = (List) obj2;
                Intrinsics.checkNotNullParameter(records, "records");
                l lVar = this.f13690b;
                ArrayList arrayListC = lVar.c(records);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : arrayListC) {
                    p56.a aVar = lVar.d;
                    String text = ((j97.a) obj3).f172309a;
                    Intrinsics.checkNotNullParameter(text, "text");
                    if (!((m) aVar.f233024b).e(text)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            default:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) this.f13690b.f13694a.get("global_search_recent_queries_v1");
        }
    }
}
