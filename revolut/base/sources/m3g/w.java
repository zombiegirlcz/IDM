package m3g;

import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchAttraction;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b f202560b;

    public /* synthetic */ w(com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b bVar, int i) {
        this.f202559a = i;
        this.f202560b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        switch (this.f202559a) {
            case 0:
                v1g.f output = (v1g.f) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b bVar = this.f202560b;
                if (!Intrinsics.f(((n) bVar.t2()).f202545g.f92822c, output.f285311a)) {
                    bVar.x2(new m11.h(output, 12));
                    bVar.A2();
                }
                return Unit.f186387a;
            case 1:
                g2g.m it8 = (g2g.m) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b bVar2 = this.f202560b;
                if (!Intrinsics.f(((n) bVar2.t2()).f202545g, it8.f140058a)) {
                    bVar2.x2(new m11.h(it8, 13));
                    bVar2.A2();
                }
                return Unit.f186387a;
            case 2:
                final k3g.k outputData = (k3g.k) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean z = outputData instanceof k3g.g;
                com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b bVar3 = this.f202560b;
                if (z) {
                    bVar3.v2(new q(null, ((n) bVar3.t2()).f202543b, ((k3g.g) outputData).f180717a));
                } else {
                    if (outputData instanceof k3g.f) {
                        m mVar = ((n) bVar3.t2()).f202542a;
                        k kVar = mVar instanceof k ? (k) mVar : null;
                        str = kVar != null ? kVar.f202539a : null;
                        TravelSearchDestination travelSearchDestination = ((k3g.f) outputData).f180716a;
                        if (!(str != null ? str.equals(travelSearchDestination.f92888a) : false)) {
                            bVar3.z2(new LocationId.DestinationId(travelSearchDestination.f92888a), true);
                        }
                        final int i = 0;
                        bVar3.x2(new Function1() { // from class: m3g.v
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                switch (i) {
                                    case 0:
                                        n updateState = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                        TravelSearchDestination travelSearchDestination2 = ((k3g.f) outputData).f180716a;
                                        return n.a(updateState, new k(travelSearchDestination2.f92888a, travelSearchDestination2.f92889b), null, null, null, null, null, null, null, null, false, 1022);
                                    case 1:
                                        n updateState2 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                                        k3g.j jVar = (k3g.j) outputData;
                                        return n.a(updateState2, new k(jVar.f180722a, jVar.f180724c), jVar.d, null, null, null, null, null, null, null, false, 1020);
                                    case 2:
                                        n updateState3 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                                        k3g.i iVar = (k3g.i) outputData;
                                        return n.a(updateState3, new j(iVar.f180719a, iVar.f180720b), iVar.f180721c, null, null, null, null, null, null, null, false, 1020);
                                    case 3:
                                        n updateState4 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                                        return n.a(updateState4, new l(((k3g.h) outputData).f180718a), null, null, null, null, null, null, null, null, false, 1022);
                                    default:
                                        n updateState5 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                                        TravelSearchAttraction travelSearchAttraction = ((k3g.e) outputData).f180715a;
                                        return n.a(updateState5, new j(travelSearchAttraction.f92885a, travelSearchAttraction.f92886b), null, null, null, null, null, null, null, null, false, 1022);
                                }
                            }
                        });
                        bVar3.A2();
                    } else if (outputData instanceof k3g.j) {
                        m mVar2 = ((n) bVar3.t2()).f202542a;
                        k kVar2 = mVar2 instanceof k ? (k) mVar2 : null;
                        str = kVar2 != null ? kVar2.f202539a : null;
                        String str2 = ((k3g.j) outputData).f180722a;
                        if (!(str != null ? str.equals(str2) : false)) {
                            bVar3.z2(new LocationId.DestinationId(str2), true);
                        }
                        final int i2 = 1;
                        bVar3.x2(new Function1() { // from class: m3g.v
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                switch (i2) {
                                    case 0:
                                        n updateState = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                        TravelSearchDestination travelSearchDestination2 = ((k3g.f) outputData).f180716a;
                                        return n.a(updateState, new k(travelSearchDestination2.f92888a, travelSearchDestination2.f92889b), null, null, null, null, null, null, null, null, false, 1022);
                                    case 1:
                                        n updateState2 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                                        k3g.j jVar = (k3g.j) outputData;
                                        return n.a(updateState2, new k(jVar.f180722a, jVar.f180724c), jVar.d, null, null, null, null, null, null, null, false, 1020);
                                    case 2:
                                        n updateState3 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                                        k3g.i iVar = (k3g.i) outputData;
                                        return n.a(updateState3, new j(iVar.f180719a, iVar.f180720b), iVar.f180721c, null, null, null, null, null, null, null, false, 1020);
                                    case 3:
                                        n updateState4 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                                        return n.a(updateState4, new l(((k3g.h) outputData).f180718a), null, null, null, null, null, null, null, null, false, 1022);
                                    default:
                                        n updateState5 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                                        TravelSearchAttraction travelSearchAttraction = ((k3g.e) outputData).f180715a;
                                        return n.a(updateState5, new j(travelSearchAttraction.f92885a, travelSearchAttraction.f92886b), null, null, null, null, null, null, null, null, false, 1022);
                                }
                            }
                        });
                        bVar3.A2();
                    } else if (outputData instanceof k3g.i) {
                        m mVar3 = ((n) bVar3.t2()).f202542a;
                        j jVar = mVar3 instanceof j ? (j) mVar3 : null;
                        str = jVar != null ? jVar.f202537a : null;
                        String str3 = ((k3g.i) outputData).f180719a;
                        if (!(str != null ? str.equals(str3) : false)) {
                            bVar3.z2(new LocationId.AttractionId(str3), true);
                        }
                        final int i3 = 2;
                        bVar3.x2(new Function1() { // from class: m3g.v
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                switch (i3) {
                                    case 0:
                                        n updateState = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                        TravelSearchDestination travelSearchDestination2 = ((k3g.f) outputData).f180716a;
                                        return n.a(updateState, new k(travelSearchDestination2.f92888a, travelSearchDestination2.f92889b), null, null, null, null, null, null, null, null, false, 1022);
                                    case 1:
                                        n updateState2 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                                        k3g.j jVar2 = (k3g.j) outputData;
                                        return n.a(updateState2, new k(jVar2.f180722a, jVar2.f180724c), jVar2.d, null, null, null, null, null, null, null, false, 1020);
                                    case 2:
                                        n updateState3 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                                        k3g.i iVar = (k3g.i) outputData;
                                        return n.a(updateState3, new j(iVar.f180719a, iVar.f180720b), iVar.f180721c, null, null, null, null, null, null, null, false, 1020);
                                    case 3:
                                        n updateState4 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                                        return n.a(updateState4, new l(((k3g.h) outputData).f180718a), null, null, null, null, null, null, null, null, false, 1022);
                                    default:
                                        n updateState5 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                                        TravelSearchAttraction travelSearchAttraction = ((k3g.e) outputData).f180715a;
                                        return n.a(updateState5, new j(travelSearchAttraction.f92885a, travelSearchAttraction.f92886b), null, null, null, null, null, null, null, null, false, 1022);
                                }
                            }
                        });
                        bVar3.A2();
                    } else if (outputData instanceof k3g.h) {
                        bVar3.z2(null, true);
                        final int i5 = 3;
                        bVar3.x2(new Function1() { // from class: m3g.v
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                switch (i5) {
                                    case 0:
                                        n updateState = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                        TravelSearchDestination travelSearchDestination2 = ((k3g.f) outputData).f180716a;
                                        return n.a(updateState, new k(travelSearchDestination2.f92888a, travelSearchDestination2.f92889b), null, null, null, null, null, null, null, null, false, 1022);
                                    case 1:
                                        n updateState2 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                                        k3g.j jVar2 = (k3g.j) outputData;
                                        return n.a(updateState2, new k(jVar2.f180722a, jVar2.f180724c), jVar2.d, null, null, null, null, null, null, null, false, 1020);
                                    case 2:
                                        n updateState3 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                                        k3g.i iVar = (k3g.i) outputData;
                                        return n.a(updateState3, new j(iVar.f180719a, iVar.f180720b), iVar.f180721c, null, null, null, null, null, null, null, false, 1020);
                                    case 3:
                                        n updateState4 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                                        return n.a(updateState4, new l(((k3g.h) outputData).f180718a), null, null, null, null, null, null, null, null, false, 1022);
                                    default:
                                        n updateState5 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                                        TravelSearchAttraction travelSearchAttraction = ((k3g.e) outputData).f180715a;
                                        return n.a(updateState5, new j(travelSearchAttraction.f92885a, travelSearchAttraction.f92886b), null, null, null, null, null, null, null, null, false, 1022);
                                }
                            }
                        });
                        bVar3.A2();
                    } else {
                        if (!(outputData instanceof k3g.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar3.z2(new LocationId.AttractionId(((k3g.e) outputData).f180715a.f92885a), true);
                        final int i6 = 4;
                        bVar3.x2(new Function1() { // from class: m3g.v
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                switch (i6) {
                                    case 0:
                                        n updateState = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                        TravelSearchDestination travelSearchDestination2 = ((k3g.f) outputData).f180716a;
                                        return n.a(updateState, new k(travelSearchDestination2.f92888a, travelSearchDestination2.f92889b), null, null, null, null, null, null, null, null, false, 1022);
                                    case 1:
                                        n updateState2 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                                        k3g.j jVar2 = (k3g.j) outputData;
                                        return n.a(updateState2, new k(jVar2.f180722a, jVar2.f180724c), jVar2.d, null, null, null, null, null, null, null, false, 1020);
                                    case 2:
                                        n updateState3 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                                        k3g.i iVar = (k3g.i) outputData;
                                        return n.a(updateState3, new j(iVar.f180719a, iVar.f180720b), iVar.f180721c, null, null, null, null, null, null, null, false, 1020);
                                    case 3:
                                        n updateState4 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                                        return n.a(updateState4, new l(((k3g.h) outputData).f180718a), null, null, null, null, null, null, null, null, false, 1022);
                                    default:
                                        n updateState5 = (n) obj3;
                                        Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                                        TravelSearchAttraction travelSearchAttraction = ((k3g.e) outputData).f180715a;
                                        return n.a(updateState5, new j(travelSearchAttraction.f92885a, travelSearchAttraction.f92886b), null, null, null, null, null, null, null, null, false, 1022);
                                }
                            }
                        });
                        bVar3.A2();
                    }
                }
                return Unit.f186387a;
            default:
                o3g.g output2 = (o3g.g) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                j2g.q qVar = new j2g.q(output2, 1);
                com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b bVar4 = this.f202560b;
                bVar4.x2(qVar);
                bVar4.A2();
                return Unit.f186387a;
        }
    }
}
