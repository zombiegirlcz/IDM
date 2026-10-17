package ue3;

import com.revolut.feature.category_boost.impl.data.service.CategoryBoostService;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f279289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f279290b;

    public c(d dVar, int i) {
        this.f279289a = dVar;
        this.f279290b = i;
    }

    @Override // phm.a
    public final Object get() {
        d dVar = this.f279289a;
        ite.a aVar = dVar.f279291a;
        nj0.a aVar2 = dVar.f279293c;
        int i = this.f279290b;
        if (i == 0) {
            gte.a aVarB = aVar.b();
            s.j(aVarB);
            Set setSingleton = Collections.singleton(new xe3.b(aVarB));
            gte.a aVarB2 = aVar.b();
            s.j(aVarB2);
            return new te3.a(setSingleton, aVarB2);
        }
        if (i == 1) {
            return new se3.c((CategoryBoostService) dVar.f.get(), (j) dVar.f279294g.get());
        }
        if (i != 2) {
            if (i == 3) {
                return new ne0.d();
            }
            throw new AssertionError(i);
        }
        ik0.b retrofitFactory = ((nj0.d) aVar2).m();
        s.j(retrofitFactory);
        ek.a converterFactory = ((nj0.d) aVar2).d();
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(CategoryBoostService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        CategoryBoostService categoryBoostService = (CategoryBoostService) objCreate;
        s.k(categoryBoostService);
        return categoryBoostService;
    }
}
