package dmj;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class r0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f116179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f116180c;

    public /* synthetic */ r0(int i, Data data, boolean z) {
        this.f116178a = i;
        this.f116179b = data;
        this.f116180c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        vzi.b bVar;
        CustomAssetCategoryDefinition customAssetCategoryDefinition;
        switch (this.f116178a) {
            case 0:
                Data data = this.f116179b;
                Intrinsics.h(data);
                return a0.a((a0) obj2, null, null, null, null, null, data, !this.f116180c, null, 159);
            case 1:
                ((eh3.l) obj2).getClass();
                Data checklistCollection = this.f116179b;
                Intrinsics.checkNotNullParameter(checklistCollection, "checklistCollection");
                return new eh3.l(checklistCollection, this.f116180c);
            case 2:
                return f33.j.a((f33.j) obj2, null, null, (hha.d) this.f116179b.getContent(), false, false, null, this.f116180c, 479);
            case 3:
                return g6a.f.a((g6a.f) obj2, this.f116179b, null, null, false, null, this.f116180c, 30);
            case 4:
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a aVar = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) obj2;
                a.b bVar2 = aVar.f73838b;
                Data processingSettingsData = this.f116179b;
                Intrinsics.h(processingSettingsData);
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(processingSettingsData, "processingSettingsData");
                return com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a.a(aVar, null, new a.b(processingSettingsData, this.f116180c), null, null, null, null, ISO781611.SMT_TAG);
            case 5:
                Data data2 = this.f116179b;
                Intrinsics.h(data2);
                return njj.b0.a((njj.b0) obj2, null, null, null, null, null, null, data2, !this.f116180c, null, 319);
            case 6:
                nrd.a aVar2 = (nrd.a) obj2;
                Data categoriesData = this.f116179b;
                if (this.f116180c) {
                    List list = (List) categoriesData.getContent();
                    bVar = (list == null || (customAssetCategoryDefinition = (CustomAssetCategoryDefinition) zhm.d0.d0(list)) == null) ? null : customAssetCategoryDefinition.f99224a;
                } else {
                    bVar = aVar2.f218610b;
                }
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(categoriesData, "categoriesData");
                return new nrd.a(categoriesData, bVar);
            case 7:
                return pgb.i.a((pgb.i) obj2, this.f116179b, null, this.f116180c, 2);
            case 8:
                return q23.q.a((q23.q) obj2, null, false, null, null, null, this.f116179b, null, null, Boolean.valueOf(this.f116180c), false, null, 3551);
            default:
                return rx6.m.a((rx6.m) obj2, null, false, null, this.f116179b, this.f116180c, 15);
        }
    }
}
