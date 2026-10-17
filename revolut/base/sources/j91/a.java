package j91;

import java.util.ArrayList;
import java.util.List;
import k91.b;
import kotlin.jvm.internal.Intrinsics;
import u91.c;
import u91.d;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final d a(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        u91.b bVar2 = new u91.b(bVar.getTitle(), bVar.getSubtitle(), bVar.getBackgroundImageUrl());
        List<b.a> steps = bVar.getSteps();
        ArrayList arrayList = new ArrayList(w.t(steps, 10));
        for (b.a aVar : steps) {
            arrayList.add(new c(aVar.getTitle(), aVar.getSubtitle(), aVar.getLogo()));
        }
        List<b.a> productOffer = bVar.getProductOffer();
        ArrayList arrayList2 = new ArrayList(w.t(productOffer, 10));
        for (b.a aVar2 : productOffer) {
            arrayList2.add(new c(aVar2.getTitle(), aVar2.getSubtitle(), aVar2.getLogo()));
        }
        List<b.a> progress = bVar.getProgress();
        ArrayList arrayList3 = new ArrayList(w.t(progress, 10));
        for (b.a aVar3 : progress) {
            arrayList3.add(new c(aVar3.getTitle(), aVar3.getSubtitle(), aVar3.getLogo()));
        }
        return new d(bVar2, arrayList, arrayList2, arrayList3);
    }
}
