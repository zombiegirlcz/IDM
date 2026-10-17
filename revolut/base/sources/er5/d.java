package er5;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$InputData;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.dialogs.CryptoSendWalletsListDialogsController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.dialogs.CryptoSendWalletsListDialogsControllerContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import efm.r;
import eif.j;
import eli.k;
import eqd.h;
import java.util.ArrayList;
import java.util.List;
import ko5.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import lo5.b0;
import lo5.c0;
import lo5.x;
import lo5.y;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;
import zhm.d0;
import zhm.f0;
import zq5.g0;
import zq5.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CryptoSendWalletsListControllerContract$InputData f128544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c70.a f128545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ap5.b f128546n;
    public final kq5.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final po5.a f128547p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pn5.a f128548q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bk5.a f128549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f128550s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f128551t;

    public d(CryptoSendWalletsListControllerContract$InputData inputData, c70.a clipboard, ap5.b cryptoWithdrawInteractor, kq5.b deleteBeneficiaryExtension, po5.a cryptoWithdrawEnabledStateChecker, pn5.a cryptoAddressValidationInteractor, bk5.a blockchainInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(deleteBeneficiaryExtension, "deleteBeneficiaryExtension");
        Intrinsics.checkNotNullParameter(cryptoWithdrawEnabledStateChecker, "cryptoWithdrawEnabledStateChecker");
        Intrinsics.checkNotNullParameter(cryptoAddressValidationInteractor, "cryptoAddressValidationInteractor");
        Intrinsics.checkNotNullParameter(blockchainInteractor, "blockchainInteractor");
        this.f128544l = inputData;
        this.f128545m = clipboard;
        this.f128546n = cryptoWithdrawInteractor;
        this.o = deleteBeneficiaryExtension;
        this.f128547p = cryptoWithdrawEnabledStateChecker;
        this.f128548q = cryptoAddressValidationInteractor;
        this.f128549r = blockchainInteractor;
        this.f128550s = q.b(1, 1, ukm.f.DROP_OLDEST);
        this.f128551t = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // er5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof er5.c
            if (r0 == 0) goto L13
            r0 = r6
            er5.c r0 = (er5.c) r0
            int r1 = r0.f128543x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128543x = r1
            goto L18
        L13:
            er5.c r0 = new er5.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128543x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r0 = r0.u
            yhm.o.b(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            c70.a r6 = r5.f128545m
            java.lang.String r6 = r6.d()
            if (r6 == 0) goto L6a
            po5.a r2 = r5.f128547p
            ufm.i r2 = r2.a()
            r0.u = r6
            r0.f128543x = r3
            java.lang.Object r0 = nim.a.b(r2, r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r4 = r0
            r0 = r6
            r6 = r4
        L50:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            boolean r6 = r6.booleanValue()
            pn5.a r1 = r5.f128548q
            wk5.a r6 = r1.a(r0, r6)
            if (r6 == 0) goto L6a
            com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$InputData r1 = r5.f128544l
            boolean r6 = ue8.c.H(r1, r6)
            if (r6 == 0) goto L6a
            return r0
        L6a:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: er5.d.Z2(gim.c):java.lang.Object");
    }

    @Override // er5.e
    public final List b3() {
        return d0.d1(this.f128551t);
    }

    @Override // er5.e
    public final z1 c3() {
        return this.f128550s;
    }

    @Override // er5.e
    public final r d3(xi0.b bVar) {
        r rVarJ;
        CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData = this.f128544l;
        if (!cryptoSendWalletsListControllerContract$InputData.f71335b.contains(p.WALLET)) {
            f0 f0Var = f0.f322471a;
            return zi0.c.j(new f(f0Var, f0Var));
        }
        r rVarDoOnNext = this.f128546n.e(true, ho5.a.ADDRESS_TYPE, true).doOnNext(new k(new a(this, 1), 6));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        r rVarW = nim.a.w(rVarDoOnNext, new a(this, 2));
        if (bVar != null) {
            r rVarFilter = bk5.a.c(this.f128549r, bVar).filter(new k(new h(5), 7));
            Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
            rVarJ = nim.a.w(rVarFilter, new a(this, 3));
        } else {
            EnumEntries enumEntriesA = wk5.a.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : enumEntriesA) {
                if (ue8.c.H(cryptoSendWalletsListControllerContract$InputData, (wk5.a) obj2)) {
                    arrayList.add(obj2);
                }
            }
            rVarJ = zi0.c.j(arrayList);
        }
        return nim.a.w(kli.a.h(rVarW, rVarJ), new h(4));
    }

    @Override // er5.e
    public final void e3(String id10) {
        ar5.d dVar;
        Intrinsics.checkNotNullParameter(id10, "id");
        if (Intrinsics.f(id10, "CRYPTO_SEND_WALLETS_COMPATIBLE_ADDRESSES_SUBHEADER_ID")) {
            dVar = ar5.d.COMPATIBLE_ADDRESSES;
        } else if (!Intrinsics.f(id10, "CRYPTO_SEND_WALLETS_INCOMPATIBLE_ADDRESSES_SUBHEADER_ID")) {
            return;
        } else {
            dVar = ar5.d.INCOMPATIBLE_ADDRESSES;
        }
        xi0.b bVar = this.f128544l.f71334a;
        if (bVar == null) {
            throw new IllegalStateException("Input currency must not be null to see Subheader Dialogs");
        }
        N2(new CryptoSendWalletsListDialogsController(new CryptoSendWalletsListDialogsControllerContract$InputData(dVar, bVar)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new a(this, 0));
    }

    @Override // er5.e
    public final void f3(h0 row) {
        Intrinsics.checkNotNullParameter(row, "row");
        if (row instanceof zq5.f0) {
            h3(new x(((zq5.f0) row).f324378a));
        } else {
            if (!(row instanceof g0)) {
                throw new NoWhenBranchMatchedException();
            }
            T2(new j(this, ((g0) row).f324382a, null, 24), new yi5.b(27));
        }
    }

    @Override // er5.e
    public final void g3(h0 row, SwipeToActionDelegate.SwipeAction action, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(action, "action");
        if (row instanceof zq5.f0) {
            CryptoAddress cryptoAddress = ((zq5.f0) row).f324378a;
            String str = action.f53505a;
            String str2 = cryptoAddress.f71059a;
            if (Intrinsics.f(str, "CryptoSendWalletsListController_SwipeAction_Details_" + str2)) {
                h3(new y(str2));
                return;
            }
            if (Intrinsics.f(str, "CryptoSendWalletsListController_SwipeAction_Send_" + str2)) {
                h3(new b0(cryptoAddress, bVar));
                return;
            }
            if (Intrinsics.f(str, "CryptoSendWalletsListController_SwipeAction_Delete_" + str2)) {
                ((kq5.e) this.o).Z2(cryptoAddress);
            }
        }
    }

    public final void h3(c0 c0Var) {
        T2(new j(this, c0Var, null, 25), new yi5.b(27));
    }
}
