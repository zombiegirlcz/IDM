package rab;

import ao.h;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.retail.junior.vaults.impl.services.WithdrawalPermissionService;
import efm.d0;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import r4k.x;
import r7i.r;
import ufm.i;
import wim.z;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements a {

    @NotNull
    private static final d Companion = new d();
    public static final Type f = new TypeToken<qab.b>() { // from class: com.revolut.feature.retail.junior.vaults.impl.repositories.WithdrawalPermissionRepositoryImpl$Companion$WITHDRAWAL_PERMISSION_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WithdrawalPermissionService f252805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f252806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f252807c;
    public final w4l.f d;
    public final h e;

    public f(WithdrawalPermissionService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f252805a = service;
        this.f252806b = memoryCache;
        this.f252807c = storage;
        final int i = 1;
        Function2 function2 = new Function2(this) { // from class: rab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f252800b;

            {
                this.f252800b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String vaultId = (String) obj2;
                        lab.a permission = (lab.a) obj3;
                        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                        Intrinsics.checkNotNullParameter(permission, "permission");
                        ue0.c cVar = this.f252800b.f252807c;
                        String strA = f.a(vaultId);
                        Intrinsics.checkNotNullParameter(permission, "<this>");
                        cVar.G(new qab.b(permission.f193357a, permission.f193358b), strA, z.d(o0.b(qab.b.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String vaultId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(vaultId2, "vaultId");
                        d0<qab.a> withdrawalPermissions = this.f252800b.f252805a.getWithdrawalPermissions(vaultId2);
                        r83.d dVar = new r83.d(16, new r(15));
                        withdrawalPermissions.getClass();
                        i iVar = new i(withdrawalPermissions, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        String vaultId3 = (String) obj2;
                        lab.a permission2 = (lab.a) obj3;
                        Intrinsics.checkNotNullParameter(vaultId3, "vaultId");
                        Intrinsics.checkNotNullParameter(permission2, "permission");
                        this.f252800b.f252806b.f(f.a(vaultId3), permission2);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: rab.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f252802b;

            {
                this.f252802b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        e params = (e) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        f fVar = this.f252802b;
                        d0<qab.a> d0VarUpdateWithdrawalPermissions = fVar.f252805a.updateWithdrawalPermissions(params.f252803a, new qab.c(params.f252804b));
                        r83.d dVar = new r83.d(17, new r(16));
                        d0VarUpdateWithdrawalPermissions.getClass();
                        ufm.f fVar2 = new ufm.f(new i(d0VarUpdateWithdrawalPermissions, dVar, 1), new r83.d(18, new x(fVar, params, 13)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 1:
                        String vaultId = (String) obj2;
                        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                        return (lab.a) this.f252802b.f252806b.get(f.a(vaultId));
                    default:
                        String vaultId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(vaultId2, "vaultId");
                        ue0.c cVar = this.f252802b.f252807c;
                        String strA = f.a(vaultId2);
                        Type WITHDRAWAL_PERMISSION_TYPE = f.f;
                        Intrinsics.checkNotNullExpressionValue(WITHDRAWAL_PERMISSION_TYPE, "WITHDRAWAL_PERMISSION_TYPE");
                        qab.b bVar = (qab.b) cVar.T2(strA, WITHDRAWAL_PERMISSION_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        return new lab.a(bVar.getSavingId(), bVar.getWithdrawalsEnabled());
                }
            }
        };
        final int i2 = 2;
        Function2 function22 = new Function2(this) { // from class: rab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f252800b;

            {
                this.f252800b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        String vaultId = (String) obj2;
                        lab.a permission = (lab.a) obj3;
                        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                        Intrinsics.checkNotNullParameter(permission, "permission");
                        ue0.c cVar = this.f252800b.f252807c;
                        String strA = f.a(vaultId);
                        Intrinsics.checkNotNullParameter(permission, "<this>");
                        cVar.G(new qab.b(permission.f193357a, permission.f193358b), strA, z.d(o0.b(qab.b.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String vaultId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(vaultId2, "vaultId");
                        d0<qab.a> withdrawalPermissions = this.f252800b.f252805a.getWithdrawalPermissions(vaultId2);
                        r83.d dVar = new r83.d(16, new r(15));
                        withdrawalPermissions.getClass();
                        i iVar = new i(withdrawalPermissions, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        String vaultId3 = (String) obj2;
                        lab.a permission2 = (lab.a) obj3;
                        Intrinsics.checkNotNullParameter(vaultId3, "vaultId");
                        Intrinsics.checkNotNullParameter(permission2, "permission");
                        this.f252800b.f252806b.f(f.a(vaultId3), permission2);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: rab.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f252802b;

            {
                this.f252802b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        e params = (e) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        f fVar = this.f252802b;
                        d0<qab.a> d0VarUpdateWithdrawalPermissions = fVar.f252805a.updateWithdrawalPermissions(params.f252803a, new qab.c(params.f252804b));
                        r83.d dVar = new r83.d(17, new r(16));
                        d0VarUpdateWithdrawalPermissions.getClass();
                        ufm.f fVar2 = new ufm.f(new i(d0VarUpdateWithdrawalPermissions, dVar, 1), new r83.d(18, new x(fVar, params, 13)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 1:
                        String vaultId = (String) obj2;
                        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                        return (lab.a) this.f252802b.f252806b.get(f.a(vaultId));
                    default:
                        String vaultId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(vaultId2, "vaultId");
                        ue0.c cVar = this.f252802b.f252807c;
                        String strA = f.a(vaultId2);
                        Type WITHDRAWAL_PERMISSION_TYPE = f.f;
                        Intrinsics.checkNotNullExpressionValue(WITHDRAWAL_PERMISSION_TYPE, "WITHDRAWAL_PERMISSION_TYPE");
                        qab.b bVar = (qab.b) cVar.T2(strA, WITHDRAWAL_PERMISSION_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        return new lab.a(bVar.getSavingId(), bVar.getWithdrawalsEnabled());
                }
            }
        };
        final int i3 = 0;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: rab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f252800b;

            {
                this.f252800b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        String vaultId = (String) obj2;
                        lab.a permission = (lab.a) obj3;
                        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                        Intrinsics.checkNotNullParameter(permission, "permission");
                        ue0.c cVar = this.f252800b.f252807c;
                        String strA = f.a(vaultId);
                        Intrinsics.checkNotNullParameter(permission, "<this>");
                        cVar.G(new qab.b(permission.f193357a, permission.f193358b), strA, z.d(o0.b(qab.b.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String vaultId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(vaultId2, "vaultId");
                        d0<qab.a> withdrawalPermissions = this.f252800b.f252805a.getWithdrawalPermissions(vaultId2);
                        r83.d dVar = new r83.d(16, new r(15));
                        withdrawalPermissions.getClass();
                        i iVar = new i(withdrawalPermissions, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        String vaultId3 = (String) obj2;
                        lab.a permission2 = (lab.a) obj3;
                        Intrinsics.checkNotNullParameter(vaultId3, "vaultId");
                        Intrinsics.checkNotNullParameter(permission2, "permission");
                        this.f252800b.f252806b.f(f.a(vaultId3), permission2);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 0;
        this.e = new h(20, new Function1(this) { // from class: rab.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f252802b;

            {
                this.f252802b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        e params = (e) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        f fVar = this.f252802b;
                        d0<qab.a> d0VarUpdateWithdrawalPermissions = fVar.f252805a.updateWithdrawalPermissions(params.f252803a, new qab.c(params.f252804b));
                        r83.d dVar = new r83.d(17, new r(16));
                        d0VarUpdateWithdrawalPermissions.getClass();
                        ufm.f fVar2 = new ufm.f(new i(d0VarUpdateWithdrawalPermissions, dVar, 1), new r83.d(18, new x(fVar, params, 13)), 3);
                        Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                        return fVar2;
                    case 1:
                        String vaultId = (String) obj2;
                        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
                        return (lab.a) this.f252802b.f252806b.get(f.a(vaultId));
                    default:
                        String vaultId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(vaultId2, "vaultId");
                        ue0.c cVar = this.f252802b.f252807c;
                        String strA = f.a(vaultId2);
                        Type WITHDRAWAL_PERMISSION_TYPE = f.f;
                        Intrinsics.checkNotNullExpressionValue(WITHDRAWAL_PERMISSION_TYPE, "WITHDRAWAL_PERMISSION_TYPE");
                        qab.b bVar = (qab.b) cVar.T2(strA, WITHDRAWAL_PERMISSION_TYPE);
                        if (bVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(bVar, "<this>");
                        return new lab.a(bVar.getSavingId(), bVar.getWithdrawalsEnabled());
                }
            }
        });
    }

    public static String a(String str) {
        return j6.a.q("WITHDRAWAL_PERMISSIONS_KEY", str);
    }
}
