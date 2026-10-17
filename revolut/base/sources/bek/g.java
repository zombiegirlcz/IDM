package bek;

import com.revolut.feature.address.models.Address;
import com.revolut.retail.feature.pod_nominees.impl.data.network.PodNomineesService;
import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import efm.d0;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import ufm.i;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PodNomineesService f14868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cek.c f14869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4l.f f14870c;

    public g(PodNomineesService service, cek.c dao, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f14868a = service;
        this.f14869b = dao;
        final int i = 0;
        final int i2 = 1;
        this.f14870c = new w4l.f(new Function2(this) { // from class: bek.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f14860b;

            {
                this.f14860b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3 = i;
                g gVar = this.f14860b;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<fek.b>> podNominees = gVar.f14868a.getPodNominees();
                        bce.e eVar = new bce.e(new bbh.a(29), 21);
                        podNominees.getClass();
                        i iVar = new i(podNominees, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        cek.c cVar = gVar.f14869b;
                        List<PodNominee> list = domain;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (PodNominee podNominee : list) {
                            DateTimeFormatter dateTimeFormatter = eek.a.f125216a;
                            Intrinsics.checkNotNullParameter(podNominee, "<this>");
                            String str = podNominee.f102617a;
                            String str2 = podNominee.f102618b;
                            String str3 = podNominee.f102619c;
                            String str4 = podNominee.d;
                            String str5 = podNominee.e.format(eek.a.f125216a);
                            Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                            String str6 = podNominee.f;
                            Address address = podNominee.f102620g;
                            arrayList.add(new cek.b(str, str2, str3, str4, str5, str6, address != null ? oc.c.D(address) : null, podNominee.f102621h));
                        }
                        cVar.e(arrayList);
                        return Unit.f186387a;
                }
            }
        }, new c(memoryCache, i), new d(memoryCache, i), new b9i.f(this, 20), new Function2(this) { // from class: bek.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f14860b;

            {
                this.f14860b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3 = i2;
                g gVar = this.f14860b;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        d0<List<fek.b>> podNominees = gVar.f14868a.getPodNominees();
                        bce.e eVar = new bce.e(new bbh.a(29), 21);
                        podNominees.getClass();
                        i iVar = new i(podNominees, eVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        List domain = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        cek.c cVar = gVar.f14869b;
                        List<PodNominee> list = domain;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (PodNominee podNominee : list) {
                            DateTimeFormatter dateTimeFormatter = eek.a.f125216a;
                            Intrinsics.checkNotNullParameter(podNominee, "<this>");
                            String str = podNominee.f102617a;
                            String str2 = podNominee.f102618b;
                            String str3 = podNominee.f102619c;
                            String str4 = podNominee.d;
                            String str5 = podNominee.e.format(eek.a.f125216a);
                            Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                            String str6 = podNominee.f;
                            Address address = podNominee.f102620g;
                            arrayList.add(new cek.b(str, str2, str3, str4, str5, str6, address != null ? oc.c.D(address) : null, podNominee.f102621h));
                        }
                        cVar.e(arrayList);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final Object a(gim.c cVar) {
        az.i iVar = new az.i(this, null, 29);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, iVar, cVar);
    }

    public final Object b(ArrayList arrayList, gim.c cVar) throws Throwable {
        b74.e eVar = new b74.e(this, arrayList, null, 21);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, eVar, cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
