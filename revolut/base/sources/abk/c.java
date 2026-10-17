package abk;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.peer_to_peer.impl.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import ofm.q;
import sf0.h;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f2976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v60.e f2977b;

    public c(h serverErrorParser, v60.e serverErrorsProvider, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f2976a = serverErrorParser;
                this.f2977b = serverErrorsProvider;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f2976a = serverErrorParser;
                this.f2977b = serverErrorsProvider;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f2976a = serverErrorParser;
                this.f2977b = serverErrorsProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f2976a = serverErrorParser;
                this.f2977b = serverErrorsProvider;
                break;
        }
    }

    public static y0 a() {
        return new y0(null, new z(new TextLocalisedClause(R$string.payments_peer_to_peer_to_subaccount_error, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5);
    }

    public static y0 b(c cVar, Throwable error) {
        v60.e eVar = cVar.f2977b;
        Intrinsics.checkNotNullParameter(error, "error");
        ServerError serverErrorA = cVar.f2976a.a(error);
        v60.d dVarB = ((ao0.a) eVar).b(serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null);
        if (dVarB == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
            dVarB = new v60.b();
        }
        return new y0(null, new z(q.O(dVarB), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4);
    }
}
