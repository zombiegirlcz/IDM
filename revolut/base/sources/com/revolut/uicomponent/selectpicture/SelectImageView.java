package com.revolut.uicomponent.selectpicture;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import au0.a2;
import bzl.k;
import com.revolut.core_ui_custom_font.TypefaceTextView;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.R$layout;
import com.revolut.uicomponent.R$styleable;
import com.revolut.uicomponent.selectpicture.SelectImageView;
import edl.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import xyl.c;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/revolut/uicomponent/selectpicture/SelectImageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/ImageView;", "b", "Lkotlin/Lazy;", "getAvatarView", "()Landroid/widget/ImageView;", "avatarView", "Lcom/revolut/core_ui_custom_font/TypefaceTextView;", "f", "getCounterTextView", "()Lcom/revolut/core_ui_custom_font/TypefaceTextView;", "counterTextView", "Lbzl/k;", "g", "getNoteTextWatcher", "()Lbzl/k;", "noteTextWatcher", "Lxyl/c;", "listener", "Lxyl/c;", "getListener", "()Lxyl/c;", "setListener", "(Lxyl/c;)V", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class SelectImageView extends ConstraintLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f107227h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f107228b;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f107229g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectImageView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final k getNoteTextWatcher() {
        return (k) this.f107229g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ImageView getAvatarView() {
        return (ImageView) this.f107228b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final TypefaceTextView getCounterTextView() {
        return (TypefaceTextView) this.f.getValue();
    }

    public final c getListener() {
        return null;
    }

    public final void setListener(c cVar) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImageView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 0;
        this.f107228b = w.y0(new Function0(this) { // from class: xyl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectImageView f309752b;

            {
                this.f309752b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                SelectImageView selectImageView = this.f309752b;
                switch (i3) {
                    case 0:
                        int i5 = SelectImageView.f107227h;
                        View viewFindViewById = selectImageView.findViewById(R$id.avatar);
                        if (viewFindViewById instanceof ImageView) {
                            return (ImageView) viewFindViewById;
                        }
                        return null;
                    case 1:
                        int i6 = SelectImageView.f107227h;
                        View viewFindViewById2 = selectImageView.findViewById(R$id.counter);
                        if (viewFindViewById2 instanceof TypefaceTextView) {
                            return (TypefaceTextView) viewFindViewById2;
                        }
                        return null;
                    default:
                        int i21 = SelectImageView.f107227h;
                        return new k(new a2(selectImageView, 13));
                }
            }
        });
        final int i3 = 1;
        this.f = w.y0(new Function0(this) { // from class: xyl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectImageView f309752b;

            {
                this.f309752b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                SelectImageView selectImageView = this.f309752b;
                switch (i32) {
                    case 0:
                        int i5 = SelectImageView.f107227h;
                        View viewFindViewById = selectImageView.findViewById(R$id.avatar);
                        if (viewFindViewById instanceof ImageView) {
                            return (ImageView) viewFindViewById;
                        }
                        return null;
                    case 1:
                        int i6 = SelectImageView.f107227h;
                        View viewFindViewById2 = selectImageView.findViewById(R$id.counter);
                        if (viewFindViewById2 instanceof TypefaceTextView) {
                            return (TypefaceTextView) viewFindViewById2;
                        }
                        return null;
                    default:
                        int i21 = SelectImageView.f107227h;
                        return new k(new a2(selectImageView, 13));
                }
            }
        });
        final int i5 = 2;
        this.f107229g = w.y0(new Function0(this) { // from class: xyl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectImageView f309752b;

            {
                this.f309752b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                SelectImageView selectImageView = this.f309752b;
                switch (i32) {
                    case 0:
                        int i59 = SelectImageView.f107227h;
                        View viewFindViewById = selectImageView.findViewById(R$id.avatar);
                        if (viewFindViewById instanceof ImageView) {
                            return (ImageView) viewFindViewById;
                        }
                        return null;
                    case 1:
                        int i6 = SelectImageView.f107227h;
                        View viewFindViewById2 = selectImageView.findViewById(R$id.counter);
                        if (viewFindViewById2 instanceof TypefaceTextView) {
                            return (TypefaceTextView) viewFindViewById2;
                        }
                        return null;
                    default:
                        int i21 = SelectImageView.f107227h;
                        return new k(new a2(selectImageView, 13));
                }
            }
        });
        int[] SelectImageView = R$styleable.SelectImageView;
        Intrinsics.checkNotNullExpressionValue(SelectImageView, "SelectImageView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SelectImageView, 0, 0);
        View.inflate(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.SelectImageView_siv_layout, R$layout.view_select_image), this);
        typedArrayObtainStyledAttributes.recycle();
        ((EditText) findViewById(R$id.noteEditor)).addTextChangedListener(getNoteTextWatcher());
        View viewFindViewById = findViewById(R$id.imagePreview);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final int i6 = 0;
        a.s(viewFindViewById, new Function1(this) { // from class: xyl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectImageView f309754b;

            {
                this.f309754b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i21 = i6;
                SelectImageView selectImageView = this.f309754b;
                int i22 = SelectImageView.f107227h;
                switch (i21) {
                    case 0:
                        selectImageView.getClass();
                        break;
                    default:
                        selectImageView.getClass();
                        break;
                }
                return Unit.f186387a;
            }
        });
        View viewFindViewById2 = findViewById(R$id.imageDelete);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final int i21 = 1;
        a.s(viewFindViewById2, new Function1(this) { // from class: xyl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectImageView f309754b;

            {
                this.f309754b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i212 = i21;
                SelectImageView selectImageView = this.f309754b;
                int i22 = SelectImageView.f107227h;
                switch (i212) {
                    case 0:
                        selectImageView.getClass();
                        break;
                    default:
                        selectImageView.getClass();
                        break;
                }
                return Unit.f186387a;
            }
        });
    }

    public /* synthetic */ SelectImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
