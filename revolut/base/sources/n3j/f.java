package n3j;

import aw0.f4;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreenContract$ModalStep;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountFieldsScreen f212141w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(AccountFieldsScreen accountFieldsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f212141w = accountFieldsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f212141w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f212141w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            case 2:
                f fVar3 = new f(this.f212141w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
            case 3:
                f fVar4 = new f(this.f212141w, continuation, 3);
                fVar4.v = obj2;
                return fVar4;
            case 4:
                f fVar5 = new f(this.f212141w, continuation, 4);
                fVar5.v = obj2;
                return fVar5;
            default:
                f fVar6 = new f(this.f212141w, continuation, 5);
                fVar6.v = obj2;
                return fVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((AppTipUIModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((AppTipUIModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f) create((s4j.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        AccountFieldsScreen accountFieldsScreen = this.f212141w;
        switch (i) {
            case 0:
                AppTipUIModel appTipUIModel = (AppTipUIModel) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE3 = accountFieldsScreen.R2();
                Object obj3 = appTipUIModel.i;
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) rVarE3;
                if (obj3 instanceof f5j.k) {
                    d4j.c cVar = dVar.E;
                    f5j.k suggestionData = (f5j.k) obj3;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(suggestionData, "suggestionData");
                    dVar.C1(cVar.f111339a.a(suggestionData));
                } else {
                    dVar.getClass();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.m(obj3, "Unknown parcel "));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                }
                break;
            case 1:
                AppTipUIModel appTipUIModel2 = (AppTipUIModel) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE32 = accountFieldsScreen.R2();
                Object obj4 = appTipUIModel2.i;
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar2 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) rVarE32;
                dVar2.getClass();
                if (obj4 instanceof f5j.k) {
                    dVar2.l2(new w(dVar2, obj4, continuation, i2), new yi5.b(26));
                } else {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(a0.d.m(obj4, "Unknown parcel "));
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                }
                break;
            case 2:
                String id10 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE33 = accountFieldsScreen.R2();
                Intrinsics.h(id10);
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar3 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) rVarE33;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("ID_ACCOUNT_FIELDS_NAVBAR_MENU_HELP")) {
                    oki.h.v2(dVar3.L, AccountFieldsScreenContract$ModalStep.DetailsSuggestion.f99677a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else if (id10.equals("PAY_WITH_PHOTO_MENU_ID")) {
                    dVar3.G.Z2();
                }
                break;
            case 3:
                g6 g6Var = (g6) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE34 = accountFieldsScreen.R2();
                String selectedId = g6Var.f54199a;
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar4 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) rVarE34;
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                dVar4.l2(new w(dVar4, selectedId, continuation, 2), new yi5.b(26));
                break;
            case 4:
                s4j.d data = (s4j.d) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE35 = accountFieldsScreen.R2();
                Intrinsics.h(data);
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar5 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) rVarE35;
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                dVar5.l2(new w(dVar5, data, continuation, 1), new yi5.b(26));
                break;
            default:
                f4 focusData = (f4) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE36 = accountFieldsScreen.R2();
                Intrinsics.h(focusData);
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar6 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) rVarE36;
                dVar6.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                dVar6.z.b(focusData);
                dVar6.H2(dVar6.K, new u(dVar6, i2));
                break;
        }
        return Unit.f186387a;
    }
}
