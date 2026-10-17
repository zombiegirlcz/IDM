package pdg;

import com.revolut.core.ui_kit.delegates.w8;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview.TravelHotelsPropertyOnMap;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.TravelHotelsPropertyDetailsScreen;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCashback;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import vkm.j2;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsPropertyDetailsScreen f235184w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(TravelHotelsPropertyDetailsScreen travelHotelsPropertyDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235184w = travelHotelsPropertyDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f235184w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f235184w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            case 2:
                f fVar3 = new f(this.f235184w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
            default:
                f fVar4 = new f(this.f235184w, continuation, 3);
                fVar4.v = obj2;
                return fVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((w8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((TagViewData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((TagViewData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        HotelsProperty hotelsProperty;
        Set set;
        int i = this.u;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        TravelHotelsPropertyDetailsScreen travelHotelsPropertyDetailsScreen = this.f235184w;
        switch (i) {
            case 0:
                w8 model = (w8) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE3 = travelHotelsPropertyDetailsScreen.d();
                Intrinsics.h(model);
                i0 i0Var = (i0) xVarE3;
                i0Var.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                HotelsProperty hotelsProperty2 = (HotelsProperty) ((m) ((j2) i0Var.E.f22677a).getValue()).f235202b.getContent();
                if (hotelsProperty2 != null) {
                    i0Var.C2(new u(new TravelHotelsPropertyOnMap(hotelsProperty2.f97987l.f98039a)));
                }
                break;
            case 1:
                TagViewData model2 = (TagViewData) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE32 = travelHotelsPropertyDetailsScreen.d();
                Intrinsics.h(model2);
                i0 i0Var2 = (i0) xVarE32;
                i0Var2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                Object obj3 = model2.k;
                HotelsPropertyCashback hotelsPropertyCashback = obj3 instanceof HotelsPropertyCashback ? (HotelsPropertyCashback) obj3 : null;
                if (hotelsPropertyCashback != null) {
                    i0Var2.B.Z2(hotelsPropertyCashback);
                }
                break;
            case 2:
                String id10 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE33 = travelHotelsPropertyDetailsScreen.d();
                Intrinsics.h(id10);
                i0 i0Var3 = (i0) xVarE33;
                cli.y yVar = i0Var3.E;
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("SHARE_ICON_ID")) {
                    m0 m0Var = i0Var3.A;
                    String propertyId = i0Var3.o.f93981a.f93670a;
                    j2 j2Var = (j2) yVar.f22677a;
                    j2 j2Var2 = (j2) yVar.f22677a;
                    LocalDate checkinDate = ((m) j2Var.getValue()).f235205h;
                    LocalDate checkoutDate = ((m) j2Var2.getValue()).i;
                    List roomOccupancy = ((m) j2Var2.getValue()).f235206j;
                    m0Var.getClass();
                    Intrinsics.checkNotNullParameter(propertyId, "propertyId");
                    Intrinsics.checkNotNullParameter(checkinDate, "checkinDate");
                    Intrinsics.checkNotNullParameter(checkoutDate, "checkoutDate");
                    Intrinsics.checkNotNullParameter(roomOccupancy, "roomOccupancy");
                    Map mapK = r0.k(new Pair("checkin", checkinDate.toString()), new Pair("checkout", checkoutDate.toString()), new Pair("occupancy", Integer.valueOf(v04.b.e(zhm.d0.k0(roomOccupancy, ",", null, null, 0, new pd4.u(14), 30)))));
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : mapK.entrySet()) {
                        String str = ((String) entry.getKey()) + "=" + entry.getValue();
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                    String strK0 = zhm.d0.k0(arrayList, "&", null, null, 0, null, 62);
                    t0 t0Var = t0.f186434a;
                    m70.a.c(t0Var);
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(m0Var.f235209a.b(new TextLocalisedClause(R$string.hotels_property_share, null, null, 14)).toString());
                    sb6.append(m70.a.o(t0Var));
                    sb6.append("https://revolut.com/app/hotels/property/");
                    a0.d.C(sb6, propertyId, "?", strK0);
                    Unit unit = Unit.f186387a;
                    i0Var3.C1(new BridgeDestination(nd.o.i("", sb6.toString())));
                } else if (id10.equals("FAVORITES_ICON_ID") && (hotelsProperty = (HotelsProperty) ((m) ((j2) yVar.f22677a).getValue()).f235202b.getContent()) != null && (set = (Set) ((m) ((j2) yVar.f22677a).getValue()).f235203c.getContent()) != null) {
                    if (set.contains(h9g.e.b(hotelsProperty.f97981a))) {
                        i0Var3.n2(new c0(i0Var3, hotelsProperty, objArr2 == true ? 1 : 0, 0), new whi.b(6));
                    } else {
                        i0Var3.n2(new c0(i0Var3, hotelsProperty, objArr == true ? 1 : 0, 1), new whi.b(6));
                    }
                }
                break;
            default:
                TagViewData model3 = (TagViewData) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE34 = travelHotelsPropertyDetailsScreen.d();
                Intrinsics.h(model3);
                i0 i0Var4 = (i0) xVarE34;
                i0Var4.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                HotelsProperty hotelsProperty3 = (HotelsProperty) ((m) ((j2) i0Var4.E.f22677a).getValue()).f235202b.getContent();
                if (hotelsProperty3 != null) {
                    i0Var4.n2(new c0(i0Var4, hotelsProperty3, objArr3 == true ? 1 : 0, 4), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
