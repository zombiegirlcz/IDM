package ia7;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f159956b;

    public /* synthetic */ f(n nVar, int i) {
        this.f159955a = i;
        this.f159956b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws JSONException {
        int i = this.f159955a;
        n nVar = this.f159956b;
        switch (i) {
            case 0:
                j geoJson = (j) obj2;
                Intrinsics.checkNotNullParameter(geoJson, "geoJson");
                String geoJsonString = geoJson.f159962a;
                if (geoJsonString != null) {
                    a aVar = nVar.f159968g;
                    Intrinsics.checkNotNullParameter(geoJsonString, "geoJsonString");
                    JSONArray jSONArray = new JSONObject(geoJsonString).getJSONArray(ib.b.Features);
                    IntRange intRangeO = kotlin.ranges.f.o(0, jSONArray.length());
                    ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
                    vim.f it8 = intRangeO.iterator();
                    while (it8.f289625c) {
                        String string = jSONArray.getJSONObject(it8.nextInt()).getJSONObject("properties").getString("ISO_A2");
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        arrayList.add(com.bumptech.glide.d.c(string));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        if (!n.k.contains(((wi0.b) obj3).f297794a)) {
                            arrayList2.add(obj3);
                        }
                    }
                    Set setI1 = d0.i1(arrayList2);
                    if (setI1 != null) {
                        return setI1;
                    }
                }
                return h0.f322473a;
            case 1:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                ne0.d dVar = nVar.f159965a;
                c cVar = d.Companion;
                return (j) dVar.get(nVar.b().f());
            default:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ne0.d dVar2 = nVar.f159965a;
                c cVar2 = d.Companion;
                return (j) dVar2.get(nVar.b().c());
        }
    }
}
