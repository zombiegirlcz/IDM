package yt1;

import c02.e;
import com.revolut.feature.apm.core.models.blik.BlikCode;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;
import zt1.b;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f316607a = r0.k(new Pair("POS_PURCHASE", e.POS_PURCHASE), new Pair("POS_RETURN", e.POS_RETURN), new Pair("WEB_PURCHASE", e.WEB_PURCHASE), new Pair("WEB_RETURN", e.WEB_RETURN), new Pair("CASH_WITHDRAWAL", e.CASH_WITHDRAWAL));

    public static final BlikCode a(zt1.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new BlikCode(aVar.getId(), aVar.getCode(), aVar.getCreatedAt(), aVar.getExpiresAt(), aVar.getRefreshAt(), aVar.getCanCopy(), aVar.getOrigin());
    }

    public static final b b(c02.a aVar) {
        return new b(aVar != null ? aVar.a() : null);
    }
}
