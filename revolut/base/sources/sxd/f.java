package sxd;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.standingordertopup.impl.ui.model.SuggestionItem;
import com.revolut.feature.standingordertopup.impl.ui.screen.edit_order.EditTopUpOrderScreen;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EditTopUpOrderScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(EditTopUpOrderScreen editTopUpOrderScreen, Continuation continuation) {
        super(2, continuation);
        this.v = editTopUpOrderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        Object next2;
        SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        Intrinsics.h(suggestion);
        z zVar = (z) kVarE3;
        cli.y yVar = zVar.f266458w;
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
        String str = suggestion.f53492a;
        Object obj3 = suggestion.f53496h;
        final int i = 0;
        if (kotlin.text.a0.H(str, "THRESHOLD_SUGGESTIONS_ID", false)) {
            final SuggestionItem suggestionItem = obj3 instanceof SuggestionItem ? (SuggestionItem) obj3 : null;
            if (suggestionItem == null) {
                IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj3, "Unexpected parcel type "));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            } else {
                zVar.H2(yVar, new Function1() { // from class: sxd.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        switch (i) {
                            case 0:
                                g update = (g) obj4;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return g.a(update, null, null, suggestionItem, null, null, false, LDSFile.EF_SOD_TAG);
                            default:
                                g update2 = (g) obj4;
                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                return g.a(update2, null, null, null, null, suggestionItem, false, 95);
                        }
                    }
                });
            }
        } else if (str.equals("CUSTOM_THRESHOLD_ID")) {
            Iterator it8 = ((g) ((j2) yVar.f22677a).getValue()).f266427c.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it8.next();
                if (((SuggestionItem) next2).f88197b) {
                    break;
                }
            }
            SuggestionItem suggestionItem2 = (SuggestionItem) next2;
            zVar.C2(new i(suggestionItem2 != null ? suggestionItem2.f88196a : null, qxd.a.THRESHOLD));
        } else if (kotlin.text.a0.H(str, "AMOUNT_SUGGESTIONS_ID", false)) {
            final SuggestionItem suggestionItem3 = obj3 instanceof SuggestionItem ? (SuggestionItem) obj3 : null;
            if (suggestionItem3 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException(a0.d.m(obj3, "Unexpected parcel type "));
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
            } else {
                final int i2 = 1;
                zVar.H2(yVar, new Function1() { // from class: sxd.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        switch (i2) {
                            case 0:
                                g update = (g) obj4;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                return g.a(update, null, null, suggestionItem3, null, null, false, LDSFile.EF_SOD_TAG);
                            default:
                                g update2 = (g) obj4;
                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                return g.a(update2, null, null, null, null, suggestionItem3, false, 95);
                        }
                    }
                });
            }
        } else if (str.equals("CUSTOM_AMOUNT_ID")) {
            Iterator it9 = ((g) ((j2) yVar.f22677a).getValue()).e.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (((SuggestionItem) next).f88197b) {
                    break;
                }
            }
            SuggestionItem suggestionItem4 = (SuggestionItem) next;
            zVar.C2(new i(suggestionItem4 != null ? suggestionItem4.f88196a : null, qxd.a.AMOUNT));
        }
        return Unit.f186387a;
    }
}
