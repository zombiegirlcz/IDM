package j9g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class p {
    public static zfi.c a(z9g.d dto) {
        zfi.b oVar;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(dto, "dto");
        List filters = dto.getFilters();
        int iB = q0.b(w.t(filters, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : filters) {
            linkedHashMap.put(((z9g.c) obj2).getReference(), obj2);
        }
        List<z9g.e> popular = dto.getPopular();
        ArrayList arrayList = new ArrayList();
        for (z9g.e eVar : popular) {
            z9g.c cVar = (z9g.c) linkedHashMap.get(eVar.getFilterReference());
            zfi.d dVar = null;
            if (cVar != null) {
                if (cVar instanceof z9g.a) {
                    z9g.a aVar = (z9g.a) cVar;
                    String reference = aVar.getReference();
                    String label = aVar.getLabel();
                    z9g.g config = aVar.getConfig();
                    dVar = new zfi.d(new zfi.g(reference, label, new zfi.h(config.getQueryParam(), config.getHidden())), eVar.getIcon(), null);
                } else if (cVar instanceof z9g.b) {
                    z9g.b bVar = (z9g.b) cVar;
                    Iterator it8 = bVar.getConfig().getOptions().iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it8.next();
                        if (Intrinsics.f(((z9g.j) next2).getId(), eVar.getOptionId())) {
                            break;
                        }
                    }
                    z9g.j jVar = (z9g.j) next2;
                    if (jVar != null) {
                        dVar = new zfi.d(new zfi.j(bVar.getReference(), bVar.getLabel(), b(bVar.getConfig())), eVar.getIcon(), c(jVar));
                    }
                } else if (cVar instanceof z9g.f) {
                    z9g.f fVar = (z9g.f) cVar;
                    Iterator it9 = fVar.getConfig().getOptions().iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it9.next();
                        if (Intrinsics.f(((z9g.j) next).getId(), eVar.getOptionId())) {
                            break;
                        }
                    }
                    z9g.j jVar2 = (z9g.j) next;
                    if (jVar2 != null) {
                        dVar = new zfi.d(new zfi.r(fVar.getReference(), fVar.getLabel(), d(fVar.getConfig())), eVar.getIcon(), c(jVar2));
                    }
                } else if (!(cVar instanceof z9g.l)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        List<z9g.c> filters2 = dto.getFilters();
        ArrayList arrayList2 = new ArrayList(w.t(filters2, 10));
        for (z9g.c cVar2 : filters2) {
            if (cVar2 instanceof z9g.a) {
                z9g.a aVar2 = (z9g.a) cVar2;
                String reference2 = aVar2.getReference();
                String label2 = aVar2.getLabel();
                z9g.g config2 = aVar2.getConfig();
                oVar = new zfi.g(reference2, label2, new zfi.h(config2.getQueryParam(), config2.getHidden()));
            } else if (cVar2 instanceof z9g.b) {
                z9g.b bVar2 = (z9g.b) cVar2;
                oVar = new zfi.j(bVar2.getReference(), bVar2.getLabel(), b(bVar2.getConfig()));
            } else if (cVar2 instanceof z9g.f) {
                z9g.f fVar2 = (z9g.f) cVar2;
                oVar = new zfi.r(fVar2.getReference(), fVar2.getLabel(), d(fVar2.getConfig()));
            } else {
                if (!(cVar2 instanceof z9g.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                z9g.l lVar = (z9g.l) cVar2;
                String reference3 = lVar.getReference();
                String label3 = lVar.getLabel();
                z9g.k config3 = lVar.getConfig();
                oVar = new zfi.o(reference3, label3, new zfi.p(config3.getQueryParamMin(), config3.getQueryParamMax(), mo3.a.o(config3.getMinValue()), mo3.a.o(config3.getMaxValue())));
            }
            arrayList2.add(oVar);
        }
        return new zfi.c(arrayList, arrayList2);
    }

    public static zfi.k b(z9g.h hVar) {
        String queryParam = hVar.getQueryParam();
        List options = hVar.getOptions();
        ArrayList arrayList = new ArrayList(w.t(options, 10));
        Iterator it8 = options.iterator();
        while (it8.hasNext()) {
            arrayList.add(c((z9g.j) it8.next()));
        }
        return new zfi.k(queryParam, arrayList);
    }

    public static zfi.n c(z9g.j jVar) {
        return new zfi.n(jVar.getId(), jVar.getName(), jVar.getValue());
    }

    public static zfi.s d(z9g.m mVar) {
        String queryParam = mVar.getQueryParam();
        List options = mVar.getOptions();
        ArrayList arrayList = new ArrayList(w.t(options, 10));
        Iterator it8 = options.iterator();
        while (it8.hasNext()) {
            arrayList.add(c((z9g.j) it8.next()));
        }
        return new zfi.s(queryParam, mVar.getDefaultOption(), arrayList);
    }
}
