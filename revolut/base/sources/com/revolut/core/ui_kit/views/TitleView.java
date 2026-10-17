package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import aw0.na;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/core/ui_kit/views/TitleView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/na;", "model", "", "setModel", "(Law0/na;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TitleView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f58916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f58917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public na f58918c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TitleView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void setModel(@NotNull na model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.f58918c, model)) {
            return;
        }
        na naVar = this.f58918c;
        Object obj2 = naVar != null ? naVar.f10440a : null;
        Object obj3 = model.f10440a;
        ?? r3 = model.f10441b;
        if (!Intrinsics.f(obj2, obj3)) {
            kli.a.b(this.f58916a, model.f10440a, ty0.f.f275450a);
        }
        na naVar2 = this.f58918c;
        if (!Intrinsics.f(naVar2 != null ? naVar2.f10441b : null, r3)) {
            kli.a.b(this.f58917b, r3, ty0.f.f275450a);
        }
        this.f58918c = model;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TitleView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_title, this);
        setOrientation(1);
        View viewFindViewById = findViewById(R$id.titleView_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f58916a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.titleView_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f58917b = (TextView) viewFindViewById2;
    }

    public /* synthetic */ TitleView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
