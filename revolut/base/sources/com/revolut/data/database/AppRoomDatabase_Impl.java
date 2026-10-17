package com.revolut.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import com.revolut.data.database.models.beneficiary.BeneficiaryDao;
import com.revolut.data.database.models.beneficiary.BeneficiaryDao_Impl;
import com.revolut.data.database.models.openbanking.ConsentsDao;
import com.revolut.data.database.models.openbanking.ConsentsDao_Impl;
import com.revolut.data.database.models.openbanking.ExternalInstitutionsDao;
import com.revolut.data.database.models.openbanking.ExternalInstitutionsDao_Impl;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentDao;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentDao_Impl;
import com.revolut.data.database.models.splitbill.SplitBillDao;
import com.revolut.data.database.models.splitbill.SplitBillDao_Impl;
import com.revolut.data.database.models.statement.StatementTemplatesInfoDao;
import com.revolut.data.database.models.statement.StatementTemplatesInfoDao_Impl;
import com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao;
import com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t11.a;
import t11.a0;
import t11.a1;
import t11.a2;
import t11.b;
import t11.b0;
import t11.b1;
import t11.c;
import t11.c0;
import t11.c1;
import t11.d;
import t11.d0;
import t11.d1;
import t11.e;
import t11.e0;
import t11.e1;
import t11.f;
import t11.f0;
import t11.f1;
import t11.g;
import t11.g0;
import t11.g1;
import t11.h;
import t11.h0;
import t11.h1;
import t11.i;
import t11.i0;
import t11.i1;
import t11.j;
import t11.j0;
import t11.j1;
import t11.k;
import t11.k0;
import t11.k1;
import t11.l;
import t11.l0;
import t11.l1;
import t11.m;
import t11.m0;
import t11.m1;
import t11.n;
import t11.n0;
import t11.n1;
import t11.o;
import t11.o0;
import t11.o1;
import t11.p;
import t11.p0;
import t11.p1;
import t11.q;
import t11.q0;
import t11.q1;
import t11.r;
import t11.r0;
import t11.r1;
import t11.s;
import t11.s0;
import t11.s1;
import t11.t;
import t11.t0;
import t11.t1;
import t11.u;
import t11.u0;
import t11.u1;
import t11.v;
import t11.v0;
import t11.v1;
import t11.w;
import t11.w0;
import t11.w1;
import t11.x;
import t11.x0;
import t11.x1;
import t11.y;
import t11.y0;
import t11.y1;
import t11.z;
import t11.z0;
import t11.z1;

/* JADX INFO: loaded from: classes.dex */
public final class AppRoomDatabase_Impl extends AppRoomDatabase {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f60128p = 0;
    public volatile RecurringPaymentDao_Impl f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile ConsentsDao_Impl f60129j;
    public volatile ExternalInstitutionsDao_Impl k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile TransactionCustomCategoryDao_Impl f60130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile BeneficiaryDao_Impl f60131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile SplitBillDao_Impl f60132n;
    public volatile StatementTemplatesInfoDao_Impl o;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(true, "recurring_payments", "consents", "institutions", "institution_branch", "transaction_custom_category", "beneficiaries", "split_bill", "statement_template_info");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "recurring_payments", "consents", "institutions", "institution_branch", "transaction_custom_category", "beneficiaries", "split_bill", "statement_template_info");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new a2(this);
    }

    @Override // com.revolut.data.database.AppRoomDatabase
    public final BeneficiaryDao g() {
        BeneficiaryDao_Impl beneficiaryDao_Impl;
        if (this.f60131m != null) {
            return this.f60131m;
        }
        synchronized (this) {
            try {
                if (this.f60131m == null) {
                    this.f60131m = new BeneficiaryDao_Impl(this);
                }
                beneficiaryDao_Impl = this.f60131m;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return beneficiaryDao_Impl;
    }

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        arrayList.add(new b());
        arrayList.add(new c());
        arrayList.add(new d());
        arrayList.add(new e());
        arrayList.add(new f());
        arrayList.add(new g());
        arrayList.add(new h());
        arrayList.add(new i());
        arrayList.add(new j());
        arrayList.add(new k());
        arrayList.add(new l());
        arrayList.add(new m());
        arrayList.add(new n());
        arrayList.add(new o());
        arrayList.add(new p());
        arrayList.add(new q());
        arrayList.add(new r());
        arrayList.add(new s());
        arrayList.add(new t());
        arrayList.add(new u());
        arrayList.add(new v());
        arrayList.add(new w());
        arrayList.add(new x());
        arrayList.add(new y());
        arrayList.add(new z());
        arrayList.add(new a0());
        arrayList.add(new b0());
        arrayList.add(new c0());
        arrayList.add(new d0());
        arrayList.add(new e0());
        arrayList.add(new f0());
        arrayList.add(new g0());
        arrayList.add(new h0());
        arrayList.add(new i0());
        arrayList.add(new j0());
        arrayList.add(new k0());
        arrayList.add(new l0());
        arrayList.add(new m0());
        arrayList.add(new n0());
        arrayList.add(new o0());
        arrayList.add(new p0());
        arrayList.add(new q0());
        arrayList.add(new r0());
        arrayList.add(new s0());
        arrayList.add(new t0());
        arrayList.add(new u0());
        arrayList.add(new v0());
        arrayList.add(new w0());
        arrayList.add(new x0());
        arrayList.add(new y0());
        arrayList.add(new z0());
        arrayList.add(new a1());
        arrayList.add(new b1());
        arrayList.add(new c1());
        arrayList.add(new d1());
        arrayList.add(new e1());
        arrayList.add(new f1());
        arrayList.add(new g1());
        arrayList.add(new h1());
        arrayList.add(new i1());
        arrayList.add(new j1());
        arrayList.add(new k1());
        arrayList.add(new l1());
        arrayList.add(new m1());
        arrayList.add(new n1());
        arrayList.add(new o1());
        arrayList.add(new p1());
        arrayList.add(new q1());
        arrayList.add(new r1());
        arrayList.add(new s1());
        arrayList.add(new t1());
        arrayList.add(new u1());
        arrayList.add(new v1());
        arrayList.add(new w1());
        arrayList.add(new x1());
        arrayList.add(new y1());
        arrayList.add(new z1());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(RecurringPaymentDao.class, RecurringPaymentDao_Impl.getRequiredConverters());
        map.put(ConsentsDao.class, ConsentsDao_Impl.getRequiredConverters());
        map.put(ExternalInstitutionsDao.class, ExternalInstitutionsDao_Impl.getRequiredConverters());
        map.put(TransactionCustomCategoryDao.class, TransactionCustomCategoryDao_Impl.getRequiredConverters());
        map.put(BeneficiaryDao.class, BeneficiaryDao_Impl.getRequiredConverters());
        map.put(SplitBillDao.class, SplitBillDao_Impl.getRequiredConverters());
        map.put(StatementTemplatesInfoDao.class, StatementTemplatesInfoDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.revolut.data.database.AppRoomDatabase
    public final ConsentsDao h() {
        ConsentsDao_Impl consentsDao_Impl;
        if (this.f60129j != null) {
            return this.f60129j;
        }
        synchronized (this) {
            try {
                if (this.f60129j == null) {
                    this.f60129j = new ConsentsDao_Impl(this);
                }
                consentsDao_Impl = this.f60129j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return consentsDao_Impl;
    }

    @Override // com.revolut.data.database.AppRoomDatabase
    public final ExternalInstitutionsDao i() {
        ExternalInstitutionsDao_Impl externalInstitutionsDao_Impl;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new ExternalInstitutionsDao_Impl(this);
                }
                externalInstitutionsDao_Impl = this.k;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return externalInstitutionsDao_Impl;
    }

    @Override // com.revolut.data.database.AppRoomDatabase
    public final RecurringPaymentDao j() {
        RecurringPaymentDao_Impl recurringPaymentDao_Impl;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new RecurringPaymentDao_Impl(this);
                }
                recurringPaymentDao_Impl = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return recurringPaymentDao_Impl;
    }

    @Override // com.revolut.data.database.AppRoomDatabase
    public final SplitBillDao k() {
        SplitBillDao_Impl splitBillDao_Impl;
        if (this.f60132n != null) {
            return this.f60132n;
        }
        synchronized (this) {
            try {
                if (this.f60132n == null) {
                    this.f60132n = new SplitBillDao_Impl(this);
                }
                splitBillDao_Impl = this.f60132n;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return splitBillDao_Impl;
    }

    @Override // com.revolut.data.database.AppRoomDatabase
    public final StatementTemplatesInfoDao l() {
        StatementTemplatesInfoDao_Impl statementTemplatesInfoDao_Impl;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new StatementTemplatesInfoDao_Impl(this);
                }
                statementTemplatesInfoDao_Impl = this.o;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return statementTemplatesInfoDao_Impl;
    }

    @Override // com.revolut.data.database.AppRoomDatabase
    public final TransactionCustomCategoryDao m() {
        TransactionCustomCategoryDao_Impl transactionCustomCategoryDao_Impl;
        if (this.f60130l != null) {
            return this.f60130l;
        }
        synchronized (this) {
            try {
                if (this.f60130l == null) {
                    this.f60130l = new TransactionCustomCategoryDao_Impl(this);
                }
                transactionCustomCategoryDao_Impl = this.f60130l;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return transactionCustomCategoryDao_Impl;
    }
}
