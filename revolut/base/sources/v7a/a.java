package v7a;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.picker.R$string;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import rd0.d;
import sf0.h;
import v60.e;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f286577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f286578b;

    public a(h serverErrorParser, e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f286577a = serverErrorsProvider;
        this.f286578b = serverErrorParser;
    }

    @Override // v7a.b
    public final TextLocalisedClause a(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            ServerError serverErrorA = this.f286578b.a(error);
            if (serverErrorA != null) {
                return new TextLocalisedClause(((ao0.a) this.f286577a).a(serverErrorA.f51362a, v60.a.SERVER).a(), (List) null, (Clause) null, true, 14);
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, "Failed to parse server error:", null, error, h0Var);
            return new TextLocalisedClause(R$string.error_generic, null, null, 14);
        } catch (Throwable unused) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
            d.a(rd0.c.ERROR, "Failed to parse server error:", null, error, h0Var2);
            return new TextLocalisedClause(R$string.error_generic, null, null, 14);
        }
    }
}
