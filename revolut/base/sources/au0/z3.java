package au0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.flexbox.FlexboxLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class z3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f9453b;

    public /* synthetic */ z3(View view, int i) {
        this.f9452a = i;
        this.f9453b = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9452a) {
            case 0:
                View view = this.f9453b;
                return new ro0.m(new Rect(0, 0, view.getWidth(), view.getHeight()), r6.b.a(view, "getContext(...)", 22.0f));
            case 1:
                return this.f9453b.findViewById(R$id.challengeMediumDelegate_image);
            case 2:
                return this.f9453b.findViewById(R$id.feedCollection_backgroundImage);
            case 3:
                return this.f9453b.findViewById(R$id.feedPost_backgroundImage);
            case 4:
                return this.f9453b.findViewById(R$id.heroBanner_media);
            case 5:
                return this.f9453b.findViewById(R$id.icon_image);
            case 6:
                return this.f9453b.findViewById(R$id.largeVoucherTile_background);
            case 7:
                return (FrameLayout) this.f9453b.findViewById(R$id.mapPlain_mapViewContainer);
            case 8:
                return this.f9453b.findViewById(R$id.mapPlain_ClickableView);
            case 9:
                return (AppCompatTextView) this.f9453b.findViewById(R$id.mapPlain_Title);
            case 10:
                return (AppCompatTextView) this.f9453b.findViewById(R$id.mapPlain_Subtitle);
            case 11:
                return (AppCompatImageView) this.f9453b.findViewById(R$id.mapPlain_RightIcon);
            case 12:
                return new LinearLayoutManager(this.f9453b.getContext(), 0, false);
            case 13:
                return new FlexboxLayoutManager(this.f9453b.getContext(), 0);
            case 14:
                return this.f9453b.findViewById(R$id.extraSmallVoucherTile_mediaView);
            case 15:
                return this.f9453b.findViewById(R$id.smallVoucherTile_mediaView);
            case 16:
                Context context = this.f9453b.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new ColorDrawable(kli.a.s(R$attr.uikit_colorBackground_50, context));
            case 17:
                View view2 = this.f9453b;
                Context context2 = view2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                FixedTabs fixedTabs = new FixedTabs(context2, null, 6, 0);
                fixedTabs.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                Context context3 = view2.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                int iK = kli.a.k(context3, 8.0f);
                fixedTabs.setPaddingRelative(com.google.android.gms.internal.mlkit_vision_face.a.a(view2, "getContext(...)", 16.0f), fixedTabs.getPaddingTop(), com.google.android.gms.internal.mlkit_vision_face.a.a(view2, "getContext(...)", 16.0f), iK);
                return fixedTabs;
            default:
                this.f9453b.setOnClickListener(null);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ z3(e4 e4Var, View view) {
        this.f9452a = 0;
        this.f9453b = view;
    }
}
