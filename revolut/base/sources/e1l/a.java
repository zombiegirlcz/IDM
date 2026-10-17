package e1l;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import ofm.q;
import sf0.h;
import v60.b;
import v60.d;
import v60.e;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f122000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f122001c;

    public a(h serverErrorParser, e serverErrorsProvider, int i) {
        this.f121999a = i;
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f122001c = serverErrorParser;
                this.f122000b = serverErrorsProvider;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f122001c = serverErrorParser;
                this.f122000b = serverErrorsProvider;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f122001c = serverErrorParser;
                this.f122000b = serverErrorsProvider;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f122001c = serverErrorParser;
                this.f122000b = serverErrorsProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
                Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
                this.f122001c = serverErrorParser;
                this.f122000b = serverErrorsProvider;
                break;
        }
    }

    public static z a(TextLocalisedClause textLocalisedClause) {
        return new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), textLocalisedClause, null, null, null, null, false, null, null, null, null, null, null, 32764);
    }

    public static z b(TextLocalisedClause textLocalisedClause) {
        return new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), textLocalisedClause, null, null, null, null, false, null, null, null, null, null, null, 32764);
    }

    public static z c() {
        return a(new TextLocalisedClause(R.string.error_generic, null, null, 14));
    }

    public static z d() {
        return b(new TextLocalisedClause(R.string.error_generic, null, null, 14));
    }

    public z e(ServerError serverError) {
        switch (this.f121999a) {
            case 2:
                if (serverError == null) {
                    return c();
                }
                d dVarB = ((ao0.a) this.f122000b).b(Integer.valueOf(serverError.f51362a));
                if (dVarB == null) {
                    dVarB = new b();
                }
                return a(q.O(dVarB));
            default:
                if (serverError == null) {
                    return d();
                }
                d dVarB2 = ((ao0.a) this.f122000b).b(Integer.valueOf(serverError.f51362a));
                if (dVarB2 == null) {
                    dVarB2 = new b();
                }
                return b(q.O(dVarB2));
        }
    }

    public y0 f(String str, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ServerError serverErrorA = this.f122001c.a(error);
        d dVarB = ((ao0.a) this.f122000b).b(serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null);
        if (dVarB == null) {
            dVarB = new b();
        }
        return new y0(str, new z(q.O(dVarB), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4);
    }

    public z g(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ServerError serverErrorA = this.f122001c.a(error);
        if (serverErrorA == null) {
            return new z(new TextLocalisedClause(R$string.general_error_common, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
        }
        d dVarB = ((ao0.a) this.f122000b).b(Integer.valueOf(serverErrorA.f51362a));
        if (dVarB == null) {
            dVarB = new b();
        }
        return new z(q.O(dVarB), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }

    public a(h serverErrorParser, e serverErrorsProvider) {
        this.f121999a = 1;
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f122000b = serverErrorsProvider;
        this.f122001c = serverErrorParser;
    }
}
