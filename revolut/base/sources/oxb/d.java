package oxb;

import com.revolut.feature.rev_points.impl.data.network.RevPointsPersonalisationService;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationBrandOption;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationBrandsResponse;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationPreferenceOption;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationPreferencesResponse;
import gim.i;
import hxb.s;
import hxb.t;
import hxb.u;
import hxb.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import m1c.o1;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f230760w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f230760w = fVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new d(this.f230760w, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new d(this.f230760w, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    RevPointsPersonalisationService revPointsPersonalisationService = this.f230760w.f230761a;
                    this.v = 1;
                    obj2 = revPointsPersonalisationService.getBrands(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                t tVar = (t) obj2;
                Intrinsics.checkNotNullParameter(tVar, "<this>");
                int minimumSelectionCount = tVar.getMinimumSelectionCount();
                List brands = tVar.getBrands();
                Intrinsics.checkNotNullParameter(brands, "<this>");
                List<s> list = brands;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (s sVar : list) {
                    Intrinsics.checkNotNullParameter(sVar, "<this>");
                    arrayList.add(new RevPointsPersonalisationBrandOption(sVar.getId(), sVar.getTitle(), sVar.getLogoUrl(), sVar.getSelected()));
                }
                return new RevPointsPersonalisationBrandsResponse(minimumSelectionCount, arrayList);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    RevPointsPersonalisationService revPointsPersonalisationService2 = this.f230760w.f230761a;
                    this.v = 1;
                    obj2 = revPointsPersonalisationService2.getPreferences(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                v vVar = (v) obj2;
                Intrinsics.checkNotNullParameter(vVar, "<this>");
                int iB = vVar.getMinimumSelectionCount();
                List listC = vVar.getPreferences();
                Intrinsics.checkNotNullParameter(listC, "<this>");
                List<u> list2 = listC;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (u uVar : list2) {
                    Intrinsics.checkNotNullParameter(uVar, "<this>");
                    arrayList2.add(new RevPointsPersonalisationPreferenceOption(uVar.getKey(), uVar.getTitle(), uVar.getEmoji(), uVar.getSelected()));
                }
                o1 o1VarA = vVar.getDisclaimer();
                return new RevPointsPersonalisationPreferencesResponse(iB, arrayList2, o1VarA != null ? qvb.b.a(o1VarA) : null);
        }
    }
}
