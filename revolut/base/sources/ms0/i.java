package ms0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import cw0.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.q f208273b;
    public final e8.q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e8.q f208274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e8.q f208275h;
    public final e8.q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e8.q f208276j;
    public g k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getAttachmentIcon() {
        return (ImageView) this.f.f();
    }

    private final FrameLayout getBadge() {
        return (FrameLayout) this.f208274g.f();
    }

    private final ImageView getBadgeIcon() {
        return (ImageView) this.i.f();
    }

    private final TextView getBadgeText() {
        return (TextView) this.f208276j.f();
    }

    private final ImageView getError() {
        return (ImageView) this.f208275h.f();
    }

    private final ProgressBar getProgress() {
        return (ProgressBar) this.f208273b.f();
    }

    private final void setAttachmentViewLayoutParams(cw0.f fVar) {
        float f;
        int i = h.f208267b[fVar.ordinal()];
        if (i == 1) {
            f = 40.0f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = 56.0f;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iK, kli.a.k(context2, f));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        layoutParams.rightMargin = kli.a.k(context3, 16.0f);
        setLayoutParams(layoutParams);
    }

    public static /* synthetic */ void setContent$default(i iVar, cw0.i iVar2, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "";
        }
        iVar.setContent(iVar2, str);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    public final void setContent(@NotNull final cw0.i attachment, @NotNull String badgeText) {
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        Intrinsics.checkNotNullParameter(badgeText, "badgeText");
        setAttachmentViewLayoutParams(attachment.d);
        cw0.g gVar = attachment.f109521c;
        if (Intrinsics.f(gVar, g.b.f109517a)) {
            getProgress().setVisibility(0);
            getError().setVisibility(8);
            getAttachmentIcon().setVisibility(8);
            getBadge().setVisibility(8);
        } else if (Intrinsics.f(gVar, g.a.f109516a)) {
            getError().setVisibility(0);
            getProgress().setVisibility(8);
            getAttachmentIcon().setVisibility(8);
            getBadge().setVisibility(0);
            final int i = 1;
            getBadge().setOnClickListener(new View.OnClickListener(this) { // from class: ms0.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f208242b;

                {
                    this.f208242b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            g gVar2 = this.f208242b.k;
                            if (gVar2 != null) {
                                com.revolut.core.ui_kit.delegates.e2 e2Var = (com.revolut.core.ui_kit.delegates.e2) gVar2;
                                cw0.i attachment2 = attachment;
                                Intrinsics.checkNotNullParameter(attachment2, "attachment");
                                e2Var.f54075a.f51808c.onNext(new com.revolut.core.ui_kit.delegates.d2(e2Var.f54076b, new cw0.d(attachment2)));
                            }
                            break;
                        case 1:
                            g gVar3 = this.f208242b.k;
                            if (gVar3 != null) {
                                com.revolut.core.ui_kit.delegates.e2 e2Var2 = (com.revolut.core.ui_kit.delegates.e2) gVar3;
                                cw0.i attachment3 = attachment;
                                Intrinsics.checkNotNullParameter(attachment3, "attachment");
                                e2Var2.f54075a.f51808c.onNext(new com.revolut.core.ui_kit.delegates.d2(e2Var2.f54076b, new cw0.e(attachment3)));
                            }
                            break;
                        default:
                            g gVar4 = this.f208242b.k;
                            if (gVar4 != null) {
                                com.revolut.core.ui_kit.delegates.e2 e2Var3 = (com.revolut.core.ui_kit.delegates.e2) gVar4;
                                cw0.i attachment4 = attachment;
                                Intrinsics.checkNotNullParameter(attachment4, "attachment");
                                e2Var3.f54075a.f51808c.onNext(new com.revolut.core.ui_kit.delegates.d2(e2Var3.f54076b, new cw0.b(attachment4)));
                            }
                            break;
                    }
                }
            });
            getBadge().setBackgroundResource(R$drawable.internal_attachment_badge_background_accent);
            getBadgeIcon().setVisibility(0);
            getBadgeIcon().setImageResource(com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_retry);
            getBadgeText().setVisibility(8);
        } else {
            if (!(gVar instanceof g.c)) {
                throw new NoWhenBranchMatchedException();
            }
            getAttachmentIcon().setVisibility(0);
            getProgress().setVisibility(8);
            getError().setVisibility(8);
            yy0.f.e(or0.u.k(this).Q(), attachment.f109520b, getAttachmentIcon(), null, null, 12);
            int i2 = h.f208266a[((g.c) gVar).f109518a.ordinal()];
            if (i2 == 1) {
                getBadge().setVisibility(0);
                final int i3 = 0;
                getBadge().setOnClickListener(new View.OnClickListener(this) { // from class: ms0.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ i f208242b;

                    {
                        this.f208242b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                g gVar2 = this.f208242b.k;
                                if (gVar2 != null) {
                                    com.revolut.core.ui_kit.delegates.e2 e2Var = (com.revolut.core.ui_kit.delegates.e2) gVar2;
                                    cw0.i attachment2 = attachment;
                                    Intrinsics.checkNotNullParameter(attachment2, "attachment");
                                    e2Var.f54075a.f51808c.onNext(new com.revolut.core.ui_kit.delegates.d2(e2Var.f54076b, new cw0.d(attachment2)));
                                }
                                break;
                            case 1:
                                g gVar3 = this.f208242b.k;
                                if (gVar3 != null) {
                                    com.revolut.core.ui_kit.delegates.e2 e2Var2 = (com.revolut.core.ui_kit.delegates.e2) gVar3;
                                    cw0.i attachment3 = attachment;
                                    Intrinsics.checkNotNullParameter(attachment3, "attachment");
                                    e2Var2.f54075a.f51808c.onNext(new com.revolut.core.ui_kit.delegates.d2(e2Var2.f54076b, new cw0.e(attachment3)));
                                }
                                break;
                            default:
                                g gVar4 = this.f208242b.k;
                                if (gVar4 != null) {
                                    com.revolut.core.ui_kit.delegates.e2 e2Var3 = (com.revolut.core.ui_kit.delegates.e2) gVar4;
                                    cw0.i attachment4 = attachment;
                                    Intrinsics.checkNotNullParameter(attachment4, "attachment");
                                    e2Var3.f54075a.f51808c.onNext(new com.revolut.core.ui_kit.delegates.d2(e2Var3.f54076b, new cw0.b(attachment4)));
                                }
                                break;
                        }
                    }
                });
                getBadge().setBackgroundResource(R$drawable.internal_attachment_badge_background_red);
                getBadgeIcon().setVisibility(0);
                getBadgeIcon().setImageResource(com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_cross);
                getBadgeText().setVisibility(8);
            } else if (i2 == 2) {
                getBadge().setVisibility(0);
                final int i5 = 2;
                getBadge().setOnClickListener(new View.OnClickListener(this) { // from class: ms0.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ i f208242b;

                    {
                        this.f208242b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i5) {
                            case 0:
                                g gVar2 = this.f208242b.k;
                                if (gVar2 != null) {
                                    com.revolut.core.ui_kit.delegates.e2 e2Var = (com.revolut.core.ui_kit.delegates.e2) gVar2;
                                    cw0.i attachment2 = attachment;
                                    Intrinsics.checkNotNullParameter(attachment2, "attachment");
                                    e2Var.f54075a.f51808c.onNext(new com.revolut.core.ui_kit.delegates.d2(e2Var.f54076b, new cw0.d(attachment2)));
                                }
                                break;
                            case 1:
                                g gVar3 = this.f208242b.k;
                                if (gVar3 != null) {
                                    com.revolut.core.ui_kit.delegates.e2 e2Var2 = (com.revolut.core.ui_kit.delegates.e2) gVar3;
                                    cw0.i attachment3 = attachment;
                                    Intrinsics.checkNotNullParameter(attachment3, "attachment");
                                    e2Var2.f54075a.f51808c.onNext(new com.revolut.core.ui_kit.delegates.d2(e2Var2.f54076b, new cw0.e(attachment3)));
                                }
                                break;
                            default:
                                g gVar4 = this.f208242b.k;
                                if (gVar4 != null) {
                                    com.revolut.core.ui_kit.delegates.e2 e2Var3 = (com.revolut.core.ui_kit.delegates.e2) gVar4;
                                    cw0.i attachment4 = attachment;
                                    Intrinsics.checkNotNullParameter(attachment4, "attachment");
                                    e2Var3.f54075a.f51808c.onNext(new com.revolut.core.ui_kit.delegates.d2(e2Var3.f54076b, new cw0.b(attachment4)));
                                }
                                break;
                        }
                    }
                });
                getBadge().setBackgroundResource(R$drawable.internal_attachment_badge_background_accent);
                getBadgeIcon().setVisibility(0);
                getBadgeIcon().setImageResource(com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_pencil);
                getBadgeText().setVisibility(8);
            }
        }
        if (kotlin.text.d0.W(badgeText)) {
            return;
        }
        getBadge().setVisibility(0);
        getBadgeIcon().setVisibility(8);
        getBadgeText().setVisibility(0);
        getBadgeText().setText(badgeText);
    }

    public final void setListener(@NotNull g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.k = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f208273b = kli.a.J(R$id.progress, this);
        this.f = kli.a.J(R$id.attachmentIcon, this);
        this.f208274g = kli.a.J(R$id.badge, this);
        this.f208275h = kli.a.J(R$id.error, this);
        this.i = kli.a.J(R$id.badgeIcon, this);
        this.f208276j = kli.a.J(R$id.badgeText, this);
        View.inflate(context, R$layout.internal_view_attachment, this);
        setAttachmentViewLayoutParams(cw0.f.DEFAULT);
        setBackgroundResource(R$drawable.internal_attachment_background);
        setClipToPadding(false);
        setClipChildren(false);
        setClickable(true);
        setFocusable(true);
    }

    public /* synthetic */ i(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
