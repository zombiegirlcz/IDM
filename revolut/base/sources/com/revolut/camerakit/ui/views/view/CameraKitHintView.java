package com.revolut.camerakit.ui.views.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.revolut.camerakit.ui.models.R$drawable;
import com.revolut.camerakit.ui.models.R$id;
import com.revolut.camerakit.ui.models.R$layout;
import com.revolut.camerakit.ui.models.R$style;
import java.util.Arrays;
import jb3.l;
import knm.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rz.c;
import rz.d;
import rz.e;
import rz.f;
import rz.h;
import rz.i;
import rz.j;
import rz.k;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/revolut/camerakit/ui/views/view/CameraKitHintView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lrz/e;", "background", "", "setBackground", "(Lrz/e;)V", "Lrz/f;", "hintModel", "setHint", "(Lrz/f;)V", "Companion", "a", "camera_kit_ui_views_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraKitHintView extends LinearLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f50853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f50854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f50855c;
    public f d;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraKitHintView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setBackground(e background) {
        boolean zF = Intrinsics.f(background, c.f258442a);
        LinearLayout linearLayout = this.f50853a;
        if (!zF) {
            if (!Intrinsics.f(background, d.f258443a)) {
                throw new NoWhenBranchMatchedException();
            }
            linearLayout.setBackground(null);
            linearLayout.setPadding(0, 0, 0, 0);
            return;
        }
        linearLayout.setBackground(ContextCompat.getDrawable(getContext(), R$drawable.bg_hint));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iG = (int) l.g(context, 16.0f);
        linearLayout.setPadding(iG, iG, iG, iG);
    }

    public final String a(j jVar) {
        if (!(jVar instanceof h)) {
            if (jVar instanceof i) {
                return ((i) jVar).f258449a;
            }
            throw new NoWhenBranchMatchedException();
        }
        Context context = getContext();
        h hVar = (h) jVar;
        int i = hVar.f258447a;
        Object[] array = hVar.f258448b.toArray(new Object[0]);
        String string = context.getString(i, Arrays.copyOf(array, array.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final void setHint(@NotNull f hintModel) {
        Intrinsics.checkNotNullParameter(hintModel, "hintModel");
        if (Intrinsics.f(hintModel, this.d)) {
            return;
        }
        this.d = hintModel;
        setBackground(hintModel.f258446c);
        k kVar = hintModel.f258444a;
        if (kVar == null) {
            setVisibility(4);
            return;
        }
        setVisibility(0);
        String strA = a(kVar.f258450a);
        TextView textView = this.f50854b;
        textView.setText(strA);
        Integer num = kVar.f258451b;
        b.a(textView, num != null ? num.intValue() : R$style.CameraKit_TextAppearance_L1);
        k kVar2 = hintModel.f258445b;
        TextView textView2 = this.f50855c;
        if (kVar2 == null) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        textView2.setText(a(kVar2.f258450a));
        Integer num2 = kVar2.f258451b;
        b.a(textView2, num2 != null ? num2.intValue() : R$style.CameraKit_TextAppearance_L2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraKitHintView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraKitHintView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.camera_kit_hint_view, this);
        View viewFindViewById = findViewById(R$id.cameraKitUi_hintRoot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50853a = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.cameraKitUi_hintViewTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50854b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.cameraKitUi_hintViewDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f50855c = (TextView) viewFindViewById3;
    }

    public /* synthetic */ CameraKitHintView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
