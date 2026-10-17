package wqe;

import com.revolut.feature.teen_profile.impl.services.TeenProfileService;
import e4m.e;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f299442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f299443b;

    public a(b bVar, int i) {
        this.f299442a = bVar;
        this.f299443b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f299442a;
        nj0.a aVar = bVar.f299444a;
        int i = this.f299443b;
        if (i == 0) {
            TeenProfileService teenProfileService = (TeenProfileService) bVar.d.get();
            j jVar = (j) bVar.e.get();
            ee0.a aVar2 = bVar.f299445b;
            d mapper = aVar2.d();
            s.j(mapper);
            f storageFactory = aVar2.f();
            s.j(storageFactory);
            yk0.a dbSessionProvider = bVar.f299446c.b();
            s.j(dbSessionProvider);
            c.Companion.getClass();
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
            Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
            return new xqe.b(new are.b(teenProfileService, jVar, f.f(storageFactory, dbSessionProvider, "teen_profile_storage", mapper, 1, null, 48)));
        }
        if (i != 1) {
            if (i == 2) {
                return new ne0.d();
            }
            throw new AssertionError(i);
        }
        ik0.b retrofitFactory = ((nj0.d) aVar).m();
        s.j(retrofitFactory);
        ek.a converterFactory = ((nj0.d) aVar).d();
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(TeenProfileService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TeenProfileService teenProfileService2 = (TeenProfileService) objCreate;
        s.k(teenProfileService2);
        return teenProfileService2;
    }
}
