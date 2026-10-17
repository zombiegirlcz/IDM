package l2d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import ip0.pb0;
import java.util.ArrayList;
import jki.p;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FavouritesAssetTypeKey f191770b;

    public /* synthetic */ c(FavouritesAssetTypeKey favouritesAssetTypeKey, int i) {
        this.f191769a = i;
        this.f191770b = favouritesAssetTypeKey;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f191769a) {
            case 0:
                Data symbolInfosData = (Data) obj2;
                Intrinsics.checkNotNullParameter(symbolInfosData, "symbolInfosData");
                return new i(this.f191770b, symbolInfosData);
            case 1:
                lgd.c it8 = (lgd.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair(this.f191770b, it8);
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                IntRange intRangeO = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
                vim.f it9 = intRangeO.iterator();
                while (it9.f289625c) {
                    int iNextInt = it9.nextInt();
                    arrayList.add(new pb0("LOADING_" + this.f191770b.f86866a + iNextInt));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                IntRange intRangeO2 = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList2 = new ArrayList(w.t(intRangeO2, 10));
                vim.f it10 = intRangeO2.iterator();
                while (it10.f289625c) {
                    int iNextInt2 = it10.nextInt();
                    arrayList2.add(new pb0("COMPLETED_ALERTS_LOADING_" + this.f191770b.f86866a + iNextInt2));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return arrayList2;
            default:
                lgd.b category = (lgd.b) obj2;
                Intrinsics.checkNotNullParameter(category, "category");
                return new Pair(this.f191770b, category);
        }
    }

    public /* synthetic */ c(p pVar, FavouritesAssetTypeKey favouritesAssetTypeKey, int i) {
        this.f191769a = i;
        this.f191770b = favouritesAssetTypeKey;
    }
}
