package ib8;

import com.revolut.feature.junior.pending_graduation.impl.data.service.JuniorGraduationService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e implements e4m.e {
    public static JuniorGraduationService a(ek.a converterFactory, ik0.b retrofitFactory) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(JuniorGraduationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorGraduationService juniorGraduationService = (JuniorGraduationService) objCreate;
        s.k(juniorGraduationService);
        return juniorGraduationService;
    }
}
