package ul8;

import android.os.Parcelable;
import com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.JuniorAddPhoneNumberScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        e currentState = (e) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new JuniorAddPhoneNumberScreenContract$RetainedState(currentState.f280903b, currentState.f280904c, currentState.f280902a, currentState.d);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        e initialState = (e) obj2;
        JuniorAddPhoneNumberScreenContract$RetainedState retainedState = (JuniorAddPhoneNumberScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        wi0.b countryCode = retainedState.f77204a;
        String phoneNumber = retainedState.f77205b;
        String phoneCode = retainedState.f77206c;
        boolean z = retainedState.d;
        initialState.getClass();
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(phoneCode, "phoneCode");
        return new e(phoneNumber, phoneCode, countryCode, z);
    }
}
