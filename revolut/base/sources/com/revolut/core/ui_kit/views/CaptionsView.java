package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import aw0.db;
import aw0.o9;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.r2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0018\u0014B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/revolut/core/ui_kit/views/CaptionsView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "text", "", "setCaptions", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit/views/CaptionsView$a;", "style", "setStyle", "(Lcom/revolut/core/ui_kit/views/CaptionsView$a;)V", "Lmx0/r2;", "alignment", "setAlignment", "(Lmx0/r2;)V", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CaptionsView extends AppCompatTextView {

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.CaptionsView$a$a, reason: collision with other inner class name */
        public static final class C0438a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0438a f58381a = new C0438a();

            private C0438a() {
            }

            @Override // com.revolut.core.ui_kit.views.CaptionsView.a
            public final int a() {
                return R$drawable.internal_captions_background_black;
            }

            @Override // com.revolut.core.ui_kit.views.CaptionsView.a
            public final int b() {
                return R$attr.uikit_colorWhite;
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f58382a = new b();

            private b() {
            }

            @Override // com.revolut.core.ui_kit.views.CaptionsView.a
            public final int a() {
                return R$drawable.internal_captions_background_white;
            }

            @Override // com.revolut.core.ui_kit.views.CaptionsView.a
            public final int b() {
                return R$attr.uikit_colorBlack;
            }
        }

        private a() {
        }

        public abstract int a();

        public abstract int b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptionsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void setAlignment(@NotNull r2 alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        setGravity(alignment.a());
    }

    public void setCaptions(@NotNull Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ty0.c cVarB0 = jh.d.f(context).b0();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        kli.a.b(this, new TextClause(ty0.c.a(cVarB0, text, context2, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString(), (Style) new Custom(null, false, db.EMPHASIS1, false, null, Constants.TAG_FB_CHARGING_STATUS), (Integer) null, false, (o9) null, (List) null, 124), ty0.d.f275448a);
    }

    public void setStyle(@NotNull a style) {
        Intrinsics.checkNotNullParameter(style, "style");
        setBackground(ContextCompat.getDrawable(getContext(), style.a()));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setTextColor(kli.a.s(style.b(), context));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptionsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setPadding(kli.a.w(R$attr.uikit_dp16, context), kli.a.w(R$attr.uikit_dp8, context), kli.a.w(R$attr.uikit_dp16, context), kli.a.w(R$attr.uikit_dp8, context));
        setTextAlignment(1);
    }

    public /* synthetic */ CaptionsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
