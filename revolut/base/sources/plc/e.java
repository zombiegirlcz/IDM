package plc;

import com.revolut.feature.robo.impl.data.network.TemplateService;
import efm.d0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import te0.w;
import vlc.e;
import wim.z;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements phm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemplateService f237329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlc.g f237330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f237331c;
    public final ne0.d d;
    public final w4l.f e;

    public e(b80.c connectivityRepository, TemplateService service, vlc.g networkMapper, ue0.c storage, ne0.d cache) {
        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkMapper, "networkMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f237329a = service;
        this.f237330b = networkMapper;
        this.f237331c = storage;
        this.d = cache;
        final int i = 0;
        uj0.b bVarK0 = w.k0(connectivityRepository, new Function1(this) { // from class: plc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f237326b;

            {
                this.f237326b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String projectionId = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(projectionId, "projectionId");
                        e eVar = this.f237326b;
                        vlc.g gVar = eVar.f237330b;
                        d0<vlc.e> templateProjection = eVar.f237329a.getTemplateProjection(projectionId);
                        pjg.i iVar = new pjg.i(new pj9.n(gVar, 16), 6);
                        templateProjection.getClass();
                        ufm.i iVar2 = new ufm.i(templateProjection, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        Intrinsics.checkNotNullParameter(projectionId, "projectionId");
                        return (alc.j) this.f237326b.d.get(e.a(projectionId));
                    default:
                        Intrinsics.checkNotNullParameter(projectionId, "projectionId");
                        vlc.e eVar2 = (vlc.e) j6.a.k(vlc.e.class, this.f237326b.f237331c, e.a(projectionId));
                        if (eVar2 != null) {
                            return vlc.g.c(eVar2);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: plc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f237326b;

            {
                this.f237326b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String projectionId = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(projectionId, "projectionId");
                        e eVar = this.f237326b;
                        vlc.g gVar = eVar.f237330b;
                        d0<vlc.e> templateProjection = eVar.f237329a.getTemplateProjection(projectionId);
                        pjg.i iVar = new pjg.i(new pj9.n(gVar, 16), 6);
                        templateProjection.getClass();
                        ufm.i iVar2 = new ufm.i(templateProjection, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        Intrinsics.checkNotNullParameter(projectionId, "projectionId");
                        return (alc.j) this.f237326b.d.get(e.a(projectionId));
                    default:
                        Intrinsics.checkNotNullParameter(projectionId, "projectionId");
                        vlc.e eVar2 = (vlc.e) j6.a.k(vlc.e.class, this.f237326b.f237331c, e.a(projectionId));
                        if (eVar2 != null) {
                            return vlc.g.c(eVar2);
                        }
                        return null;
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: plc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f237328b;

            {
                this.f237328b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String projectionId = (String) obj2;
                alc.j projection = (alc.j) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(projectionId, "projectionId");
                        Intrinsics.checkNotNullParameter(projection, "projection");
                        this.f237328b.d.f(e.a(projectionId), projection);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(projectionId, "projectionId");
                        Intrinsics.checkNotNullParameter(projection, "projection");
                        ue0.c cVar = this.f237328b.f237331c;
                        String strA = e.a(projectionId);
                        Intrinsics.checkNotNullParameter(projection, "<this>");
                        BigDecimal bigDecimal = projection.f6201a;
                        BigDecimal bigDecimal2 = projection.f6202b;
                        BigDecimal bigDecimal3 = projection.d;
                        alc.g gVar = projection.f6203c;
                        Intrinsics.checkNotNullParameter(gVar, "<this>");
                        e.a aVar = new e.a(vlc.g.f(gVar.f6196a), vlc.g.f(gVar.f6197b));
                        List<alc.h> list = projection.e;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (alc.h hVar : list) {
                            Intrinsics.checkNotNullParameter(hVar, "<this>");
                            arrayList.add(new vlc.c(hVar.f6198a, hVar.f6199b, hVar.f6200c, hVar.d));
                        }
                        cVar.G(new vlc.e(bigDecimal, bigDecimal2, aVar, bigDecimal3, arrayList), strA, z.d(o0.b(vlc.e.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: plc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f237326b;

            {
                this.f237326b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String projectionId = (String) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(projectionId, "projectionId");
                        e eVar = this.f237326b;
                        vlc.g gVar = eVar.f237330b;
                        d0<vlc.e> templateProjection = eVar.f237329a.getTemplateProjection(projectionId);
                        pjg.i iVar = new pjg.i(new pj9.n(gVar, 16), 6);
                        templateProjection.getClass();
                        ufm.i iVar2 = new ufm.i(templateProjection, iVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 1:
                        Intrinsics.checkNotNullParameter(projectionId, "projectionId");
                        return (alc.j) this.f237326b.d.get(e.a(projectionId));
                    default:
                        Intrinsics.checkNotNullParameter(projectionId, "projectionId");
                        vlc.e eVar2 = (vlc.e) j6.a.k(vlc.e.class, this.f237326b.f237331c, e.a(projectionId));
                        if (eVar2 != null) {
                            return vlc.g.c(eVar2);
                        }
                        return null;
                }
            }
        };
        final int i6 = 1;
        this.e = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: plc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f237328b;

            {
                this.f237328b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                String projectionId = (String) obj2;
                alc.j projection = (alc.j) obj3;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(projectionId, "projectionId");
                        Intrinsics.checkNotNullParameter(projection, "projection");
                        this.f237328b.d.f(e.a(projectionId), projection);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(projectionId, "projectionId");
                        Intrinsics.checkNotNullParameter(projection, "projection");
                        ue0.c cVar = this.f237328b.f237331c;
                        String strA = e.a(projectionId);
                        Intrinsics.checkNotNullParameter(projection, "<this>");
                        BigDecimal bigDecimal = projection.f6201a;
                        BigDecimal bigDecimal2 = projection.f6202b;
                        BigDecimal bigDecimal3 = projection.d;
                        alc.g gVar = projection.f6203c;
                        Intrinsics.checkNotNullParameter(gVar, "<this>");
                        e.a aVar = new e.a(vlc.g.f(gVar.f6196a), vlc.g.f(gVar.f6197b));
                        List<alc.h> list = projection.e;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (alc.h hVar : list) {
                            Intrinsics.checkNotNullParameter(hVar, "<this>");
                            arrayList.add(new vlc.c(hVar.f6198a, hVar.f6199b, hVar.f6200c, hVar.d));
                        }
                        cVar.G(new vlc.e(bigDecimal, bigDecimal2, aVar, bigDecimal3, arrayList), strA, z.d(o0.b(vlc.e.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String a(String str) {
        return j6.a.q("TEMPLATE_PROJECTION_", str);
    }

    @Override // phm.a
    public final Object get() {
        return this.e;
    }
}
