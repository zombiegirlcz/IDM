package dp4;

import com.revolut.feature.credit.card.api.models.creditcard.CreditCardFeatureConfig;
import com.revolut.feature.credit.card.impl.network.CreditCardService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardService f116610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f116611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.d f116612c;
    public final ij0.a d;
    public final xx4.e e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f116613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f116614h;
    public final x4l.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x4l.c f116615j;
    public final x4l.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x4l.c f116616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x4l.c f116617m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x4l.c f116618n;
    public final x4l.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x4l.c f116619p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x4l.c f116620q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x4l.c f116621r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x4l.c f116622s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x4l.c f116623t;
    public final x4l.c u;
    public final x4l.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x4l.c f116624w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x4l.c f116625x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x4l.c f116626y;

    public c1(CreditCardService api2, xx4.d memoryCache, xx4.d timeMemoryCache, ij0.a networkConfiguration, xx4.e storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(timeMemoryCache, "timeMemoryCache");
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f116610a = api2;
        this.f116611b = memoryCache;
        this.f116612c = timeMemoryCache;
        this.d = networkConfiguration;
        this.e = storage;
        Continuation continuation = null;
        cuh.a aVar = new cuh.a(this, continuation, 21);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i2 = 1;
        this.f = new x4l.c(aVar, function1, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 5), new n(this, continuation, 17));
        cuh.a aVar2 = new cuh.a(this, continuation, 20);
        final int i3 = 7;
        Function1 function12 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i5 = 13;
        this.f116613g = new x4l.c(aVar2, function12, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 4), new n(this, continuation, 16));
        cuh.a aVar3 = new cuh.a(this, continuation, 28);
        final int i6 = 13;
        Function1 function13 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i21 = 14;
        this.f116614h = new x4l.c(aVar3, function13, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, i21), new n(this, continuation, 24));
        u0 u0Var = new u0(this, continuation, 4);
        final int i22 = 14;
        Function1 function14 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i32 = 15;
        this.i = new x4l.c(u0Var, function14, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 13), new z0(this, continuation, 0));
        a1 a1Var = new a1(this, continuation, 2);
        final int i33 = 15;
        Function1 function15 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i33) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i43 = 16;
        this.f116615j = new x4l.c(a1Var, function15, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 19), new n(this, continuation, 29));
        a1 a1Var2 = new a1(this, continuation, 1);
        final int i59 = 5;
        Function1 function16 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i59) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i66 = 10;
        this.k = new x4l.c(a1Var2, function16, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i66) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 18), new n(this, continuation, 28));
        cuh.a aVar4 = new cuh.a(this, continuation, 26);
        final int i74 = 16;
        Function1 function17 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i74) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i92 = 17;
        this.f116616l = new x4l.c(aVar4, function17, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i92) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 11), new n(this, continuation, 22));
        cuh.a aVar5 = new cuh.a(this, continuation, 25);
        final int i96 = 17;
        Function1 function18 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i96) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i99 = 18;
        this.f116617m = new x4l.c(aVar5, function18, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i99) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 10), new n(this, continuation, 21));
        cuh.a aVar6 = new cuh.a(this, continuation, 27);
        final int i100 = 18;
        Function1 function19 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i100) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i101 = 19;
        this.f116618n = new x4l.c(aVar6, function19, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i101) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 12), new n(this, continuation, 23));
        a1 a1Var3 = new a1(this, continuation, 0);
        final int i102 = 19;
        Function1 function110 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i102) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i103 = 0;
        this.o = new x4l.c(a1Var3, function110, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i103) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 17), new n(this, continuation, 27));
        final int i104 = 1;
        u0 u0Var2 = new u0(this, continuation, i104);
        Function1 function111 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i104) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i105 = 2;
        this.f116619p = new x4l.c(u0Var2, function111, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i105) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 1), new x0(this, continuation, 0));
        u0 u0Var3 = new u0(this, continuation, 3);
        final int i106 = 2;
        Function1 function112 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i106) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i107 = 3;
        this.f116620q = new x4l.c(u0Var3, function112, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i107) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 9), new x0(this, continuation, 1));
        u0 u0Var4 = new u0(this, continuation, 5);
        final int i108 = 3;
        Function1 function113 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i108) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i109 = 4;
        this.f116621r = new x4l.c(u0Var4, function113, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i109) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 15), new n(this, continuation, 25));
        u0 u0Var5 = new u0(this, continuation, 0);
        final int i110 = 4;
        Function1 function114 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i110) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i111 = 5;
        this.f116622s = new x4l.c(u0Var5, function114, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i111) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 0), new n(this, continuation, 13));
        final int i112 = 6;
        this.f116623t = new x4l.c(new u0(this, continuation, 2), new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i112) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        }, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i112) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 2), new n(this, continuation, 14));
        cuh.a aVar7 = new cuh.a(this, continuation, 23);
        final int i113 = 8;
        Function1 function115 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i113) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i114 = 7;
        Function2 function2 = new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i114) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        };
        v0 v0Var = new v0(this, continuation, i114);
        int i115 = 19;
        this.u = new x4l.c(aVar7, function115, function2, v0Var, new n(this, continuation, i115));
        cuh.a aVar8 = new cuh.a(this, continuation, i115);
        final int i116 = 9;
        Function1 function116 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i116) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i117 = 8;
        this.v = new x4l.c(aVar8, function116, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i117) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 3), new n(this, continuation, 15));
        cuh.a aVar9 = new cuh.a(this, continuation, 29);
        final int i118 = 10;
        Function1 function117 = new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i118) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        };
        final int i119 = 9;
        this.f116624w = new x4l.c(aVar9, function117, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i119) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 16), new n(this, continuation, 26));
        final int i120 = 11;
        this.f116625x = new x4l.c(new cuh.a(this, continuation, 24), new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i120) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        }, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i120) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 8), new n(this, continuation, 20));
        final int i121 = 12;
        this.f116626y = new x4l.c(new cuh.a(this, continuation, 22), new Function1(this) { // from class: dp4.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116688b;

            {
                this.f116688b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i121) {
                    case 0:
                        cp4.q key = (cp4.q) obj2;
                        Intrinsics.checkNotNullParameter(key, "key");
                        return (List) this.f116688b.f116612c.a(key);
                    case 1:
                        String facilityId = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.f(facilityId));
                    case 2:
                        String facilityId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        return (ux4.b) this.f116688b.f116611b.a(new cp4.s(facilityId2));
                    case 3:
                        String facilityId3 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        return (ll4.r) this.f116688b.f116611b.a(new cp4.j0(facilityId3));
                    case 4:
                        String facilityId4 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        return (il4.g) this.f116688b.f116611b.a(new cp4.a(facilityId4));
                    case 5:
                        cp4.p0 key2 = (cp4.p0) obj2;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        return (List) this.f116688b.f116611b.a(key2);
                    case 6:
                        String facilityId5 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        return (List) this.f116688b.f116611b.a(new cp4.i(facilityId5));
                    case 7:
                        cp4.p key3 = (cp4.p) obj2;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        return (CreditCardFeatureConfig) this.f116688b.f116611b.a(key3);
                    case 8:
                        cp4.m key4 = (cp4.m) obj2;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        return (List) this.f116688b.f116611b.a(key4);
                    case 9:
                        cp4.h0 key5 = (cp4.h0) obj2;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        return (ll4.o) this.f116688b.f116611b.a(key5);
                    case 10:
                        cp4.l0 key6 = (cp4.l0) obj2;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        return (List) this.f116688b.f116611b.a(key6);
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        return (kl4.b) this.f116688b.f116611b.a(key7);
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        return (List) this.f116688b.f116611b.a(key8);
                    case 13:
                        cp4.e0 key9 = (cp4.e0) obj2;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        return (ll4.y) this.f116688b.f116611b.a(key9);
                    case 14:
                        String facilityId6 = (String) obj2;
                        Intrinsics.checkNotNullParameter(facilityId6, "facilityId");
                        return (ll4.u) this.f116688b.f116611b.a(new cp4.b0(facilityId6));
                    case 15:
                        cp4.q0 key10 = (cp4.q0) obj2;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        return (wl4.b) this.f116688b.f116611b.a(key10);
                    case 16:
                        cp4.v key11 = (cp4.v) obj2;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        return (List) this.f116688b.f116611b.a(key11);
                    case 17:
                        cp4.u key12 = (cp4.u) obj2;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        return (vl4.g) this.f116688b.f116611b.a(key12);
                    case 18:
                        cp4.w key13 = (cp4.w) obj2;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        return (vl4.u) this.f116688b.f116611b.a(key13);
                    default:
                        cp4.m0 key14 = (cp4.m0) obj2;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        return (ll4.d0) this.f116688b.f116611b.a(key14);
                }
            }
        }, new Function2(this) { // from class: dp4.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c1 f116693b;

            {
                this.f116693b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i121) {
                    case 0:
                        cp4.m0 key = (cp4.m0) obj2;
                        ll4.d0 breakdown = (ll4.d0) obj3;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
                        this.f116693b.f116611b.b(key, breakdown);
                        break;
                    case 1:
                        cp4.q key2 = (cp4.q) obj2;
                        List features = (List) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(features, "features");
                        this.f116693b.f116612c.b(key2, features);
                        break;
                    case 2:
                        String facilityId = (String) obj2;
                        ux4.b docs = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(docs, "docs");
                        this.f116693b.f116611b.b(new cp4.f(facilityId), docs);
                        break;
                    case 3:
                        String facilityId2 = (String) obj2;
                        ux4.b docs2 = (ux4.b) obj3;
                        Intrinsics.checkNotNullParameter(facilityId2, "facilityId");
                        Intrinsics.checkNotNullParameter(docs2, "docs");
                        this.f116693b.f116611b.b(new cp4.s(facilityId2), docs2);
                        break;
                    case 4:
                        String facilityId3 = (String) obj2;
                        ll4.r rates = (ll4.r) obj3;
                        Intrinsics.checkNotNullParameter(facilityId3, "facilityId");
                        Intrinsics.checkNotNullParameter(rates, "rates");
                        this.f116693b.f116611b.b(new cp4.j0(facilityId3), rates);
                        break;
                    case 5:
                        String facilityId4 = (String) obj2;
                        il4.g cashback = (il4.g) obj3;
                        Intrinsics.checkNotNullParameter(facilityId4, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback, "cashback");
                        this.f116693b.f116611b.b(new cp4.a(facilityId4), cashback);
                        break;
                    case 6:
                        String facilityId5 = (String) obj2;
                        List cashback2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(facilityId5, "facilityId");
                        Intrinsics.checkNotNullParameter(cashback2, "cashback");
                        this.f116693b.f116611b.b(new cp4.i(facilityId5), cashback2);
                        break;
                    case 7:
                        cp4.m key3 = (cp4.m) obj2;
                        List deeplinks = (List) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
                        this.f116693b.f116611b.b(key3, deeplinks);
                        break;
                    case 8:
                        cp4.h0 key4 = (cp4.h0) obj2;
                        ll4.o details = (ll4.o) obj3;
                        Intrinsics.checkNotNullParameter(key4, "key");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f116693b.f116611b.b(key4, details);
                        break;
                    case 9:
                        cp4.l0 key5 = (cp4.l0) obj2;
                        List settings = (List) obj3;
                        Intrinsics.checkNotNullParameter(key5, "key");
                        Intrinsics.checkNotNullParameter(settings, "settings");
                        this.f116693b.f116611b.b(key5, settings);
                        break;
                    case 10:
                        cp4.p0 key6 = (cp4.p0) obj2;
                        List statements = (List) obj3;
                        Intrinsics.checkNotNullParameter(key6, "key");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        this.f116693b.f116611b.b(key6, statements);
                        break;
                    case 11:
                        cp4.k key7 = (cp4.k) obj2;
                        kl4.b offer = (kl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key7, "key");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f116693b.f116611b.b(key7, offer);
                        break;
                    case 12:
                        cp4.j key8 = (cp4.j) obj2;
                        List limitHistory = (List) obj3;
                        Intrinsics.checkNotNullParameter(key8, "key");
                        Intrinsics.checkNotNullParameter(limitHistory, "limitHistory");
                        this.f116693b.f116611b.b(key8, limitHistory);
                        break;
                    case 13:
                        cp4.p key9 = (cp4.p) obj2;
                        CreditCardFeatureConfig config = (CreditCardFeatureConfig) obj3;
                        Intrinsics.checkNotNullParameter(key9, "key");
                        Intrinsics.checkNotNullParameter(config, "config");
                        this.f116693b.f116611b.b(key9, config);
                        break;
                    case 14:
                        cp4.e0 key10 = (cp4.e0) obj2;
                        ll4.y creditPaymentInfo = (ll4.y) obj3;
                        Intrinsics.checkNotNullParameter(key10, "key");
                        Intrinsics.checkNotNullParameter(creditPaymentInfo, "creditPaymentInfo");
                        this.f116693b.f116611b.b(key10, creditPaymentInfo);
                        break;
                    case 15:
                        ll4.u creditManagementInfo = (ll4.u) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(creditManagementInfo, "creditManagementInfo");
                        this.f116693b.f116611b.b(new cp4.b0(creditManagementInfo.f196535a), creditManagementInfo);
                        break;
                    case 16:
                        cp4.q0 key11 = (cp4.q0) obj2;
                        wl4.b transactionDetails = (wl4.b) obj3;
                        Intrinsics.checkNotNullParameter(key11, "key");
                        Intrinsics.checkNotNullParameter(transactionDetails, "transactionDetails");
                        this.f116693b.f116611b.b(key11, transactionDetails);
                        break;
                    case 17:
                        cp4.v key12 = (cp4.v) obj2;
                        List statements2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(key12, "key");
                        Intrinsics.checkNotNullParameter(statements2, "statements");
                        this.f116693b.f116611b.b(key12, statements2);
                        break;
                    case 18:
                        cp4.u key13 = (cp4.u) obj2;
                        vl4.g statements3 = (vl4.g) obj3;
                        Intrinsics.checkNotNullParameter(key13, "key");
                        Intrinsics.checkNotNullParameter(statements3, "statements");
                        this.f116693b.f116611b.b(key13, statements3);
                        break;
                    default:
                        cp4.w key14 = (cp4.w) obj2;
                        vl4.u widget = (vl4.u) obj3;
                        Intrinsics.checkNotNullParameter(key14, "key");
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        this.f116693b.f116611b.b(key14, widget);
                        break;
                }
                return Unit.f186387a;
            }
        }, new v0(this, continuation, 6), new n(this, continuation, 18));
    }
}
