package sxd;

import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.standingordertopup.impl.ui.model.SuggestionItem;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f266452w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Continuation continuation) {
        super(2, continuation);
        this.f266452w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        y yVar = new y(this.f266452w, continuation);
        yVar.v = obj2;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVar;
        dj0.d dVar2;
        AutoTopUpState.Type type;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            z zVar = this.f266452w;
            g gVar = (g) ((j2) zVar.f266458w.f22677a).getValue();
            TopupMethod.StoredMethod storedMethod = gVar.f266426b;
            Continuation continuation = null;
            if (storedMethod == null) {
                IllegalStateException illegalStateException = new IllegalStateException("selectedMethod is null on attempt to save order");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return Unit.f186387a;
            }
            SuggestionItem suggestionItem = gVar.d;
            if (suggestionItem == null || (dVar = suggestionItem.f88196a) == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("selectedThresholdSuggestion is null on attempt to save order");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                return Unit.f186387a;
            }
            SuggestionItem suggestionItem2 = gVar.f;
            if (suggestionItem2 == null || (dVar2 = suggestionItem2.f88196a) == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("selectedAmountSuggestion is null on attempt to save order");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                return Unit.f186387a;
            }
            if (storedMethod instanceof TopupMethod.StoredMethod.Card) {
                type = AutoTopUpState.Type.EXTERNAL_CARD;
            } else {
                if (!(storedMethod instanceof TopupMethod.StoredMethod.PayTo)) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Unexpected stored method type: " + storedMethod);
                    h0 h0Var4 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException4, h0Var4);
                    return Unit.f186387a;
                }
                type = AutoTopUpState.Type.PAY_TO;
            }
            sb4.i iVar = new sb4.i(zVar, new AutoTopUpState(true, null, storedMethod.getF60502a(), type, dVar, dVar2, zVar.o.f88205c), continuation, 11);
            this.v = null;
            this.u = 1;
            if (zVar.p2(this, iVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
