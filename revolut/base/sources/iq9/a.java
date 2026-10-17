package iq9;

import com.revolut.core.ui_kit.models.MoneyClause;
import hq9.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f167806a;

    public a(i inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f167806a = inputData;
    }

    public static MoneyClause a(long j2, xi0.b bVar) {
        return new MoneyClause(new dj0.d(j2, bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }
}
