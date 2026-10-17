package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.o9;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/revolut/core/ui_kit/views/LogoWithTaglineView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/views/LogoWithTaglineView$a;", "model", "", "setModel", "(Lcom/revolut/core/ui_kit/views/LogoWithTaglineView$a;)V", "a", "mx0/o9", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LogoWithTaglineView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f58763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f58764b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f58765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o9 f58766b;

        public a() {
            this(null, null, 3);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f58765a, aVar.f58765a) && this.f58766b == aVar.f58766b;
        }

        public final int hashCode() {
            Clause clause = this.f58765a;
            return this.f58766b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
        }

        public a(TextLocalisedClause textLocalisedClause, o9 logoVariant, int i) {
            textLocalisedClause = (i & 1) != 0 ? null : textLocalisedClause;
            logoVariant = (i & 2) != 0 ? o9.REVOLUT : logoVariant;
            Intrinsics.checkNotNullParameter(logoVariant, "logoVariant");
            this.f58765a = textLocalisedClause;
            this.f58766b = logoVariant;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LogoWithTaglineView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setModel(@NotNull a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        kli.a.b(this.f58764b, model.f58765a, ty0.f.f275450a);
        this.f58763a.setImageDrawable(AppCompatResources.getDrawable(getContext(), model.f58766b.a()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LogoWithTaglineView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoWithTaglineView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_logo_with_tagline, this);
        setOrientation(1);
        View viewFindViewById = findViewById(R$id.logoWithTaglineView_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f58763a = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.logoWithTaglineView_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f58764b = (TextView) viewFindViewById2;
    }

    public /* synthetic */ LogoWithTaglineView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
