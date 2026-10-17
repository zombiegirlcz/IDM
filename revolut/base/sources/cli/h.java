package cli;

import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends g {
    public final String e;
    public final Function2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final States$PersistentDomain f25027g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String key, Function2 restoredStateReducer, States$PersistentDomain initialState, n stateMapper, boolean z) {
        super(initialState, stateMapper, z);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(restoredStateReducer, "restoredStateReducer");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.e = key;
        this.f = restoredStateReducer;
        this.f25027g = initialState;
    }
}
