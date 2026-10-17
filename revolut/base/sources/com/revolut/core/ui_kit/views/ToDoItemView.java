package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import aw0.oa;
import aw0.pa;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/revolut/core/ui_kit/views/ToDoItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "", "setImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "text", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Law0/oa;", "newStyle", "setStyle", "(Law0/oa;)V", "Law0/pa;", "newModel", "setModel", "(Law0/pa;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ToDoItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pa f58919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f58920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f58921c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToDoItemView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setImage(Image image) {
        ImageView image2 = this.f58920b;
        Intrinsics.checkNotNullExpressionValue(image2, "image");
        zi0.c.g(image2, image);
    }

    private final void setStyle(oa newStyle) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(newStyle.a(), context);
        this.f58921c.setTextColor(iS);
        boolean zB = newStyle.b();
        ImageView imageView = this.f58920b;
        if (zB) {
            imageView.setColorFilter(iS, PorterDuff.Mode.SRC_IN);
        } else {
            imageView.clearColorFilter();
        }
    }

    private final void setText(Clause text) {
        ty0.c cVarB0 = or0.u.k(this).b0();
        TextView textView = this.f58921c;
        Intrinsics.checkNotNullExpressionValue(textView, "textView");
        ty0.c.b(cVarB0, text, textView, null, null, 12);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        if (this.f58921c.getLayout() == null) {
            return;
        }
        float top = r2.getTop() + ((r3.getLineBottom(0) + r3.getLineTop(0)) / 2.0f);
        this.f58920b.offsetTopAndBottom((int) ((top - (r3.getHeight() / 2.0f)) - r3.getTop()));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setModel(@org.jetbrains.annotations.NotNull aw0.pa r5) {
        /*
            r4 = this;
            java.lang.String r0 = "newModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            aw0.pa r0 = r4.f58919a
            r1 = 0
            if (r0 != 0) goto L11
            aw0.oa r2 = r5.f10476c
            aw0.oa r3 = aw0.oa.LEGACY_CONTENT_COLOR
            if (r2 != r3) goto L11
            goto L1d
        L11:
            aw0.oa r2 = r5.f10476c
            if (r0 == 0) goto L18
            aw0.oa r3 = r0.f10476c
            goto L19
        L18:
            r3 = r1
        L19:
            if (r2 == r3) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            if (r0 == 0) goto L23
            com.revolut.core.ui_kit_core.displayers.image.Image r3 = r0.f10474a
            goto L24
        L23:
            r3 = r1
        L24:
            if (r3 == 0) goto L34
            com.revolut.core.ui_kit_core.displayers.image.Image r3 = r5.f10474a
            if (r0 == 0) goto L2d
            com.revolut.core.ui_kit_core.displayers.image.Image r0 = r0.f10474a
            goto L2e
        L2d:
            r0 = r1
        L2e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r3, r0)
            if (r0 != 0) goto L39
        L34:
            com.revolut.core.ui_kit_core.displayers.image.Image r0 = r5.f10474a
            r4.setImage(r0)
        L39:
            com.revolut.core.ui_kit.models.Clause r0 = r5.f10475b
            aw0.pa r3 = r4.f58919a
            if (r3 == 0) goto L41
            com.revolut.core.ui_kit.models.Clause r1 = r3.f10475b
        L41:
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 != 0) goto L4c
            com.revolut.core.ui_kit.models.Clause r0 = r5.f10475b
            r4.setText(r0)
        L4c:
            if (r2 == 0) goto L53
            aw0.oa r0 = r5.f10476c
            r4.setStyle(r0)
        L53:
            r4.f58919a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ToDoItemView.setModel(aw0.pa):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToDoItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToDoItemView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_to_do_item, this);
        setOrientation(0);
        this.f58920b = (ImageView) findViewById(R$id.toDoItemView_image);
        this.f58921c = (TextView) findViewById(R$id.toDoItemView_text);
    }

    public /* synthetic */ ToDoItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
