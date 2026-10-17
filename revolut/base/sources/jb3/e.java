package jb3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f172583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f172584c;

    public /* synthetic */ e(j jVar, k kVar, int i) {
        this.f172582a = i;
        this.f172583b = jVar;
        this.f172584c = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f172582a) {
            case 0:
                hb3.f dto = (hb3.f) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                hb3.c cVar = this.f172583b.f172589b;
                co3.a userLocation = this.f172584c.f172591a;
                Intrinsics.checkNotNullParameter(userLocation, "userLocation");
                Intrinsics.checkNotNullParameter(dto, "dto");
                List locations = dto.getLocations();
                ArrayList arrayList = new ArrayList(w.t(locations, 10));
                Iterator it8 = locations.iterator();
                while (it8.hasNext()) {
                    arrayList.add(cVar.a((hb3.e) it8.next(), userLocation, dto.getUserLastLocationTime()));
                }
                return arrayList;
            default:
                List dtos = (List) obj2;
                Intrinsics.checkNotNullParameter(dtos, "dtos");
                hb3.c cVar2 = this.f172583b.f172589b;
                co3.a userLocation2 = this.f172584c.f172591a;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(userLocation2, "userLocation");
                Intrinsics.checkNotNullParameter(dtos, "dtos");
                List list = dtos;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(cVar2.a((hb3.e) it9.next(), userLocation2, null));
                }
                return arrayList2;
        }
    }
}
