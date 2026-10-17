package tak;

import android.os.Parcelable;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes11.dex */
public interface d {
    default Object D0(sak.c cVar, Continuation continuation) {
        return PendingPaymentResult$Default.f102412a;
    }

    Object H(sak.c cVar, gim.c cVar2);

    Flow N(sak.c cVar);

    default boolean O0(Throwable throwable, sak.c cVar) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    default void T1(c event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    Object d0(sak.c cVar, gim.c cVar2);

    Flow q(Parcelable parcelable);

    Flow u0(sak.c cVar);
}
