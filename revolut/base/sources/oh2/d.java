package oh2;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import kotlin.jvm.internal.Intrinsics;
import nii.z;
import ofm.q;
import org.jetbrains.annotations.NotNull;
import sf0.h;
import v60.e;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f225272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f225273b;

    public d(h serverErrorParser, e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f225272a = serverErrorParser;
        this.f225273b = serverErrorsProvider;
    }

    public final z a(Throwable error) {
        v60.d bVar;
        Intrinsics.checkNotNullParameter(error, "error");
        if ((error instanceof UserDeclinedTwoFaException) || (error instanceof HandledNetworkException)) {
            return null;
        }
        ServerError serverErrorA = this.f225272a.a(error);
        Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
        if (numValueOf == null || (bVar = ((ao0.a) this.f225273b).b(numValueOf)) == null) {
            bVar = new v60.b();
        }
        return new z(q.O(bVar), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }
}
