package n68;

import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.junior.account_activation.impl.ui.screen.request.ActivationRequestScreenContract$RetainedState;
import com.revolut.feature.junior_onboarding.api.model.OnboardingTerms;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        k currentState = (k) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new ActivationRequestScreenContract$RetainedState(currentState.f212721a, currentState.f212722b, currentState.f212723c, currentState.d, currentState.e, currentState.f, (wi0.b) currentState.f212724g.getContent(), (List) currentState.f212725h.getContent());
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        k initialState = (k) obj2;
        ActivationRequestScreenContract$RetainedState retainedState = (ActivationRequestScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        String str = retainedState.f76681a;
        String str2 = retainedState.f76682b;
        LocalDate localDate = retainedState.f76683c;
        bj0.b bVar = retainedState.d;
        boolean z = retainedState.e;
        OnboardingTerms onboardingTerms = retainedState.f;
        wi0.b bVar2 = retainedState.f76684g;
        Data dataP = bVar2 != null ? zi0.c.P(bVar2, false, null, 3) : initialState.f212724g;
        List list = retainedState.f76685h;
        Data dataP2 = list != null ? zi0.c.P(list, false, null, 3) : initialState.f212725h;
        initialState.getClass();
        return k.a(str, str2, localDate, bVar, z, onboardingTerms, dataP, dataP2);
    }
}
