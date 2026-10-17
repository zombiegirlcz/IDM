package vx9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f292860b;

    public /* synthetic */ e(g gVar, int i) {
        this.f292859a = i;
        this.f292860b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f292859a) {
            case 0:
                List recents = (List) obj2;
                Intrinsics.checkNotNullParameter(recents, "recents");
                List list = recents;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(nx9.c.b((jq9.m) it8.next(), true));
                }
                g gVar = this.f292860b;
                efm.b bVarB = gVar.f292862b.b(arrayList);
                efm.b bVarFlatMapCompletable = efm.r.fromIterable(list).flatMapCompletable(new vx5.m(new e(gVar, 1), 8));
                Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
                return bVarB.e(bVarFlatMapCompletable);
            default:
                jq9.m recent = (jq9.m) obj2;
                Intrinsics.checkNotNullParameter(recent, "recent");
                f5j.a aVar = recent.f177508b;
                o71.a aVar2 = (o71.a) this.f292860b.f292863c;
                String id10 = aVar.f132329a;
                int i = aVar.f132345y;
                long j2 = aVar.z;
                Intrinsics.checkNotNullParameter(id10, "id");
                pfm.h hVar = new pfm.h(new ll3.b((r21.h) aVar2, id10, i, j2, 1), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return ue0.e.v(te0.w.g0(hVar));
        }
    }
}
