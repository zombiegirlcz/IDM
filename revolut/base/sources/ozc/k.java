package ozc;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f231287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.b f231288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sf0.h f231289c;
    public final v60.e d;
    public final ty0.c e;

    public k(Context context, t70.b currenciesLocalization, sf0.h serverErrorParser, v60.e serverErrorsProvider, ty0.c clauseDisplayer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(clauseDisplayer, "clauseDisplayer");
        this.f231287a = context;
        this.f231288b = currenciesLocalization;
        this.f231289c = serverErrorParser;
        this.d = serverErrorsProvider;
        this.e = clauseDisplayer;
    }
}
