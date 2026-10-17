package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category_items;

import android.view.View;
import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category_items.CategoryItemsScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category_items.CategoryItemsScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import la8.h;
import ld1.f;
import ld1.l;
import le1.c;
import le1.d;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/category_items/CategoryItemsScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lle1/d;", "Lle1/c;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CategoryItemsScreen extends BaseBottomSheetRecyclerController<d, c> {
    public static final /* synthetic */ int V = 0;
    public final CategoryItemsScreenContract$InputData Q;
    public final Object R;
    public final ExtraSmallCardDelegate S;
    public final List T;
    public final Object U;

    public CategoryItemsScreen(CategoryItemsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: le1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CategoryItemsScreen f194430b;

            {
                this.f194430b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CategoryItemsScreen categoryItemsScreen = this.f194430b;
                switch (i2) {
                    case 0:
                        int i3 = CategoryItemsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(categoryItemsScreen.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).f;
                        CategoryItemsScreenContract$InputData categoryItemsScreenContract$InputData = categoryItemsScreen.Q;
                        categoryItemsScreenContract$InputData.getClass();
                        return new ld1.f(lVar, categoryItemsScreenContract$InputData);
                    default:
                        int i5 = CategoryItemsScreen.V;
                        return (f) ((ld1.f) categoryItemsScreen.R.getValue()).f193939c.get();
                }
            }
        });
        ExtraSmallCardDelegate.INSTANCE.getClass();
        ExtraSmallCardDelegate extraSmallCardDelegate = new ExtraSmallCardDelegate(2);
        this.S = extraSmallCardDelegate;
        final int i2 = 1;
        this.T = v.k(new GridBoxDelegate(v.k(extraSmallCardDelegate, new SmallCardLoadingDelegate(ExtraSmallCardDelegate.f52286h)), 0, 8.0f, 8.0f, 2), new FullScreenStateDelegate());
        this.U = w.y0(new Function0(this) { // from class: le1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CategoryItemsScreen f194430b;

            {
                this.f194430b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CategoryItemsScreen categoryItemsScreen = this.f194430b;
                switch (i22) {
                    case 0:
                        int i3 = CategoryItemsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(categoryItemsScreen.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).f;
                        CategoryItemsScreenContract$InputData categoryItemsScreenContract$InputData = categoryItemsScreen.Q;
                        categoryItemsScreenContract$InputData.getClass();
                        return new ld1.f(lVar, categoryItemsScreenContract$InputData);
                    default:
                        int i5 = CategoryItemsScreen.V;
                        return (f) ((ld1.f) categoryItemsScreen.R.getValue()).f193939c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (le1.f) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, i3(), new h(this, null, 9), 3);
        ViewController.P2(this, rd0.e.b(this.S.d), new le1.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (le1.f) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
