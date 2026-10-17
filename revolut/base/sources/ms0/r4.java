package ms0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.v9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class r4 extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f208399b;
    public final CenteredAmountView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AvatarView f208400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UIKitTextView f208401h;
    public final UIKitTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LargeActionButton f208402j;
    public final fp0.p k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InputFilter.LengthFilter f208403l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v9 f208404m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Function2 f208405n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r4(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final CenteredAmountView getAmountView$ui_kit_components_release() {
        return this.f;
    }

    public final Function2<v9, CenteredAmountView, zp0.d> getMaskBinder() {
        return this.f208405n;
    }

    @NotNull
    public final View getRecipientClickableView$ui_kit_components_release() {
        return this.f208399b;
    }

    public final void setMaskBinder(Function2<? super v9, ? super CenteredAmountView, zp0.d> function2) {
        this.f208405n = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setModel(@org.jetbrains.annotations.NotNull aw0.v9 r23) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms0.r4.setModel(aw0.v9):void");
    }

    public final void setRecipientClickListener$ui_kit_components_release(@NotNull TrackableItem component, @NotNull Clause title, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        py0.c cVar = new py0.c(title);
        fp0.p pVar = this.k;
        fp0.p.b(pVar, true);
        View view = pVar.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new au0.t1(component, 28, cVar, onClick));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r4(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setClipChildren(false);
        LayoutInflater.from(context).inflate(R$layout.internal_view_smart_tile_send_money, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.smartTileSendMoney_recipientClickable);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f208399b = viewFindViewById;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(fp0.f.f137022a);
        mVar.getClass();
        this.k = fp0.m.a(viewFindViewById, gVar);
        View viewFindViewById2 = findViewById(R$id.smartTileSendMoney_avatar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        AvatarView avatarView = (AvatarView) viewFindViewById2;
        this.f208400g = avatarView;
        View viewFindViewById3 = findViewById(R$id.smartTileSendMoney_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f208401h = (UIKitTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.smartTileSendMoney_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (UIKitTextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.smartTileSendMoney_amount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        CenteredAmountView centeredAmountView = (CenteredAmountView) viewFindViewById5;
        this.f = centeredAmountView;
        View viewFindViewById6 = findViewById(R$id.smartTileSendMoney_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f208402j = (LargeActionButton) viewFindViewById6;
        viewFindViewById.setBackground(new RippleDrawable(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorSelectableItemBackground, context)), null, dr0.b.e(context, new c.e((qv0.h) null, 3))));
        avatarView.setDefaultAvatarStyle$ui_kit_components_release(mx0.i1.SIZE_40_40);
        centeredAmountView.setHint(null);
        centeredAmountView.setSecondHint(null);
        centeredAmountView.setSideControls(null);
        centeredAmountView.setCurrencyPickerData(null);
        centeredAmountView.setAmountFontSize(mx0.c0.SMALL);
    }

    public /* synthetic */ r4(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
