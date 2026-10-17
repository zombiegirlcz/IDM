package bwb;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroupDetails;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroupResponse;
import com.revolut.feature.rev_points.giftcards.impl.data.network.RevPointsGiftcardsService;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements e {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Type f19302j;
    public static final Class k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f19303l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsGiftcardsService f19304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f19305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f19306c;
    public final hlm.c d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f19307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f19308h;
    public final x4l.c i;

    static {
        Type type = new TypeToken<List<? extends ewb.c>>() { // from class: com.revolut.feature.rev_points.giftcards.impl.data.repository.RevPointsGiftcardsRepositoryImpl$Companion$REV_POINTS_GIFTCARDS_USER_VOUCHER_LIST_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f19302j = type;
        k = ewb.a.class;
        b.Companion companion = kotlin.time.b.INSTANCE;
        f19303l = kotlin.time.c.g(2, pkm.e.SECONDS);
    }

    public p(RevPointsGiftcardsService revPointsGiftcardsService, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(revPointsGiftcardsService, "revPointsGiftcardsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f19304a = revPointsGiftcardsService;
        this.f19305b = memoryCache;
        this.f19306c = storage;
        this.d = hlm.d.a();
        Continuation continuation = null;
        final int i = 0;
        this.e = new x4l.c(new a09.o(this, continuation, 22), new Function1(this) { // from class: bwb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f19288b;

            {
                this.f19288b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (VoucherProductGroupResponse) this.f19288b.f19305b.get("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_RESPONSE_MEM_KEY");
                    case 1:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (VoucherProductGroupDetails) v7.r("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_DETAILS_MEM_KEY", params.f19284a, this.f19288b.f19305b);
                    case 2:
                        b params2 = (b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        ne0.j jVar = this.f19288b.f19305b;
                        String str = params2.f19283a;
                        if (str == null) {
                            str = "";
                        }
                        return (List) jVar.get("REV_POINTS_GIFTCARDS_USER_VOUCHERS_MEM_KEY".concat(str));
                    case 3:
                        a params3 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (UserVoucherDetails) v7.r("REV_POINTS_GIFTCARDS_USER_VOUCHER_DETAILS_MEM_KEY", params3.f19282a, this.f19288b.f19305b);
                    default:
                        d params4 = (d) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        List list = (List) v7.r("GIFTCARDS_SEARCH_MEM_KEY_", params4.f19285a, this.f19288b.f19305b);
                        if (list == null) {
                            return null;
                        }
                        List<kwb.a> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (kwb.a aVar : list2) {
                            boolean z = params4.f19286b;
                            String id10 = aVar.f190322a;
                            tvb.e source = aVar.f190323b;
                            String str2 = aVar.f190324c;
                            String name = aVar.d;
                            String logoImageUrl = aVar.e;
                            String category = aVar.f;
                            Intrinsics.checkNotNullParameter(id10, "id");
                            Intrinsics.checkNotNullParameter(source, "source");
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(logoImageUrl, "logoImageUrl");
                            Intrinsics.checkNotNullParameter(category, "category");
                            arrayList.add(new kwb.a(id10, source, str2, name, logoImageUrl, category, z));
                        }
                        return arrayList;
                }
            }
        }, new Function2(this) { // from class: bwb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f19290b;

            {
                this.f19290b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        VoucherProductGroupResponse groups = (VoucherProductGroupResponse) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups, "groups");
                        this.f19290b.f19305b.f("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_RESPONSE_MEM_KEY", groups);
                        break;
                    case 1:
                        c params = (c) obj2;
                        VoucherProductGroupDetails groupDetails = (VoucherProductGroupDetails) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDetails, "groupDetails");
                        this.f19290b.f19305b.f("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_DETAILS_MEM_KEY" + params.f19284a, groupDetails);
                        break;
                    case 2:
                        b params2 = (b) obj2;
                        List vouchers = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(vouchers, "vouchers");
                        ne0.j jVar = this.f19290b.f19305b;
                        String str = params2.f19283a;
                        if (str == null) {
                            str = "";
                        }
                        jVar.f("REV_POINTS_GIFTCARDS_USER_VOUCHERS_MEM_KEY".concat(str), vouchers);
                        break;
                    case 3:
                        a params3 = (a) obj2;
                        UserVoucherDetails voucherDetails = (UserVoucherDetails) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(voucherDetails, "voucherDetails");
                        this.f19290b.f19305b.f("REV_POINTS_GIFTCARDS_USER_VOUCHER_DETAILS_MEM_KEY" + params3.f19282a, voucherDetails);
                        break;
                    default:
                        d params4 = (d) obj2;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(list, "list");
                        ehe.n.z("GIFTCARDS_SEARCH_MEM_KEY_", params4.f19285a, this.f19290b.f19305b, list);
                        break;
                }
                return Unit.f186387a;
            }
        }, new brc.h(this, continuation, 13), new awd.b(this, continuation, 14));
        final int i2 = 1;
        this.f = new x4l.c(new b6a.d(this, continuation, 13), new Function1(this) { // from class: bwb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f19288b;

            {
                this.f19288b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (VoucherProductGroupResponse) this.f19288b.f19305b.get("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_RESPONSE_MEM_KEY");
                    case 1:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (VoucherProductGroupDetails) v7.r("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_DETAILS_MEM_KEY", params.f19284a, this.f19288b.f19305b);
                    case 2:
                        b params2 = (b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        ne0.j jVar = this.f19288b.f19305b;
                        String str = params2.f19283a;
                        if (str == null) {
                            str = "";
                        }
                        return (List) jVar.get("REV_POINTS_GIFTCARDS_USER_VOUCHERS_MEM_KEY".concat(str));
                    case 3:
                        a params3 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (UserVoucherDetails) v7.r("REV_POINTS_GIFTCARDS_USER_VOUCHER_DETAILS_MEM_KEY", params3.f19282a, this.f19288b.f19305b);
                    default:
                        d params4 = (d) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        List list = (List) v7.r("GIFTCARDS_SEARCH_MEM_KEY_", params4.f19285a, this.f19288b.f19305b);
                        if (list == null) {
                            return null;
                        }
                        List<kwb.a> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (kwb.a aVar : list2) {
                            boolean z = params4.f19286b;
                            String id10 = aVar.f190322a;
                            tvb.e source = aVar.f190323b;
                            String str2 = aVar.f190324c;
                            String name = aVar.d;
                            String logoImageUrl = aVar.e;
                            String category = aVar.f;
                            Intrinsics.checkNotNullParameter(id10, "id");
                            Intrinsics.checkNotNullParameter(source, "source");
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(logoImageUrl, "logoImageUrl");
                            Intrinsics.checkNotNullParameter(category, "category");
                            arrayList.add(new kwb.a(id10, source, str2, name, logoImageUrl, category, z));
                        }
                        return arrayList;
                }
            }
        }, new Function2(this) { // from class: bwb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f19290b;

            {
                this.f19290b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        VoucherProductGroupResponse groups = (VoucherProductGroupResponse) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups, "groups");
                        this.f19290b.f19305b.f("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_RESPONSE_MEM_KEY", groups);
                        break;
                    case 1:
                        c params = (c) obj2;
                        VoucherProductGroupDetails groupDetails = (VoucherProductGroupDetails) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDetails, "groupDetails");
                        this.f19290b.f19305b.f("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_DETAILS_MEM_KEY" + params.f19284a, groupDetails);
                        break;
                    case 2:
                        b params2 = (b) obj2;
                        List vouchers = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(vouchers, "vouchers");
                        ne0.j jVar = this.f19290b.f19305b;
                        String str = params2.f19283a;
                        if (str == null) {
                            str = "";
                        }
                        jVar.f("REV_POINTS_GIFTCARDS_USER_VOUCHERS_MEM_KEY".concat(str), vouchers);
                        break;
                    case 3:
                        a params3 = (a) obj2;
                        UserVoucherDetails voucherDetails = (UserVoucherDetails) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(voucherDetails, "voucherDetails");
                        this.f19290b.f19305b.f("REV_POINTS_GIFTCARDS_USER_VOUCHER_DETAILS_MEM_KEY" + params3.f19282a, voucherDetails);
                        break;
                    default:
                        d params4 = (d) obj2;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(list, "list");
                        ehe.n.z("GIFTCARDS_SEARCH_MEM_KEY_", params4.f19285a, this.f19290b.f19305b, list);
                        break;
                }
                return Unit.f186387a;
            }
        }, new m(this, continuation, 2), new n(this, continuation, 0));
        final int i3 = 2;
        this.f19307g = new x4l.c(new b6a.d(this, continuation, 12), new Function1(this) { // from class: bwb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f19288b;

            {
                this.f19288b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (VoucherProductGroupResponse) this.f19288b.f19305b.get("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_RESPONSE_MEM_KEY");
                    case 1:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (VoucherProductGroupDetails) v7.r("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_DETAILS_MEM_KEY", params.f19284a, this.f19288b.f19305b);
                    case 2:
                        b params2 = (b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        ne0.j jVar = this.f19288b.f19305b;
                        String str = params2.f19283a;
                        if (str == null) {
                            str = "";
                        }
                        return (List) jVar.get("REV_POINTS_GIFTCARDS_USER_VOUCHERS_MEM_KEY".concat(str));
                    case 3:
                        a params3 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (UserVoucherDetails) v7.r("REV_POINTS_GIFTCARDS_USER_VOUCHER_DETAILS_MEM_KEY", params3.f19282a, this.f19288b.f19305b);
                    default:
                        d params4 = (d) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        List list = (List) v7.r("GIFTCARDS_SEARCH_MEM_KEY_", params4.f19285a, this.f19288b.f19305b);
                        if (list == null) {
                            return null;
                        }
                        List<kwb.a> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (kwb.a aVar : list2) {
                            boolean z = params4.f19286b;
                            String id10 = aVar.f190322a;
                            tvb.e source = aVar.f190323b;
                            String str2 = aVar.f190324c;
                            String name = aVar.d;
                            String logoImageUrl = aVar.e;
                            String category = aVar.f;
                            Intrinsics.checkNotNullParameter(id10, "id");
                            Intrinsics.checkNotNullParameter(source, "source");
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(logoImageUrl, "logoImageUrl");
                            Intrinsics.checkNotNullParameter(category, "category");
                            arrayList.add(new kwb.a(id10, source, str2, name, logoImageUrl, category, z));
                        }
                        return arrayList;
                }
            }
        }, new Function2(this) { // from class: bwb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f19290b;

            {
                this.f19290b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        VoucherProductGroupResponse groups = (VoucherProductGroupResponse) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups, "groups");
                        this.f19290b.f19305b.f("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_RESPONSE_MEM_KEY", groups);
                        break;
                    case 1:
                        c params = (c) obj2;
                        VoucherProductGroupDetails groupDetails = (VoucherProductGroupDetails) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDetails, "groupDetails");
                        this.f19290b.f19305b.f("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_DETAILS_MEM_KEY" + params.f19284a, groupDetails);
                        break;
                    case 2:
                        b params2 = (b) obj2;
                        List vouchers = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(vouchers, "vouchers");
                        ne0.j jVar = this.f19290b.f19305b;
                        String str = params2.f19283a;
                        if (str == null) {
                            str = "";
                        }
                        jVar.f("REV_POINTS_GIFTCARDS_USER_VOUCHERS_MEM_KEY".concat(str), vouchers);
                        break;
                    case 3:
                        a params3 = (a) obj2;
                        UserVoucherDetails voucherDetails = (UserVoucherDetails) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(voucherDetails, "voucherDetails");
                        this.f19290b.f19305b.f("REV_POINTS_GIFTCARDS_USER_VOUCHER_DETAILS_MEM_KEY" + params3.f19282a, voucherDetails);
                        break;
                    default:
                        d params4 = (d) obj2;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(list, "list");
                        ehe.n.z("GIFTCARDS_SEARCH_MEM_KEY_", params4.f19285a, this.f19290b.f19305b, list);
                        break;
                }
                return Unit.f186387a;
            }
        }, new m(this, continuation, 1), new a0e.o(this, continuation, 29));
        final int i5 = 3;
        this.f19308h = new x4l.c(new b6a.d(this, continuation, 11), new Function1(this) { // from class: bwb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f19288b;

            {
                this.f19288b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (VoucherProductGroupResponse) this.f19288b.f19305b.get("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_RESPONSE_MEM_KEY");
                    case 1:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (VoucherProductGroupDetails) v7.r("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_DETAILS_MEM_KEY", params.f19284a, this.f19288b.f19305b);
                    case 2:
                        b params2 = (b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        ne0.j jVar = this.f19288b.f19305b;
                        String str = params2.f19283a;
                        if (str == null) {
                            str = "";
                        }
                        return (List) jVar.get("REV_POINTS_GIFTCARDS_USER_VOUCHERS_MEM_KEY".concat(str));
                    case 3:
                        a params3 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (UserVoucherDetails) v7.r("REV_POINTS_GIFTCARDS_USER_VOUCHER_DETAILS_MEM_KEY", params3.f19282a, this.f19288b.f19305b);
                    default:
                        d params4 = (d) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        List list = (List) v7.r("GIFTCARDS_SEARCH_MEM_KEY_", params4.f19285a, this.f19288b.f19305b);
                        if (list == null) {
                            return null;
                        }
                        List<kwb.a> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (kwb.a aVar : list2) {
                            boolean z = params4.f19286b;
                            String id10 = aVar.f190322a;
                            tvb.e source = aVar.f190323b;
                            String str2 = aVar.f190324c;
                            String name = aVar.d;
                            String logoImageUrl = aVar.e;
                            String category = aVar.f;
                            Intrinsics.checkNotNullParameter(id10, "id");
                            Intrinsics.checkNotNullParameter(source, "source");
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(logoImageUrl, "logoImageUrl");
                            Intrinsics.checkNotNullParameter(category, "category");
                            arrayList.add(new kwb.a(id10, source, str2, name, logoImageUrl, category, z));
                        }
                        return arrayList;
                }
            }
        }, new Function2(this) { // from class: bwb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f19290b;

            {
                this.f19290b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        VoucherProductGroupResponse groups = (VoucherProductGroupResponse) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups, "groups");
                        this.f19290b.f19305b.f("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_RESPONSE_MEM_KEY", groups);
                        break;
                    case 1:
                        c params = (c) obj2;
                        VoucherProductGroupDetails groupDetails = (VoucherProductGroupDetails) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDetails, "groupDetails");
                        this.f19290b.f19305b.f("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_DETAILS_MEM_KEY" + params.f19284a, groupDetails);
                        break;
                    case 2:
                        b params2 = (b) obj2;
                        List vouchers = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(vouchers, "vouchers");
                        ne0.j jVar = this.f19290b.f19305b;
                        String str = params2.f19283a;
                        if (str == null) {
                            str = "";
                        }
                        jVar.f("REV_POINTS_GIFTCARDS_USER_VOUCHERS_MEM_KEY".concat(str), vouchers);
                        break;
                    case 3:
                        a params3 = (a) obj2;
                        UserVoucherDetails voucherDetails = (UserVoucherDetails) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(voucherDetails, "voucherDetails");
                        this.f19290b.f19305b.f("REV_POINTS_GIFTCARDS_USER_VOUCHER_DETAILS_MEM_KEY" + params3.f19282a, voucherDetails);
                        break;
                    default:
                        d params4 = (d) obj2;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(list, "list");
                        ehe.n.z("GIFTCARDS_SEARCH_MEM_KEY_", params4.f19285a, this.f19290b.f19305b, list);
                        break;
                }
                return Unit.f186387a;
            }
        }, new m(this, continuation, 0), new a0e.o(this, continuation, 28));
        final int i6 = 4;
        this.i = new x4l.c(new b6a.d(this, continuation, 10), new Function1(this) { // from class: bwb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f19288b;

            {
                this.f19288b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (VoucherProductGroupResponse) this.f19288b.f19305b.get("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_RESPONSE_MEM_KEY");
                    case 1:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (VoucherProductGroupDetails) v7.r("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_DETAILS_MEM_KEY", params.f19284a, this.f19288b.f19305b);
                    case 2:
                        b params2 = (b) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        ne0.j jVar = this.f19288b.f19305b;
                        String str = params2.f19283a;
                        if (str == null) {
                            str = "";
                        }
                        return (List) jVar.get("REV_POINTS_GIFTCARDS_USER_VOUCHERS_MEM_KEY".concat(str));
                    case 3:
                        a params3 = (a) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (UserVoucherDetails) v7.r("REV_POINTS_GIFTCARDS_USER_VOUCHER_DETAILS_MEM_KEY", params3.f19282a, this.f19288b.f19305b);
                    default:
                        d params4 = (d) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        List list = (List) v7.r("GIFTCARDS_SEARCH_MEM_KEY_", params4.f19285a, this.f19288b.f19305b);
                        if (list == null) {
                            return null;
                        }
                        List<kwb.a> list2 = list;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (kwb.a aVar : list2) {
                            boolean z = params4.f19286b;
                            String id10 = aVar.f190322a;
                            tvb.e source = aVar.f190323b;
                            String str2 = aVar.f190324c;
                            String name = aVar.d;
                            String logoImageUrl = aVar.e;
                            String category = aVar.f;
                            Intrinsics.checkNotNullParameter(id10, "id");
                            Intrinsics.checkNotNullParameter(source, "source");
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(logoImageUrl, "logoImageUrl");
                            Intrinsics.checkNotNullParameter(category, "category");
                            arrayList.add(new kwb.a(id10, source, str2, name, logoImageUrl, category, z));
                        }
                        return arrayList;
                }
            }
        }, new Function2(this) { // from class: bwb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f19290b;

            {
                this.f19290b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        VoucherProductGroupResponse groups = (VoucherProductGroupResponse) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(groups, "groups");
                        this.f19290b.f19305b.f("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_RESPONSE_MEM_KEY", groups);
                        break;
                    case 1:
                        c params = (c) obj2;
                        VoucherProductGroupDetails groupDetails = (VoucherProductGroupDetails) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(groupDetails, "groupDetails");
                        this.f19290b.f19305b.f("REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_DETAILS_MEM_KEY" + params.f19284a, groupDetails);
                        break;
                    case 2:
                        b params2 = (b) obj2;
                        List vouchers = (List) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(vouchers, "vouchers");
                        ne0.j jVar = this.f19290b.f19305b;
                        String str = params2.f19283a;
                        if (str == null) {
                            str = "";
                        }
                        jVar.f("REV_POINTS_GIFTCARDS_USER_VOUCHERS_MEM_KEY".concat(str), vouchers);
                        break;
                    case 3:
                        a params3 = (a) obj2;
                        UserVoucherDetails voucherDetails = (UserVoucherDetails) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(voucherDetails, "voucherDetails");
                        this.f19290b.f19305b.f("REV_POINTS_GIFTCARDS_USER_VOUCHER_DETAILS_MEM_KEY" + params3.f19282a, voucherDetails);
                        break;
                    default:
                        d params4 = (d) obj2;
                        List list = (List) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(list, "list");
                        ehe.n.z("GIFTCARDS_SEARCH_MEM_KEY_", params4.f19285a, this.f19290b.f19305b, list);
                        break;
                }
                return Unit.f186387a;
            }
        }, new akl.o(2, 16, continuation), new a19.e(3, 18, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(bwb.p r10, com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bwb.p.a(bwb.p, com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof bwb.j
            if (r0 == 0) goto L13
            r0 = r5
            bwb.j r0 = (bwb.j) r0
            int r1 = r0.f19292w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19292w = r1
            goto L18
        L13:
            bwb.j r0 = new bwb.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f19292w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f19292w = r3
            com.revolut.feature.rev_points.giftcards.impl.data.network.RevPointsGiftcardsService r5 = r4.f19304a
            java.lang.Object r5 = r5.getStatement(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            retrofit2.Response r5 = (retrofit2.Response) r5
            java.lang.Object r0 = r5.body()
            okhttp3.ResponseBody r0 = (okhttp3.ResponseBody) r0
            boolean r1 = r5.isSuccessful()
            if (r1 == 0) goto L52
            if (r0 == 0) goto L52
            java.io.InputStream r5 = r0.byteStream()
            return r5
        L52:
            retrofit2.HttpException r0 = new retrofit2.HttpException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bwb.p.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r14, java.lang.String r15, com.revolut.feature.rev_points.models.RevPoints r16, dj0.d r17, java.lang.String r18, gim.c r19) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = r19
            boolean r1 = r0 instanceof bwb.l
            if (r1 == 0) goto L15
            r1 = r0
            bwb.l r1 = (bwb.l) r1
            int r2 = r1.f19295w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f19295w = r2
            goto L1a
        L15:
            bwb.l r1 = new bwb.l
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.u
            fim.a r11 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f19295w
            r12 = 1
            if (r2 == 0) goto L31
            if (r2 != r12) goto L29
            yhm.o.b(r0)
            goto L51
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L31:
            yhm.o.b(r0)
            ac8.h r2 = new ac8.h
            r10 = 0
            r3 = 1
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            skm.p0 r0 = skm.p0.f264001a
            elm.f r0 = elm.f.f127540b
            r1.f19295w = r12
            java.lang.Object r0 = skm.e0.J(r0, r2, r1)
            if (r0 != r11) goto L51
            return r11
        L51:
            zvb.b r0 = (zvb.b) r0
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            com.revolut.feature.rev_points.giftcards.api.model.PurchaseVoucherResponse r1 = new com.revolut.feature.rev_points.giftcards.api.model.PurchaseVoucherResponse
            java.lang.String r0 = r0.getId()
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bwb.p.c(java.lang.String, java.lang.String, com.revolut.feature.rev_points.models.RevPoints, dj0.d, java.lang.String, gim.c):java.lang.Object");
    }
}
