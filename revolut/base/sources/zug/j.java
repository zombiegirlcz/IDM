package zug;

import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.upcoming_dividends.UpcomingDividendsContract$PersistentDomainState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        a currentState = (a) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new UpcomingDividendsContract$PersistentDomainState(currentState.f325452a);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        a initialState = (a) obj2;
        UpcomingDividendsContract$PersistentDomainState retainedState = (UpcomingDividendsContract$PersistentDomainState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        c selectedTab = retainedState.f94960a;
        Data data = initialState.f325453b;
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        return new a(selectedTab, data);
    }
}
