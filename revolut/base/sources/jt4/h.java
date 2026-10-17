package jt4;

import cli.y;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardActionParcel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelParcel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardSectionModel;
import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardDialog$InputData;
import com.revolut.feature.credit.card.impl.ui.items.bottom_sheet.CreditCardBottomSheetController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditCardBottomSheetController f178346w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CreditCardBottomSheetController creditCardBottomSheetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f178346w = creditCardBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f178346w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f178346w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        yx4.b bVar = (yx4.b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(bVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditCardBottomSheetController creditCardBottomSheetController = this.f178346w;
        switch (i) {
            case 0:
                yx4.b click = (yx4.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) ((a) creditCardBottomSheetController.T.getValue());
                iVar.getClass();
                Intrinsics.checkNotNullParameter(click, "click");
                Object obj3 = click.f317545b;
                if (obj3 == null) {
                    iVar.B2();
                } else if (obj3 instanceof CreditCardActionParcel) {
                    iVar.C2(new zl4.f((CreditCardActionParcel) obj3));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj3, "Expected CreditCardActionParcel, but was "));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
            default:
                yx4.b click2 = (yx4.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar2 = (i) ((a) creditCardBottomSheetController.T.getValue());
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(click2, "click");
                Object obj4 = click2.f317545b;
                if (obj4 instanceof CreditCardModelParcel.CollapsingParcel) {
                    String str = ((CreditCardModelParcel.CollapsingParcel) obj4).f68851a;
                    y yVar = iVar2.f178349r;
                    CreditCardDialogModel creditCardDialogModel = (CreditCardDialogModel) ((b) ((j2) yVar.f22677a).getValue()).f178338a.getContent();
                    if (creditCardDialogModel != null) {
                        List list = creditCardDialogModel.d;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            List items = kt4.a.a(str, ((CreditCardSectionModel) it8.next()).f68858a);
                            Intrinsics.checkNotNullParameter(items, "items");
                            arrayList.add(new CreditCardSectionModel(items));
                        }
                        iVar2.H2(yVar, new jp3.b(creditCardDialogModel, arrayList, 12));
                    }
                } else if (obj4 instanceof CreditCardActionParcel) {
                    iVar2.C2(new zl4.f((CreditCardActionParcel) obj4));
                } else if (Intrinsics.f(click2.f317544a, "ERROR_STATE_ID") && (iVar2.o instanceof CreditCardDialog$InputData.LoadContent)) {
                    iVar2.f178348q.a();
                }
                break;
        }
        return Unit.f186387a;
    }
}
