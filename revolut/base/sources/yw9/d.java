package yw9;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.payments.profile.impl.ui_kompot.onboarding.ProfileController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) obj2;
        g gVar = (g) this.receiver;
        KProperty[] kPropertyArr = ProfileController.S;
        w wVar = (w) gVar;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
        Object obj4 = suggestion.f53496h;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.payments.profile.impl.data.model.UsernameSuggestion");
        wVar.J2(((iw9.c) obj4).f169000a);
        return Unit.f186387a;
    }
}
