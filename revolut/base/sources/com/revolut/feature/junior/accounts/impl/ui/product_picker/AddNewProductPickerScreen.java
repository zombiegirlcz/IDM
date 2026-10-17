package com.revolut.feature.junior.accounts.impl.ui.product_picker;

import aii.q;
import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior.accounts.impl.ui.product_picker.AddNewProductPickerScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import k78.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import z78.e;
import z78.f;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/accounts/impl/ui/product_picker/AddNewProductPickerScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "feature_junior_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddNewProductPickerScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ int V = 0;
    public final e Q;
    public final RowDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public AddNewProductPickerScreen(e input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.Q = input;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        this.S = u.c(rowDelegate);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: z78.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewProductPickerScreen f319943b;

            {
                this.f319943b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddNewProductPickerScreen addNewProductPickerScreen = this.f319943b;
                switch (i2) {
                    case 0:
                        int i3 = AddNewProductPickerScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(addNewProductPickerScreen.m2()).a().get(r68.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r68.b.class, " is not found"));
                        }
                        k78.b bVar = ((k78.b) ((k78.k) aVar2.b())).Q;
                        e eVar = addNewProductPickerScreen.Q;
                        eVar.getClass();
                        return new k78.a(bVar, eVar);
                    default:
                        int i5 = AddNewProductPickerScreen.V;
                        return (f) ((k78.a) addNewProductPickerScreen.T.getValue()).f181850b.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: z78.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewProductPickerScreen f319943b;

            {
                this.f319943b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddNewProductPickerScreen addNewProductPickerScreen = this.f319943b;
                switch (i22) {
                    case 0:
                        int i3 = AddNewProductPickerScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(addNewProductPickerScreen.m2()).a().get(r68.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r68.b.class, " is not found"));
                        }
                        k78.b bVar = ((k78.b) ((k78.k) aVar2.b())).Q;
                        e eVar = addNewProductPickerScreen.Q;
                        eVar.getClass();
                        return new k78.a(bVar, eVar);
                    default:
                        int i5 = AddNewProductPickerScreen.V;
                        return (f) ((k78.a) addNewProductPickerScreen.T.getValue()).f181850b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (a) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new z78.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
