package km2;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f185681b;

    public /* synthetic */ a(i iVar, int i) {
        this.f185680a = i;
        this.f185681b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f185680a) {
            case 0:
                List dtos = (List) obj2;
                Intrinsics.checkNotNullParameter(dtos, "dtos");
                List<dn2.a> list = dtos;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (dn2.a aVar : list) {
                    i iVar = this.f185681b;
                    iVar.getClass();
                    arrayList.add(fn2.a.a(aVar.getId(), iVar.f185694b.getBaseUrl()));
                }
                return arrayList;
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) this.f185681b.d.get("UPLOADED_BACKGROUNDS_MEMORY_KEY");
            default:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                ue0.c cVar = this.f185681b.e;
                Type type = new TypeToken<List<? extends dn2.a>>() { // from class: com.revolut.feature.backgroundpicker.impl.data.BackgroundCatalogueRepositoryImpl$uploadedBackgroundsDod$4$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return (List) cVar.T2("UPLOADED_BACKGROUNDS_STORAGE_KEY", type);
        }
    }
}
