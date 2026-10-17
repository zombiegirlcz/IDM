package twg;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import aw0.x8;
import com.google.android.gms.wallet.WalletConstants;
import com.revolut.core.model.FileExtension;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.core.ui_kit.views.navbar.b0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmPayId;
import com.revolut.feature.apm.core.api.product.ApmPix;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.credit.autopay.models.AccountDetails;
import com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentData;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit.autopay.models.repayment.RepresentationAmountStyle;
import com.revolut.feature.credit.autopay.models.repayment.RepresentationDayStyle;
import com.revolut.feature.credit.autopay.models.repayment.RepresentationFromStyle;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.direct.debit.account_selection.models.DirectDebitPreviousMandate;
import com.revolut.feature.credit.direct.debit.account_selection.models.LinkedPocketInfo;
import com.revolut.feature.credit.loan.impl.ui.autopay.model.LoanAutoPayDataRequest;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$PetEditResult;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.WhoToTransferApi$Toggles;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import h93.f0;
import h93.h0;
import h93.l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import jel.e2;
import jq9.k;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import ne0.j;
import nwj.f1;
import or0.u;
import p35.e0;
import pfm.m;
import te0.w;
import tzd.l;
import tzd.n;
import tzd.q;
import tzd.t;
import u3a.v;
import ufm.i;
import vf0.h;
import vkm.t0;
import vwg.f;
import vwg.o;
import vwg.x;
import vyg.g;
import wim.z;
import x33.e;
import zh9.u0;
import zhm.d0;
import zw7.r;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f275013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f275014c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f275012a = i;
        this.f275013b = obj2;
        this.f275014c = obj3;
    }

    private final Object a(Object obj2) {
        RepresentationFromStyle externalAccount;
        LoanAutoPayDataRequest loanAutoPayDataRequest = (LoanAutoPayDataRequest) this.f275013b;
        bk4.b bVar = (bk4.b) this.f275014c;
        e0 loanManagementDetails = (e0) obj2;
        Intrinsics.checkNotNullParameter(loanManagementDetails, "loanManagementDetails");
        RepaymentSource repaymentSource = loanAutoPayDataRequest.f70325a;
        Intrinsics.h(bVar);
        dj0.d dVar = loanManagementDetails.P;
        if (dVar == null) {
            xi0.a aVar = xi0.b.Companion;
            String str = loanManagementDetails.f232624c;
            aVar.getClass();
            dVar = new dj0.d(0L, xi0.a.a(str));
        }
        RepresentationAmountStyle.SimpleMoney simpleMoney = new RepresentationAmountStyle.SimpleMoney(dVar);
        RepresentationDayStyle representationDayStyle = new RepresentationDayStyle(loanManagementDetails.L, false);
        if (repaymentSource instanceof RepaymentSource.RevolutWallet) {
            externalAccount = new RepresentationFromStyle.RevolutWallet((String) null, 3);
        } else {
            if (!(repaymentSource instanceof RepaymentSource.ExternalAccount)) {
                if (!(repaymentSource instanceof RepaymentSource.Pocket) && !(repaymentSource instanceof RepaymentSource.JointAccount)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(j6.a.q("Unsupported repayment source type: ", o0.f186429a.b(repaymentSource.getClass()).m()));
            }
            RepaymentSource.ExternalAccount.Companion companion = RepaymentSource.ExternalAccount.INSTANCE;
            AccountDetails.LinkedAccount linkedAccount = ((RepaymentSource.ExternalAccount) repaymentSource).f68552a;
            companion.getClass();
            externalAccount = new RepresentationFromStyle.ExternalAccount(RepaymentSource.ExternalAccount.Companion.a(linkedAccount), false);
        }
        return new AutoPayRepaymentData(simpleMoney, representationDayStyle, externalAccount, bVar, null, 112);
    }

    private final Object b(Object obj2) {
        ArrayList arrayList = (ArrayList) this.f275013b;
        ArrayList<k1j.b> arrayList2 = (ArrayList) this.f275014c;
        List compatibility = (List) obj2;
        Intrinsics.checkNotNullParameter(compatibility, "compatibility");
        ArrayList arrayListL1 = d0.l1(arrayList, compatibility);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayListL1) {
            if (((Boolean) ((Pair) obj3).f186386b).booleanValue()) {
                arrayList3.add(obj3);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it8 = arrayList3.iterator();
        while (it8.hasNext()) {
            linkedHashSet.add(((BalanceWrapper.DeFiBalanceWrapper) ((Pair) it8.next()).f186385a).f99406c.f306286a);
        }
        ArrayList arrayList4 = new ArrayList();
        for (k1j.b bVar : arrayList2) {
            List list = bVar.f180284c;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : list) {
                if (obj4 instanceof BalanceWrapper.DeFiBalanceWrapper) {
                    arrayList5.add(obj4);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj5 : arrayList5) {
                if (linkedHashSet.contains(((BalanceWrapper.DeFiBalanceWrapper) obj5).f99406c.f306286a)) {
                    arrayList6.add(obj5);
                }
            }
            if (arrayList6.isEmpty()) {
                bVar = null;
            }
            k1j.b bVarA = bVar != null ? k1j.b.a(bVar, arrayList6) : null;
            if (bVarA != null) {
                arrayList4.add(bVarA);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a9 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0016, B:5:0x001d, B:9:0x002d, B:10:0x009d, B:12:0x00a3, B:16:0x00b4, B:20:0x00c3, B:24:0x00d4, B:28:0x00e7, B:32:0x00f6, B:36:0x0105, B:40:0x0114, B:44:0x0123, B:48:0x013f, B:52:0x014c, B:56:0x015f, B:60:0x016e, B:62:0x0174, B:64:0x017a, B:66:0x0182, B:72:0x019e, B:76:0x01b1, B:80:0x01c4, B:84:0x01d7, B:87:0x01e4, B:83:0x01cf, B:79:0x01bc, B:75:0x01a9, B:59:0x0168, B:55:0x0159, B:51:0x0148, B:47:0x0130, B:43:0x011d, B:39:0x010e, B:35:0x00ff, B:31:0x00f0, B:27:0x00e1, B:23:0x00cc, B:19:0x00bd, B:15:0x00ae, B:8:0x0026), top: B:98:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bc A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0016, B:5:0x001d, B:9:0x002d, B:10:0x009d, B:12:0x00a3, B:16:0x00b4, B:20:0x00c3, B:24:0x00d4, B:28:0x00e7, B:32:0x00f6, B:36:0x0105, B:40:0x0114, B:44:0x0123, B:48:0x013f, B:52:0x014c, B:56:0x015f, B:60:0x016e, B:62:0x0174, B:64:0x017a, B:66:0x0182, B:72:0x019e, B:76:0x01b1, B:80:0x01c4, B:84:0x01d7, B:87:0x01e4, B:83:0x01cf, B:79:0x01bc, B:75:0x01a9, B:59:0x0168, B:55:0x0159, B:51:0x0148, B:47:0x0130, B:43:0x011d, B:39:0x010e, B:35:0x00ff, B:31:0x00f0, B:27:0x00e1, B:23:0x00cc, B:19:0x00bd, B:15:0x00ae, B:8:0x0026), top: B:98:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cf A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0016, B:5:0x001d, B:9:0x002d, B:10:0x009d, B:12:0x00a3, B:16:0x00b4, B:20:0x00c3, B:24:0x00d4, B:28:0x00e7, B:32:0x00f6, B:36:0x0105, B:40:0x0114, B:44:0x0123, B:48:0x013f, B:52:0x014c, B:56:0x015f, B:60:0x016e, B:62:0x0174, B:64:0x017a, B:66:0x0182, B:72:0x019e, B:76:0x01b1, B:80:0x01c4, B:84:0x01d7, B:87:0x01e4, B:83:0x01cf, B:79:0x01bc, B:75:0x01a9, B:59:0x0168, B:55:0x0159, B:51:0x0148, B:47:0x0130, B:43:0x011d, B:39:0x010e, B:35:0x00ff, B:31:0x00f0, B:27:0x00e1, B:23:0x00cc, B:19:0x00bd, B:15:0x00ae, B:8:0x0026), top: B:98:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e4 A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0016, B:5:0x001d, B:9:0x002d, B:10:0x009d, B:12:0x00a3, B:16:0x00b4, B:20:0x00c3, B:24:0x00d4, B:28:0x00e7, B:32:0x00f6, B:36:0x0105, B:40:0x0114, B:44:0x0123, B:48:0x013f, B:52:0x014c, B:56:0x015f, B:60:0x016e, B:62:0x0174, B:64:0x017a, B:66:0x0182, B:72:0x019e, B:76:0x01b1, B:80:0x01c4, B:84:0x01d7, B:87:0x01e4, B:83:0x01cf, B:79:0x01bc, B:75:0x01a9, B:59:0x0168, B:55:0x0159, B:51:0x0148, B:47:0x0130, B:43:0x011d, B:39:0x010e, B:35:0x00ff, B:31:0x00f0, B:27:0x00e1, B:23:0x00cc, B:19:0x00bd, B:15:0x00ae, B:8:0x0026), top: B:98:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: twg.a.c(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        f fVar;
        x xVar;
        Object next;
        lwg.a aVar;
        ArrayList arrayList;
        LayeredImage layeredImageD;
        Collection collectionValues;
        int i = this.f275012a;
        int i2 = 7;
        int i3 = 6;
        int i5 = 0;
        dj0.d dVar = null;
        Object obj3 = this.f275014c;
        Object obj4 = this.f275013b;
        switch (i) {
            case 0:
                c cVar = (c) obj4;
                String str = (String) obj3;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM `portfolio_insights` WHERE `portfolio_id` = ?");
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "portfolio_id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "usage_requirements");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "summary");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "indicators");
                    if (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String jsonString = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        e eVarA = cVar.a();
                        eVarA.getClass();
                        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
                        vwg.d0 d0Var = (vwg.d0) eVarA.f275021a.b(vwg.d0.Companion.serializer(), jsonString);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        e eVarA2 = cVar.a();
                        if (text2 != null) {
                            xVar = (x) eVarA2.f275021a.b(x.Companion.serializer(), text2);
                        } else {
                            eVarA2.getClass();
                            xVar = null;
                        }
                        String jsonString2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        e eVarA3 = cVar.a();
                        eVarA3.getClass();
                        Intrinsics.checkNotNullParameter(jsonString2, "jsonString");
                        fVar = new f(text, d0Var, xVar, (List) eVarA3.f275021a.b(nlm.a.a(o.Companion.serializer()), jsonString2));
                    } else {
                        fVar = null;
                    }
                    sQLiteStatementPrepare.close();
                    return fVar;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 1:
                ((b) ((c) obj4).d).insert((SQLiteConnection) obj2, (vwg.d) obj3);
                return Unit.f186387a;
            case 2:
                twh.d dVar2 = (twh.d) obj4;
                String promptId = (String) obj3;
                Boolean alreadyViewed = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(alreadyViewed, "alreadyViewed");
                if (alreadyViewed.booleanValue()) {
                    return m.f235744a;
                }
                uwh.a aVar2 = dVar2.f275027b;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(promptId, "promptId");
                return w.g0(aVar2.f283666a.markAsViewed(promptId));
            case 3:
                List list = (List) obj3;
                List answers = (List) obj2;
                Intrinsics.checkNotNullParameter(answers, "answers");
                j jVar = ((twj.f) obj4).f275038b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : answers) {
                    if (((o0j.c) obj5) instanceof o0j.b) {
                        arrayList2.add(obj5);
                    }
                }
                jVar.f("ANSWERS_FOR_SUBMISSION_CACHE_KEY", arrayList2);
                Intrinsics.h(list);
                ArrayList arrayListZ = d0.Z(list);
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListZ, 10));
                Iterator it8 = arrayListZ.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(mwj.c.a((f1) it8.next()));
                }
                return arrayList3;
            case 4:
                twj.f fVar2 = (twj.f) obj4;
                List savedAnswers = (List) obj2;
                Intrinsics.checkNotNullParameter(savedAnswers, "savedAnswers");
                ufm.f fVar3 = new ufm.f(new ufm.c(new tif.e(fVar2, 4, savedAnswers, (String) obj3), 0), new ts5.o(21, new twj.c(fVar2, i5)), 3);
                Intrinsics.checkNotNullExpressionValue(fVar3, "doOnSuccess(...)");
                return w.i0(fVar3);
            case 5:
                return BasicNavBar.k((BasicNavBar) obj4, (Clause) obj3, (ty0.a) obj2);
            case 6:
                NavBarWithContainerHeaderView navBarWithContainerHeaderView = (NavBarWithContainerHeaderView) obj4;
                ty0.a it9 = (ty0.a) obj2;
                NavBarWithContainerHeaderView.Companion companion = NavBarWithContainerHeaderView.INSTANCE;
                Intrinsics.checkNotNullParameter(it9, "it");
                u.k(navBarWithContainerHeaderView).n0().a(navBarWithContainerHeaderView.headerDisclaimer, navBarWithContainerHeaderView, new py0.c((Clause) obj3));
                navBarWithContainerHeaderView.S.onNext(it9);
                return Unit.f186387a;
            case 7:
                b0 b0Var = (b0) obj4;
                x8 x8Var = (x8) obj2;
                Intrinsics.h(x8Var);
                b0Var.F(x8Var);
                StoryNavBarContentView.a((StoryNavBarContentView) obj3, b0Var);
                return Unit.f186387a;
            case 8:
                WallpaperAssetSwitcher wallpaperAssetSwitcher = (WallpaperAssetSwitcher) obj4;
                NavBarWithContainerBackground.VideoBackground videoBackground = (NavBarWithContainerBackground.VideoBackground) obj3;
                Drawable drawable = (Drawable) obj2;
                if (!wallpaperAssetSwitcher.f59501q) {
                    wallpaperAssetSwitcher.f59501q = true;
                    wallpaperAssetSwitcher.f59503s.removeCallbacks(wallpaperAssetSwitcher.v);
                    wallpaperAssetSwitcher.d(wallpaperAssetSwitcher.e);
                    wallpaperAssetSwitcher.i(drawable, videoBackground);
                    wallpaperAssetSwitcher.k();
                }
                return Unit.f186387a;
            case 9:
                List list2 = (List) obj4;
                ty4.o oVar = (ty4.o) obj3;
                List paymentSources = (List) obj2;
                Intrinsics.checkNotNullParameter(paymentSources, "paymentSources");
                List<dz4.a> list3 = paymentSources;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                for (dz4.a aVar3 : list3) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj6 : list2) {
                        if (obj6 instanceof LinkedPocketInfo) {
                            arrayList5.add(obj6);
                        }
                    }
                    Iterator it10 = arrayList5.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            next = it10.next();
                            LinkedPocketInfo linkedPocketInfo = (LinkedPocketInfo) next;
                            if (!Intrinsics.f(linkedPocketInfo.f, aVar3.f121237c) || !Intrinsics.f(linkedPocketInfo.f69902g, aVar3.f121236b)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    LinkedPocketInfo linkedPocketInfo2 = (LinkedPocketInfo) next;
                    arrayList4.add(linkedPocketInfo2 == null ? new DirectDebitPreviousMandate(oVar.f275480r.b(new TextLocalisedClause(R$string.loan_management_default_bank_name, null, null, 14)).toString(), aVar3.f121235a, null, null, aVar3.d, new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), aVar3.f121237c, aVar3.f121236b, aVar3.d) : new DirectDebitPreviousMandate(linkedPocketInfo2.f69899a, aVar3.f121235a, linkedPocketInfo2.f69900b, linkedPocketInfo2.f69901c, linkedPocketInfo2.d, linkedPocketInfo2.e, linkedPocketInfo2.f, linkedPocketInfo2.f69902g, linkedPocketInfo2.f69903h));
                }
                return arrayList4;
            case 10:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new h((zw7.d0) obj4, (PetEditDetailsContract$PetEditResult) pair.f186385a, (r) obj3, (PolicyDocument) pair.f186386b);
            case 11:
                g benchmarkType = (g) obj3;
                List benchmarks = (List) obj2;
                Intrinsics.checkNotNullParameter(benchmarks, "benchmarks");
                vvg.b bVar = (vvg.b) ((kbb.c) obj4).f182549b;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(benchmarkType, "benchmarkType");
                ue0.c cVar2 = bVar.f292541a;
                zvg.a aVar4 = (zvg.a) j6.a.k(zvg.a.class, cVar2, benchmarkType.name());
                if ((aVar4 != null ? aVar4.getBenchmarkRef() : null) == null && (aVar = (lwg.a) d0.d0(benchmarks)) != null) {
                    bVar.a(benchmarkType, aVar.f200457a, false);
                }
                Intrinsics.checkNotNullParameter(benchmarkType, "benchmarkType");
                return new tse.c(new aa7.c(new t0(ue0.e.R(cVar2, benchmarkType.name(), z.d(o0.b(zvg.a.class))), 1), i3), benchmarks, i3);
            case 12:
                tzd.g gVar = (tzd.g) obj4;
                t tVar = (t) obj3;
                StatementUrlState content = (StatementUrlState) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                if (content instanceof StatementUrlState.InPreparation) {
                    ufm.b bVarM = efm.d0.m(new l(((StatementUrlState.InPreparation) content).getEmail()));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                if (!(content instanceof StatementUrlState.Ready)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = q.f275937b[gVar.f275928c.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        return new i(tVar.f275940p.b(((StatementUrlState.Ready) content).getUrl(), true, FileExtension.Csv.f51401b), new ty1.c(new tyg.g(i2), 25), 1);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ufm.b bVarM2 = efm.d0.m(new n(((StatementUrlState.Ready) content).getUrl()));
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                return bVarM2;
            case 13:
                e03.b bVar2 = (e03.b) obj4;
                u03.j jVar2 = (u03.j) obj3;
                List cardPaymentMethodWidget = (List) obj2;
                Intrinsics.checkNotNullParameter(cardPaymentMethodWidget, "cardPaymentMethodWidget");
                wy2.b bVar3 = bVar2.f121386l;
                f0 card = bVar2.f121380a;
                if (bVar3 != wy2.b.DEFAULT) {
                    cardPaymentMethodWidget = null;
                }
                if (cardPaymentMethodWidget == null) {
                    cardPaymentMethodWidget = zhm.f0.f322471a;
                }
                List list4 = cardPaymentMethodWidget;
                jVar2.getClass();
                int i21 = u03.i.f276046a[bVar2.f121386l.ordinal()];
                if (i21 == 1) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.addAll(jVar2.c(bVar2));
                    ArrayList arrayList7 = new ArrayList();
                    jVar2.f276047a.getClass();
                    if (!card.X) {
                        arrayList7.add(u03.j.b(card));
                    }
                    if (card.L) {
                        if (((jte.d) jVar2.d).c(CardsCoreApi$Toggles.VirtualCardDesignChange.f65573c)) {
                            arrayList7.add(new RowDelegate.Model("DESIGN_CARD_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_palette, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_settings_section_design_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_settings_section_design_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, card, null, 0, 0, 0, 0, 1056964460));
                        }
                    }
                    arrayList6.addAll(arrayList7.isEmpty() ? zhm.f0.f322471a : yp0.b.g(arrayList7, new ListSubheaderDelegate.Model("CUSTOMISE_SECTION_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_settings_section_customise, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                    arrayList6.addAll(u03.j.d(bVar2));
                    ArrayList arrayList8 = new ArrayList();
                    if (bVar2.i) {
                        arrayList8.add(new RowDelegate.Model("GOOGLE_PAY_WALLET_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_wallet, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_settings_item_shopping_open_in_gpay_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_settings_item_shopping_open_in_gpay_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741676));
                    }
                    arrayList6.addAll(arrayList8.isEmpty() ? zhm.f0.f322471a : yp0.b.g(arrayList8, new ListSubheaderDelegate.Model("FASTER_SHOPPING_SECTION_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_settings_section_shopping, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
                    arrayList6.addAll(jVar2.f(bVar2));
                    arrayList6.addAll(u03.j.a(bVar2));
                    arrayList = arrayList6;
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList = new ArrayList();
                    boolean zE = h0.e(card);
                    u03.g gVar2 = jVar2.f276049c;
                    Intrinsics.checkNotNullParameter(card, "card");
                    String str2 = card.f150115j;
                    TextClause textClause = str2 != null ? new TextClause("··".concat(str2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                    String strC = h0.c(card);
                    TextClause[] elements = {textClause, strC != null ? new TextClause(strC, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    List listL = kotlin.collections.d.L(elements);
                    int i22 = h0.e(card) ? com.revolut.feature.cards_core.R$string.cards_home_widget_action_unfreeze : com.revolut.feature.cards_core.R$string.cards_home_widget_action_freeze;
                    CompositeClause compositeClauseJ = v04.b.J(card, card.f150111b, null, null, 14);
                    CompositeClause compositeClauseM = !((ArrayList) listL).isEmpty() ? yoj.b.m(u03.g.f276044b, listL) : null;
                    Image imageB = ((ia3.h) gVar2.f276045a).b(card.f150114h, h0.e(card));
                    if (h0.e(card)) {
                        int i32 = R$drawable.uikit_icn_24_snowflake;
                        int i33 = R$attr.uikit_colorRed;
                        int i43 = R$attr.uikit_colorForeground;
                        layeredImageD = LayeredImage.INSTANCE.d(i32, i33, i43, Integer.valueOf(i43), 2.0f, 2.0f, Float.valueOf(8.0f));
                    } else {
                        layeredImageD = null;
                    }
                    RowDelegate.Model model = new RowDelegate.Model("CARD_ITEM_LIST_ID", new RowDelegate.Model.MainImage.Image40(imageB, layeredImageD, null, false, 28), compositeClauseJ, null, 0, compositeClauseM, null, null, 0, new pf(new TextLocalisedClause(i22, null, null, 14), null, null, false, card, "CARD_ITEM_LIST_ID", WalletConstants.ERROR_CODE_ILLEGAL_CALLER), false, null, false, null, null, null, null, null, null, card, null, 0, 0, 0, 0, 532675544);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(model);
                    if (!zE) {
                        arrayList.addAll(jVar2.c(bVar2));
                        arrayList.addAll(u03.j.d(bVar2));
                        arrayList.addAll(jVar2.f(bVar2));
                    }
                    arrayList.addAll(u03.j.a(bVar2));
                }
                return d0.E0(arrayList, list4);
            case 14:
                String name = (String) obj2;
                Intrinsics.checkNotNullParameter(name, "name");
                return ((uu9.f) ((u0a.a) obj4).f276162b).a((String) obj3, name);
            case 15:
                Function1 function1 = (Function1) obj4;
                Class cls = (Class) obj3;
                List<k> list5 = (List) obj2;
                Intrinsics.checkNotNullParameter(list5, "list");
                ArrayList arrayList9 = new ArrayList();
                for (k kVar : list5) {
                    jq9.l lVar = kVar instanceof jq9.l ? (jq9.l) kVar : null;
                    ApmRecipient apmRecipient = lVar != null ? lVar.f177506b : null;
                    ApmContact apmContact = apmRecipient instanceof ApmContact ? (ApmContact) apmRecipient : null;
                    if (apmContact == null || !cls.isInstance(apmContact)) {
                        apmContact = null;
                    }
                    if (apmContact != null) {
                        arrayList9.add(apmContact);
                    }
                }
                ArrayList arrayList10 = new ArrayList();
                for (Object obj7 : arrayList9) {
                    if (((Boolean) function1.invoke(obj7)).booleanValue()) {
                        arrayList10.add(obj7);
                    }
                }
                return arrayList10;
            case 16:
                List beneficiaries = (List) obj2;
                Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaryList");
                sz5.f fVar4 = ((u3a.c) obj4).f276836b;
                u3a.d cacheContext = u3a.d.BENEFICIARIES;
                Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                Intrinsics.checkNotNullParameter(cacheContext, "cacheContext");
                i iVar = new i(((v) fVar4.d).a(beneficiaries, (String) obj3, new a(fVar4, cacheContext, 19)), new u21.a(25, new u21.b(23)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 17:
                Boolean isPixFeatureEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isPixFeatureEnabled, "isPixFeatureEnabled");
                return nim.a.w((efm.r) obj4, new a((u3a.c) obj3, isPixFeatureEnabled, 18));
            case 18:
                Boolean bool = (Boolean) obj3;
                List beneficiaries2 = (List) obj2;
                Intrinsics.checkNotNullParameter(beneficiaries2, "beneficiaries");
                Intrinsics.h(bool);
                boolean zBooleanValue = bool.booleanValue();
                boolean zC = ((jte.d) ((u3a.c) obj4).d).c(WhoToTransferApi$Toggles.TransferVendorFiltering.f80047c);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj8 : beneficiaries2) {
                    f5j.a aVar5 = (f5j.a) obj8;
                    d3a.a aVar6 = (zBooleanValue && f5j.c.c(aVar5)) ? d3a.a.APM_PIX : (zC && aVar5.f132335l == f5j.r.MOBILE_WALLET) ? d3a.a.MOBILE_WALLET : d3a.a.ACCOUNTS;
                    Object arrayList11 = linkedHashMap.get(aVar6);
                    if (arrayList11 == null) {
                        arrayList11 = new ArrayList();
                        linkedHashMap.put(aVar6, arrayList11);
                    }
                    ((List) arrayList11).add(obj8);
                }
                List list6 = (List) linkedHashMap.get(d3a.a.ACCOUNTS);
                if (list6 == null) {
                    list6 = zhm.f0.f322471a;
                }
                List list7 = (List) linkedHashMap.get(d3a.a.APM_PIX);
                if (list7 == null) {
                    list7 = zhm.f0.f322471a;
                }
                List list8 = (List) linkedHashMap.get(d3a.a.MOBILE_WALLET);
                if (list8 == null) {
                    list8 = zhm.f0.f322471a;
                }
                return new u3a.a(list6, list7, list8);
            case 19:
                sz5.f fVar5 = (sz5.f) obj4;
                u3a.d dVar3 = (u3a.d) obj3;
                f5j.a beneficiary = (f5j.a) obj2;
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                Object obj9 = ((Map) fVar5.f266766b).get(dVar3);
                if (obj9 == null) {
                    throw new IllegalArgumentException("No cache for cache context " + dVar3);
                }
                ne0.n nVar = (ne0.n) obj9;
                String str3 = beneficiary.f132329a;
                Object objK0 = nVar.get(str3);
                if (objK0 == null) {
                    Intrinsics.checkNotNullParameter(beneficiary, "<this>");
                    String strC2 = n61.j.c(beneficiary);
                    String str4 = beneficiary.A;
                    String str5 = beneficiary.f132333h;
                    String str6 = beneficiary.C;
                    String str7 = beneficiary.i;
                    String str8 = beneficiary.f132334j;
                    Map map = beneficiary.u;
                    String[] elements2 = {strC2, str4, str5, str6, str7, str8, (map == null || (collectionValues = map.values()) == null) ? null : d0.k0(collectionValues, "|", null, null, 0, new n5k.c(i3), 30)};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    String strK0 = d0.k0(kotlin.collections.d.L(elements2), "|", null, null, 0, new n5k.c(i2), 30);
                    f5j.r rVar = beneficiary.f132335l;
                    int i59 = rVar == null ? -1 : u3a.u.f276881a[rVar.ordinal()];
                    TextLocalisedClause textLocalisedClauseE = i59 != 1 ? (i59 == 2 || i59 == 3) ? ApmPix.f61820c.e() : null : ApmPayId.f61819c.e();
                    String[] elements3 = {strK0, textLocalisedClauseE == null ? null : ngm.n.I(((f01.c) fVar5.f266765a).b(textLocalisedClauseE).toString()), (String) ((Lazy) fVar5.e).getValue()};
                    Intrinsics.checkNotNullParameter(elements3, "elements");
                    objK0 = d0.k0(kotlin.collections.d.L(elements3), "|", null, null, 0, null, 62);
                    nVar.f(str3, objK0);
                }
                return (String) objK0;
            case 20:
                u43.g gVar3 = (u43.g) obj4;
                s43.f fVar6 = (s43.f) obj3;
                s43.e item = (s43.e) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                if (!(item instanceof s43.c)) {
                    if (!(item instanceof s43.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s43.b bVar4 = gVar3.f277040c;
                    x33.a aVar7 = ((s43.d) item).f259733b;
                    return ((t43.a) bVar4).a(aVar7, fVar6.a().a().contains(aVar7.f302630a.f65523a.f163145a), false);
                }
                String str9 = ((s43.c) item).f259730a;
                if (str9.equals("SEARCHABLE_ITEM_ID_ALL_BALANCES_CRYPTO")) {
                    return u43.e.b("LIST_ID_ALL_CRYPTO", fVar6.f259736c.f302633b.f302637b, gVar3.e, gVar3.f, R$drawable.uikit_icn_24_coins, fVar6.a() instanceof e.a);
                }
                throw new IllegalStateException(("unknown item for section " + fVar6.f259735b.a() + ": " + str9).toString());
            case 21:
                u43.j jVar3 = (u43.j) obj4;
                s43.f fVar7 = (s43.f) obj3;
                s43.e item2 = (s43.e) obj2;
                Intrinsics.checkNotNullParameter(item2, "item");
                if (!(item2 instanceof s43.c)) {
                    if (!(item2 instanceof s43.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s43.b bVar5 = jVar3.f277042c;
                    x33.a aVar8 = ((s43.d) item2).f259733b;
                    return ((t43.a) bVar5).a(aVar8, fVar7.a().a().contains(aVar8.f302630a.f65523a.f163145a), false);
                }
                String str10 = ((s43.c) item2).f259730a;
                if (!str10.equals("SEARCHABLE_ITEM_ID_ALL_BALANCES_FIAT")) {
                    throw new IllegalStateException(("unknown item for section " + fVar7.f259735b.a() + ": " + str10).toString());
                }
                AccountId accountId = fVar7.f259734a;
                l0 l0Var = fVar7.i;
                x33.b bVar6 = fVar7.f259736c;
                if (l0Var == null) {
                    dVar = bVar6.f302632a.f302637b;
                } else {
                    List list9 = bVar6.f302632a.f302636a;
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj10 : list9) {
                        if (jVar3.f277039b.a(l0Var, ((x33.a) obj10).f302630a.f65523a.f163147c)) {
                            arrayList12.add(obj10);
                        }
                    }
                    ArrayList arrayList13 = new ArrayList();
                    Iterator it11 = arrayList12.iterator();
                    while (it11.hasNext()) {
                        dj0.d dVar4 = ((x33.a) it11.next()).f302631b;
                        if (dVar4 != null) {
                            arrayList13.add(dVar4);
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        arrayList13 = null;
                    }
                    if (arrayList13 != null) {
                        Iterator it12 = arrayList13.iterator();
                        if (!it12.hasNext()) {
                            throw new UnsupportedOperationException("Empty collection can't be reduced.");
                        }
                        Object next2 = it12.next();
                        while (it12.hasNext()) {
                            next2 = pyd.c.O((dj0.d) next2, (dj0.d) it12.next());
                        }
                        dVar = (dj0.d) next2;
                    }
                }
                return u43.e.b("LIST_ID_ALL_FIAT", dVar, u43.j.e(accountId, l0Var), null, R$drawable.uikit_icn_24_cash, fVar7.a() instanceof e.b);
            case 22:
                s43.f fVar8 = (s43.f) obj4;
                u43.l lVar2 = (u43.l) obj3;
                s43.e item3 = (s43.e) obj2;
                Intrinsics.checkNotNullParameter(item3, "item");
                if (!(item3 instanceof s43.c)) {
                    if (!(item3 instanceof s43.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s43.b bVar7 = lVar2.f277043c;
                    x33.a aVar9 = ((s43.d) item3).f259733b;
                    return ((t43.a) bVar7).a(aVar9, fVar8.a().a().contains(aVar9.f302630a.f65523a.f163145a), fVar8.e.contains(aVar9.f302630a.f65523a.f163145a));
                }
                throw new IllegalStateException(("unknown item for section " + fVar8.f259735b.a() + ": " + ((s43.c) item3).f259730a).toString());
            case 23:
                List recommendations = (List) obj2;
                Intrinsics.checkNotNullParameter(recommendations, "recommendations");
                od0.h hVar = od0.i.Companion;
                ((u4e.m) obj4).f277338r.getClass();
                q4e.c cVarA = p4e.a.a((e2) obj3, recommendations);
                hVar.getClass();
                return od0.h.a(cVarA);
            case 24:
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f fVar9 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f) obj4;
                yki.l lVar3 = (yki.l) obj3;
                t4j.d output = (t4j.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output == null) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar9.C1(u0.c(((uz9.a) fVar9.f99760x).a(new ChatTransferRecipient.BeneficiaryRecipient(output.f268006a, null), null)));
                oki.h.D2(lVar3);
                return Unit.f186387a;
            case 25:
                u55.a aVar10 = (u55.a) obj4;
                LoanAutoPayDataRequest loanAutoPayDataRequest = (LoanAutoPayDataRequest) obj3;
                bk4.b docs = (bk4.b) obj2;
                Intrinsics.checkNotNullParameter(docs, "docs");
                return nim.a.w(((y45.f) aVar10.f277381a).m(loanAutoPayDataRequest.f70326b, w4l.h.f294642c), new a(aVar10, loanAutoPayDataRequest, docs));
            case 26:
                return a(obj2);
            case 27:
                return b(obj2);
            case 28:
                return c(obj2);
            default:
                ((u69.h) obj4).f277519b.insert((SQLiteConnection) obj2, (Iterable) obj3);
                return null;
        }
    }

    public /* synthetic */ a(u55.a aVar, LoanAutoPayDataRequest loanAutoPayDataRequest, bk4.b bVar) {
        this.f275012a = 26;
        this.f275013b = loanAutoPayDataRequest;
        this.f275014c = bVar;
    }
}
