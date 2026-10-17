package gvl;

import android.os.Parcelable;
import com.revolut.trading.orders.ui.screens.schedule.ScheduleSettingsScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends k {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        j currentState = (j) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new ScheduleSettingsScreenContract$RetainedState(currentState.f147221a, currentState.f);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        j initialState = (j) obj2;
        ScheduleSettingsScreenContract$RetainedState retainedState = (ScheduleSettingsScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return j.a(initialState, retainedState.f107061a, retainedState.f107062b, 94);
    }
}
