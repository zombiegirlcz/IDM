package ivb;

import com.revolut.feature.rev_points.exclusive_store.impl.data.network.ExclusiveStoreService;
import com.revolut.feature.rev_points.models.RevPoints;
import efm.d0;
import ip0.v7;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import wim.z;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExclusiveStoreService f168808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f168809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f168810c;
    public final w4l.f d;
    public final w4l.f e;

    public f(ExclusiveStoreService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f168808a = service;
        this.f168809b = memoryCache;
        this.f168810c = storage;
        final int i = 4;
        Function2 function2 = new Function2(this) { // from class: ivb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f168802b;

            {
                this.f168802b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        String auctionId = (String) obj2;
                        fvb.a details = (fvb.a) obj3;
                        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
                        Intrinsics.checkNotNullParameter(details, "details");
                        ue0.c cVar = this.f168802b.f168810c;
                        String str = "KEY_AUCTION_" + auctionId;
                        Intrinsics.checkNotNullParameter(details, "<this>");
                        String str2 = details.f138405a;
                        String str3 = details.f138406b;
                        String str4 = details.f138407c;
                        String str5 = details.d;
                        ZonedDateTime zonedDateTime = details.e;
                        String string = zonedDateTime != null ? zonedDateTime.toString() : null;
                        RevPoints revPoints = details.f138408g;
                        String strW = revPoints != null ? revPoints.W() : null;
                        RevPoints revPoints2 = details.f;
                        String strW2 = revPoints2 != null ? revPoints2.W() : null;
                        RevPoints revPoints3 = details.f138409h;
                        String strW3 = revPoints3 != null ? revPoints3.W() : null;
                        ArrayList arrayList = details.i;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((RevPoints) it8.next()).W());
                        }
                        cVar.G(new hvb.c(str2, str3, str4, str5, string, strW2, strW, strW3, arrayList2, details.f138410j.name()), str, z.d(o0.b(hvb.c.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        c params = (c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<hvb.f> bidDetails = this.f168802b.f168808a.getBidDetails(params.f168805a, params.f168806b);
                        ir9.a aVar = new ir9.a(new iui.a(13), 27);
                        bidDetails.getClass();
                        ufm.i iVar = new ufm.i(bidDetails, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        c params2 = (c) obj2;
                        fvb.b details2 = (fvb.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f168802b.f168809b.f(a0.d.s("KEY_BID_", params2.f168805a, "-", params2.f168806b), details2);
                        return Unit.f186387a;
                    case 3:
                        c params3 = (c) obj2;
                        fvb.b details3 = (fvb.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(details3, "details");
                        ue0.c cVar2 = this.f168802b.f168810c;
                        String strS = a0.d.s("KEY_BID_", params3.f168805a, "-", params3.f168806b);
                        Intrinsics.checkNotNullParameter(details3, "<this>");
                        cVar2.G(new hvb.f(details3.f138411a, details3.f138412b.W(), details3.f138413c.name()), strS, z.d(o0.b(hvb.f.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String auctionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(auctionId2, "auctionId");
                        d0<hvb.c> auctionDetails = this.f168802b.f168808a.getAuctionDetails(auctionId2);
                        ir9.a aVar2 = new ir9.a(new iui.a(14), 28);
                        auctionDetails.getClass();
                        ufm.i iVar2 = new ufm.i(auctionDetails, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        String auctionId3 = (String) obj2;
                        fvb.a details4 = (fvb.a) obj3;
                        Intrinsics.checkNotNullParameter(auctionId3, "auctionId");
                        Intrinsics.checkNotNullParameter(details4, "details");
                        this.f168802b.f168809b.f("KEY_AUCTION_" + auctionId3, details4);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 2;
        Function1 function1 = new Function1(this) { // from class: ivb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f168804b;

            {
                this.f168804b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (fvb.b) this.f168804b.f168809b.get("KEY_BID_" + params.f168805a + "-" + params.f168806b);
                    case 1:
                        c params2 = (c) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        hvb.f fVar = (hvb.f) j6.a.k(hvb.f.class, this.f168804b.f168810c, a0.d.s("KEY_BID_", params2.f168805a, "-", params2.f168806b));
                        if (fVar != null) {
                            return knm.b.I(fVar);
                        }
                        return null;
                    case 2:
                        String auctionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
                        return (fvb.a) v7.r("KEY_AUCTION_", auctionId, this.f168804b.f168809b);
                    default:
                        String auctionId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(auctionId2, "auctionId");
                        hvb.c cVar = (hvb.c) j6.a.k(hvb.c.class, this.f168804b.f168810c, j6.a.q("KEY_AUCTION_", auctionId2));
                        if (cVar != null) {
                            return knm.b.H(cVar);
                        }
                        return null;
                }
            }
        };
        final int i3 = 5;
        Function2 function22 = new Function2(this) { // from class: ivb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f168802b;

            {
                this.f168802b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        String auctionId = (String) obj2;
                        fvb.a details = (fvb.a) obj3;
                        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
                        Intrinsics.checkNotNullParameter(details, "details");
                        ue0.c cVar = this.f168802b.f168810c;
                        String str = "KEY_AUCTION_" + auctionId;
                        Intrinsics.checkNotNullParameter(details, "<this>");
                        String str2 = details.f138405a;
                        String str3 = details.f138406b;
                        String str4 = details.f138407c;
                        String str5 = details.d;
                        ZonedDateTime zonedDateTime = details.e;
                        String string = zonedDateTime != null ? zonedDateTime.toString() : null;
                        RevPoints revPoints = details.f138408g;
                        String strW = revPoints != null ? revPoints.W() : null;
                        RevPoints revPoints2 = details.f;
                        String strW2 = revPoints2 != null ? revPoints2.W() : null;
                        RevPoints revPoints3 = details.f138409h;
                        String strW3 = revPoints3 != null ? revPoints3.W() : null;
                        ArrayList arrayList = details.i;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((RevPoints) it8.next()).W());
                        }
                        cVar.G(new hvb.c(str2, str3, str4, str5, string, strW2, strW, strW3, arrayList2, details.f138410j.name()), str, z.d(o0.b(hvb.c.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        c params = (c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<hvb.f> bidDetails = this.f168802b.f168808a.getBidDetails(params.f168805a, params.f168806b);
                        ir9.a aVar = new ir9.a(new iui.a(13), 27);
                        bidDetails.getClass();
                        ufm.i iVar = new ufm.i(bidDetails, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        c params2 = (c) obj2;
                        fvb.b details2 = (fvb.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f168802b.f168809b.f(a0.d.s("KEY_BID_", params2.f168805a, "-", params2.f168806b), details2);
                        return Unit.f186387a;
                    case 3:
                        c params3 = (c) obj2;
                        fvb.b details3 = (fvb.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(details3, "details");
                        ue0.c cVar2 = this.f168802b.f168810c;
                        String strS = a0.d.s("KEY_BID_", params3.f168805a, "-", params3.f168806b);
                        Intrinsics.checkNotNullParameter(details3, "<this>");
                        cVar2.G(new hvb.f(details3.f138411a, details3.f138412b.W(), details3.f138413c.name()), strS, z.d(o0.b(hvb.f.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String auctionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(auctionId2, "auctionId");
                        d0<hvb.c> auctionDetails = this.f168802b.f168808a.getAuctionDetails(auctionId2);
                        ir9.a aVar2 = new ir9.a(new iui.a(14), 28);
                        auctionDetails.getClass();
                        ufm.i iVar2 = new ufm.i(auctionDetails, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        String auctionId3 = (String) obj2;
                        fvb.a details4 = (fvb.a) obj3;
                        Intrinsics.checkNotNullParameter(auctionId3, "auctionId");
                        Intrinsics.checkNotNullParameter(details4, "details");
                        this.f168802b.f168809b.f("KEY_AUCTION_" + auctionId3, details4);
                        return Unit.f186387a;
                }
            }
        };
        final int i5 = 3;
        Function1 function12 = new Function1(this) { // from class: ivb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f168804b;

            {
                this.f168804b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (fvb.b) this.f168804b.f168809b.get("KEY_BID_" + params.f168805a + "-" + params.f168806b);
                    case 1:
                        c params2 = (c) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        hvb.f fVar = (hvb.f) j6.a.k(hvb.f.class, this.f168804b.f168810c, a0.d.s("KEY_BID_", params2.f168805a, "-", params2.f168806b));
                        if (fVar != null) {
                            return knm.b.I(fVar);
                        }
                        return null;
                    case 2:
                        String auctionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
                        return (fvb.a) v7.r("KEY_AUCTION_", auctionId, this.f168804b.f168809b);
                    default:
                        String auctionId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(auctionId2, "auctionId");
                        hvb.c cVar = (hvb.c) j6.a.k(hvb.c.class, this.f168804b.f168810c, j6.a.q("KEY_AUCTION_", auctionId2));
                        if (cVar != null) {
                            return knm.b.H(cVar);
                        }
                        return null;
                }
            }
        };
        final int i6 = 0;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: ivb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f168802b;

            {
                this.f168802b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        String auctionId = (String) obj2;
                        fvb.a details = (fvb.a) obj3;
                        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
                        Intrinsics.checkNotNullParameter(details, "details");
                        ue0.c cVar = this.f168802b.f168810c;
                        String str = "KEY_AUCTION_" + auctionId;
                        Intrinsics.checkNotNullParameter(details, "<this>");
                        String str2 = details.f138405a;
                        String str3 = details.f138406b;
                        String str4 = details.f138407c;
                        String str5 = details.d;
                        ZonedDateTime zonedDateTime = details.e;
                        String string = zonedDateTime != null ? zonedDateTime.toString() : null;
                        RevPoints revPoints = details.f138408g;
                        String strW = revPoints != null ? revPoints.W() : null;
                        RevPoints revPoints2 = details.f;
                        String strW2 = revPoints2 != null ? revPoints2.W() : null;
                        RevPoints revPoints3 = details.f138409h;
                        String strW3 = revPoints3 != null ? revPoints3.W() : null;
                        ArrayList arrayList = details.i;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((RevPoints) it8.next()).W());
                        }
                        cVar.G(new hvb.c(str2, str3, str4, str5, string, strW2, strW, strW3, arrayList2, details.f138410j.name()), str, z.d(o0.b(hvb.c.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        c params = (c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<hvb.f> bidDetails = this.f168802b.f168808a.getBidDetails(params.f168805a, params.f168806b);
                        ir9.a aVar = new ir9.a(new iui.a(13), 27);
                        bidDetails.getClass();
                        ufm.i iVar = new ufm.i(bidDetails, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        c params2 = (c) obj2;
                        fvb.b details2 = (fvb.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f168802b.f168809b.f(a0.d.s("KEY_BID_", params2.f168805a, "-", params2.f168806b), details2);
                        return Unit.f186387a;
                    case 3:
                        c params3 = (c) obj2;
                        fvb.b details3 = (fvb.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(details3, "details");
                        ue0.c cVar2 = this.f168802b.f168810c;
                        String strS = a0.d.s("KEY_BID_", params3.f168805a, "-", params3.f168806b);
                        Intrinsics.checkNotNullParameter(details3, "<this>");
                        cVar2.G(new hvb.f(details3.f138411a, details3.f138412b.W(), details3.f138413c.name()), strS, z.d(o0.b(hvb.f.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String auctionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(auctionId2, "auctionId");
                        d0<hvb.c> auctionDetails = this.f168802b.f168808a.getAuctionDetails(auctionId2);
                        ir9.a aVar2 = new ir9.a(new iui.a(14), 28);
                        auctionDetails.getClass();
                        ufm.i iVar2 = new ufm.i(auctionDetails, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        String auctionId3 = (String) obj2;
                        fvb.a details4 = (fvb.a) obj3;
                        Intrinsics.checkNotNullParameter(auctionId3, "auctionId");
                        Intrinsics.checkNotNullParameter(details4, "details");
                        this.f168802b.f168809b.f("KEY_AUCTION_" + auctionId3, details4);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 1;
        Function2 function23 = new Function2(this) { // from class: ivb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f168802b;

            {
                this.f168802b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        String auctionId = (String) obj2;
                        fvb.a details = (fvb.a) obj3;
                        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
                        Intrinsics.checkNotNullParameter(details, "details");
                        ue0.c cVar = this.f168802b.f168810c;
                        String str = "KEY_AUCTION_" + auctionId;
                        Intrinsics.checkNotNullParameter(details, "<this>");
                        String str2 = details.f138405a;
                        String str3 = details.f138406b;
                        String str4 = details.f138407c;
                        String str5 = details.d;
                        ZonedDateTime zonedDateTime = details.e;
                        String string = zonedDateTime != null ? zonedDateTime.toString() : null;
                        RevPoints revPoints = details.f138408g;
                        String strW = revPoints != null ? revPoints.W() : null;
                        RevPoints revPoints2 = details.f;
                        String strW2 = revPoints2 != null ? revPoints2.W() : null;
                        RevPoints revPoints3 = details.f138409h;
                        String strW3 = revPoints3 != null ? revPoints3.W() : null;
                        ArrayList arrayList = details.i;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((RevPoints) it8.next()).W());
                        }
                        cVar.G(new hvb.c(str2, str3, str4, str5, string, strW2, strW, strW3, arrayList2, details.f138410j.name()), str, z.d(o0.b(hvb.c.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        c params = (c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<hvb.f> bidDetails = this.f168802b.f168808a.getBidDetails(params.f168805a, params.f168806b);
                        ir9.a aVar = new ir9.a(new iui.a(13), 27);
                        bidDetails.getClass();
                        ufm.i iVar = new ufm.i(bidDetails, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        c params2 = (c) obj2;
                        fvb.b details2 = (fvb.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f168802b.f168809b.f(a0.d.s("KEY_BID_", params2.f168805a, "-", params2.f168806b), details2);
                        return Unit.f186387a;
                    case 3:
                        c params3 = (c) obj2;
                        fvb.b details3 = (fvb.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(details3, "details");
                        ue0.c cVar2 = this.f168802b.f168810c;
                        String strS = a0.d.s("KEY_BID_", params3.f168805a, "-", params3.f168806b);
                        Intrinsics.checkNotNullParameter(details3, "<this>");
                        cVar2.G(new hvb.f(details3.f138411a, details3.f138412b.W(), details3.f138413c.name()), strS, z.d(o0.b(hvb.f.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String auctionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(auctionId2, "auctionId");
                        d0<hvb.c> auctionDetails = this.f168802b.f168808a.getAuctionDetails(auctionId2);
                        ir9.a aVar2 = new ir9.a(new iui.a(14), 28);
                        auctionDetails.getClass();
                        ufm.i iVar2 = new ufm.i(auctionDetails, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        String auctionId3 = (String) obj2;
                        fvb.a details4 = (fvb.a) obj3;
                        Intrinsics.checkNotNullParameter(auctionId3, "auctionId");
                        Intrinsics.checkNotNullParameter(details4, "details");
                        this.f168802b.f168809b.f("KEY_AUCTION_" + auctionId3, details4);
                        return Unit.f186387a;
                }
            }
        };
        final int i22 = 0;
        Function1 function13 = new Function1(this) { // from class: ivb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f168804b;

            {
                this.f168804b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (fvb.b) this.f168804b.f168809b.get("KEY_BID_" + params.f168805a + "-" + params.f168806b);
                    case 1:
                        c params2 = (c) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        hvb.f fVar = (hvb.f) j6.a.k(hvb.f.class, this.f168804b.f168810c, a0.d.s("KEY_BID_", params2.f168805a, "-", params2.f168806b));
                        if (fVar != null) {
                            return knm.b.I(fVar);
                        }
                        return null;
                    case 2:
                        String auctionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
                        return (fvb.a) v7.r("KEY_AUCTION_", auctionId, this.f168804b.f168809b);
                    default:
                        String auctionId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(auctionId2, "auctionId");
                        hvb.c cVar = (hvb.c) j6.a.k(hvb.c.class, this.f168804b.f168810c, j6.a.q("KEY_AUCTION_", auctionId2));
                        if (cVar != null) {
                            return knm.b.H(cVar);
                        }
                        return null;
                }
            }
        };
        final int i32 = 2;
        Function2 function24 = new Function2(this) { // from class: ivb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f168802b;

            {
                this.f168802b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        String auctionId = (String) obj2;
                        fvb.a details = (fvb.a) obj3;
                        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
                        Intrinsics.checkNotNullParameter(details, "details");
                        ue0.c cVar = this.f168802b.f168810c;
                        String str = "KEY_AUCTION_" + auctionId;
                        Intrinsics.checkNotNullParameter(details, "<this>");
                        String str2 = details.f138405a;
                        String str3 = details.f138406b;
                        String str4 = details.f138407c;
                        String str5 = details.d;
                        ZonedDateTime zonedDateTime = details.e;
                        String string = zonedDateTime != null ? zonedDateTime.toString() : null;
                        RevPoints revPoints = details.f138408g;
                        String strW = revPoints != null ? revPoints.W() : null;
                        RevPoints revPoints2 = details.f;
                        String strW2 = revPoints2 != null ? revPoints2.W() : null;
                        RevPoints revPoints3 = details.f138409h;
                        String strW3 = revPoints3 != null ? revPoints3.W() : null;
                        ArrayList arrayList = details.i;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((RevPoints) it8.next()).W());
                        }
                        cVar.G(new hvb.c(str2, str3, str4, str5, string, strW2, strW, strW3, arrayList2, details.f138410j.name()), str, z.d(o0.b(hvb.c.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        c params = (c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<hvb.f> bidDetails = this.f168802b.f168808a.getBidDetails(params.f168805a, params.f168806b);
                        ir9.a aVar = new ir9.a(new iui.a(13), 27);
                        bidDetails.getClass();
                        ufm.i iVar = new ufm.i(bidDetails, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        c params2 = (c) obj2;
                        fvb.b details2 = (fvb.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f168802b.f168809b.f(a0.d.s("KEY_BID_", params2.f168805a, "-", params2.f168806b), details2);
                        return Unit.f186387a;
                    case 3:
                        c params3 = (c) obj2;
                        fvb.b details3 = (fvb.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(details3, "details");
                        ue0.c cVar2 = this.f168802b.f168810c;
                        String strS = a0.d.s("KEY_BID_", params3.f168805a, "-", params3.f168806b);
                        Intrinsics.checkNotNullParameter(details3, "<this>");
                        cVar2.G(new hvb.f(details3.f138411a, details3.f138412b.W(), details3.f138413c.name()), strS, z.d(o0.b(hvb.f.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String auctionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(auctionId2, "auctionId");
                        d0<hvb.c> auctionDetails = this.f168802b.f168808a.getAuctionDetails(auctionId2);
                        ir9.a aVar2 = new ir9.a(new iui.a(14), 28);
                        auctionDetails.getClass();
                        ufm.i iVar2 = new ufm.i(auctionDetails, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        String auctionId3 = (String) obj2;
                        fvb.a details4 = (fvb.a) obj3;
                        Intrinsics.checkNotNullParameter(auctionId3, "auctionId");
                        Intrinsics.checkNotNullParameter(details4, "details");
                        this.f168802b.f168809b.f("KEY_AUCTION_" + auctionId3, details4);
                        return Unit.f186387a;
                }
            }
        };
        final int i33 = 1;
        Function1 function14 = new Function1(this) { // from class: ivb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f168804b;

            {
                this.f168804b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i33) {
                    case 0:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (fvb.b) this.f168804b.f168809b.get("KEY_BID_" + params.f168805a + "-" + params.f168806b);
                    case 1:
                        c params2 = (c) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        hvb.f fVar = (hvb.f) j6.a.k(hvb.f.class, this.f168804b.f168810c, a0.d.s("KEY_BID_", params2.f168805a, "-", params2.f168806b));
                        if (fVar != null) {
                            return knm.b.I(fVar);
                        }
                        return null;
                    case 2:
                        String auctionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
                        return (fvb.a) v7.r("KEY_AUCTION_", auctionId, this.f168804b.f168809b);
                    default:
                        String auctionId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(auctionId2, "auctionId");
                        hvb.c cVar = (hvb.c) j6.a.k(hvb.c.class, this.f168804b.f168810c, j6.a.q("KEY_AUCTION_", auctionId2));
                        if (cVar != null) {
                            return knm.b.H(cVar);
                        }
                        return null;
                }
            }
        };
        final int i43 = 3;
        this.e = new w4l.f(function23, function13, function24, function14, new Function2(this) { // from class: ivb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f168802b;

            {
                this.f168802b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        String auctionId = (String) obj2;
                        fvb.a details = (fvb.a) obj3;
                        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
                        Intrinsics.checkNotNullParameter(details, "details");
                        ue0.c cVar = this.f168802b.f168810c;
                        String str = "KEY_AUCTION_" + auctionId;
                        Intrinsics.checkNotNullParameter(details, "<this>");
                        String str2 = details.f138405a;
                        String str3 = details.f138406b;
                        String str4 = details.f138407c;
                        String str5 = details.d;
                        ZonedDateTime zonedDateTime = details.e;
                        String string = zonedDateTime != null ? zonedDateTime.toString() : null;
                        RevPoints revPoints = details.f138408g;
                        String strW = revPoints != null ? revPoints.W() : null;
                        RevPoints revPoints2 = details.f;
                        String strW2 = revPoints2 != null ? revPoints2.W() : null;
                        RevPoints revPoints3 = details.f138409h;
                        String strW3 = revPoints3 != null ? revPoints3.W() : null;
                        ArrayList arrayList = details.i;
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(((RevPoints) it8.next()).W());
                        }
                        cVar.G(new hvb.c(str2, str3, str4, str5, string, strW2, strW, strW3, arrayList2, details.f138410j.name()), str, z.d(o0.b(hvb.c.class)));
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        c params = (c) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<hvb.f> bidDetails = this.f168802b.f168808a.getBidDetails(params.f168805a, params.f168806b);
                        ir9.a aVar = new ir9.a(new iui.a(13), 27);
                        bidDetails.getClass();
                        ufm.i iVar = new ufm.i(bidDetails, aVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        c params2 = (c) obj2;
                        fvb.b details2 = (fvb.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(details2, "details");
                        this.f168802b.f168809b.f(a0.d.s("KEY_BID_", params2.f168805a, "-", params2.f168806b), details2);
                        return Unit.f186387a;
                    case 3:
                        c params3 = (c) obj2;
                        fvb.b details3 = (fvb.b) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(details3, "details");
                        ue0.c cVar2 = this.f168802b.f168810c;
                        String strS = a0.d.s("KEY_BID_", params3.f168805a, "-", params3.f168806b);
                        Intrinsics.checkNotNullParameter(details3, "<this>");
                        cVar2.G(new hvb.f(details3.f138411a, details3.f138412b.W(), details3.f138413c.name()), strS, z.d(o0.b(hvb.f.class)));
                        return Unit.f186387a;
                    case 4:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String auctionId2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(auctionId2, "auctionId");
                        d0<hvb.c> auctionDetails = this.f168802b.f168808a.getAuctionDetails(auctionId2);
                        ir9.a aVar2 = new ir9.a(new iui.a(14), 28);
                        auctionDetails.getClass();
                        ufm.i iVar2 = new ufm.i(auctionDetails, aVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        String auctionId3 = (String) obj2;
                        fvb.a details4 = (fvb.a) obj3;
                        Intrinsics.checkNotNullParameter(auctionId3, "auctionId");
                        Intrinsics.checkNotNullParameter(details4, "details");
                        this.f168802b.f168809b.f("KEY_AUCTION_" + auctionId3, details4);
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
    public final java.lang.Object a(java.lang.String r5, com.revolut.feature.rev_points.models.RevPoints r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ivb.e
            if (r0 == 0) goto L13
            r0 = r7
            ivb.e r0 = (ivb.e) r0
            int r1 = r0.f168807w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168807w = r1
            goto L18
        L13:
            ivb.e r0 = new ivb.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168807w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            hvb.i r7 = new hvb.i
            java.lang.String r6 = r6.W()
            r7.<init>(r6)
            com.revolut.feature.rev_points.exclusive_store.impl.data.network.ExclusiveStoreService r6 = r4.f168808a
            efm.d0 r5 = r6.placeBid(r5, r7)
            iui.a r6 = new iui.a
            r7 = 15
            r6.<init>(r7)
            ir9.a r7 = new ir9.a
            r2 = 29
            r7.<init>(r6, r2)
            r5.getClass()
            ufm.i r6 = new ufm.i
            r2 = 1
            r6.<init>(r5, r7, r2)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            ufm.n r5 = te0.w.i0(r6)
            r0.f168807w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L6a
            return r1
        L6a:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ivb.f.a(java.lang.String, com.revolut.feature.rev_points.models.RevPoints, gim.c):java.lang.Object");
    }
}
