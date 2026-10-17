package j1a;

import android.content.Context;
import androidx.room.migration.Migration;
import com.revolut.feature.payments.splitbill.impl.data.recurringsplit.RecurringSplitService;
import com.revolut.feature.payments.splitbill.impl.data.recurringsplit.database.RecurringSplitDatabase;
import com.revolut.feature.payments.splitbill.impl.data.splitbilllink.SplitBillLinkService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f170302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f170303b;

    public h(i iVar, int i) {
        this.f170302a = iVar;
        this.f170303b = i;
    }

    @Override // phm.a
    public final Object get() {
        i iVar = this.f170302a;
        int i = this.f170303b;
        switch (i) {
            case 0:
                return new e1a.f((SplitBillLinkService) iVar.f170314q.get(), new e1a.g(), (ne0.j) iVar.f170315r.get(), (ue0.c) iVar.f170316s.get());
            case 1:
                ik0.b retrofitFactory = ((nj0.d) iVar.f170304a).m();
                s.j(retrofitFactory);
                ek.a converterFactory = ((nj0.d) iVar.f170304a).d();
                i1a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(SplitBillLinkService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                SplitBillLinkService splitBillLinkService = (SplitBillLinkService) objCreate;
                s.k(splitBillLinkService);
                return splitBillLinkService;
            case 2:
                i1a.b.Companion.getClass();
                return new ne0.d();
            case 3:
                je0.d mapper = iVar.f170305b.d();
                s.j(mapper);
                yk0.a databaseSessionProvider = iVar.f170306c.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = iVar.f170305b.f();
                s.j(storageFactory);
                i1a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "split_bill_links", mapper, 0, null, 56);
            case 4:
                tv9.a aVar = iVar.e;
                djf.c cVar = iVar.f;
                wv9.c cVarD = ((s6k.b) aVar).d();
                s.j(cVarD);
                fnc.s sVarB = iVar.b();
                thf.m mVarG = cVar.g();
                s.j(mVarG);
                thf.d dVarD = cVar.d();
                s.j(dVarD);
                return new l1a.g(cVarD, sVarB, mVarG, dVarD, new l1a.i(iVar.b()));
            case 5:
                return new a1a.d((RecurringSplitService) iVar.v.get(), (ne0.j) iVar.f170318w.get(), (b1a.a) iVar.f170320y.get());
            case 6:
                ik0.b retrofitFactory2 = ((nj0.d) iVar.f170304a).m();
                s.j(retrofitFactory2);
                ek.a converterFactory2 = ((nj0.d) iVar.f170304a).d();
                i1a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                Object objCreate2 = ik0.b.a(retrofitFactory2, null, null, converterFactory2, null, 27).create(RecurringSplitService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                RecurringSplitService recurringSplitService = (RecurringSplitService) objCreate2;
                s.k(recurringSplitService);
                return recurringSplitService;
            case 7:
                return new ne0.d();
            case 8:
                RecurringSplitDatabase database = (RecurringSplitDatabase) iVar.f170319x.get();
                i1a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(database, "database");
                b1a.a aVarG = database.g();
                s.k(aVarG);
                return aVarG;
            case 9:
                Context context = iVar.f170307g;
                yk0.a databaseSessionProvider2 = iVar.f170306c.b();
                s.j(databaseSessionProvider2);
                de0.a databaseEncryptionMigratorFactory = ((c21.b) iVar.f170308h).b();
                i1a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                RecurringSplitDatabase.Companion companion = RecurringSplitDatabase.INSTANCE;
                companion.getClass();
                RecurringSplitDatabase recurringSplitDatabase = (RecurringSplitDatabase) companion.a(context, databaseSessionProvider2, new Migration[]{d1a.a.f110614c}, databaseEncryptionMigratorFactory);
                s.k(recurringSplitDatabase);
                return recurringSplitDatabase;
            case 10:
                return new h1a.b();
            default:
                throw new AssertionError(i);
        }
    }
}
