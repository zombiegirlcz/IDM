package jk8;

import com.revolut.feature.junior_progression.impl.data.service.JuniorProgressionService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g implements e4m.e {
    public static JuniorProgressionService a(ek.a converterFactory, ik0.b factory) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(factory, null, null, converterFactory, null, 27).create(JuniorProgressionService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorProgressionService juniorProgressionService = (JuniorProgressionService) objCreate;
        s.k(juniorProgressionService);
        return juniorProgressionService;
    }
}
