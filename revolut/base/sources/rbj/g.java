package rbj;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.recyclerview.widget.GridLayoutManager;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.TravelHotelsFavoritesGridScreen;
import com.revolut.feature.wealth.impl.ui.screens.popularassets.PopularAssetsController;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import ocb.z;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253131a;

    public /* synthetic */ g(int i) {
        this.f253131a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f253131a) {
            case 0:
                zm3.b it8 = (zm3.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list = it8.f323334c;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof zm3.l) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 1:
                JuniorBankingProfile profile = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(profile, "profile");
                int i = rc8.i.f253228a[profile.f77104l.ordinal()];
                if (i != 1 && i != 2 && i != 3 && i != 4) {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = false;
                }
                return new rc8.f(z);
            case 2:
                Bitmap cardImage = (Bitmap) obj2;
                Intrinsics.checkNotNullParameter(cardImage, "cardImage");
                return new BitmapImage(cardImage, false, new ImageTransformations((CircleTransformation) null, false, false, (Integer) null, (Integer) null, (Integer) null, 503), 10);
            case 3:
                return Boolean.valueOf(!((Boolean) obj2).booleanValue());
            case 4:
                Data it9 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Boolean bool = (Boolean) it9.getContent();
                return new z(bool != null ? bool.booleanValue() : true);
            case 5:
                Context context = (Context) obj2;
                KProperty[] kPropertyArr = TravelHotelsFavoritesGridScreen.R;
                Intrinsics.checkNotNullParameter(context, "context");
                return new GridLayoutManager(context, 2);
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 7:
                RowDelegate.Model it10 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = PopularAssetsController.W;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj4 = it10.u;
                if (obj4 instanceof rch.j) {
                    return (rch.j) obj4;
                }
                return null;
            case 8:
                ty0.a it11 = (ty0.a) obj2;
                KProperty[] kPropertyArr3 = PopularAssetsController.W;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj5 = it11.d;
                if (obj5 instanceof rch.j) {
                    return (rch.j) obj5;
                }
                return null;
            case 9:
                LargeActionButtonDelegate.Model it12 = (LargeActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = PopularAssetsController.W;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj6 = it12.i;
                if (obj6 instanceof rch.j) {
                    return (rch.j) obj6;
                }
                return null;
            case 10:
                List performanceAssets = (List) obj2;
                Intrinsics.checkNotNullParameter(performanceAssets, "performanceAssets");
                List<vel.f> list2 = performanceAssets;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (vel.f fVar : list2) {
                    arrayList2.add(new p5d.b(fVar.a(), zi0.c.N(fVar), null));
                }
                return arrayList2;
            case 11:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 4);
                for (int i2 = 0; i2 < 4; i2++) {
                    arrayListP.add(nb0.b(pb0.Companion, a0.d.n("POPULAR_ASSET_ITEM_ID_", i2), false, 0, false, 30));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return CounterTextDelegate.c.a.f52173a;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ListSubheaderDelegate.Model modelF = rd3.d.f(false);
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList3 = new ArrayList(w.t(intRange, 10));
                vim.f it13 = intRange.iterator();
                while (it13.f289625c) {
                    arrayList3.add(new pb0(a0.d.n("ID_LOADING_TRANSACTION_", it13.nextInt())));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                return i2b.a.q(modelF, arrayList3);
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                IntRange intRangeO = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList4 = new ArrayList(w.t(intRangeO, 10));
                vim.f it14 = intRangeO.iterator();
                while (it14.f289625c) {
                    arrayList4.add(new pb0(a0.d.n("ID_LOADING__", it14.nextInt())));
                }
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                return arrayList4;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                rd3.d.Companion.getClass();
                return rd3.d.f253322b;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                rd3.d.Companion.getClass();
                return rd3.d.f253322b;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                rd3.d.Companion.getClass();
                return rd3.d.f253322b;
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                rd3.d.Companion.getClass();
                return rd3.d.f253322b;
        }
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f253131a = i;
    }
}
