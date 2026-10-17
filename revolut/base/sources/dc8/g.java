package dc8;

import android.os.Parcelable;
import com.revolut.feature.junior_allowance.impl.ui.screen.allowance_pager.JuniorAllowancePagerScreenContract$AllowancePage;
import com.revolut.feature.junior_allowance.impl.ui.screen.allowance_pager.JuniorAllowancePagerScreenContract$RetainedState;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends c {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        Object next;
        b currentState = (b) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Iterator it8 = currentState.f112814b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((JuniorAllowancePagerScreenContract$AllowancePage) next).f76837a, currentState.f112813a)) {
                break;
            }
        }
        JuniorAllowancePagerScreenContract$AllowancePage juniorAllowancePagerScreenContract$AllowancePage = (JuniorAllowancePagerScreenContract$AllowancePage) next;
        if (juniorAllowancePagerScreenContract$AllowancePage == null) {
            return null;
        }
        return new JuniorAllowancePagerScreenContract$RetainedState(juniorAllowancePagerScreenContract$AllowancePage);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        b initialState = (b) obj2;
        JuniorAllowancePagerScreenContract$RetainedState retainedState = (JuniorAllowancePagerScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        JuniorAllowancePagerScreenContract$AllowancePage juniorAllowancePagerScreenContract$AllowancePage = retainedState.f76842a;
        return b.a(initialState, juniorAllowancePagerScreenContract$AllowancePage.f76837a, u.c(juniorAllowancePagerScreenContract$AllowancePage), 4);
    }
}
