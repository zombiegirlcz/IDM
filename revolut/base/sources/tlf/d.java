package tlf;

import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f272066a = new d();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        P2pPersonalisation p2pPersonalisation = (P2pPersonalisation) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (p2pPersonalisation == null) {
            return error;
        }
        return null;
    }
}
