package q81;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.abexperiments.impl.network.SkywalkerService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f242960g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SkywalkerService f242961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f242962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b80.c f242963c;
    public final zm0.c d;
    public final AtomicBoolean e;
    public final ihm.b f;

    static {
        Type type = new TypeToken<List<? extends p81.c>>() { // from class: com.revolut.feature.abexperiments.impl.repository.SkywalkerRepositoryImpl$Companion$LIST_OF_EXPERIMENTDTO_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f242960g = type;
    }

    public d(SkywalkerService service, ue0.c storage, b80.c networkStateRepository, zm0.c sessionProvider) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f242961a = service;
        this.f242962b = storage;
        this.f242963c = networkStateRepository;
        this.d = sessionProvider;
        this.e = new AtomicBoolean(false);
        ihm.b bVarE = ihm.b.e(r0.g());
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f = bVarE;
    }

    public static LinkedHashMap c(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            String str = ((p81.d) obj2).f233821a;
            Object objO = linkedHashMap.get(str);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, str);
            }
            ((List) objO).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (p81.d) d0.b0((List) entry.getValue()));
        }
        return linkedHashMap2;
    }

    public final void a() {
        r81.b bVar;
        synchronized (this.e) {
            try {
                List list = (List) this.f242962b.T2("memoryCacheKey", f242960g);
                List list2 = null;
                if (list != null) {
                    List<p81.c> list3 = list;
                    ArrayList arrayList = new ArrayList(w.t(list3, 10));
                    for (p81.c cVar : list3) {
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        String str = cVar.f233818a;
                        String str2 = cVar.f233819b;
                        String str3 = cVar.f233820c;
                        if (str3 != null) {
                            r81.b[] bVarArrValues = r81.b.values();
                            int length = bVarArrValues.length;
                            for (int i = 0; i < length; i++) {
                                bVar = bVarArrValues[i];
                                if (a0.z(bVar.name(), str3, true)) {
                                    break;
                                }
                            }
                            bVar = null;
                        } else {
                            bVar = null;
                        }
                        arrayList.add(new p81.d(str, str2, bVar));
                    }
                    list2 = arrayList;
                }
                this.f.onNext(c(list2 == null ? f0.f322471a : list2));
                this.e.set(list2 != null);
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final Map b() {
        Object objF = this.f.f();
        if (objF != null) {
            return (Map) objF;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // od0.e
    public final void clear() {
        this.f242962b.clear();
        this.e.set(false);
        this.f.onNext(r0.g());
    }
}
