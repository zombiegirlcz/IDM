package wbg;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.ve;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCheckoutParams;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomDetailsParams;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreenContract$ModalStep;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCashback;
import com.revolut.feature_travel_hotels_models.property.room.Area;
import com.revolut.feature_travel_hotels_models.property.room.BedOptionSelection;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoom;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomOccupancyRatesSelection;
import com.revolut.kompot.common.ModalDestination;
import ip0.y7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsCheckoutScreen f296211w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(TravelHotelsCheckoutScreen travelHotelsCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f296211w = travelHotelsCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w(this.f296211w, continuation, 0);
                wVar.v = obj2;
                return wVar;
            case 1:
                w wVar2 = new w(this.f296211w, continuation, 1);
                wVar2.v = obj2;
                return wVar2;
            case 2:
                w wVar3 = new w(this.f296211w, continuation, 2);
                wVar3.v = obj2;
                return wVar3;
            case 3:
                w wVar4 = new w(this.f296211w, continuation, 3);
                wVar4.v = obj2;
                return wVar4;
            case 4:
                w wVar5 = new w(this.f296211w, continuation, 4);
                wVar5.v = obj2;
                return wVar5;
            case 5:
                w wVar6 = new w(this.f296211w, continuation, 5);
                wVar6.v = obj2;
                return wVar6;
            case 6:
                w wVar7 = new w(this.f296211w, continuation, 6);
                wVar7.v = obj2;
                return wVar7;
            default:
                w wVar8 = new w(this.f296211w, continuation, 7);
                wVar8.v = obj2;
                return wVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((w) create((ve) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((w) create((y7) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((w) create((sa) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((w) create((ve) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((w) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((w) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((w) create((TagViewData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((w) create((ve) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

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
    public final Object invokeSuspend(Object obj2) {
        HotelsProperty hotelsProperty;
        int i = this.u;
        TravelHotelsCheckoutScreen travelHotelsCheckoutScreen = this.f296211w;
        switch (i) {
            case 0:
                ve model = (ve) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0 s0VarE3 = travelHotelsCheckoutScreen.d();
                Intrinsics.h(model);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) s0VarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.f54872j;
                BedOptionSelection bedOptionSelection = obj3 instanceof BedOptionSelection ? (BedOptionSelection) obj3 : null;
                if (bedOptionSelection != null) {
                    oki.h.v2(aVar2.P, new TravelHotelsCheckoutScreenContract$ModalStep.BedOptionsSelection(bedOptionSelection), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            case 1:
                y7 model2 = (y7) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0 s0VarE32 = travelHotelsCheckoutScreen.d();
                Intrinsics.h(model2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar4 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) s0VarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                aVar4.J2();
                break;
            case 2:
                sa model3 = (sa) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0 s0VarE33 = travelHotelsCheckoutScreen.d();
                Intrinsics.h(model3);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar6 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) s0VarE33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                aVar6.K.getClass();
                aVar6.C1(fcg.f.a());
                break;
            case 3:
                ve model4 = (ve) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0 s0VarE34 = travelHotelsCheckoutScreen.d();
                Intrinsics.h(model4);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar8 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) s0VarE34;
                aVar8.getClass();
                Intrinsics.checkNotNullParameter(model4, "model");
                Object obj4 = model4.f54872j;
                BedOptionSelection bedOptionSelection2 = obj4 instanceof BedOptionSelection ? (BedOptionSelection) obj4 : null;
                if (bedOptionSelection2 != null) {
                    HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection = bedOptionSelection2.f98090a;
                    HotelsPropertyRoom hotelsPropertyRoom = hotelsPropertyRoomOccupancyRatesSelection.f98104a;
                    String str = hotelsPropertyRoom.f98099b;
                    ArrayList arrayList = hotelsPropertyRoom.d;
                    Area area = hotelsPropertyRoom.f98102h;
                    List listB = hotelsPropertyRoomOccupancyRatesSelection.b();
                    TravelHotelsCheckoutParams travelHotelsCheckoutParams = aVar8.o.f93895a;
                    aVar8.C2(new k0(new TravelHotelsRoomDetailsParams(str, area, arrayList, listB, travelHotelsCheckoutParams.f93650a, travelHotelsCheckoutParams.f93651b)));
                }
                break;
            case 4:
                ty0.a aVar9 = (ty0.a) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0 s0VarE35 = travelHotelsCheckoutScreen.d();
                Intrinsics.h(aVar9);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) s0VarE35).L2(aVar9);
                break;
            case 5:
                ty0.a aVar11 = (ty0.a) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0 s0VarE36 = travelHotelsCheckoutScreen.d();
                Intrinsics.h(aVar11);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) s0VarE36).L2(aVar11);
                break;
            case 6:
                TagViewData model5 = (TagViewData) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0 s0VarE37 = travelHotelsCheckoutScreen.d();
                Intrinsics.h(model5);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar14 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) s0VarE37;
                aVar14.getClass();
                Intrinsics.checkNotNullParameter(model5, "model");
                Object obj5 = model5.k;
                HotelsPropertyCashback hotelsPropertyCashback = obj5 instanceof HotelsPropertyCashback ? (HotelsPropertyCashback) obj5 : null;
                if (hotelsPropertyCashback != null) {
                    aVar14.G.Z2(hotelsPropertyCashback);
                }
                break;
            default:
                ve model6 = (ve) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0 s0VarE38 = travelHotelsCheckoutScreen.d();
                Intrinsics.h(model6);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar16 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) s0VarE38;
                aVar16.getClass();
                Intrinsics.checkNotNullParameter(model6, "model");
                Object obj6 = model6.f54872j;
                BedOptionSelection bedOptionSelection3 = obj6 instanceof BedOptionSelection ? (BedOptionSelection) obj6 : null;
                if (bedOptionSelection3 != null) {
                    HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection2 = bedOptionSelection3.f98090a;
                    afi.a aVar17 = (afi.a) ((g0) ((j2) aVar16.O.f22677a).getValue()).f296168a.getContent();
                    if (aVar17 != null && (hotelsProperty = aVar17.f4101b) != null) {
                        aVar16.C2(new i0(hotelsPropertyRoomOccupancyRatesSelection2.f98105b.e, hotelsProperty.u));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
