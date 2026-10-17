package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import aw0.d0;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.e3;
import mx0.l7;
import mx0.m7;
import mx0.n7;
import mx0.o7;
import mx0.p7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b.\b\u0000\u0018\u0000 L2\u00020\u0001:\u0002\nMB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b&\u0010\u0013R\u001b\u0010*\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0011\u001a\u0004\b)\u0010\u001bR\u001b\u0010-\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0011\u001a\u0004\b,\u0010\u001bR\u001b\u00100\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0011\u001a\u0004\b/\u0010\u0013R\u001b\u00103\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0011\u001a\u0004\b2\u0010\u001bR\u001b\u00106\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0011\u001a\u0004\b5\u0010\u001bR\u001b\u00109\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0011\u001a\u0004\b8\u0010\u0013R\u001b\u0010<\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u0011\u001a\u0004\b;\u0010\u001bR\u001b\u0010?\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u0011\u001a\u0004\b>\u0010\u001bR\u001b\u0010B\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u0011\u001a\u0004\bA\u0010\u0013R\u001b\u0010E\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u0011\u001a\u0004\bD\u0010\u001bR\u001b\u0010H\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\u0011\u001a\u0004\bG\u0010\u001bR\u001b\u0010K\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\u0011\u001a\u0004\bJ\u0010\u0013¨\u0006N"}, d2 = {"Lcom/revolut/core/ui_kit/views/IdDocumentView;", "Lcom/revolut/core/ui_kit/internal/views/layout/UIKitConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmx0/p7;", "model", "", "setModel", "(Lmx0/p7;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "l", "Le8/q;", "getBackgroundImage", "()Landroidx/appcompat/widget/AppCompatImageView;", "backgroundImage", "m", "getDocumentCountryIcon", "documentCountryIcon", "Landroidx/appcompat/widget/AppCompatTextView;", "n", "getDocumentType", "()Landroidx/appcompat/widget/AppCompatTextView;", "documentType", "o", "getLogo", "logo", "Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "p", "getTag", "()Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "tag", "q", "getPhoto", "photo", "r", "getLegalNameLabel", "legalNameLabel", "s", "getLegalNameValue", "legalNameValue", "t", "getCopyLegalNameIcon", "copyLegalNameIcon", "u", "getDocumentNumberLabel", "documentNumberLabel", "v", "getDocumentNumberValue", "documentNumberValue", "w", "getCopyDocumentNumberIcon", "copyDocumentNumberIcon", "x", "getDateOfBirthLabel", "dateOfBirthLabel", "y", "getDateOfBirthValue", "dateOfBirthValue", "z", "getCopyDateOfBirthIcon", "copyDateOfBirthIcon", "A", "getExpiresOnLabel", "expiresOnLabel", "B", "getExpiresOnValue", "expiresOnValue", "C", "getCopyExpiresOnIcon", "copyExpiresOnIcon", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IdDocumentView extends UIKitConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final ut0.e E = new ut0.e(new d0(345, Constants.TAG_BOOT_LOADER_VERSION), ut0.a.ADJUST_HEIGHT);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final e8.q expiresOnLabel;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final e8.q expiresOnValue;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final e8.q copyExpiresOnIcon;
    public p7 D;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f58635h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f58636j;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final e8.q backgroundImage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final e8.q documentCountryIcon;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final e8.q documentType;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final e8.q logo;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final e8.q tag;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final e8.q photo;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final e8.q legalNameLabel;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final e8.q legalNameValue;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final e8.q copyLegalNameIcon;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final e8.q documentNumberLabel;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final e8.q documentNumberValue;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final e8.q copyDocumentNumberIcon;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final e8.q dateOfBirthLabel;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final e8.q dateOfBirthValue;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final e8.q copyDateOfBirthIcon;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.IdDocumentView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdDocumentView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final AppCompatImageView getBackgroundImage() {
        return (AppCompatImageView) this.backgroundImage.f();
    }

    private final AppCompatImageView getCopyDateOfBirthIcon() {
        return (AppCompatImageView) this.copyDateOfBirthIcon.f();
    }

    private final AppCompatImageView getCopyDocumentNumberIcon() {
        return (AppCompatImageView) this.copyDocumentNumberIcon.f();
    }

    private final AppCompatImageView getCopyExpiresOnIcon() {
        return (AppCompatImageView) this.copyExpiresOnIcon.f();
    }

    private final AppCompatImageView getCopyLegalNameIcon() {
        return (AppCompatImageView) this.copyLegalNameIcon.f();
    }

    private final AppCompatTextView getDateOfBirthLabel() {
        return (AppCompatTextView) this.dateOfBirthLabel.f();
    }

    private final AppCompatTextView getDateOfBirthValue() {
        return (AppCompatTextView) this.dateOfBirthValue.f();
    }

    private final AppCompatImageView getDocumentCountryIcon() {
        return (AppCompatImageView) this.documentCountryIcon.f();
    }

    private final AppCompatTextView getDocumentNumberLabel() {
        return (AppCompatTextView) this.documentNumberLabel.f();
    }

    private final AppCompatTextView getDocumentNumberValue() {
        return (AppCompatTextView) this.documentNumberValue.f();
    }

    private final AppCompatTextView getDocumentType() {
        return (AppCompatTextView) this.documentType.f();
    }

    private final AppCompatTextView getExpiresOnLabel() {
        return (AppCompatTextView) this.expiresOnLabel.f();
    }

    private final AppCompatTextView getExpiresOnValue() {
        return (AppCompatTextView) this.expiresOnValue.f();
    }

    private final AppCompatTextView getLegalNameLabel() {
        return (AppCompatTextView) this.legalNameLabel.f();
    }

    private final AppCompatTextView getLegalNameValue() {
        return (AppCompatTextView) this.legalNameValue.f();
    }

    private final AppCompatImageView getLogo() {
        return (AppCompatImageView) this.logo.f();
    }

    private final AppCompatImageView getPhoto() {
        return (AppCompatImageView) this.photo.f();
    }

    private final TagView getTag() {
        return (TagView) this.tag.f();
    }

    public final void f0(AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, ihm.f fVar) {
        yy0.f.e(or0.u.k(this).Q(), new ResourceImage(R$drawable.uikit_icn_16_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite_80), (List) null, (ImageTransformations) null, (Clause) null, 246), appCompatImageView, null, null, 12);
        appCompatImageView.setOnClickListener(new e3(fVar, 2));
        appCompatTextView.setOnClickListener(new e3(fVar, 3));
    }

    public final void setModel(@NotNull p7 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model, this.D)) {
            return;
        }
        p7 p7Var = this.D;
        boolean zF = Intrinsics.f(p7Var != null ? p7Var.f209929a : null, model);
        p7 p7Var2 = this.D;
        boolean zF2 = Intrinsics.f(p7Var2 != null ? p7Var2.f209930b : null, model);
        p7 p7Var3 = this.D;
        boolean zF3 = Intrinsics.f(p7Var3 != null ? p7Var3.f209931c : null, model);
        p7 p7Var4 = this.D;
        boolean zF4 = Intrinsics.f(p7Var4 != null ? p7Var4.d : null, model);
        p7 p7Var5 = this.D;
        boolean zF5 = Intrinsics.f(p7Var5 != null ? p7Var5.e : null, model);
        p7 p7Var6 = this.D;
        boolean zF6 = Intrinsics.f(p7Var6 != null ? p7Var6.f : null, model);
        p7 p7Var7 = this.D;
        boolean zF7 = Intrinsics.f(p7Var7 != null ? p7Var7.f209932g : null, model);
        p7 p7Var8 = this.D;
        boolean zF8 = Intrinsics.f(p7Var8 != null ? p7Var8.f209933h : null, model);
        p7 p7Var9 = this.D;
        boolean zF9 = Intrinsics.f(p7Var9 != null ? p7Var9.i : null, model);
        this.D = model;
        if (!zF) {
            yy0.f.e(or0.u.k(this).Q(), model.f209929a, getBackgroundImage(), null, null, 12);
        }
        if (!zF2) {
            yy0.f.e(or0.u.k(this).Q(), model.f209930b, getDocumentCountryIcon(), null, null, 12);
        }
        if (!zF3) {
            ty0.c.b(or0.u.k(this).b0(), model.f209931c, getDocumentType(), null, null, 12);
        }
        if (!zF4) {
            o7 o7Var = model.d;
            if (o7Var instanceof n7) {
                AppCompatImageView logo = getLogo();
                ViewGroup.LayoutParams layoutParams = logo.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                layoutParams.width = kli.a.k(context, n7.f209859c);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                layoutParams.height = kli.a.k(context2, n7.d);
                logo.setLayoutParams(layoutParams);
                zi0.c.g(getLogo(), n7.f209858b);
                getTag().setVisibility(8);
            } else {
                if (!(o7Var instanceof m7)) {
                    throw new NoWhenBranchMatchedException();
                }
                getTag().setVisibility(0);
                getTag().setContent(((m7) o7Var).f209838a);
                getLogo().setVisibility(8);
            }
        }
        if (!zF5) {
            yy0.f.e(or0.u.k(this).Q(), model.e, getPhoto(), null, null, 12);
        }
        if (!zF6) {
            ty0.c cVarB0 = or0.u.k(this).b0();
            l7 l7Var = model.f;
            ty0.c.b(cVarB0, l7Var != null ? l7Var.f209802a : null, getLegalNameLabel(), null, null, 12);
            ty0.c cVarB02 = or0.u.k(this).b0();
            l7 l7Var2 = model.f;
            ty0.c.b(cVarB02, l7Var2 != null ? l7Var2.f209803b : null, getLegalNameValue(), null, null, 12);
        }
        if (!zF7) {
            ty0.c.b(or0.u.k(this).b0(), model.f209932g.f209802a, getDocumentNumberLabel(), null, null, 12);
            ty0.c.b(or0.u.k(this).b0(), model.f209932g.f209803b, getDocumentNumberValue(), null, null, 12);
        }
        if (!zF8) {
            ty0.c cVarB03 = or0.u.k(this).b0();
            l7 l7Var3 = model.f209933h;
            ty0.c.b(cVarB03, l7Var3 != null ? l7Var3.f209802a : null, getDateOfBirthLabel(), null, null, 12);
            ty0.c cVarB04 = or0.u.k(this).b0();
            l7 l7Var4 = model.f209933h;
            ty0.c.b(cVarB04, l7Var4 != null ? l7Var4.f209803b : null, getDateOfBirthValue(), null, null, 12);
        }
        if (zF9) {
            return;
        }
        ty0.c cVarB05 = or0.u.k(this).b0();
        l7 l7Var5 = model.i;
        ty0.c.b(cVarB05, l7Var5 != null ? l7Var5.f209802a : null, getExpiresOnLabel(), null, null, 12);
        ty0.c cVarB06 = or0.u.k(this).b0();
        l7 l7Var6 = model.i;
        ty0.c.b(cVarB06, l7Var6 != null ? l7Var6.f209803b : null, getExpiresOnValue(), null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdDocumentView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdDocumentView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ihm.f fVarD = v0.a.d("create(...)");
        this.f58635h = fVarD;
        ihm.f fVarD2 = v0.a.d("create(...)");
        this.i = fVarD2;
        ihm.f fVarD3 = v0.a.d("create(...)");
        this.f58636j = fVarD3;
        ihm.f fVarD4 = v0.a.d("create(...)");
        this.k = fVarD4;
        this.backgroundImage = kli.a.J(R$id.internalIdDocumentView_backgroundImage, this);
        this.documentCountryIcon = kli.a.J(R$id.internalIdDocumentView_documentCountryIcon, this);
        this.documentType = kli.a.J(R$id.internalIdDocumentView_documentType, this);
        this.logo = kli.a.J(R$id.internalIdDocumentView_logo, this);
        this.tag = kli.a.J(R$id.internalIdDocumentView_tag, this);
        this.photo = kli.a.J(R$id.internalIdDocumentView_photo, this);
        this.legalNameLabel = kli.a.J(R$id.internalIdDocumentView_legalNameLabel, this);
        this.legalNameValue = kli.a.J(R$id.internalIdDocumentView_legalNameValue, this);
        this.copyLegalNameIcon = kli.a.J(R$id.internalIdDocumentView_copyLegalNameIcon, this);
        this.documentNumberLabel = kli.a.J(R$id.internalIdDocumentView_documentNumberLabel, this);
        this.documentNumberValue = kli.a.J(R$id.internalIdDocumentView_documentNumberValue, this);
        this.copyDocumentNumberIcon = kli.a.J(R$id.internalIdDocumentView_copyDocumentNumberIcon, this);
        this.dateOfBirthLabel = kli.a.J(R$id.internalIdDocumentView_dateOfBirthLabel, this);
        this.dateOfBirthValue = kli.a.J(R$id.internalIdDocumentView_dateOfBirthValue, this);
        this.copyDateOfBirthIcon = kli.a.J(R$id.internalIdDocumentView_copyDateOfBirthIcon, this);
        this.expiresOnLabel = kli.a.J(R$id.internalIdDocumentView_expiresOnLabel, this);
        this.expiresOnValue = kli.a.J(R$id.internalIdDocumentView_expiresOnValue, this);
        this.copyExpiresOnIcon = kli.a.J(R$id.internalIdDocumentView_copyExpiresOnIcon, this);
        View.inflate(context, R$layout.internal_view_id_document, this);
        setClipToPadding(false);
        setClipToOutline(true);
        setOutlineProvider(new iv0.s(kli.a.k(context, 12.0f), true));
        f0(getCopyLegalNameIcon(), getLegalNameValue(), fVarD);
        f0(getCopyDocumentNumberIcon(), getDocumentNumberValue(), fVarD2);
        f0(getCopyDateOfBirthIcon(), getDateOfBirthValue(), fVarD3);
        f0(getCopyExpiresOnIcon(), getExpiresOnValue(), fVarD4);
    }

    public /* synthetic */ IdDocumentView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
