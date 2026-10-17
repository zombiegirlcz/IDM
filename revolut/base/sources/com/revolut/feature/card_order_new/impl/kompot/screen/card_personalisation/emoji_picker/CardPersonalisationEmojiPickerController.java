package com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.emoji_picker;

import android.view.View;
import at4.b;
import aw1.a;
import b33.c;
import b33.e;
import b33.f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.EmojiDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.emoji_picker.CardPersonalisationEmojiPickerController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import x13.t;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/emoji_picker/CardPersonalisationEmojiPickerController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lb33/e;", "Lb33/c;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardPersonalisationEmojiPickerController extends BaseBottomSheetRecyclerController<e, c> {
    public static final /* synthetic */ int V = 0;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final List U;

    public CardPersonalisationEmojiPickerController(CardPersonalisationEmojiPickerControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = w.y0(new b(this, inputData, 18));
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: b33.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardPersonalisationEmojiPickerController f11986b;

            {
                this.f11986b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardPersonalisationEmojiPickerController cardPersonalisationEmojiPickerController = this.f11986b;
                switch (i2) {
                    case 0:
                        int i3 = CardPersonalisationEmojiPickerController.V;
                        return (f) ((t) cardPersonalisationEmojiPickerController.Q.getValue()).e.get();
                    default:
                        int i5 = CardPersonalisationEmojiPickerController.V;
                        return new GridBoxDelegate(u.c((EmojiDelegate) cardPersonalisationEmojiPickerController.S.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                }
            }
        });
        this.S = w.y0(new a(20));
        final int i2 = 1;
        Lazy lazyY0 = w.y0(new Function0(this) { // from class: b33.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardPersonalisationEmojiPickerController f11986b;

            {
                this.f11986b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardPersonalisationEmojiPickerController cardPersonalisationEmojiPickerController = this.f11986b;
                switch (i22) {
                    case 0:
                        int i3 = CardPersonalisationEmojiPickerController.V;
                        return (f) ((t) cardPersonalisationEmojiPickerController.Q.getValue()).e.get();
                    default:
                        int i5 = CardPersonalisationEmojiPickerController.V;
                        return new GridBoxDelegate(u.c((EmojiDelegate) cardPersonalisationEmojiPickerController.S.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                }
            }
        });
        this.T = lazyY0;
        this.U = v.k((GridBoxDelegate) lazyY0.getValue(), new ListSubheaderDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((EmojiDelegate) this.S.getValue()).f52217c), null, new b33.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
