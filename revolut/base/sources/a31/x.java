package a31;

import com.revolut.data.database.models.recurringpayments.RecurringPaymentDao;
import com.revolut.data.database.models.recurringpayments.mapper.RecurringPaymentEntityMapperKt;
import com.revolut.data.network.models.credit.CreditRecurringPaymentsDto;
import com.revolut.data.network.models.credit.PayLaterUpcomingPaymentsDto;
import com.revolut.data.network.models.recurringpayment.RecurringPaymentListDto;
import com.revolut.data.network.services.CreditRecurringPaymentService;
import com.revolut.data.network.services.RecurringPaymentService;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.recurring_payments.api.RecurringPaymentApi$Toggles$PredictedSubscriptions;
import com.revolut.shared.feature.recurring_payments.data.services.StandingOrdersService;
import efm.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import rfm.f0;
import skm.p0;

/* JADX INFO: loaded from: classes.dex */
public final class x implements s71.a {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringPaymentService f999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StandingOrdersService f1000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditRecurringPaymentService f1001c;
    public final u0a.a d;
    public final ne0.d e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f1002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ue0.c f1003h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f1004j;

    public x(RecurringPaymentService recurringPaymentService, StandingOrdersService standingOrdersService, CreditRecurringPaymentService creditRecurringPaymentService, u0a.a recurringPaymentDataProvider, ne0.d memoryCache, a groupMemberContactMapper, gte.a featureToggleInteractor, ue0.c storage) {
        Intrinsics.checkNotNullParameter(recurringPaymentService, "recurringPaymentService");
        Intrinsics.checkNotNullParameter(standingOrdersService, "standingOrdersService");
        Intrinsics.checkNotNullParameter(creditRecurringPaymentService, "creditRecurringPaymentService");
        Intrinsics.checkNotNullParameter(recurringPaymentDataProvider, "recurringPaymentDataProvider");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(groupMemberContactMapper, "groupMemberContactMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f999a = recurringPaymentService;
        this.f1000b = standingOrdersService;
        this.f1001c = creditRecurringPaymentService;
        this.d = recurringPaymentDataProvider;
        this.e = memoryCache;
        this.f = groupMemberContactMapper;
        this.f1002g = featureToggleInteractor;
        this.f1003h = storage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: a31.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f983b;

            {
                this.f983b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0 d0VarI0;
                d0 d0VarI02;
                d0 d0VarI03;
                String str;
                d0 d0VarO0;
                d0 d0VarA;
                int i2 = i;
                int i3 = 3;
                x xVar = this.f983b;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        hbd.a params = (hbd.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        x xVar2 = this.f983b;
                        CreditRecurringPaymentService creditRecurringPaymentService2 = xVar2.f1001c;
                        List list = params.e;
                        Intrinsics.checkNotNullParameter("CURRENT_WALLET_ID", "id");
                        ArrayList arrayListF0 = zhm.d0.F0(new WalletId("CURRENT_WALLET_ID"), list);
                        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListF0, 10));
                        Iterator it8 = arrayListF0.iterator();
                        while (true) {
                            Object[] objArr = 0;
                            if (!it8.hasNext()) {
                                f0 f0VarE = d0.E(arrayList, new a05.a(new a09.a(26), 28));
                                Intrinsics.checkNotNullExpressionValue(f0VarE, "zip(...)");
                                if (params.f150647b) {
                                    d0<CreditRecurringPaymentsDto> creditRecurringPayments = creditRecurringPaymentService2.getCreditRecurringPayments();
                                    e eVar = new e(new a09.a(22), 9);
                                    creditRecurringPayments.getClass();
                                    ufm.i iVar = new ufm.i(creditRecurringPayments, eVar, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                    d0VarI0 = te0.w.i0(xVar2.c(ue0.e.F(iVar, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI0 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI0, "just(...)");
                                }
                                if (params.f150648c) {
                                    CreditRecurringPaymentService.Companion companion = CreditRecurringPaymentService.INSTANCE;
                                    d0<PayLaterUpcomingPaymentsDto> payLaterRecurringPayments = creditRecurringPaymentService2.getPayLaterRecurringPayments(5);
                                    e eVar2 = new e(new a09.a(23), 12);
                                    payLaterRecurringPayments.getClass();
                                    ufm.i iVar2 = new ufm.i(payLaterRecurringPayments, eVar2, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                    d0VarI02 = te0.w.i0(xVar2.c(ue0.e.F(iVar2, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI02 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI02, "just(...)");
                                }
                                if (params.d) {
                                    d0<CreditRecurringPaymentsDto> loanRecurringPayments = creditRecurringPaymentService2.getLoanRecurringPayments();
                                    a05.a aVar = new a05.a(new a09.a(20), 29);
                                    loanRecurringPayments.getClass();
                                    ufm.i iVar3 = new ufm.i(loanRecurringPayments, aVar, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                    d0VarI03 = te0.w.i0(xVar2.c(ue0.e.F(iVar3, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI03 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI03, "just(...)");
                                }
                                ufm.i iVar4 = new ufm.i(te0.w.J0(f0VarE, d0VarI0, d0VarI02, d0VarI03), new e(new a09.a(19), i3), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                                return iVar4;
                            }
                            String str2 = ((WalletId) it8.next()).f66106a;
                            WalletId walletId = new WalletId(str2);
                            if (Intrinsics.f(str2, "CURRENT_WALLET_ID")) {
                                walletId = null;
                            }
                            String str3 = walletId != null ? walletId.f66106a : null;
                            String str4 = ((jte.d) xVar2.f1002g).c(RecurringPaymentApi$Toggles$PredictedSubscriptions.f81650c) ? "RAISED_SUBSCRIPTIONS" : null;
                            if (params.f150646a) {
                                RecurringPaymentService recurringPaymentService2 = xVar2.f999a;
                                String str5 = str3 == null ? null : str3;
                                String[] elements = {"SUBSCRIPTION_BRAND_BLOCK", "NEW_YOUTH_ALLOWANCES", str4};
                                Intrinsics.checkNotNullParameter(elements, "elements");
                                List list2 = (List) ue0.e.M(kotlin.collections.d.L(elements));
                                d0<RecurringPaymentListDto> recurringPayments = recurringPaymentService2.getRecurringPayments(str5, list2 != null ? zhm.d0.k0(list2, ",", null, null, 0, null, 62) : null);
                                u uVar = u.f;
                                a0.b bVar = new a0.b(7);
                                recurringPayments.getClass();
                                d0VarO0 = new ufm.i(recurringPayments, bVar, 1);
                                Intrinsics.checkNotNullExpressionValue(d0VarO0, "map(...)");
                                str = str3;
                            } else {
                                p0 p0Var = p0.f264001a;
                                str = str3;
                                d0VarO0 = te0.w.o0(elm.f.f127540b, new t(xVar2, str3, str4, objArr == true ? 1 : 0, 1));
                            }
                            arrayList.add(xVar2.c(d0VarO0, str));
                        }
                        break;
                    case 1:
                        List list3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((hbd.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list3, "list");
                        xVar.e.f("RECURRING_PAYMENTS", list3);
                        return Unit.f186387a;
                    case 2:
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((hbd.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        u0a.a aVar2 = xVar.d;
                        List list5 = list4;
                        ArrayList list6 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it9 = list5.iterator();
                        while (it9.hasNext()) {
                            list6.add(RecurringPaymentEntityMapperKt.toEntity((qua.p) it9.next()));
                        }
                        Intrinsics.checkNotNullParameter(list6, "list");
                        ((RecurringPaymentDao) ((Lazy) aVar2.f276163c).getValue()).insertOrUpdateAll(list6);
                        return Unit.f186387a;
                    case 3:
                        RecurringPaymentService recurringPaymentService3 = xVar.f999a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        qua.d type = (qua.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(type, "type");
                        if (type instanceof qua.a) {
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, null, ((qua.a) type).f249281a, null, 5);
                        } else if (type instanceof qua.b) {
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, null, null, ((qua.b) type).f249285a, 3);
                        } else {
                            if (!(type instanceof qua.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, ((qua.c) type).f249286a, null, null, 6);
                        }
                        e eVar3 = new e(new a09.a(21), 13);
                        d0VarA.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarA, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 4:
                        qua.d type2 = (qua.d) obj2;
                        List ids = (List) obj3;
                        Intrinsics.checkNotNullParameter(type2, "type");
                        Intrinsics.checkNotNullParameter(ids, "ids");
                        xVar.e.f("ASSOCIATED_SUBSCRIPTIONS_MEMORY_CACHE_KEY" + type2, ids);
                        return Unit.f186387a;
                    default:
                        qua.d type3 = (qua.d) obj2;
                        List ids2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(type3, "type");
                        Intrinsics.checkNotNullParameter(ids2, "ids");
                        xVar.f1003h.G(ids2, "ASSOCIATED_SUBSCRIPTIONS_MEMORY_CACHE_KEY" + type3, kii.e.o(String.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        f fVar = new f(this, 3);
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: a31.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f983b;

            {
                this.f983b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0 d0VarI0;
                d0 d0VarI02;
                d0 d0VarI03;
                String str;
                d0 d0VarO0;
                d0 d0VarA;
                int i22 = i2;
                int i3 = 3;
                x xVar = this.f983b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        hbd.a params = (hbd.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        x xVar2 = this.f983b;
                        CreditRecurringPaymentService creditRecurringPaymentService2 = xVar2.f1001c;
                        List list = params.e;
                        Intrinsics.checkNotNullParameter("CURRENT_WALLET_ID", "id");
                        ArrayList arrayListF0 = zhm.d0.F0(new WalletId("CURRENT_WALLET_ID"), list);
                        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListF0, 10));
                        Iterator it8 = arrayListF0.iterator();
                        while (true) {
                            Object[] objArr = 0;
                            if (!it8.hasNext()) {
                                f0 f0VarE = d0.E(arrayList, new a05.a(new a09.a(26), 28));
                                Intrinsics.checkNotNullExpressionValue(f0VarE, "zip(...)");
                                if (params.f150647b) {
                                    d0<CreditRecurringPaymentsDto> creditRecurringPayments = creditRecurringPaymentService2.getCreditRecurringPayments();
                                    e eVar = new e(new a09.a(22), 9);
                                    creditRecurringPayments.getClass();
                                    ufm.i iVar = new ufm.i(creditRecurringPayments, eVar, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                    d0VarI0 = te0.w.i0(xVar2.c(ue0.e.F(iVar, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI0 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI0, "just(...)");
                                }
                                if (params.f150648c) {
                                    CreditRecurringPaymentService.Companion companion = CreditRecurringPaymentService.INSTANCE;
                                    d0<PayLaterUpcomingPaymentsDto> payLaterRecurringPayments = creditRecurringPaymentService2.getPayLaterRecurringPayments(5);
                                    e eVar2 = new e(new a09.a(23), 12);
                                    payLaterRecurringPayments.getClass();
                                    ufm.i iVar2 = new ufm.i(payLaterRecurringPayments, eVar2, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                    d0VarI02 = te0.w.i0(xVar2.c(ue0.e.F(iVar2, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI02 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI02, "just(...)");
                                }
                                if (params.d) {
                                    d0<CreditRecurringPaymentsDto> loanRecurringPayments = creditRecurringPaymentService2.getLoanRecurringPayments();
                                    a05.a aVar = new a05.a(new a09.a(20), 29);
                                    loanRecurringPayments.getClass();
                                    ufm.i iVar3 = new ufm.i(loanRecurringPayments, aVar, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                    d0VarI03 = te0.w.i0(xVar2.c(ue0.e.F(iVar3, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI03 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI03, "just(...)");
                                }
                                ufm.i iVar4 = new ufm.i(te0.w.J0(f0VarE, d0VarI0, d0VarI02, d0VarI03), new e(new a09.a(19), i3), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                                return iVar4;
                            }
                            String str2 = ((WalletId) it8.next()).f66106a;
                            WalletId walletId = new WalletId(str2);
                            if (Intrinsics.f(str2, "CURRENT_WALLET_ID")) {
                                walletId = null;
                            }
                            String str3 = walletId != null ? walletId.f66106a : null;
                            String str4 = ((jte.d) xVar2.f1002g).c(RecurringPaymentApi$Toggles$PredictedSubscriptions.f81650c) ? "RAISED_SUBSCRIPTIONS" : null;
                            if (params.f150646a) {
                                RecurringPaymentService recurringPaymentService2 = xVar2.f999a;
                                String str5 = str3 == null ? null : str3;
                                String[] elements = {"SUBSCRIPTION_BRAND_BLOCK", "NEW_YOUTH_ALLOWANCES", str4};
                                Intrinsics.checkNotNullParameter(elements, "elements");
                                List list2 = (List) ue0.e.M(kotlin.collections.d.L(elements));
                                d0<RecurringPaymentListDto> recurringPayments = recurringPaymentService2.getRecurringPayments(str5, list2 != null ? zhm.d0.k0(list2, ",", null, null, 0, null, 62) : null);
                                u uVar = u.f;
                                a0.b bVar = new a0.b(7);
                                recurringPayments.getClass();
                                d0VarO0 = new ufm.i(recurringPayments, bVar, 1);
                                Intrinsics.checkNotNullExpressionValue(d0VarO0, "map(...)");
                                str = str3;
                            } else {
                                p0 p0Var = p0.f264001a;
                                str = str3;
                                d0VarO0 = te0.w.o0(elm.f.f127540b, new t(xVar2, str3, str4, objArr == true ? 1 : 0, 1));
                            }
                            arrayList.add(xVar2.c(d0VarO0, str));
                        }
                        break;
                    case 1:
                        List list3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((hbd.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list3, "list");
                        xVar.e.f("RECURRING_PAYMENTS", list3);
                        return Unit.f186387a;
                    case 2:
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((hbd.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        u0a.a aVar2 = xVar.d;
                        List list5 = list4;
                        ArrayList list6 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it9 = list5.iterator();
                        while (it9.hasNext()) {
                            list6.add(RecurringPaymentEntityMapperKt.toEntity((qua.p) it9.next()));
                        }
                        Intrinsics.checkNotNullParameter(list6, "list");
                        ((RecurringPaymentDao) ((Lazy) aVar2.f276163c).getValue()).insertOrUpdateAll(list6);
                        return Unit.f186387a;
                    case 3:
                        RecurringPaymentService recurringPaymentService3 = xVar.f999a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        qua.d type = (qua.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(type, "type");
                        if (type instanceof qua.a) {
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, null, ((qua.a) type).f249281a, null, 5);
                        } else if (type instanceof qua.b) {
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, null, null, ((qua.b) type).f249285a, 3);
                        } else {
                            if (!(type instanceof qua.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, ((qua.c) type).f249286a, null, null, 6);
                        }
                        e eVar3 = new e(new a09.a(21), 13);
                        d0VarA.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarA, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 4:
                        qua.d type2 = (qua.d) obj2;
                        List ids = (List) obj3;
                        Intrinsics.checkNotNullParameter(type2, "type");
                        Intrinsics.checkNotNullParameter(ids, "ids");
                        xVar.e.f("ASSOCIATED_SUBSCRIPTIONS_MEMORY_CACHE_KEY" + type2, ids);
                        return Unit.f186387a;
                    default:
                        qua.d type3 = (qua.d) obj2;
                        List ids2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(type3, "type");
                        Intrinsics.checkNotNullParameter(ids2, "ids");
                        xVar.f1003h.G(ids2, "ASSOCIATED_SUBSCRIPTIONS_MEMORY_CACHE_KEY" + type3, kii.e.o(String.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        };
        final int i3 = 2;
        this.i = new w4l.f(function2, fVar, function22, null, new Function2(this) { // from class: a31.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f983b;

            {
                this.f983b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0 d0VarI0;
                d0 d0VarI02;
                d0 d0VarI03;
                String str;
                d0 d0VarO0;
                d0 d0VarA;
                int i22 = i3;
                int i32 = 3;
                x xVar = this.f983b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        hbd.a params = (hbd.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        x xVar2 = this.f983b;
                        CreditRecurringPaymentService creditRecurringPaymentService2 = xVar2.f1001c;
                        List list = params.e;
                        Intrinsics.checkNotNullParameter("CURRENT_WALLET_ID", "id");
                        ArrayList arrayListF0 = zhm.d0.F0(new WalletId("CURRENT_WALLET_ID"), list);
                        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListF0, 10));
                        Iterator it8 = arrayListF0.iterator();
                        while (true) {
                            Object[] objArr = 0;
                            if (!it8.hasNext()) {
                                f0 f0VarE = d0.E(arrayList, new a05.a(new a09.a(26), 28));
                                Intrinsics.checkNotNullExpressionValue(f0VarE, "zip(...)");
                                if (params.f150647b) {
                                    d0<CreditRecurringPaymentsDto> creditRecurringPayments = creditRecurringPaymentService2.getCreditRecurringPayments();
                                    e eVar = new e(new a09.a(22), 9);
                                    creditRecurringPayments.getClass();
                                    ufm.i iVar = new ufm.i(creditRecurringPayments, eVar, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                    d0VarI0 = te0.w.i0(xVar2.c(ue0.e.F(iVar, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI0 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI0, "just(...)");
                                }
                                if (params.f150648c) {
                                    CreditRecurringPaymentService.Companion companion = CreditRecurringPaymentService.INSTANCE;
                                    d0<PayLaterUpcomingPaymentsDto> payLaterRecurringPayments = creditRecurringPaymentService2.getPayLaterRecurringPayments(5);
                                    e eVar2 = new e(new a09.a(23), 12);
                                    payLaterRecurringPayments.getClass();
                                    ufm.i iVar2 = new ufm.i(payLaterRecurringPayments, eVar2, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                    d0VarI02 = te0.w.i0(xVar2.c(ue0.e.F(iVar2, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI02 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI02, "just(...)");
                                }
                                if (params.d) {
                                    d0<CreditRecurringPaymentsDto> loanRecurringPayments = creditRecurringPaymentService2.getLoanRecurringPayments();
                                    a05.a aVar = new a05.a(new a09.a(20), 29);
                                    loanRecurringPayments.getClass();
                                    ufm.i iVar3 = new ufm.i(loanRecurringPayments, aVar, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                    d0VarI03 = te0.w.i0(xVar2.c(ue0.e.F(iVar3, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI03 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI03, "just(...)");
                                }
                                ufm.i iVar4 = new ufm.i(te0.w.J0(f0VarE, d0VarI0, d0VarI02, d0VarI03), new e(new a09.a(19), i32), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                                return iVar4;
                            }
                            String str2 = ((WalletId) it8.next()).f66106a;
                            WalletId walletId = new WalletId(str2);
                            if (Intrinsics.f(str2, "CURRENT_WALLET_ID")) {
                                walletId = null;
                            }
                            String str3 = walletId != null ? walletId.f66106a : null;
                            String str4 = ((jte.d) xVar2.f1002g).c(RecurringPaymentApi$Toggles$PredictedSubscriptions.f81650c) ? "RAISED_SUBSCRIPTIONS" : null;
                            if (params.f150646a) {
                                RecurringPaymentService recurringPaymentService2 = xVar2.f999a;
                                String str5 = str3 == null ? null : str3;
                                String[] elements = {"SUBSCRIPTION_BRAND_BLOCK", "NEW_YOUTH_ALLOWANCES", str4};
                                Intrinsics.checkNotNullParameter(elements, "elements");
                                List list2 = (List) ue0.e.M(kotlin.collections.d.L(elements));
                                d0<RecurringPaymentListDto> recurringPayments = recurringPaymentService2.getRecurringPayments(str5, list2 != null ? zhm.d0.k0(list2, ",", null, null, 0, null, 62) : null);
                                u uVar = u.f;
                                a0.b bVar = new a0.b(7);
                                recurringPayments.getClass();
                                d0VarO0 = new ufm.i(recurringPayments, bVar, 1);
                                Intrinsics.checkNotNullExpressionValue(d0VarO0, "map(...)");
                                str = str3;
                            } else {
                                p0 p0Var = p0.f264001a;
                                str = str3;
                                d0VarO0 = te0.w.o0(elm.f.f127540b, new t(xVar2, str3, str4, objArr == true ? 1 : 0, 1));
                            }
                            arrayList.add(xVar2.c(d0VarO0, str));
                        }
                        break;
                    case 1:
                        List list3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((hbd.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list3, "list");
                        xVar.e.f("RECURRING_PAYMENTS", list3);
                        return Unit.f186387a;
                    case 2:
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((hbd.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        u0a.a aVar2 = xVar.d;
                        List list5 = list4;
                        ArrayList list6 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it9 = list5.iterator();
                        while (it9.hasNext()) {
                            list6.add(RecurringPaymentEntityMapperKt.toEntity((qua.p) it9.next()));
                        }
                        Intrinsics.checkNotNullParameter(list6, "list");
                        ((RecurringPaymentDao) ((Lazy) aVar2.f276163c).getValue()).insertOrUpdateAll(list6);
                        return Unit.f186387a;
                    case 3:
                        RecurringPaymentService recurringPaymentService3 = xVar.f999a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        qua.d type = (qua.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(type, "type");
                        if (type instanceof qua.a) {
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, null, ((qua.a) type).f249281a, null, 5);
                        } else if (type instanceof qua.b) {
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, null, null, ((qua.b) type).f249285a, 3);
                        } else {
                            if (!(type instanceof qua.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, ((qua.c) type).f249286a, null, null, 6);
                        }
                        e eVar3 = new e(new a09.a(21), 13);
                        d0VarA.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarA, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 4:
                        qua.d type2 = (qua.d) obj2;
                        List ids = (List) obj3;
                        Intrinsics.checkNotNullParameter(type2, "type");
                        Intrinsics.checkNotNullParameter(ids, "ids");
                        xVar.e.f("ASSOCIATED_SUBSCRIPTIONS_MEMORY_CACHE_KEY" + type2, ids);
                        return Unit.f186387a;
                    default:
                        qua.d type3 = (qua.d) obj2;
                        List ids2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(type3, "type");
                        Intrinsics.checkNotNullParameter(ids2, "ids");
                        xVar.f1003h.G(ids2, "ASSOCIATED_SUBSCRIPTIONS_MEMORY_CACHE_KEY" + type3, kii.e.o(String.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, new f(this, 4), null, 168);
        final int i5 = 3;
        final int i6 = 4;
        final int i21 = 5;
        this.f1004j = new w4l.f(new Function2(this) { // from class: a31.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f983b;

            {
                this.f983b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0 d0VarI0;
                d0 d0VarI02;
                d0 d0VarI03;
                String str;
                d0 d0VarO0;
                d0 d0VarA;
                int i22 = i5;
                int i32 = 3;
                x xVar = this.f983b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        hbd.a params = (hbd.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        x xVar2 = this.f983b;
                        CreditRecurringPaymentService creditRecurringPaymentService2 = xVar2.f1001c;
                        List list = params.e;
                        Intrinsics.checkNotNullParameter("CURRENT_WALLET_ID", "id");
                        ArrayList arrayListF0 = zhm.d0.F0(new WalletId("CURRENT_WALLET_ID"), list);
                        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListF0, 10));
                        Iterator it8 = arrayListF0.iterator();
                        while (true) {
                            Object[] objArr = 0;
                            if (!it8.hasNext()) {
                                f0 f0VarE = d0.E(arrayList, new a05.a(new a09.a(26), 28));
                                Intrinsics.checkNotNullExpressionValue(f0VarE, "zip(...)");
                                if (params.f150647b) {
                                    d0<CreditRecurringPaymentsDto> creditRecurringPayments = creditRecurringPaymentService2.getCreditRecurringPayments();
                                    e eVar = new e(new a09.a(22), 9);
                                    creditRecurringPayments.getClass();
                                    ufm.i iVar = new ufm.i(creditRecurringPayments, eVar, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                    d0VarI0 = te0.w.i0(xVar2.c(ue0.e.F(iVar, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI0 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI0, "just(...)");
                                }
                                if (params.f150648c) {
                                    CreditRecurringPaymentService.Companion companion = CreditRecurringPaymentService.INSTANCE;
                                    d0<PayLaterUpcomingPaymentsDto> payLaterRecurringPayments = creditRecurringPaymentService2.getPayLaterRecurringPayments(5);
                                    e eVar2 = new e(new a09.a(23), 12);
                                    payLaterRecurringPayments.getClass();
                                    ufm.i iVar2 = new ufm.i(payLaterRecurringPayments, eVar2, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                    d0VarI02 = te0.w.i0(xVar2.c(ue0.e.F(iVar2, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI02 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI02, "just(...)");
                                }
                                if (params.d) {
                                    d0<CreditRecurringPaymentsDto> loanRecurringPayments = creditRecurringPaymentService2.getLoanRecurringPayments();
                                    a05.a aVar = new a05.a(new a09.a(20), 29);
                                    loanRecurringPayments.getClass();
                                    ufm.i iVar3 = new ufm.i(loanRecurringPayments, aVar, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                    d0VarI03 = te0.w.i0(xVar2.c(ue0.e.F(iVar3, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI03 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI03, "just(...)");
                                }
                                ufm.i iVar4 = new ufm.i(te0.w.J0(f0VarE, d0VarI0, d0VarI02, d0VarI03), new e(new a09.a(19), i32), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                                return iVar4;
                            }
                            String str2 = ((WalletId) it8.next()).f66106a;
                            WalletId walletId = new WalletId(str2);
                            if (Intrinsics.f(str2, "CURRENT_WALLET_ID")) {
                                walletId = null;
                            }
                            String str3 = walletId != null ? walletId.f66106a : null;
                            String str4 = ((jte.d) xVar2.f1002g).c(RecurringPaymentApi$Toggles$PredictedSubscriptions.f81650c) ? "RAISED_SUBSCRIPTIONS" : null;
                            if (params.f150646a) {
                                RecurringPaymentService recurringPaymentService2 = xVar2.f999a;
                                String str5 = str3 == null ? null : str3;
                                String[] elements = {"SUBSCRIPTION_BRAND_BLOCK", "NEW_YOUTH_ALLOWANCES", str4};
                                Intrinsics.checkNotNullParameter(elements, "elements");
                                List list2 = (List) ue0.e.M(kotlin.collections.d.L(elements));
                                d0<RecurringPaymentListDto> recurringPayments = recurringPaymentService2.getRecurringPayments(str5, list2 != null ? zhm.d0.k0(list2, ",", null, null, 0, null, 62) : null);
                                u uVar = u.f;
                                a0.b bVar = new a0.b(7);
                                recurringPayments.getClass();
                                d0VarO0 = new ufm.i(recurringPayments, bVar, 1);
                                Intrinsics.checkNotNullExpressionValue(d0VarO0, "map(...)");
                                str = str3;
                            } else {
                                p0 p0Var = p0.f264001a;
                                str = str3;
                                d0VarO0 = te0.w.o0(elm.f.f127540b, new t(xVar2, str3, str4, objArr == true ? 1 : 0, 1));
                            }
                            arrayList.add(xVar2.c(d0VarO0, str));
                        }
                        break;
                    case 1:
                        List list3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((hbd.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list3, "list");
                        xVar.e.f("RECURRING_PAYMENTS", list3);
                        return Unit.f186387a;
                    case 2:
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((hbd.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        u0a.a aVar2 = xVar.d;
                        List list5 = list4;
                        ArrayList list6 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it9 = list5.iterator();
                        while (it9.hasNext()) {
                            list6.add(RecurringPaymentEntityMapperKt.toEntity((qua.p) it9.next()));
                        }
                        Intrinsics.checkNotNullParameter(list6, "list");
                        ((RecurringPaymentDao) ((Lazy) aVar2.f276163c).getValue()).insertOrUpdateAll(list6);
                        return Unit.f186387a;
                    case 3:
                        RecurringPaymentService recurringPaymentService3 = xVar.f999a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        qua.d type = (qua.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(type, "type");
                        if (type instanceof qua.a) {
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, null, ((qua.a) type).f249281a, null, 5);
                        } else if (type instanceof qua.b) {
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, null, null, ((qua.b) type).f249285a, 3);
                        } else {
                            if (!(type instanceof qua.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, ((qua.c) type).f249286a, null, null, 6);
                        }
                        e eVar3 = new e(new a09.a(21), 13);
                        d0VarA.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarA, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 4:
                        qua.d type2 = (qua.d) obj2;
                        List ids = (List) obj3;
                        Intrinsics.checkNotNullParameter(type2, "type");
                        Intrinsics.checkNotNullParameter(ids, "ids");
                        xVar.e.f("ASSOCIATED_SUBSCRIPTIONS_MEMORY_CACHE_KEY" + type2, ids);
                        return Unit.f186387a;
                    default:
                        qua.d type3 = (qua.d) obj2;
                        List ids2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(type3, "type");
                        Intrinsics.checkNotNullParameter(ids2, "ids");
                        xVar.f1003h.G(ids2, "ASSOCIATED_SUBSCRIPTIONS_MEMORY_CACHE_KEY" + type3, kii.e.o(String.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new f(this, 5), new Function2(this) { // from class: a31.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f983b;

            {
                this.f983b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0 d0VarI0;
                d0 d0VarI02;
                d0 d0VarI03;
                String str;
                d0 d0VarO0;
                d0 d0VarA;
                int i22 = i6;
                int i32 = 3;
                x xVar = this.f983b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        hbd.a params = (hbd.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        x xVar2 = this.f983b;
                        CreditRecurringPaymentService creditRecurringPaymentService2 = xVar2.f1001c;
                        List list = params.e;
                        Intrinsics.checkNotNullParameter("CURRENT_WALLET_ID", "id");
                        ArrayList arrayListF0 = zhm.d0.F0(new WalletId("CURRENT_WALLET_ID"), list);
                        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListF0, 10));
                        Iterator it8 = arrayListF0.iterator();
                        while (true) {
                            Object[] objArr = 0;
                            if (!it8.hasNext()) {
                                f0 f0VarE = d0.E(arrayList, new a05.a(new a09.a(26), 28));
                                Intrinsics.checkNotNullExpressionValue(f0VarE, "zip(...)");
                                if (params.f150647b) {
                                    d0<CreditRecurringPaymentsDto> creditRecurringPayments = creditRecurringPaymentService2.getCreditRecurringPayments();
                                    e eVar = new e(new a09.a(22), 9);
                                    creditRecurringPayments.getClass();
                                    ufm.i iVar = new ufm.i(creditRecurringPayments, eVar, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                    d0VarI0 = te0.w.i0(xVar2.c(ue0.e.F(iVar, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI0 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI0, "just(...)");
                                }
                                if (params.f150648c) {
                                    CreditRecurringPaymentService.Companion companion = CreditRecurringPaymentService.INSTANCE;
                                    d0<PayLaterUpcomingPaymentsDto> payLaterRecurringPayments = creditRecurringPaymentService2.getPayLaterRecurringPayments(5);
                                    e eVar2 = new e(new a09.a(23), 12);
                                    payLaterRecurringPayments.getClass();
                                    ufm.i iVar2 = new ufm.i(payLaterRecurringPayments, eVar2, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                    d0VarI02 = te0.w.i0(xVar2.c(ue0.e.F(iVar2, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI02 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI02, "just(...)");
                                }
                                if (params.d) {
                                    d0<CreditRecurringPaymentsDto> loanRecurringPayments = creditRecurringPaymentService2.getLoanRecurringPayments();
                                    a05.a aVar = new a05.a(new a09.a(20), 29);
                                    loanRecurringPayments.getClass();
                                    ufm.i iVar3 = new ufm.i(loanRecurringPayments, aVar, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                    d0VarI03 = te0.w.i0(xVar2.c(ue0.e.F(iVar3, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI03 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI03, "just(...)");
                                }
                                ufm.i iVar4 = new ufm.i(te0.w.J0(f0VarE, d0VarI0, d0VarI02, d0VarI03), new e(new a09.a(19), i32), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                                return iVar4;
                            }
                            String str2 = ((WalletId) it8.next()).f66106a;
                            WalletId walletId = new WalletId(str2);
                            if (Intrinsics.f(str2, "CURRENT_WALLET_ID")) {
                                walletId = null;
                            }
                            String str3 = walletId != null ? walletId.f66106a : null;
                            String str4 = ((jte.d) xVar2.f1002g).c(RecurringPaymentApi$Toggles$PredictedSubscriptions.f81650c) ? "RAISED_SUBSCRIPTIONS" : null;
                            if (params.f150646a) {
                                RecurringPaymentService recurringPaymentService2 = xVar2.f999a;
                                String str5 = str3 == null ? null : str3;
                                String[] elements = {"SUBSCRIPTION_BRAND_BLOCK", "NEW_YOUTH_ALLOWANCES", str4};
                                Intrinsics.checkNotNullParameter(elements, "elements");
                                List list2 = (List) ue0.e.M(kotlin.collections.d.L(elements));
                                d0<RecurringPaymentListDto> recurringPayments = recurringPaymentService2.getRecurringPayments(str5, list2 != null ? zhm.d0.k0(list2, ",", null, null, 0, null, 62) : null);
                                u uVar = u.f;
                                a0.b bVar = new a0.b(7);
                                recurringPayments.getClass();
                                d0VarO0 = new ufm.i(recurringPayments, bVar, 1);
                                Intrinsics.checkNotNullExpressionValue(d0VarO0, "map(...)");
                                str = str3;
                            } else {
                                p0 p0Var = p0.f264001a;
                                str = str3;
                                d0VarO0 = te0.w.o0(elm.f.f127540b, new t(xVar2, str3, str4, objArr == true ? 1 : 0, 1));
                            }
                            arrayList.add(xVar2.c(d0VarO0, str));
                        }
                        break;
                    case 1:
                        List list3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((hbd.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list3, "list");
                        xVar.e.f("RECURRING_PAYMENTS", list3);
                        return Unit.f186387a;
                    case 2:
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((hbd.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        u0a.a aVar2 = xVar.d;
                        List list5 = list4;
                        ArrayList list6 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it9 = list5.iterator();
                        while (it9.hasNext()) {
                            list6.add(RecurringPaymentEntityMapperKt.toEntity((qua.p) it9.next()));
                        }
                        Intrinsics.checkNotNullParameter(list6, "list");
                        ((RecurringPaymentDao) ((Lazy) aVar2.f276163c).getValue()).insertOrUpdateAll(list6);
                        return Unit.f186387a;
                    case 3:
                        RecurringPaymentService recurringPaymentService3 = xVar.f999a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        qua.d type = (qua.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(type, "type");
                        if (type instanceof qua.a) {
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, null, ((qua.a) type).f249281a, null, 5);
                        } else if (type instanceof qua.b) {
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, null, null, ((qua.b) type).f249285a, 3);
                        } else {
                            if (!(type instanceof qua.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, ((qua.c) type).f249286a, null, null, 6);
                        }
                        e eVar3 = new e(new a09.a(21), 13);
                        d0VarA.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarA, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 4:
                        qua.d type2 = (qua.d) obj2;
                        List ids = (List) obj3;
                        Intrinsics.checkNotNullParameter(type2, "type");
                        Intrinsics.checkNotNullParameter(ids, "ids");
                        xVar.e.f("ASSOCIATED_SUBSCRIPTIONS_MEMORY_CACHE_KEY" + type2, ids);
                        return Unit.f186387a;
                    default:
                        qua.d type3 = (qua.d) obj2;
                        List ids2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(type3, "type");
                        Intrinsics.checkNotNullParameter(ids2, "ids");
                        xVar.f1003h.G(ids2, "ASSOCIATED_SUBSCRIPTIONS_MEMORY_CACHE_KEY" + type3, kii.e.o(String.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, new f(this, 6), new Function2(this) { // from class: a31.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f983b;

            {
                this.f983b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                d0 d0VarI0;
                d0 d0VarI02;
                d0 d0VarI03;
                String str;
                d0 d0VarO0;
                d0 d0VarA;
                int i22 = i21;
                int i32 = 3;
                x xVar = this.f983b;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        hbd.a params = (hbd.a) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        x xVar2 = this.f983b;
                        CreditRecurringPaymentService creditRecurringPaymentService2 = xVar2.f1001c;
                        List list = params.e;
                        Intrinsics.checkNotNullParameter("CURRENT_WALLET_ID", "id");
                        ArrayList arrayListF0 = zhm.d0.F0(new WalletId("CURRENT_WALLET_ID"), list);
                        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListF0, 10));
                        Iterator it8 = arrayListF0.iterator();
                        while (true) {
                            Object[] objArr = 0;
                            if (!it8.hasNext()) {
                                f0 f0VarE = d0.E(arrayList, new a05.a(new a09.a(26), 28));
                                Intrinsics.checkNotNullExpressionValue(f0VarE, "zip(...)");
                                if (params.f150647b) {
                                    d0<CreditRecurringPaymentsDto> creditRecurringPayments = creditRecurringPaymentService2.getCreditRecurringPayments();
                                    e eVar = new e(new a09.a(22), 9);
                                    creditRecurringPayments.getClass();
                                    ufm.i iVar = new ufm.i(creditRecurringPayments, eVar, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                    d0VarI0 = te0.w.i0(xVar2.c(ue0.e.F(iVar, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI0 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI0, "just(...)");
                                }
                                if (params.f150648c) {
                                    CreditRecurringPaymentService.Companion companion = CreditRecurringPaymentService.INSTANCE;
                                    d0<PayLaterUpcomingPaymentsDto> payLaterRecurringPayments = creditRecurringPaymentService2.getPayLaterRecurringPayments(5);
                                    e eVar2 = new e(new a09.a(23), 12);
                                    payLaterRecurringPayments.getClass();
                                    ufm.i iVar2 = new ufm.i(payLaterRecurringPayments, eVar2, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                                    d0VarI02 = te0.w.i0(xVar2.c(ue0.e.F(iVar2, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI02 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI02, "just(...)");
                                }
                                if (params.d) {
                                    d0<CreditRecurringPaymentsDto> loanRecurringPayments = creditRecurringPaymentService2.getLoanRecurringPayments();
                                    a05.a aVar = new a05.a(new a09.a(20), 29);
                                    loanRecurringPayments.getClass();
                                    ufm.i iVar3 = new ufm.i(loanRecurringPayments, aVar, 1);
                                    Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                                    d0VarI03 = te0.w.i0(xVar2.c(ue0.e.F(iVar3, zhm.f0.f322471a), null));
                                } else {
                                    d0VarI03 = d0.m(zhm.f0.f322471a);
                                    Intrinsics.checkNotNullExpressionValue(d0VarI03, "just(...)");
                                }
                                ufm.i iVar4 = new ufm.i(te0.w.J0(f0VarE, d0VarI0, d0VarI02, d0VarI03), new e(new a09.a(19), i32), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                                return iVar4;
                            }
                            String str2 = ((WalletId) it8.next()).f66106a;
                            WalletId walletId = new WalletId(str2);
                            if (Intrinsics.f(str2, "CURRENT_WALLET_ID")) {
                                walletId = null;
                            }
                            String str3 = walletId != null ? walletId.f66106a : null;
                            String str4 = ((jte.d) xVar2.f1002g).c(RecurringPaymentApi$Toggles$PredictedSubscriptions.f81650c) ? "RAISED_SUBSCRIPTIONS" : null;
                            if (params.f150646a) {
                                RecurringPaymentService recurringPaymentService2 = xVar2.f999a;
                                String str5 = str3 == null ? null : str3;
                                String[] elements = {"SUBSCRIPTION_BRAND_BLOCK", "NEW_YOUTH_ALLOWANCES", str4};
                                Intrinsics.checkNotNullParameter(elements, "elements");
                                List list2 = (List) ue0.e.M(kotlin.collections.d.L(elements));
                                d0<RecurringPaymentListDto> recurringPayments = recurringPaymentService2.getRecurringPayments(str5, list2 != null ? zhm.d0.k0(list2, ",", null, null, 0, null, 62) : null);
                                u uVar = u.f;
                                a0.b bVar = new a0.b(7);
                                recurringPayments.getClass();
                                d0VarO0 = new ufm.i(recurringPayments, bVar, 1);
                                Intrinsics.checkNotNullExpressionValue(d0VarO0, "map(...)");
                                str = str3;
                            } else {
                                p0 p0Var = p0.f264001a;
                                str = str3;
                                d0VarO0 = te0.w.o0(elm.f.f127540b, new t(xVar2, str3, str4, objArr == true ? 1 : 0, 1));
                            }
                            arrayList.add(xVar2.c(d0VarO0, str));
                        }
                        break;
                    case 1:
                        List list3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((hbd.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list3, "list");
                        xVar.e.f("RECURRING_PAYMENTS", list3);
                        return Unit.f186387a;
                    case 2:
                        List list4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((hbd.a) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(list4, "list");
                        u0a.a aVar2 = xVar.d;
                        List list5 = list4;
                        ArrayList list6 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it9 = list5.iterator();
                        while (it9.hasNext()) {
                            list6.add(RecurringPaymentEntityMapperKt.toEntity((qua.p) it9.next()));
                        }
                        Intrinsics.checkNotNullParameter(list6, "list");
                        ((RecurringPaymentDao) ((Lazy) aVar2.f276163c).getValue()).insertOrUpdateAll(list6);
                        return Unit.f186387a;
                    case 3:
                        RecurringPaymentService recurringPaymentService3 = xVar.f999a;
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        qua.d type = (qua.d) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(type, "type");
                        if (type instanceof qua.a) {
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, null, ((qua.a) type).f249281a, null, 5);
                        } else if (type instanceof qua.b) {
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, null, null, ((qua.b) type).f249285a, 3);
                        } else {
                            if (!(type instanceof qua.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            d0VarA = RecurringPaymentService.a(recurringPaymentService3, ((qua.c) type).f249286a, null, null, 6);
                        }
                        e eVar3 = new e(new a09.a(21), 13);
                        d0VarA.getClass();
                        ufm.i iVar5 = new ufm.i(d0VarA, eVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 4:
                        qua.d type2 = (qua.d) obj2;
                        List ids = (List) obj3;
                        Intrinsics.checkNotNullParameter(type2, "type");
                        Intrinsics.checkNotNullParameter(ids, "ids");
                        xVar.e.f("ASSOCIATED_SUBSCRIPTIONS_MEMORY_CACHE_KEY" + type2, ids);
                        return Unit.f186387a;
                    default:
                        qua.d type3 = (qua.d) obj2;
                        List ids2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(type3, "type");
                        Intrinsics.checkNotNullParameter(ids2, "ids");
                        xVar.f1003h.G(ids2, "ASSOCIATED_SUBSCRIPTIONS_MEMORY_CACHE_KEY" + type3, kii.e.o(String.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Set r6, hbd.a r7, java.lang.String r8, gim.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof a31.r
            if (r0 == 0) goto L13
            r0 = r9
            a31.r r0 = (a31.r) r0
            int r1 = r0.f988w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f988w = r1
            goto L18
        L13:
            a31.r r0 = new a31.r
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f988w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L6f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r9)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            efm.r r6 = efm.r.fromIterable(r6)
            a31.g r9 = new a31.g
            r2 = 0
            r9.<init>(r8, r2)
            a31.e r2 = new a31.e
            r4 = 4
            r2.<init>(r9, r4)
            efm.r r6 = r6.map(r2)
            a31.d r9 = new a31.d
            r2 = 2
            r9.<init>(r5, r7, r8, r2)
            a31.e r7 = new a31.e
            r8 = 5
            r7.<init>(r9, r8)
            efm.r r6 = r6.concatMapSingle(r7)
            efm.d0 r6 = r6.toList()
            java.lang.String r7 = "toList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            ufm.n r6 = te0.w.i0(r6)
            r0.f988w = r3
            java.lang.Object r9 = nim.a.b(r6, r0)
            if (r9 != r1) goto L6f
            return r1
        L6f:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a31.x.a(java.util.Set, hbd.a, java.lang.String, gim.c):java.lang.Object");
    }

    public final efm.r b(String id10, hbd.a params) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(params, "params");
        return nim.a.w(nim.a.w(this.i.f(params, true), new a09.a(24)), new g(id10, 3));
    }

    public final ufm.i c(d0 d0Var, String str) {
        ufm.i iVar = new ufm.i(new ufm.i(d0Var, new e(new g(str, 2), 10), 1), new e(new f(this, 1), 11), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i d(d0 d0Var, hbd.a aVar, String str) {
        e eVar = new e(new d(this, str, aVar, 0), 0);
        d0Var.getClass();
        ufm.i iVar = new ufm.i(new ufm.i(d0Var, eVar, 0), new e(new f(this, 0), 1), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final pfm.a e(hbd.a aVar, Function1 function1) {
        d0 d0VarFirstOrError = m70.a.g(this.i.f(aVar, false), null, new a08.n(14), 1).firstOrError();
        e eVar = new e(new k(0, function1), 15);
        d0VarFirstOrError.getClass();
        pfm.a aVar2 = new pfm.a(new ufm.i(d0VarFirstOrError, eVar, 1), new e(new h(this, aVar, 2), 16), 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return aVar2;
    }

    public final pfm.h f(String str, hbd.a aVar) {
        d0 d0VarFirstOrError = m70.a.g(this.i.f(aVar, false), null, new a08.n(13), 1).firstOrError();
        e eVar = new e(new g(1, str, this), 6);
        d0VarFirstOrError.getClass();
        pfm.h hVar = new pfm.h(new ufm.i(new ufm.i(d0VarFirstOrError, eVar, 0), new e(new h(this, aVar, 0), 7), 1), 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        return hVar;
    }
}
