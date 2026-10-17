package ph9;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import kotlin.jvm.internal.Intrinsics;
import nii.z;
import ofm.q;
import sf0.h;
import v60.d;
import v60.e;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f236248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f236249b;

    public c(h serverErrorParser, e serverErrorsProvider, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f236248a = serverErrorParser;
                this.f236249b = serverErrorsProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f236248a = serverErrorParser;
                this.f236249b = serverErrorsProvider;
                break;
        }
    }

    public z a(Throwable throwable) {
        d bVar;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if ((throwable instanceof UserDeclinedTwoFaException) || (throwable instanceof HandledNetworkException)) {
            return null;
        }
        ServerError serverErrorA = this.f236248a.a(throwable);
        Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
        if (numValueOf == null || (bVar = ((ao0.a) this.f236249b).b(numValueOf)) == null) {
            bVar = new v60.b();
        }
        return new z(q.O(bVar), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }
}
