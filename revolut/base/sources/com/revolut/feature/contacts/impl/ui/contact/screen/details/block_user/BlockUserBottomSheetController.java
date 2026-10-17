package com.revolut.feature.contacts.impl.ui.contact.screen.details.block_user;

import android.view.View;
import cli.k;
import com.revolut.feature.contacts.api.navigation.BlockUserBottomSheetInputData;
import com.revolut.feature.contacts.impl.ui.contact.screen.details.block_user.BlockUserBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import el3.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import te0.w;
import vl3.i;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/contacts/impl/ui/contact/screen/details/block_user/BlockUserBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lel3/j;", "Lcli/k;", "retail_feature_contacts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlockUserBottomSheetController extends BaseBottomSheetRecyclerController<j, k> {
    public static final /* synthetic */ int U = 0;
    public final BlockUserBottomSheetInputData Q;
    public final List R;
    public final Object S;
    public final Object T;

    public BlockUserBottomSheetController(BlockUserBottomSheetInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = b.v(null, null, 7);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: em3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlockUserBottomSheetController f127596b;

            {
                this.f127596b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BlockUserBottomSheetController blockUserBottomSheetController = this.f127596b;
                switch (i2) {
                    case 0:
                        int i3 = BlockUserBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(blockUserBottomSheetController.m2()).a().get(bl3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bl3.a.class, " is not found"));
                        }
                        vl3.k kVar = ((vl3.k) aVar2.b()).z;
                        BlockUserBottomSheetInputData blockUserBottomSheetInputData = blockUserBottomSheetController.Q;
                        blockUserBottomSheetInputData.getClass();
                        return new i(kVar, blockUserBottomSheetInputData);
                    default:
                        int i5 = BlockUserBottomSheetController.U;
                        return (e) ((i) blockUserBottomSheetController.S.getValue()).f290194c.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: em3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlockUserBottomSheetController f127596b;

            {
                this.f127596b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BlockUserBottomSheetController blockUserBottomSheetController = this.f127596b;
                switch (i22) {
                    case 0:
                        int i3 = BlockUserBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(blockUserBottomSheetController.m2()).a().get(bl3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bl3.a.class, " is not found"));
                        }
                        vl3.k kVar = ((vl3.k) aVar2.b()).z;
                        BlockUserBottomSheetInputData blockUserBottomSheetInputData = blockUserBottomSheetController.Q;
                        blockUserBottomSheetInputData.getClass();
                        return new i(kVar, blockUserBottomSheetInputData);
                    default:
                        int i5 = BlockUserBottomSheetController.U;
                        return (e) ((i) blockUserBottomSheetController.S.getValue()).f290194c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (em3.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new em3.b(this, null, 0), 3);
        ViewController.P2(this, f3(), new em3.b(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (em3.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
