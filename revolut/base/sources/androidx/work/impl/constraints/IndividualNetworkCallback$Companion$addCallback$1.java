package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class IndividualNetworkCallback$Companion$addCallback$1 extends u implements Function0<Unit> {
    final /* synthetic */ Ref$BooleanRef $callbackRegistered;
    final /* synthetic */ ConnectivityManager $connManager;
    final /* synthetic */ IndividualNetworkCallback $networkCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndividualNetworkCallback$Companion$addCallback$1(Ref$BooleanRef ref$BooleanRef, ConnectivityManager connectivityManager, IndividualNetworkCallback individualNetworkCallback) {
        super(0);
        this.$callbackRegistered = ref$BooleanRef;
        this.$connManager = connectivityManager;
        this.$networkCallback = individualNetworkCallback;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m3639invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3639invoke() {
        if (this.$callbackRegistered.f186407a) {
            Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister callback");
            this.$connManager.unregisterNetworkCallback(this.$networkCallback);
        }
    }
}
