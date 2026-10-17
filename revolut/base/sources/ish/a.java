package ish;

import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f168249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final csh.g f168250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f168251c;

    public a(Map catalogueProviders, csh.g widgetInitializer, b contentInteractor) {
        Intrinsics.checkNotNullParameter(catalogueProviders, "catalogueProviders");
        Intrinsics.checkNotNullParameter(widgetInitializer, "widgetInitializer");
        Intrinsics.checkNotNullParameter(contentInteractor, "contentInteractor");
        this.f168249a = catalogueProviders;
        this.f168250b = widgetInitializer;
        this.f168251c = contentInteractor;
    }

    public final Object a(WidgetContext widgetContext, String str, gim.c cVar) {
        List listA = this.f168250b.a(widgetContext.getClass());
        List listC = b(str).c();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listC) {
            String str2 = (String) obj2;
            int size = listA.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    arrayList.add(obj2);
                    break;
                }
                if (Intrinsics.f(((dsh.i) listA.get(i)).f117323a, str2)) {
                    break;
                }
                i++;
            }
        }
        return !arrayList.isEmpty() ? e0.o(new i4g.d(arrayList, this, widgetContext, (Continuation) null, 7), cVar) : f0.f322471a;
    }

    public final csh.d b(String str) {
        phm.a aVar = (phm.a) this.f168249a.get(str);
        if (aVar == null) {
            throw new IllegalStateException(j6.a.q("Can't find provider for sourceId = ", str));
        }
        Object obj2 = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (csh.d) obj2;
    }
}
