package bac;

import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f14014b;

    public /* synthetic */ a(b bVar, int i) {
        this.f14013a = i;
        this.f14014b = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f14013a) {
            case 0:
                b bVar = this.f14014b;
                ee0.a aVar = bVar.f14017c;
                xe0.f storageFactory = aVar.f();
                s.j(storageFactory);
                yk0.a databaseSessionProvider = bVar.d.b();
                s.j(databaseSessionProvider);
                je0.d mapper = aVar.b();
                s.j(mapper);
                l.Companion.getClass();
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                return xe0.f.f(storageFactory, databaseSessionProvider, "revolut_pay_management", mapper, 0, null, 56);
            default:
                b bVar2 = this.f14014b;
                x9c.d dVarD = bVar2.d();
                zja.a aVarA = ((ika.b) bVar2.f14020j).a();
                s.j(aVarA);
                return new com.revolut.feature.revolutpay.management.impl.ui.management.flow.b(dVarD, aVarA);
        }
    }
}
