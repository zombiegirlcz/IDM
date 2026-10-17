package ac8;

import aw0.o9;
import bn2.x;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.data.network.BankAccountSwitchingService;
import com.revolut.feature.bank_account_switching.impl.domain.CardDigits;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import com.revolut.feature.bank_account_switching.impl.ui.review.domain.BankInformation;
import com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.domain.TermsStep;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.kyc.core.impl.kyc.UserKycService;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.tax_residency.impl.v2.models.ExemptionReason;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreviewParams;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.nfc_reader_documents.NfcDocument$PassportRaw;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import dej.q1;
import dfj.v2;
import eq5.z0;
import fg8.t0;
import gim.i;
import id1.n;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.n0;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import lmg.q;
import m1c.v0;
import m1c.w0;
import mn6.j;
import nfj.a1;
import nx1.u;
import okhttp3.MultipartBody$Part;
import q35.g0;
import qn2.p;
import qt8.m;
import rn2.a0;
import rn2.b0;
import rn2.t;
import rn2.z;
import skm.e0;
import ulm.e1;
import ulm.o1;
import w4l.k;
import yhm.o;
import zhm.f0;
import zhm.r0;
import zhm.v;
import zhm.w;
import zm3.l;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends i implements Function2 {
    public Object A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f3103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f3104x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f3105y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f3105y = obj2;
        this.z = serializable;
        this.A = obj3;
        this.B = obj4;
        this.C = obj5;
    }

    private final Object A(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            qt8.o oVar = (qt8.o) this.f3103w;
            UserKycService userKycService = oVar.f249036a;
            String str = (String) this.f3104x;
            MultipartBody$Part multipartBody$Part = (MultipartBody$Part) this.f3105y;
            oy8.b bVar = oVar.f249038c;
            my8.h metadata = ((my8.d) this.z).f210376b;
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            e1 e1Var = MultipartBody$Part.Companion;
            String strK = ((bz8.a) bVar).d.k(r0.k(new Pair("scanType", metadata.f210377a.a()), new Pair("source", metadata.f210379c), new Pair("metaData", r0.k(new Pair("language", metadata.d), new Pair("region", metadata.e), new Pair("model", metadata.f)))));
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
            e1Var.getClass();
            MultipartBody$Part multipartBody$PartB = e1.b("info", strK);
            m mVar = new m((n0) this.A, (j21.c) this.B, (n0) this.C, 1);
            this.v = 1;
            if (userKycService.uploadKycInhouseDocumentWithProgress(str, multipartBody$Part, multipartBody$PartB, mVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object b(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        j jVar = (j) this.f3103w;
        mn6.i iVar = new mn6.i(jVar, (ExternalInstitution) this.f3104x, (ho3.a) this.f3105y, (String) this.z, (Function0) this.A, (Function0) this.B, (Function0) this.C, null, 1);
        this.v = 1;
        Object objY2 = jVar.Y2(this, iVar);
        return objY2 == aVar ? aVar : objY2;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc A[Catch: Exception -> 0x002d, CancellationException -> 0x0037, RewardsHubRepositoryImpl$ChallengeStartFailedException -> 0x0126, TRY_LEAVE, TryCatch #8 {RewardsHubRepositoryImpl$ChallengeStartFailedException -> 0x0126, blocks: (B:52:0x00f6, B:54:0x00fc), top: B:85:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac8.h.c(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e3, code lost:
    
        if (r14 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac8.h.n(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    private final Object o(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c cVar = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c) this.f3103w;
        z0 z0Var = new z0(cVar, (f5j.a) this.f3104x, (TransferTrustData) this.f3105y, (r4k.m) this.z, (BankTransferData) this.A, (i) this.B, (AccountId) this.C, null);
        this.v = 1;
        Object objB = pu7.a.B(cVar.k, "transfer_submit", z0Var, this);
        return objB == aVar ? aVar : objB;
    }

    private final Object p(Object obj2) {
        n02.b bVar;
        CoroutineScope coroutineScope = (CoroutineScope) this.f3104x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            ArrayList arrayList = (ArrayList) this.z;
            hlm.i iVar = (hlm.i) this.A;
            u uVar = (u) this.B;
            List list = (List) this.C;
            n02.b bVar2 = (n02.b) this.f3105y;
            aim.e eVarB = zhm.u.b();
            eVarB.add(e0.g(coroutineScope, null, null, new x(iVar, uVar, list, bVar2, (Continuation) null), 3));
            int i2 = 0;
            for (Object obj3 : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                eVarB.add(e0.g(coroutineScope, null, null, new q(iVar, uVar, bVar2, i2, (List) obj3, null), 3));
                i2 = i3;
            }
            aim.e eVarA = zhm.u.a(eVarB);
            bVar = (n02.b) this.f3105y;
            this.f3104x = null;
            this.f3103w = bVar;
            this.v = 1;
            obj2 = e0.h(eVarA, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (n02.b) this.f3103w;
            o.b(obj2);
        }
        Iterable iterable = (Iterable) obj2;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                if (((Boolean) it8.next()).booleanValue()) {
                    return bVar;
                }
            }
        }
        return null;
    }

    private final Object s(Object obj2) {
        hlm.c cVar;
        v0 v0Var;
        nxb.e eVar;
        String str;
        String str2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            nxb.e eVar2 = (nxb.e) this.A;
            cVar = eVar2.d;
            v0Var = (v0) this.B;
            String str3 = (String) this.C;
            this.f3103w = cVar;
            this.f3104x = eVar2;
            this.f3105y = v0Var;
            this.z = str3;
            this.v = 1;
            if (cVar.lock(null, this) == aVar) {
                return aVar;
            }
            eVar = eVar2;
            str = str3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.z;
            v0Var = (v0) this.f3105y;
            eVar = (nxb.e) this.f3104x;
            cVar = (hlm.c) this.f3103w;
            o.b(obj2);
        }
        try {
            ue0.c cVar2 = eVar.f220549b;
            if (Intrinsics.f(v0Var, v0.a.f201465a)) {
                str2 = "ANALYTICS_KEY";
            } else {
                if (!(v0Var instanceof w0)) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "TRANSACTION_DETAILS_KEY";
            }
            Object objT2 = cVar2.T2("BANNER_DISMISSAL_INFO_STORAGE_KEY_".concat(str2), nxb.a.class);
            nxb.a aVar2 = (nxb.a) objT2;
            ne0.j jVar = eVar.f220550c;
            if (aVar2 == null) {
                nxb.e.Companion.getClass();
                aVar2 = nxb.e.f;
            }
            jVar.f(str, aVar2);
            nxb.a aVar3 = (nxb.a) objT2;
            cVar.unlock(null);
            return aVar3;
        } catch (Throwable th10) {
            cVar.unlock(null);
            throw th10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac8.h.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    private final Object u(Object obj2) {
        qn2.o oVar;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            String switchType = i2b.a.K((mn2.a) this.f3104x, (wn2.d) this.f3105y);
            FormState formState = (FormState) this.z;
            wn2.a targetAccountType = (wn2.a) this.A;
            LocalDate localDate = (LocalDate) this.B;
            Intrinsics.checkNotNullParameter(formState, "formState");
            Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
            Intrinsics.checkNotNullParameter(switchType, "switchType");
            t tVar = new t(switchType, targetAccountType.name(), localDate != null ? localDate.format(DateTimeFormatter.ISO_LOCAL_DATE) : null, qn2.e.a(formState, targetAccountType));
            BankAccountSwitchingService bankAccountSwitchingService = ((pn2.d) this.C).f237658a;
            qn2.o oVar2 = qn2.o.f247866a;
            this.f3103w = oVar2;
            this.v = 1;
            obj2 = bankAccountSwitchingService.getInboundReview(tVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
            oVar = oVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = (qn2.o) this.f3103w;
            o.b(obj2);
        }
        rn2.u uVar = (rn2.u) obj2;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        BankInformation bankInformationA = qn2.a.a(uVar.getFromBank());
        BankInformation bankInformationA2 = qn2.a.a(uVar.getToBank());
        List documents = uVar.getDocuments();
        if (documents != null) {
            List list = documents;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(p.a((rn2.x) it8.next()));
            }
        } else {
            arrayList = f0.f322471a;
        }
        List terms = uVar.getTerms();
        if (terms != null) {
            List<b0> list2 = terms;
            arrayList2 = new ArrayList(w.t(list2, 10));
            for (b0 b0Var : list2) {
                Intrinsics.checkNotNullParameter(b0Var, "<this>");
                arrayList2.add(new TermsStep(b0Var.getTitle(), b0Var.getSubtitle(), b0Var.getScopes()));
            }
        } else {
            arrayList2 = f0.f322471a;
        }
        List sections = uVar.getSections();
        if (sections != null) {
            List list3 = sections;
            arrayList3 = new ArrayList(w.t(list3, 10));
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                arrayList3.add(qn2.c.a((rn2.c) it9.next()));
            }
        } else {
            arrayList3 = f0.f322471a;
        }
        return new bp2.e(bankInformationA, bankInformationA2, arrayList, arrayList2, arrayList3);
    }

    private final Object v(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            String switchType = i2b.a.K((mn2.a) this.f3103w, (wn2.d) this.f3104x);
            FormState formState = (FormState) this.f3105y;
            LocalDate localDate = (LocalDate) this.z;
            wn2.a targetAccountType = (wn2.a) this.A;
            CardDigits cardDigits = (CardDigits) this.B;
            Intrinsics.checkNotNullParameter(switchType, "switchType");
            Intrinsics.checkNotNullParameter(formState, "formState");
            Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
            String str = localDate != null ? localDate.format(DateTimeFormatter.ISO_LOCAL_DATE) : null;
            String str2 = cardDigits != null ? cardDigits.f63894a : null;
            String str3 = cardDigits != null ? cardDigits.f63895b : null;
            z zVar = new z(switchType, str, qn2.e.a(formState, targetAccountType), str2, (str3 == null || d0.W(str3)) ? null : str3);
            BankAccountSwitchingService bankAccountSwitchingService = ((pn2.d) this.C).f237658a;
            this.v = 1;
            obj2 = bankAccountSwitchingService.submitRequest(zVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return ((a0) obj2).getSwitchId();
    }

    private final Object w(Object obj2) {
        TransferScheduleData transferScheduleData;
        Data data = (Data) this.f3103w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        CompositeClause compositeClause = null;
        if (i == 0) {
            o.b(obj2);
            q6i.a0 a0Var = (q6i.a0) this.f3104x;
            x5i.a aVar2 = (x5i.a) this.f3105y;
            x5i.a aVar3 = (x5i.a) this.z;
            OrderMode orderMode = (OrderMode) this.A;
            if (orderMode instanceof OrderMode.Scheduling) {
                transferScheduleData = ((OrderMode.Scheduling) orderMode).f97229a;
            } else {
                if (!(orderMode instanceof OrderMode.Threshold) && !(orderMode instanceof OrderMode.Market) && !(orderMode instanceof OrderMode.Automation)) {
                    throw new NoWhenBranchMatchedException();
                }
                transferScheduleData = new TransferScheduleData(0L, (jli.c) null, 7);
            }
            TransferScheduleData transferScheduleData2 = transferScheduleData;
            OrderMode orderMode2 = (OrderMode) this.A;
            TransferAvailability transferAvailability = (TransferAvailability) this.B;
            CreditCardInterest creditCardInterest = (CreditCardInterest) this.C;
            this.f3103w = data;
            this.v = 1;
            obj2 = a0Var.b(aVar2, aVar3, transferScheduleData2, orderMode2, transferAvailability, creditCardInterest, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        x5i.e extraInfo = (x5i.e) obj2;
        if (extraInfo != null) {
            Intrinsics.checkNotNullParameter(extraInfo, "extraInfo");
            List listL = v.l(extraInfo.f302984a);
            List list = extraInfo.f302985b;
            List listL2 = v.l(extraInfo.f302986c);
            ArrayList arrayListE0 = zhm.d0.E0(listL2, zhm.d0.E0(list, listL));
            if (!arrayListE0.isEmpty()) {
                compositeClause = new CompositeClause(arrayListE0, new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
        }
        return new z5i.a(data, compositeClause);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        if (r2.lock(null, r12) != r3) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0103, code lost:
    
        if (r2.lock(null, r12) == r3) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac8.h.x(java.lang.Object):java.lang.Object");
    }

    private final Object y(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            qt8.o oVar = (qt8.o) this.f3103w;
            UserKycService userKycService = oVar.f249036a;
            String str = (String) this.f3104x;
            MultipartBody$Part multipartBody$Part = (MultipartBody$Part) this.f3105y;
            oy8.b bVar = oVar.f249038c;
            my8.h metadata = ((my8.c) this.z).f210374b;
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            e1 e1Var = MultipartBody$Part.Companion;
            String strK = ((bz8.a) bVar).d.k(r0.k(new Pair("scanType", metadata.f210377a.a()), new Pair("source", metadata.f210379c), new Pair("rotationType", metadata.f210378b.a()), new Pair("metaData", r0.k(new Pair("language", metadata.d), new Pair("region", metadata.e), new Pair("model", metadata.f)))));
            Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
            e1Var.getClass();
            MultipartBody$Part multipartBody$PartB = e1.b("info", strK);
            m mVar = new m((n0) this.A, (j21.c) this.B, (n0) this.C, 0);
            this.v = 1;
            if (userKycService.uploadKycInhouseDocumentWithProgress(str, multipartBody$Part, multipartBody$PartB, mVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r6v26, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a aVar = (com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a) this.f3105y;
                return new h(0, (l) this.z, aVar, (xi0.b) this.A, (TransferScheduleData) this.B, (pf8.h) this.C, continuation);
            case 1:
                return new h(1, (bwb.p) this.f3104x, (String) this.f3105y, (String) this.z, (RevPoints) this.A, (dj0.d) this.B, (String) this.C, continuation);
            case 2:
                Function1 function1 = (Function1) this.f3105y;
                h hVar = new h(2, (Ref$ObjectRef) this.z, function1, (q1) this.A, (v2) this.B, (a1) this.C, continuation);
                hVar.f3104x = obj2;
                return hVar;
            case 3:
                return new h((dp4.l) this.f3103w, (String) this.f3104x, (hl4.e) this.f3105y, (hl4.g) this.z, (String) this.A, (dj0.d) this.B, (Boolean) this.C, continuation, 3);
            case 4:
                return new h((com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.z, (Pair) this.B, continuation, (wk5.a) this.C, (xi0.b) this.A);
            case 5:
                t0 t0Var = (t0) this.f3105y;
                h hVar2 = new h(5, (String) this.z, t0Var, (com.revolut.feature.junior_profile.api.models.a) this.A, (psg.a) this.B, (ReferralCampaignV4) this.C, continuation);
                hVar2.f3104x = obj2;
                return hVar2;
            case 6:
                h hVar3 = new h((h4g.b) this.A, (BookingPreviewParams) this.B, (k) this.C, continuation, 6);
                hVar3.z = obj2;
                return hVar3;
            case 7:
                h hVar4 = new h((h4g.f) this.A, (String) this.B, (k) this.C, continuation, 7);
                hVar4.z = obj2;
                return hVar4;
            case 8:
                h hVar5 = new h((h4g.h) this.A, (String) this.B, (k) this.C, continuation, 8);
                hVar5.z = obj2;
                return hVar5;
            case 9:
                return new h((hl9.d) this.A, (ScannedBillDetails) this.B, (String) this.C, continuation, 9);
            case 10:
                h hVar6 = new h((hma.o) this.B, (FlowCollector) this.C, continuation, 10);
                hVar6.A = obj2;
                return hVar6;
            case 11:
                return new h((n) this.f3103w, (String) this.f3104x, (String) this.f3105y, (dj0.d) this.z, (String) this.A, (cd1.j) this.B, (String) this.C, continuation, 11);
            case 12:
                return new h((wi0.b) this.f3103w, (Boolean) this.f3104x, (String) this.f3105y, (ExemptionReason) this.z, (joe.o) this.A, (String) this.B, (String) this.C, continuation, 12);
            case 13:
                return new h((Boolean) this.f3103w, (jtj.n) this.f3104x, (String) this.f3105y, (List) this.z, (hzi.a) this.A, (IncomeSorterDestinationId) this.B, (String) this.C, continuation, 13);
            case 14:
                h hVar7 = new h(14, (String) this.f3104x, (o1) this.f3105y, (Function0) this.z, (lr.p) this.A, (String) this.B, (String) this.C, continuation);
                hVar7.f3103w = obj2;
                return hVar7;
            case 15:
                h hVar8 = new h(15, (lr.p) this.f3104x, (Map) this.f3105y, (String) this.z, (String) this.A, (Integer) this.B, (NfcDocument$PassportRaw) this.C, continuation);
                hVar8.f3103w = obj2;
                return hVar8;
            case 16:
                return new h((j) this.f3103w, (ExternalInstitution) this.f3104x, (ho3.a) this.f3105y, (String) this.z, (Function0) this.A, (Function0) this.B, (Function0) this.C, continuation, 16);
            case 17:
                return new h((stj.c) this.B, (mtj.q) this.C, continuation, 17);
            case 18:
                h hVar9 = new h((com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c) this.C, continuation);
                hVar9.B = obj2;
                return hVar9;
            case 19:
                return new h((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c) this.f3103w, (f5j.a) this.f3104x, (TransferTrustData) this.f3105y, (r4k.m) this.z, (BankTransferData) this.A, (Function1) this.B, (AccountId) this.C, continuation);
            case 20:
                n02.b bVar = (n02.b) this.f3105y;
                h hVar10 = new h(20, (ArrayList) this.z, bVar, (hlm.i) this.A, (u) this.B, (List) this.C, continuation);
                hVar10.f3104x = obj2;
                return hVar10;
            case 21:
                return new h((nxb.e) this.A, (v0) this.B, (String) this.C, continuation, 21);
            case 22:
                o55.w wVar = (o55.w) this.f3105y;
                return new h(22, (String) this.z, wVar, (Long) this.A, (String) this.B, (g0) this.C, continuation);
            case 23:
                return new h(23, (mn2.a) this.f3104x, (wn2.d) this.f3105y, (FormState) this.z, (wn2.a) this.A, (LocalDate) this.B, (pn2.d) this.C, continuation);
            case 24:
                return new h((mn2.a) this.f3103w, (wn2.d) this.f3104x, (FormState) this.f3105y, (LocalDate) this.z, (wn2.a) this.A, (CardDigits) this.B, (pn2.d) this.C, continuation, 24);
            case 25:
                h hVar11 = new h(25, (q6i.a0) this.f3104x, (x5i.a) this.f3105y, (x5i.a) this.z, (OrderMode) this.A, (TransferAvailability) this.B, (CreditCardInterest) this.C, continuation);
                hVar11.f3103w = obj2;
                return hVar11;
            case 26:
                return new h((nxh.b) this.A, (ProducerScope) this.B, (qq3.i) this.C, continuation, 26);
            case 27:
                return new h((qt8.o) this.f3103w, (String) this.f3104x, (MultipartBody$Part) this.f3105y, (my8.c) this.z, (n0) this.A, (j21.c) this.B, (n0) this.C, continuation, 27);
            case 28:
                return new h((qt8.o) this.f3103w, (String) this.f3104x, (MultipartBody$Part) this.f3105y, (my8.d) this.z, (n0) this.A, (j21.c) this.B, (n0) this.C, continuation, 28);
            default:
                h hVar12 = new h((com.revolut.feature.junior_profile.api.models.a) this.B, (prl.e) this.C, continuation, 29);
                hVar12.A = obj2;
                return hVar12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:425:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:426:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v47, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.Throwable, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:364:0x09f9 -> B:365:0x09fa). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ac8.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f3104x = obj2;
        this.f3105y = obj3;
        this.z = obj4;
        this.A = obj5;
        this.B = obj6;
        this.C = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar, Pair pair, Continuation continuation, wk5.a aVar, xi0.b bVar) {
        super(2, continuation);
        this.u = 4;
        this.z = jVar;
        this.B = pair;
        this.A = bVar;
        this.C = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = 18;
        this.C = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c cVar, f5j.a aVar, TransferTrustData transferTrustData, r4k.m mVar, BankTransferData bankTransferData, Function1 function1, AccountId accountId, Continuation continuation) {
        super(2, continuation);
        this.u = 19;
        this.f3103w = cVar;
        this.f3104x = aVar;
        this.f3105y = transferTrustData;
        this.z = mVar;
        this.A = bankTransferData;
        this.B = (i) function1;
        this.C = accountId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3103w = obj2;
        this.f3104x = obj3;
        this.f3105y = obj4;
        this.z = obj5;
        this.A = obj6;
        this.B = obj7;
        this.C = obj8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.B = obj2;
        this.C = obj3;
    }
}
