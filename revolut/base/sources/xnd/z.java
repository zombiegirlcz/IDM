package xnd;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lmd.a f307470a;

    public z(lmd.a analyticsInteractor) {
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        this.f307470a = analyticsInteractor;
    }

    public static final yld.c a(z zVar, Map map, yld.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return (yld.c) map.getOrDefault(dVar, hx7.q.b0(dVar).a());
    }

    public final wyd.f b(yld.d... dVarArr) {
        ArrayList arrayList = new ArrayList(dVarArr.length);
        for (yld.d screenType : dVarArr) {
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            arrayList.add(rd0.e.e(this.f307470a.f196949a.b(hx7.q.b0(screenType)), zhm.h0.f322473a, new wqj.g(screenType, null, 8)));
        }
        return new wyd.f((Flow[]) zhm.d0.d1(arrayList).toArray(new Flow[0]), dVarArr, 17);
    }
}
