package bjg;

import cjg.a;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import com.revolut.feature.trusted_merchants.impl.data.network.TrustedMerchantsService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDateTime;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements yig.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f15666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Type f15667h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrustedMerchantsService f15668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f15669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f15670c;
    public final w4l.f d;
    public final w4l.f e;
    public final w4l.f f;

    static {
        Type type = new TypeToken<List<? extends a.C0154a>>() { // from class: com.revolut.feature.trusted_merchants.impl.data.repository.TrustedMerchantsRepositoryImpl$Companion$LIST_OF_TRUSTED_MERCHANTS_ENTITIES_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f15666g = type;
        Type type2 = new TypeToken<List<? extends a.b>>() { // from class: com.revolut.feature.trusted_merchants.impl.data.repository.TrustedMerchantsRepositoryImpl$Companion$LIST_OF_MERCHANTS_TO_REVIEW_ENTITIES_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f15667h = type2;
    }

    public f(TrustedMerchantsService service, j cache, ue0.c trustedMerchantsStorage, b80.c connectivityRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(trustedMerchantsStorage, "trustedMerchantsStorage");
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        this.f15668a = service;
        this.f15669b = cache;
        this.f15670c = trustedMerchantsStorage;
        final int i = 5;
        uj0.b bVarK0 = w.k0(connectivityRepository, new Function1(this) { // from class: bjg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f15660b;

            {
                this.f15660b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f15660b.f15669b.get("TRUSTED_MERCHANTS");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List list = (List) this.f15660b.f15670c.T2("TRUSTED_MERCHANTS_STORAGE_KEY", f.f15666g);
                        if (list == null) {
                            return null;
                        }
                        List<a.C0154a> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (a.C0154a c0154a : list2) {
                            Intrinsics.checkNotNullParameter(c0154a, "<this>");
                            String id10 = c0154a.getId();
                            String name = c0154a.getName();
                            String category = c0154a.getCategory();
                            String logo = c0154a.getLogo();
                            Long approve = c0154a.getApprove();
                            if (approve == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList.add(new TrustedMerchant.Approved(new LocalDateTime(approve.longValue()), id10, name, category, logo));
                        }
                        return arrayList;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<List<zig.a>> merchantsToReview = this.f15660b.f15668a.getMerchantsToReview();
                        bce.e eVar = new bce.e(new bek.a(29), 28);
                        merchantsToReview.getClass();
                        i iVar = new i(merchantsToReview, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f15660b.f15669b.get("MERCHANTS_TO_REVIEW");
                    case 4:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        List list3 = (List) this.f15660b.f15670c.T2("MERCHANTS_TO_REVIEW_STORAGE_KEY", f.f15667h);
                        if (list3 == null) {
                            return null;
                        }
                        List<a.b> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (a.b bVar : list4) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String id11 = bVar.getId();
                            String name2 = bVar.getName();
                            String category2 = bVar.getCategory();
                            String logo2 = bVar.getLogo();
                            Long lastDecline = bVar.getLastDecline();
                            if (lastDecline == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList2.add(new TrustedMerchant.ToReview(new LocalDateTime(lastDecline.longValue()), id11, name2, category2, logo2));
                        }
                        return arrayList2;
                    case 5:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<List<zig.a>> trustedMerchants = this.f15660b.f15668a.getTrustedMerchants();
                        bce.e eVar2 = new bce.e(new c(0), 29);
                        trustedMerchants.getClass();
                        i iVar2 = new i(trustedMerchants, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 6:
                        String transactionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d0<zig.a> merchantByTransactionId = this.f15660b.f15668a.getMerchantByTransactionId(transactionId);
                        d dVar = new d(0, new c(1));
                        merchantByTransactionId.getClass();
                        i iVar3 = new i(merchantByTransactionId, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String transactionId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        return (TrustedMerchant) this.f15660b.f15669b.get(transactionId2);
                }
            }
        });
        final int i2 = 0;
        Function1 function1 = new Function1(this) { // from class: bjg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f15660b;

            {
                this.f15660b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f15660b.f15669b.get("TRUSTED_MERCHANTS");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List list = (List) this.f15660b.f15670c.T2("TRUSTED_MERCHANTS_STORAGE_KEY", f.f15666g);
                        if (list == null) {
                            return null;
                        }
                        List<a.C0154a> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (a.C0154a c0154a : list2) {
                            Intrinsics.checkNotNullParameter(c0154a, "<this>");
                            String id10 = c0154a.getId();
                            String name = c0154a.getName();
                            String category = c0154a.getCategory();
                            String logo = c0154a.getLogo();
                            Long approve = c0154a.getApprove();
                            if (approve == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList.add(new TrustedMerchant.Approved(new LocalDateTime(approve.longValue()), id10, name, category, logo));
                        }
                        return arrayList;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<List<zig.a>> merchantsToReview = this.f15660b.f15668a.getMerchantsToReview();
                        bce.e eVar = new bce.e(new bek.a(29), 28);
                        merchantsToReview.getClass();
                        i iVar = new i(merchantsToReview, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f15660b.f15669b.get("MERCHANTS_TO_REVIEW");
                    case 4:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        List list3 = (List) this.f15660b.f15670c.T2("MERCHANTS_TO_REVIEW_STORAGE_KEY", f.f15667h);
                        if (list3 == null) {
                            return null;
                        }
                        List<a.b> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (a.b bVar : list4) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String id11 = bVar.getId();
                            String name2 = bVar.getName();
                            String category2 = bVar.getCategory();
                            String logo2 = bVar.getLogo();
                            Long lastDecline = bVar.getLastDecline();
                            if (lastDecline == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList2.add(new TrustedMerchant.ToReview(new LocalDateTime(lastDecline.longValue()), id11, name2, category2, logo2));
                        }
                        return arrayList2;
                    case 5:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<List<zig.a>> trustedMerchants = this.f15660b.f15668a.getTrustedMerchants();
                        bce.e eVar2 = new bce.e(new c(0), 29);
                        trustedMerchants.getClass();
                        i iVar2 = new i(trustedMerchants, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 6:
                        String transactionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d0<zig.a> merchantByTransactionId = this.f15660b.f15668a.getMerchantByTransactionId(transactionId);
                        d dVar = new d(0, new c(1));
                        merchantByTransactionId.getClass();
                        i iVar3 = new i(merchantByTransactionId, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String transactionId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        return (TrustedMerchant) this.f15660b.f15669b.get(transactionId2);
                }
            }
        };
        Function2 function2 = new Function2(this) { // from class: bjg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f15662b;

            {
                this.f15662b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f15662b.f15669b.f("TRUSTED_MERCHANTS", data);
                        break;
                    case 1:
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        ue0.c cVar = this.f15662b.f15670c;
                        List<TrustedMerchant.Approved> list = data2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (TrustedMerchant.Approved approved : list) {
                            Intrinsics.checkNotNullParameter(approved, "<this>");
                            arrayList.add(new a.C0154a(approved.f94405b, approved.f94406c, approved.d, Long.valueOf(approved.f94404a.toDate().getTime()), approved.e));
                        }
                        cVar.G(arrayList, "TRUSTED_MERCHANTS_STORAGE_KEY", kii.e.o(a.C0154a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 2:
                        List data3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f15662b.f15669b.f("MERCHANTS_TO_REVIEW", data3);
                        break;
                    case 3:
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        ue0.c cVar2 = this.f15662b.f15670c;
                        List<TrustedMerchant.ToReview> list2 = data4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TrustedMerchant.ToReview toReview : list2) {
                            Intrinsics.checkNotNullParameter(toReview, "<this>");
                            arrayList2.add(new a.b(toReview.f94411b, toReview.f94412c, toReview.d, Long.valueOf(toReview.f94410a.toDate().getTime()), toReview.e));
                        }
                        cVar2.G(arrayList2, "MERCHANTS_TO_REVIEW_STORAGE_KEY", kii.e.o(a.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    default:
                        String transactionId = (String) obj2;
                        TrustedMerchant data5 = (TrustedMerchant) obj3;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        Intrinsics.checkNotNullParameter(data5, "data");
                        this.f15662b.f15669b.f(transactionId, data5);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 1;
        this.d = new w4l.f(bVarK0, function1, function2, new Function1(this) { // from class: bjg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f15660b;

            {
                this.f15660b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f15660b.f15669b.get("TRUSTED_MERCHANTS");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List list = (List) this.f15660b.f15670c.T2("TRUSTED_MERCHANTS_STORAGE_KEY", f.f15666g);
                        if (list == null) {
                            return null;
                        }
                        List<a.C0154a> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (a.C0154a c0154a : list2) {
                            Intrinsics.checkNotNullParameter(c0154a, "<this>");
                            String id10 = c0154a.getId();
                            String name = c0154a.getName();
                            String category = c0154a.getCategory();
                            String logo = c0154a.getLogo();
                            Long approve = c0154a.getApprove();
                            if (approve == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList.add(new TrustedMerchant.Approved(new LocalDateTime(approve.longValue()), id10, name, category, logo));
                        }
                        return arrayList;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<List<zig.a>> merchantsToReview = this.f15660b.f15668a.getMerchantsToReview();
                        bce.e eVar = new bce.e(new bek.a(29), 28);
                        merchantsToReview.getClass();
                        i iVar = new i(merchantsToReview, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f15660b.f15669b.get("MERCHANTS_TO_REVIEW");
                    case 4:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        List list3 = (List) this.f15660b.f15670c.T2("MERCHANTS_TO_REVIEW_STORAGE_KEY", f.f15667h);
                        if (list3 == null) {
                            return null;
                        }
                        List<a.b> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (a.b bVar : list4) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String id11 = bVar.getId();
                            String name2 = bVar.getName();
                            String category2 = bVar.getCategory();
                            String logo2 = bVar.getLogo();
                            Long lastDecline = bVar.getLastDecline();
                            if (lastDecline == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList2.add(new TrustedMerchant.ToReview(new LocalDateTime(lastDecline.longValue()), id11, name2, category2, logo2));
                        }
                        return arrayList2;
                    case 5:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<List<zig.a>> trustedMerchants = this.f15660b.f15668a.getTrustedMerchants();
                        bce.e eVar2 = new bce.e(new c(0), 29);
                        trustedMerchants.getClass();
                        i iVar2 = new i(trustedMerchants, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 6:
                        String transactionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d0<zig.a> merchantByTransactionId = this.f15660b.f15668a.getMerchantByTransactionId(transactionId);
                        d dVar = new d(0, new c(1));
                        merchantByTransactionId.getClass();
                        i iVar3 = new i(merchantByTransactionId, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String transactionId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        return (TrustedMerchant) this.f15660b.f15669b.get(transactionId2);
                }
            }
        }, new Function2(this) { // from class: bjg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f15662b;

            {
                this.f15662b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f15662b.f15669b.f("TRUSTED_MERCHANTS", data);
                        break;
                    case 1:
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        ue0.c cVar = this.f15662b.f15670c;
                        List<TrustedMerchant.Approved> list = data2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (TrustedMerchant.Approved approved : list) {
                            Intrinsics.checkNotNullParameter(approved, "<this>");
                            arrayList.add(new a.C0154a(approved.f94405b, approved.f94406c, approved.d, Long.valueOf(approved.f94404a.toDate().getTime()), approved.e));
                        }
                        cVar.G(arrayList, "TRUSTED_MERCHANTS_STORAGE_KEY", kii.e.o(a.C0154a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 2:
                        List data3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f15662b.f15669b.f("MERCHANTS_TO_REVIEW", data3);
                        break;
                    case 3:
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        ue0.c cVar2 = this.f15662b.f15670c;
                        List<TrustedMerchant.ToReview> list2 = data4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TrustedMerchant.ToReview toReview : list2) {
                            Intrinsics.checkNotNullParameter(toReview, "<this>");
                            arrayList2.add(new a.b(toReview.f94411b, toReview.f94412c, toReview.d, Long.valueOf(toReview.f94410a.toDate().getTime()), toReview.e));
                        }
                        cVar2.G(arrayList2, "MERCHANTS_TO_REVIEW_STORAGE_KEY", kii.e.o(a.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    default:
                        String transactionId = (String) obj2;
                        TrustedMerchant data5 = (TrustedMerchant) obj3;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        Intrinsics.checkNotNullParameter(data5, "data");
                        this.f15662b.f15669b.f(transactionId, data5);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 2;
        uj0.b bVarK02 = w.k0(connectivityRepository, new Function1(this) { // from class: bjg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f15660b;

            {
                this.f15660b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f15660b.f15669b.get("TRUSTED_MERCHANTS");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List list = (List) this.f15660b.f15670c.T2("TRUSTED_MERCHANTS_STORAGE_KEY", f.f15666g);
                        if (list == null) {
                            return null;
                        }
                        List<a.C0154a> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (a.C0154a c0154a : list2) {
                            Intrinsics.checkNotNullParameter(c0154a, "<this>");
                            String id10 = c0154a.getId();
                            String name = c0154a.getName();
                            String category = c0154a.getCategory();
                            String logo = c0154a.getLogo();
                            Long approve = c0154a.getApprove();
                            if (approve == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList.add(new TrustedMerchant.Approved(new LocalDateTime(approve.longValue()), id10, name, category, logo));
                        }
                        return arrayList;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<List<zig.a>> merchantsToReview = this.f15660b.f15668a.getMerchantsToReview();
                        bce.e eVar = new bce.e(new bek.a(29), 28);
                        merchantsToReview.getClass();
                        i iVar = new i(merchantsToReview, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f15660b.f15669b.get("MERCHANTS_TO_REVIEW");
                    case 4:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        List list3 = (List) this.f15660b.f15670c.T2("MERCHANTS_TO_REVIEW_STORAGE_KEY", f.f15667h);
                        if (list3 == null) {
                            return null;
                        }
                        List<a.b> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (a.b bVar : list4) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String id11 = bVar.getId();
                            String name2 = bVar.getName();
                            String category2 = bVar.getCategory();
                            String logo2 = bVar.getLogo();
                            Long lastDecline = bVar.getLastDecline();
                            if (lastDecline == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList2.add(new TrustedMerchant.ToReview(new LocalDateTime(lastDecline.longValue()), id11, name2, category2, logo2));
                        }
                        return arrayList2;
                    case 5:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<List<zig.a>> trustedMerchants = this.f15660b.f15668a.getTrustedMerchants();
                        bce.e eVar2 = new bce.e(new c(0), 29);
                        trustedMerchants.getClass();
                        i iVar2 = new i(trustedMerchants, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 6:
                        String transactionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d0<zig.a> merchantByTransactionId = this.f15660b.f15668a.getMerchantByTransactionId(transactionId);
                        d dVar = new d(0, new c(1));
                        merchantByTransactionId.getClass();
                        i iVar3 = new i(merchantByTransactionId, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String transactionId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        return (TrustedMerchant) this.f15660b.f15669b.get(transactionId2);
                }
            }
        });
        final int i6 = 3;
        Function1 function12 = new Function1(this) { // from class: bjg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f15660b;

            {
                this.f15660b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f15660b.f15669b.get("TRUSTED_MERCHANTS");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List list = (List) this.f15660b.f15670c.T2("TRUSTED_MERCHANTS_STORAGE_KEY", f.f15666g);
                        if (list == null) {
                            return null;
                        }
                        List<a.C0154a> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (a.C0154a c0154a : list2) {
                            Intrinsics.checkNotNullParameter(c0154a, "<this>");
                            String id10 = c0154a.getId();
                            String name = c0154a.getName();
                            String category = c0154a.getCategory();
                            String logo = c0154a.getLogo();
                            Long approve = c0154a.getApprove();
                            if (approve == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList.add(new TrustedMerchant.Approved(new LocalDateTime(approve.longValue()), id10, name, category, logo));
                        }
                        return arrayList;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<List<zig.a>> merchantsToReview = this.f15660b.f15668a.getMerchantsToReview();
                        bce.e eVar = new bce.e(new bek.a(29), 28);
                        merchantsToReview.getClass();
                        i iVar = new i(merchantsToReview, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f15660b.f15669b.get("MERCHANTS_TO_REVIEW");
                    case 4:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        List list3 = (List) this.f15660b.f15670c.T2("MERCHANTS_TO_REVIEW_STORAGE_KEY", f.f15667h);
                        if (list3 == null) {
                            return null;
                        }
                        List<a.b> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (a.b bVar : list4) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String id11 = bVar.getId();
                            String name2 = bVar.getName();
                            String category2 = bVar.getCategory();
                            String logo2 = bVar.getLogo();
                            Long lastDecline = bVar.getLastDecline();
                            if (lastDecline == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList2.add(new TrustedMerchant.ToReview(new LocalDateTime(lastDecline.longValue()), id11, name2, category2, logo2));
                        }
                        return arrayList2;
                    case 5:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<List<zig.a>> trustedMerchants = this.f15660b.f15668a.getTrustedMerchants();
                        bce.e eVar2 = new bce.e(new c(0), 29);
                        trustedMerchants.getClass();
                        i iVar2 = new i(trustedMerchants, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 6:
                        String transactionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d0<zig.a> merchantByTransactionId = this.f15660b.f15668a.getMerchantByTransactionId(transactionId);
                        d dVar = new d(0, new c(1));
                        merchantByTransactionId.getClass();
                        i iVar3 = new i(merchantByTransactionId, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String transactionId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        return (TrustedMerchant) this.f15660b.f15669b.get(transactionId2);
                }
            }
        };
        final int i21 = 2;
        Function2 function22 = new Function2(this) { // from class: bjg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f15662b;

            {
                this.f15662b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f15662b.f15669b.f("TRUSTED_MERCHANTS", data);
                        break;
                    case 1:
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        ue0.c cVar = this.f15662b.f15670c;
                        List<TrustedMerchant.Approved> list = data2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (TrustedMerchant.Approved approved : list) {
                            Intrinsics.checkNotNullParameter(approved, "<this>");
                            arrayList.add(new a.C0154a(approved.f94405b, approved.f94406c, approved.d, Long.valueOf(approved.f94404a.toDate().getTime()), approved.e));
                        }
                        cVar.G(arrayList, "TRUSTED_MERCHANTS_STORAGE_KEY", kii.e.o(a.C0154a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 2:
                        List data3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f15662b.f15669b.f("MERCHANTS_TO_REVIEW", data3);
                        break;
                    case 3:
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        ue0.c cVar2 = this.f15662b.f15670c;
                        List<TrustedMerchant.ToReview> list2 = data4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TrustedMerchant.ToReview toReview : list2) {
                            Intrinsics.checkNotNullParameter(toReview, "<this>");
                            arrayList2.add(new a.b(toReview.f94411b, toReview.f94412c, toReview.d, Long.valueOf(toReview.f94410a.toDate().getTime()), toReview.e));
                        }
                        cVar2.G(arrayList2, "MERCHANTS_TO_REVIEW_STORAGE_KEY", kii.e.o(a.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    default:
                        String transactionId = (String) obj2;
                        TrustedMerchant data5 = (TrustedMerchant) obj3;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        Intrinsics.checkNotNullParameter(data5, "data");
                        this.f15662b.f15669b.f(transactionId, data5);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i22 = 4;
        Function1 function13 = new Function1(this) { // from class: bjg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f15660b;

            {
                this.f15660b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f15660b.f15669b.get("TRUSTED_MERCHANTS");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List list = (List) this.f15660b.f15670c.T2("TRUSTED_MERCHANTS_STORAGE_KEY", f.f15666g);
                        if (list == null) {
                            return null;
                        }
                        List<a.C0154a> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (a.C0154a c0154a : list2) {
                            Intrinsics.checkNotNullParameter(c0154a, "<this>");
                            String id10 = c0154a.getId();
                            String name = c0154a.getName();
                            String category = c0154a.getCategory();
                            String logo = c0154a.getLogo();
                            Long approve = c0154a.getApprove();
                            if (approve == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList.add(new TrustedMerchant.Approved(new LocalDateTime(approve.longValue()), id10, name, category, logo));
                        }
                        return arrayList;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<List<zig.a>> merchantsToReview = this.f15660b.f15668a.getMerchantsToReview();
                        bce.e eVar = new bce.e(new bek.a(29), 28);
                        merchantsToReview.getClass();
                        i iVar = new i(merchantsToReview, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f15660b.f15669b.get("MERCHANTS_TO_REVIEW");
                    case 4:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        List list3 = (List) this.f15660b.f15670c.T2("MERCHANTS_TO_REVIEW_STORAGE_KEY", f.f15667h);
                        if (list3 == null) {
                            return null;
                        }
                        List<a.b> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (a.b bVar : list4) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String id11 = bVar.getId();
                            String name2 = bVar.getName();
                            String category2 = bVar.getCategory();
                            String logo2 = bVar.getLogo();
                            Long lastDecline = bVar.getLastDecline();
                            if (lastDecline == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList2.add(new TrustedMerchant.ToReview(new LocalDateTime(lastDecline.longValue()), id11, name2, category2, logo2));
                        }
                        return arrayList2;
                    case 5:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<List<zig.a>> trustedMerchants = this.f15660b.f15668a.getTrustedMerchants();
                        bce.e eVar2 = new bce.e(new c(0), 29);
                        trustedMerchants.getClass();
                        i iVar2 = new i(trustedMerchants, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 6:
                        String transactionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d0<zig.a> merchantByTransactionId = this.f15660b.f15668a.getMerchantByTransactionId(transactionId);
                        d dVar = new d(0, new c(1));
                        merchantByTransactionId.getClass();
                        i iVar3 = new i(merchantByTransactionId, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String transactionId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        return (TrustedMerchant) this.f15660b.f15669b.get(transactionId2);
                }
            }
        };
        final int i32 = 3;
        this.e = new w4l.f(bVarK02, function12, function22, function13, new Function2(this) { // from class: bjg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f15662b;

            {
                this.f15662b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f15662b.f15669b.f("TRUSTED_MERCHANTS", data);
                        break;
                    case 1:
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        ue0.c cVar = this.f15662b.f15670c;
                        List<TrustedMerchant.Approved> list = data2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (TrustedMerchant.Approved approved : list) {
                            Intrinsics.checkNotNullParameter(approved, "<this>");
                            arrayList.add(new a.C0154a(approved.f94405b, approved.f94406c, approved.d, Long.valueOf(approved.f94404a.toDate().getTime()), approved.e));
                        }
                        cVar.G(arrayList, "TRUSTED_MERCHANTS_STORAGE_KEY", kii.e.o(a.C0154a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 2:
                        List data3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f15662b.f15669b.f("MERCHANTS_TO_REVIEW", data3);
                        break;
                    case 3:
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        ue0.c cVar2 = this.f15662b.f15670c;
                        List<TrustedMerchant.ToReview> list2 = data4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TrustedMerchant.ToReview toReview : list2) {
                            Intrinsics.checkNotNullParameter(toReview, "<this>");
                            arrayList2.add(new a.b(toReview.f94411b, toReview.f94412c, toReview.d, Long.valueOf(toReview.f94410a.toDate().getTime()), toReview.e));
                        }
                        cVar2.G(arrayList2, "MERCHANTS_TO_REVIEW_STORAGE_KEY", kii.e.o(a.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    default:
                        String transactionId = (String) obj2;
                        TrustedMerchant data5 = (TrustedMerchant) obj3;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        Intrinsics.checkNotNullParameter(data5, "data");
                        this.f15662b.f15669b.f(transactionId, data5);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i33 = 6;
        uj0.b bVarK03 = w.k0(connectivityRepository, new Function1(this) { // from class: bjg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f15660b;

            {
                this.f15660b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i33) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f15660b.f15669b.get("TRUSTED_MERCHANTS");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List list = (List) this.f15660b.f15670c.T2("TRUSTED_MERCHANTS_STORAGE_KEY", f.f15666g);
                        if (list == null) {
                            return null;
                        }
                        List<a.C0154a> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (a.C0154a c0154a : list2) {
                            Intrinsics.checkNotNullParameter(c0154a, "<this>");
                            String id10 = c0154a.getId();
                            String name = c0154a.getName();
                            String category = c0154a.getCategory();
                            String logo = c0154a.getLogo();
                            Long approve = c0154a.getApprove();
                            if (approve == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList.add(new TrustedMerchant.Approved(new LocalDateTime(approve.longValue()), id10, name, category, logo));
                        }
                        return arrayList;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<List<zig.a>> merchantsToReview = this.f15660b.f15668a.getMerchantsToReview();
                        bce.e eVar = new bce.e(new bek.a(29), 28);
                        merchantsToReview.getClass();
                        i iVar = new i(merchantsToReview, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f15660b.f15669b.get("MERCHANTS_TO_REVIEW");
                    case 4:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        List list3 = (List) this.f15660b.f15670c.T2("MERCHANTS_TO_REVIEW_STORAGE_KEY", f.f15667h);
                        if (list3 == null) {
                            return null;
                        }
                        List<a.b> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (a.b bVar : list4) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String id11 = bVar.getId();
                            String name2 = bVar.getName();
                            String category2 = bVar.getCategory();
                            String logo2 = bVar.getLogo();
                            Long lastDecline = bVar.getLastDecline();
                            if (lastDecline == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList2.add(new TrustedMerchant.ToReview(new LocalDateTime(lastDecline.longValue()), id11, name2, category2, logo2));
                        }
                        return arrayList2;
                    case 5:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<List<zig.a>> trustedMerchants = this.f15660b.f15668a.getTrustedMerchants();
                        bce.e eVar2 = new bce.e(new c(0), 29);
                        trustedMerchants.getClass();
                        i iVar2 = new i(trustedMerchants, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 6:
                        String transactionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d0<zig.a> merchantByTransactionId = this.f15660b.f15668a.getMerchantByTransactionId(transactionId);
                        d dVar = new d(0, new c(1));
                        merchantByTransactionId.getClass();
                        i iVar3 = new i(merchantByTransactionId, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String transactionId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        return (TrustedMerchant) this.f15660b.f15669b.get(transactionId2);
                }
            }
        });
        final int i43 = 7;
        Function1 function14 = new Function1(this) { // from class: bjg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f15660b;

            {
                this.f15660b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i43) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f15660b.f15669b.get("TRUSTED_MERCHANTS");
                    case 1:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        List list = (List) this.f15660b.f15670c.T2("TRUSTED_MERCHANTS_STORAGE_KEY", f.f15666g);
                        if (list == null) {
                            return null;
                        }
                        List<a.C0154a> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (a.C0154a c0154a : list2) {
                            Intrinsics.checkNotNullParameter(c0154a, "<this>");
                            String id10 = c0154a.getId();
                            String name = c0154a.getName();
                            String category = c0154a.getCategory();
                            String logo = c0154a.getLogo();
                            Long approve = c0154a.getApprove();
                            if (approve == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList.add(new TrustedMerchant.Approved(new LocalDateTime(approve.longValue()), id10, name, category, logo));
                        }
                        return arrayList;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        d0<List<zig.a>> merchantsToReview = this.f15660b.f15668a.getMerchantsToReview();
                        bce.e eVar = new bce.e(new bek.a(29), 28);
                        merchantsToReview.getClass();
                        i iVar = new i(merchantsToReview, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 3:
                        Unit it11 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        return (List) this.f15660b.f15669b.get("MERCHANTS_TO_REVIEW");
                    case 4:
                        Unit it12 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it12, "it");
                        List list3 = (List) this.f15660b.f15670c.T2("MERCHANTS_TO_REVIEW_STORAGE_KEY", f.f15667h);
                        if (list3 == null) {
                            return null;
                        }
                        List<a.b> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (a.b bVar : list4) {
                            Intrinsics.checkNotNullParameter(bVar, "<this>");
                            String id11 = bVar.getId();
                            String name2 = bVar.getName();
                            String category2 = bVar.getCategory();
                            String logo2 = bVar.getLogo();
                            Long lastDecline = bVar.getLastDecline();
                            if (lastDecline == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            arrayList2.add(new TrustedMerchant.ToReview(new LocalDateTime(lastDecline.longValue()), id11, name2, category2, logo2));
                        }
                        return arrayList2;
                    case 5:
                        Unit it13 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it13, "it");
                        d0<List<zig.a>> trustedMerchants = this.f15660b.f15668a.getTrustedMerchants();
                        bce.e eVar2 = new bce.e(new c(0), 29);
                        trustedMerchants.getClass();
                        i iVar2 = new i(trustedMerchants, eVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 6:
                        String transactionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        d0<zig.a> merchantByTransactionId = this.f15660b.f15668a.getMerchantByTransactionId(transactionId);
                        d dVar = new d(0, new c(1));
                        merchantByTransactionId.getClass();
                        i iVar3 = new i(merchantByTransactionId, dVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    default:
                        String transactionId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(transactionId2, "transactionId");
                        return (TrustedMerchant) this.f15660b.f15669b.get(transactionId2);
                }
            }
        };
        final int i59 = 4;
        this.f = new w4l.f(bVarK03, function14, new Function2(this) { // from class: bjg.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f15662b;

            {
                this.f15662b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i59) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f15662b.f15669b.f("TRUSTED_MERCHANTS", data);
                        break;
                    case 1:
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        ue0.c cVar = this.f15662b.f15670c;
                        List<TrustedMerchant.Approved> list = data2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (TrustedMerchant.Approved approved : list) {
                            Intrinsics.checkNotNullParameter(approved, "<this>");
                            arrayList.add(new a.C0154a(approved.f94405b, approved.f94406c, approved.d, Long.valueOf(approved.f94404a.toDate().getTime()), approved.e));
                        }
                        cVar.G(arrayList, "TRUSTED_MERCHANTS_STORAGE_KEY", kii.e.o(a.C0154a.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 2:
                        List data3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f15662b.f15669b.f("MERCHANTS_TO_REVIEW", data3);
                        break;
                    case 3:
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        ue0.c cVar2 = this.f15662b.f15670c;
                        List<TrustedMerchant.ToReview> list2 = data4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (TrustedMerchant.ToReview toReview : list2) {
                            Intrinsics.checkNotNullParameter(toReview, "<this>");
                            arrayList2.add(new a.b(toReview.f94411b, toReview.f94412c, toReview.d, Long.valueOf(toReview.f94410a.toDate().getTime()), toReview.e));
                        }
                        cVar2.G(arrayList2, "MERCHANTS_TO_REVIEW_STORAGE_KEY", kii.e.o(a.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    default:
                        String transactionId = (String) obj2;
                        TrustedMerchant data5 = (TrustedMerchant) obj3;
                        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                        Intrinsics.checkNotNullParameter(data5, "data");
                        this.f15662b.f15669b.f(transactionId, data5);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
