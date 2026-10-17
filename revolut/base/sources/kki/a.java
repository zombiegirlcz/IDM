package kki;

import android.os.Parcelable;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public abstract ScreenStates$RetainedDomain a(i iVar);

    public abstract i b(i iVar, ScreenStates$RetainedDomain screenStates$RetainedDomain);

    public final i c(i initialState, Parcelable retainedState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return b(initialState, (ScreenStates$RetainedDomain) retainedState);
    }
}
