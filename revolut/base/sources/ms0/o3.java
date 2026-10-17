package ms0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.pc;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.u50;
import ip0.v50;
import ip0.w50;
import ip0.x50;
import ip0.y50;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class o3 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f208354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f208355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f208356c;
    public pc d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o3(@NotNull Context context) {
        this(context, null, 0, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setIcon(ResourceImage resourceImage) {
        zi0.c.g(this.f208354a, resourceImage);
    }

    private final void setModelInternal(pc pcVar) {
        ResourceImage resourceImage = pcVar.f54583b;
        y50 y50Var = pcVar.d;
        TimeClause timeClause = pcVar.f54584c;
        pc pcVar2 = this.d;
        if (!resourceImage.equals(pcVar2 != null ? pcVar2.f54583b : null)) {
            setIcon(pcVar.f54583b);
        }
        pc pcVar3 = this.d;
        if (!timeClause.equals(pcVar3 != null ? pcVar3.f54584c : null)) {
            setTitle(timeClause);
        }
        pc pcVar4 = this.d;
        if (!Intrinsics.f(y50Var, pcVar4 != null ? pcVar4.d : null)) {
            setStyle(y50Var);
        }
        this.d = pcVar;
    }

    private final void setStyle(y50 y50Var) {
        int iS;
        int iS2;
        if (y50Var != null) {
            u50 u50Var = u50.f166597a;
            boolean zEquals = y50Var.equals(u50Var);
            x50 x50Var = x50.f167096a;
            w50 w50Var = w50.f166936a;
            v50 v50Var = v50.f166774a;
            if (zEquals) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iS = kli.a.s(R$attr.uikit_colorStatusWarning, context);
            } else if (y50Var.equals(v50Var)) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                iS = kli.a.s(R$attr.uikit_colorForeground, context2);
            } else if (y50Var.equals(w50Var)) {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                iS = kli.a.s(R$attr.uikit_colorGreyTone8, context3);
            } else {
                if (!y50Var.equals(x50Var)) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                iS = kli.a.s(R$attr.uikit_colorGreyTone20, context4);
            }
            this.f208354a.setColorFilter(iS);
            if (y50Var.equals(u50Var)) {
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                iS2 = kli.a.s(R$attr.uikit_colorStatusWarning, context5);
            } else if (y50Var.equals(v50Var)) {
                Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                iS2 = kli.a.s(R$attr.uikit_colorForeground, context6);
            } else if (y50Var.equals(w50Var)) {
                Context context7 = getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                iS2 = kli.a.s(R$attr.uikit_colorGreyTone10, context7);
            } else {
                if (!y50Var.equals(x50Var)) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context8 = getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                iS2 = kli.a.s(R$attr.uikit_colorGreyTone50, context8);
            }
            this.f208355b.setTextColor(iS2);
            if (y50Var.equals(u50Var)) {
                Context context9 = getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                kli.a.s(R$attr.uikit_colorGreyTone50, context9);
            } else if (y50Var.equals(v50Var)) {
                Context context10 = getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                kli.a.s(R$attr.uikit_colorGreyTone50, context10);
            } else if (y50Var.equals(w50Var)) {
                Context context11 = getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
                kli.a.s(R$attr.uikit_colorGreyTone10, context11);
            } else {
                if (!y50Var.equals(x50Var)) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context12 = getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
                kli.a.s(R$attr.uikit_colorGreyTone20, context12);
            }
        }
        if (isLaidOut()) {
            invalidate();
        }
    }

    private final void setSubtitle(Clause clause) {
        kli.a.b(this.f208356c, clause, ty0.f.f275450a);
    }

    private final void setTitle(Clause clause) {
        kli.a.b(this.f208355b, clause, ty0.f.f275450a);
    }

    public final void setModel(@NotNull pc model) {
        Intrinsics.checkNotNullParameter(model, "model");
        setModelInternal(model);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o3(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o3(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o3(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i, 0);
        View.inflate(context, R$layout.internal_view_progress_timeline_step, this);
        View viewFindViewById = findViewById(R$id.viewProgressTimelineStep_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f208354a = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.viewProgressTimelineStep_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f208355b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.viewProgressTimelineStep_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f208356c = (TextView) viewFindViewById3;
        setOrientation(1);
        setGravity(1);
    }
}
