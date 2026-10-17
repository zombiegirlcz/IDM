package fa7;

import com.revolut.feature.globalsearch.models.RetailGlobalSearchContext;
import com.revolut.feature.globalsearch.sources.suggestion.data.ProductSuggestionsService;
import dcl.q;
import dp4.a1;
import dp4.z0;
import eul.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f133244g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductSuggestionsService f133245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f133246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f133247c;
    public final q d;
    public final p97.d e;
    public final x4l.c f;

    static {
        RetailGlobalSearchContext[] elements = {RetailGlobalSearchContext.MAIN_HOME, RetailGlobalSearchContext.WEALTH_HOME, RetailGlobalSearchContext.CRYPTO_HOME, RetailGlobalSearchContext.LIFESTYLE_HOME, RetailGlobalSearchContext.REVX_HOME};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f133244g = kotlin.collections.d.y0(elements);
    }

    public e(ProductSuggestionsService service, ne0.d memoryCache, xe0.e storage, q mapper, p97.d defaultProductSuggestionsProvider) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(defaultProductSuggestionsProvider, "defaultProductSuggestionsProvider");
        this.f133245a = service;
        this.f133246b = memoryCache;
        this.f133247c = storage;
        this.d = mapper;
        this.e = defaultProductSuggestionsProvider;
        Continuation continuation = null;
        this.f = new x4l.c(new a1(this, continuation, 23), new f0m.c(this, 19), new f(this, 22), new ev7.b(this, continuation, 21), new z0(this, continuation, 8));
    }

    public static final LinkedHashMap a(e eVar, ea7.b dto) {
        q qVar = eVar.d;
        Intrinsics.checkNotNullParameter(dto, "dto");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ea7.a aVar : dto.getSuggestions()) {
            String name = aVar.getContext();
            Intrinsics.checkNotNullParameter(name, "name");
            RetailGlobalSearchContext.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            RetailGlobalSearchContext retailGlobalSearchContext = (RetailGlobalSearchContext) RetailGlobalSearchContext.valuesByName.get(name);
            if (retailGlobalSearchContext != null) {
                List items = aVar.getItems();
                ArrayList arrayList = new ArrayList();
                Iterator it8 = items.iterator();
                while (true) {
                    Object obj2 = null;
                    if (!it8.hasNext()) {
                        break;
                    }
                    String value = ((ea7.c) it8.next()).getId();
                    Intrinsics.checkNotNullParameter(value, "value");
                    Iterator<E> it9 = t97.d.a().iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            break;
                        }
                        Object next = it9.next();
                        if (Intrinsics.f(((t97.d) next).b(), value)) {
                            obj2 = next;
                            break;
                        }
                    }
                    p97.b bVar = (p97.b) obj2;
                    if (bVar != null) {
                        arrayList.add(bVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    linkedHashMap.put(retailGlobalSearchContext, arrayList);
                }
            }
        }
        return linkedHashMap;
    }
}
