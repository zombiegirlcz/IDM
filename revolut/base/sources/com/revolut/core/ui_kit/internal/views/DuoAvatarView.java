package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.AvatarView;
import e8.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.p0;
import mx0.i1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/DuoAvatarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lms0/p0;", "model", "", "setModel", "(Lms0/p0;)V", "Lcom/revolut/core/ui_kit/views/AvatarView;", "b", "Le8/q;", "getAvatarLeft", "()Lcom/revolut/core/ui_kit/views/AvatarView;", "avatarLeft", "f", "getAvatarRight", "avatarRight", "Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "g", "getTagView", "()Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "tagView", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DuoAvatarView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q avatarLeft;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q avatarRight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q tagView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DuoAvatarView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final AvatarView getAvatarLeft() {
        return (AvatarView) this.avatarLeft.f();
    }

    private final AvatarView getAvatarRight() {
        return (AvatarView) this.avatarRight.f();
    }

    private final TagView getTagView() {
        return (TagView) this.tagView.f();
    }

    public final void setModel(@NotNull p0 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        AvatarView avatarLeft = getAvatarLeft();
        AvatarModel.Default r110 = model.f208360a;
        i1 i1Var = i1.SIZE_72_72;
        avatarLeft.setDefaultAvatarStyle$ui_kit_components_release(i1Var);
        avatarLeft.setModel(r110);
        AvatarView avatarRight = getAvatarRight();
        AvatarModel avatarModel = model.f208361b;
        avatarRight.setDefaultAvatarStyle$ui_kit_components_release(i1Var);
        avatarRight.setModel(avatarModel);
        getTagView().setContent(model.f208362c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DuoAvatarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DuoAvatarView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.avatarLeft = kli.a.J(R$id.duoAvatar_iconLeft, this);
        this.avatarRight = kli.a.J(R$id.duoAvatar_iconRight, this);
        this.tagView = kli.a.J(R$id.duoAvatar_tagView, this);
        View.inflate(context, R$layout.internal_duo_avatar_view, this);
    }

    public /* synthetic */ DuoAvatarView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
