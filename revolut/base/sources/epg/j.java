package epg;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.username.ui.UsernameScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) obj2;
        o oVar = (o) this.receiver;
        KProperty[] kPropertyArr = UsernameScreen.f94688e0;
        u uVar = (u) oVar;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
        Object obj4 = suggestion.f53496h;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.user.api.model.UsernameInfo");
        uVar.x2(new e2j.i(((zlg.q) obj4).f323264a, 14));
        return Unit.f186387a;
    }
}
