package fx7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zw7.h f138759b;

    public /* synthetic */ c(zw7.h hVar, int i) {
        this.f138758a = i;
        this.f138759b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List breedList = (List) obj2;
        switch (this.f138758a) {
            case 0:
                Intrinsics.checkNotNullParameter(breedList, "breedList");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : breedList) {
                    if (((zw7.e) obj3).f325775c == this.f138759b) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            default:
                Intrinsics.checkNotNullParameter(breedList, "breedList");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : breedList) {
                    zw7.e eVar = (zw7.e) obj4;
                    if (eVar.d && eVar.f325775c == this.f138759b) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
        }
    }
}
