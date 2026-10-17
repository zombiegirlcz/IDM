package grd;

import aw0.f4;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetController;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinition;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AddEditAssetController f146004w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(AddEditAssetController addEditAssetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f146004w = addEditAssetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f146004w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f146004w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            case 2:
                l lVar3 = new l(this.f146004w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
            case 3:
                l lVar4 = new l(this.f146004w, continuation, 3);
                lVar4.v = obj2;
                return lVar4;
            default:
                l lVar5 = new l(this.f146004w, continuation, 4);
                lVar5.v = obj2;
                return lVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l) create((CustomAssetFieldDefinition) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((l) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        int i2 = 9;
        Object obj3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        AddEditAssetController addEditAssetController = this.f146004w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj4 = aVar.d;
                String url2 = obj4 instanceof String ? (String) obj4 : null;
                if (url2 != null) {
                    com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d dVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) addEditAssetController.R2();
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(url2, "url");
                    dVar.n2(new gm6.j(dVar, url2, objArr == true ? 1 : 0, i2), new whi.b(6));
                }
                return Unit.f186387a;
            case 1:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVarE3 = addEditAssetController.R2();
                String amountString = charSequence.toString();
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d dVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) cVarE3;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(amountString, "amountString");
                cli.y yVar = dVar2.f87925x;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                Iterator it8 = ((a) j2Var.getValue()).f145983b.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (((CustomAssetFieldDefinition) next).f99229c == vzi.e.AMOUNT_PICKER) {
                            obj3 = next;
                        }
                    }
                }
                CustomAssetFieldDefinition customAssetFieldDefinition = (CustomAssetFieldDefinition) obj3;
                if (customAssetFieldDefinition != null && (str = customAssetFieldDefinition.f99227a) != null) {
                    dVar2.J2(str, false, new dj0.d(dVar2.f87923t.b(amountString, ((a) j2Var2.getValue()).f145984c.f306286a), ((a) j2Var2.getValue()).f145984c));
                }
                return Unit.f186387a;
            case 2:
                CustomAssetFieldDefinition field = (CustomAssetFieldDefinition) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (field != null) {
                    com.revolut.kompot.navigable.vc.modal.a aVar5 = ((com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) addEditAssetController.R2()).f87926y;
                    Intrinsics.checkNotNullParameter(field, "field");
                    int i3 = t.f146014b[field.f99229c.ordinal()];
                    ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
                    ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                    switch (i3) {
                        case 1:
                            oki.h.v2(aVar5, AddEditAssetContract$ModalStep.CurrencyPicker.f87913a, fullscreen_fade);
                            break;
                        case 2:
                            oki.h.v2(aVar5, new AddEditAssetContract$ModalStep.CountryPicker(field.f99227a), fullscreen_fade);
                            break;
                        case 3:
                            oki.h.v2(aVar5, new AddEditAssetContract$ModalStep.OptionsBottomSheet(field), bottom_dialog);
                            break;
                        case 4:
                            oki.h.v2(aVar5, new AddEditAssetContract$ModalStep.DatePicker(field, jrd.a.YEAR_ONLY), bottom_dialog);
                            break;
                        case 5:
                            oki.h.v2(aVar5, new AddEditAssetContract$ModalStep.DatePicker(field, jrd.a.MONTH_YEAR), bottom_dialog);
                            break;
                        case 6:
                        case 7:
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
            case 3:
                f4 focusData = (f4) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVarE32 = addEditAssetController.R2();
                Intrinsics.h(focusData);
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d dVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) cVarE32;
                cli.y yVar2 = dVar3.f87925x;
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                if (focusData.f10304b) {
                    dVar3.H2(yVar2, new b94.p(focusData, 2));
                } else if (Intrinsics.f(((a) ((j2) yVar2.f22677a).getValue()).f145986h, focusData.f10303a)) {
                    dVar3.H2(yVar2, new b94.p(focusData, 3));
                }
                return Unit.f186387a;
            default:
                ty0.a aVar7 = (ty0.a) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj5 = aVar7.d;
                String url3 = obj5 instanceof String ? (String) obj5 : null;
                if (url3 != null) {
                    com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d dVar4 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) addEditAssetController.R2();
                    dVar4.getClass();
                    Intrinsics.checkNotNullParameter(url3, "url");
                    dVar4.n2(new gm6.j(dVar4, url3, objArr2 == true ? 1 : 0, i2), new whi.b(6));
                }
                return Unit.f186387a;
        }
    }
}
