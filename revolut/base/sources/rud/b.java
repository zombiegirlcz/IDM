package rud;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import nii.z;
import ofm.q;
import sf0.h;
import v60.c;
import v60.e;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f257528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f257529b;

    public b(h serverErrorParser, e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f257528a = serverErrorParser;
        this.f257529b = serverErrorsProvider;
    }

    public final z a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = this.f257528a.a(throwable);
        c cVarB = ((ao0.a) this.f257529b).b(serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null);
        return new z(cVarB != null ? q.O(cVarB) : new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }
}
