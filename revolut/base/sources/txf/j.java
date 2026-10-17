package txf;

import com.revolut.feature.travel.common.impl.network.TravelService;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import tx0.o1;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelService f275399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f275400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wxf.d f275401c;
    public final w4l.f d;

    public j(TravelService travelService, ne0.d memoryCache, wxf.d documentDao) {
        Intrinsics.checkNotNullParameter(travelService, "travelService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(documentDao, "documentDao");
        this.f275399a = travelService;
        this.f275400b = memoryCache;
        this.f275401c = documentDao;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: txf.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f275396b;

            {
                this.f275396b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f params = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<pxf.a> document = this.f275396b.f275399a.getDocument(params.f275393a.name(), params.f275394b.name());
                        o1 o1Var = new o1(new tx.f(9), 23);
                        document.getClass();
                        ufm.i iVar = new ufm.i(document, o1Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        f params2 = (f) obj2;
                        gxf.a item = (gxf.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(item, "item");
                        this.f275396b.f275400b.f(j.a(params2), item);
                        break;
                    default:
                        f params3 = (f) obj2;
                        gxf.a item2 = (gxf.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(item2, "item");
                        wxf.d dVar = this.f275396b.f275401c;
                        String product = params3.f275393a.name();
                        String type = params3.f275394b.name();
                        Intrinsics.checkNotNullParameter(item2, "<this>");
                        Intrinsics.checkNotNullParameter(product, "product");
                        Intrinsics.checkNotNullParameter(type, "type");
                        dVar.b(new qxf.a(product, type, item2.f147745a));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: txf.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f275398b;

            {
                this.f275398b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                f params = (f) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (gxf.a) this.f275398b.f275400b.get(j.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        qxf.a aVarA = this.f275398b.f275401c.a(params.f275393a.name(), params.f275394b.name());
                        if (aVarA == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVarA, "<this>");
                        return new gxf.a(aVarA.f250088c);
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: txf.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f275396b;

            {
                this.f275396b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f params = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<pxf.a> document = this.f275396b.f275399a.getDocument(params.f275393a.name(), params.f275394b.name());
                        o1 o1Var = new o1(new tx.f(9), 23);
                        document.getClass();
                        ufm.i iVar = new ufm.i(document, o1Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        f params2 = (f) obj2;
                        gxf.a item = (gxf.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(item, "item");
                        this.f275396b.f275400b.f(j.a(params2), item);
                        break;
                    default:
                        f params3 = (f) obj2;
                        gxf.a item2 = (gxf.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(item2, "item");
                        wxf.d dVar = this.f275396b.f275401c;
                        String product = params3.f275393a.name();
                        String type = params3.f275394b.name();
                        Intrinsics.checkNotNullParameter(item2, "<this>");
                        Intrinsics.checkNotNullParameter(product, "product");
                        Intrinsics.checkNotNullParameter(type, "type");
                        dVar.b(new qxf.a(product, type, item2.f147745a));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: txf.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f275398b;

            {
                this.f275398b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                f params = (f) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (gxf.a) this.f275398b.f275400b.get(j.a(params));
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        qxf.a aVarA = this.f275398b.f275401c.a(params.f275393a.name(), params.f275394b.name());
                        if (aVarA == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVarA, "<this>");
                        return new gxf.a(aVarA.f250088c);
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: txf.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f275396b;

            {
                this.f275396b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f params = (f) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<pxf.a> document = this.f275396b.f275399a.getDocument(params.f275393a.name(), params.f275394b.name());
                        o1 o1Var = new o1(new tx.f(9), 23);
                        document.getClass();
                        ufm.i iVar = new ufm.i(document, o1Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        f params2 = (f) obj2;
                        gxf.a item = (gxf.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(item, "item");
                        this.f275396b.f275400b.f(j.a(params2), item);
                        break;
                    default:
                        f params3 = (f) obj2;
                        gxf.a item2 = (gxf.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(item2, "item");
                        wxf.d dVar = this.f275396b.f275401c;
                        String product = params3.f275393a.name();
                        String type = params3.f275394b.name();
                        Intrinsics.checkNotNullParameter(item2, "<this>");
                        Intrinsics.checkNotNullParameter(product, "product");
                        Intrinsics.checkNotNullParameter(type, "type");
                        dVar.b(new qxf.a(product, type, item2.f147745a));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String a(f fVar) {
        return a0.d.s("TRAVEL_DOCUMENT_CACHE_KEY_", fVar.f275393a.name(), "_", fVar.f275394b.name());
    }
}
