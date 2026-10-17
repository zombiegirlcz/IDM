package kvh;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.rxdata.core.CompositeException;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v60.e f190126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf0.h f190127b;

    public h(sf0.h serverErrorParser, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f190126a = serverErrorsProvider;
        this.f190127b = serverErrorParser;
    }

    public final boolean a(Throwable error) throws IOException {
        Intrinsics.checkNotNullParameter(error, "error");
        HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
        if (httpException == null) {
            return false;
        }
        ServerError serverErrorC = this.f190127b.c(httpException);
        return httpException.code() == 401 && serverErrorC != null && serverErrorC.f51362a == 9001;
    }

    public final TextLocalisedClause b(Throwable error) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            ServerError serverErrorC = c(error);
            if (serverErrorC != null) {
                v60.d dVarA = ((ao0.a) this.f190126a).a(serverErrorC.f51362a, v60.a.SERVER);
                if (dVarA instanceof v60.b) {
                    g.c(Companion, "Server error contained no error code", error, null, 12);
                    return null;
                }
                textLocalisedClause = new TextLocalisedClause(dVarA.a(), (List) null, (Clause) null, true, 14);
            } else {
                textLocalisedClause = null;
            }
            if (textLocalisedClause == null) {
                g.c(Companion, "Failed to parse error", error, null, 12);
            }
            return textLocalisedClause;
        } catch (Throwable th10) {
            g.c(Companion, "Exception while trying to parse server error", new CompositeException(v.k(th10, error)), null, 12);
            return null;
        }
    }

    public final ServerError c(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return this.f190127b.a(error);
    }
}
