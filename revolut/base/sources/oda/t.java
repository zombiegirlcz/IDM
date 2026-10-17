package oda;

import com.revolut.feature.pockets.impl.network.PocketDetailsService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class t implements e4m.e {
    public static PocketDetailsService a(s sVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(PocketDetailsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        PocketDetailsService pocketDetailsService = (PocketDetailsService) objCreate;
        vc.s.k(pocketDetailsService);
        return pocketDetailsService;
    }
}
