package com.revolut.core.ui_kit.internal.sticker;

import a10.b;
import a31.k;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.core.widget.TextViewCompat;
import androidx.palette.graphics.Palette;
import aw0.o9;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.storiesdelegates.StoryColours;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import cx0.c;
import cx0.d;
import dkk.a0;
import dkm.a;
import e8.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import yy0.f;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001ZB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0003\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010\u001eJ\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b'\u0010&J\u0019\u0010(\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b(\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b)\u0010&R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00102\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u001b\u00105\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u001b\u00108\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u0010.R\u001b\u0010;\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b:\u0010.R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010,\u001a\u0004\b>\u0010?R\u001b\u0010C\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010,\u001a\u0004\bB\u0010?R\u001b\u0010F\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010,\u001a\u0004\bE\u0010?R\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010,\u001a\u0004\bI\u0010JR\u001b\u0010N\u001a\u00020<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010,\u001a\u0004\bM\u0010?R\u001b\u0010Q\u001a\u00020<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010,\u001a\u0004\bP\u0010?RF\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010R2\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X¨\u0006["}, d2 = {"Lcom/revolut/core/ui_kit/internal/sticker/StickerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content;", "content", "Lcom/revolut/core/ui_kit/storiesdelegates/StoryColours;", "storyColours", "", "setContent", "(Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content;Lcom/revolut/core/ui_kit/storiesdelegates/StoryColours;)V", "cornerRadiusAttr", "colorAttrRes", "setupRoundedBackground", "(II)V", "Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content$ImageValue;", "setImageValue", "(Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content$ImageValue;)V", "Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content$MerchantSticker;", "setMerchantSticker", "(Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content$MerchantSticker;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setTopLeftImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "setBackgroundImage", "setTopImage", "setBadgeImage", "setStartImage", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setBottomTitle", "setBottomSubtitle", "setValue", "Landroid/widget/TextView;", "f", "Le8/q;", "getTitle", "()Landroid/widget/TextView;", "title", "g", "getBottomTitle", "bottomTitle", "h", "getBottomSubtitle", "bottomSubtitle", "i", "getBottomText", "bottomText", "j", "getValue", "value", "Landroid/widget/ImageView;", "k", "getStartImage", "()Landroid/widget/ImageView;", "startImage", "l", "getTopLeftImage", "topLeftImage", "m", "getBackgroundImage", "backgroundImage", "Landroid/view/View;", "n", "getImageGradient", "()Landroid/view/View;", "imageGradient", "o", "getTopImage", "topImage", "p", "getBadge", "badge", "Lkotlin/Function1;", "q", "Lkotlin/jvm/functions/Function1;", "getBackgroundImageDominantColorListener", "()Lkotlin/jvm/functions/Function1;", "setBackgroundImageDominantColorListener", "(Lkotlin/jvm/functions/Function1;)V", "backgroundImageDominantColorListener", "Content", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f56067s = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f56068b;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q title;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q bottomTitle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q bottomSubtitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q bottomText;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final q value;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final q startImage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final q topLeftImage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final q backgroundImage;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final q imageGradient;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final q topImage;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final q badge;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public Function1 backgroundImageDominantColorListener;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Content f56077r;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content;", "Landroid/os/Parcelable;", "<init>", "()V", "ImageTitleValue", "TitleValue", "ImageValue", "MerchantSticker", "Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content$ImageTitleValue;", "Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content$ImageValue;", "Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content$MerchantSticker;", "Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content$TitleValue;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Content implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content$ImageTitleValue;", "Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ImageTitleValue extends Content {

            @NotNull
            public static final Parcelable.Creator<ImageTitleValue> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f56078a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Image f56079b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Clause f56080c;
            public final Image d;
            public final Clause e;
            public final boolean f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ImageTitleValue((Clause) parcel.readParcelable(ImageTitleValue.class.getClassLoader()), (Image) parcel.readParcelable(ImageTitleValue.class.getClassLoader()), (Clause) parcel.readParcelable(ImageTitleValue.class.getClassLoader()), (Image) parcel.readParcelable(ImageTitleValue.class.getClassLoader()), (Clause) parcel.readParcelable(ImageTitleValue.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ImageTitleValue[i];
                }
            }

            public ImageTitleValue(Clause value, Image topImage, Clause title, Image image, Clause clause, boolean z) {
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(topImage, "topImage");
                Intrinsics.checkNotNullParameter(title, "title");
                this.f56078a = value;
                this.f56079b = topImage;
                this.f56080c = title;
                this.d = image;
                this.e = clause;
                this.f = z;
            }

            public static ImageTitleValue a(ImageTitleValue imageTitleValue) {
                Clause value = imageTitleValue.f56078a;
                Image topImage = imageTitleValue.f56079b;
                Clause title = imageTitleValue.f56080c;
                Image image = imageTitleValue.d;
                Clause clause = imageTitleValue.e;
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(topImage, "topImage");
                Intrinsics.checkNotNullParameter(title, "title");
                return new ImageTitleValue(value, topImage, title, image, clause, true);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ImageTitleValue)) {
                    return false;
                }
                ImageTitleValue imageTitleValue = (ImageTitleValue) obj2;
                return Intrinsics.f(this.f56078a, imageTitleValue.f56078a) && Intrinsics.f(this.f56079b, imageTitleValue.f56079b) && Intrinsics.f(this.f56080c, imageTitleValue.f56080c) && Intrinsics.f(this.d, imageTitleValue.d) && Intrinsics.f(this.e, imageTitleValue.e) && this.f == imageTitleValue.f;
            }

            public final int hashCode() {
                int iA = p.a.a(b.c(this.f56079b, this.f56078a.hashCode() * 31, 31), 31, this.f56080c);
                Image image = this.d;
                int iHashCode = (iA + (image == null ? 0 : image.hashCode())) * 31;
                Clause clause = this.e;
                return Boolean.hashCode(this.f) + ((iHashCode + (clause != null ? clause.hashCode() : 0)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f56078a, i);
                dest.writeParcelable(this.f56079b, i);
                dest.writeParcelable(this.f56080c, i);
                dest.writeParcelable(this.d, i);
                dest.writeParcelable(this.e, i);
                dest.writeInt(this.f ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content$ImageValue;", "Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ImageValue extends Content {

            @NotNull
            public static final Parcelable.Creator<ImageValue> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f56081a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Image f56082b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ImageValue((Clause) parcel.readParcelable(ImageValue.class.getClassLoader()), (Image) parcel.readParcelable(ImageValue.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ImageValue[i];
                }
            }

            public ImageValue(Clause value, Image startImage) {
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(startImage, "startImage");
                this.f56081a = value;
                this.f56082b = startImage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ImageValue)) {
                    return false;
                }
                ImageValue imageValue = (ImageValue) obj2;
                return Intrinsics.f(this.f56081a, imageValue.f56081a) && Intrinsics.f(this.f56082b, imageValue.f56082b);
            }

            public final int hashCode() {
                return this.f56082b.hashCode() + (this.f56081a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f56081a, i);
                dest.writeParcelable(this.f56082b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content$MerchantSticker;", "Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MerchantSticker extends Content {

            @NotNull
            public static final Parcelable.Creator<MerchantSticker> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Image f56083a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Image f56084b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Clause f56085c;
            public final Clause d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new MerchantSticker((Clause) parcel.readParcelable(MerchantSticker.class.getClassLoader()), (Clause) parcel.readParcelable(MerchantSticker.class.getClassLoader()), (Image) parcel.readParcelable(MerchantSticker.class.getClassLoader()), (Image) parcel.readParcelable(MerchantSticker.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MerchantSticker[i];
                }
            }

            public MerchantSticker(Clause bottomTitle, Clause clause, Image topLeftImage, Image background) {
                Intrinsics.checkNotNullParameter(topLeftImage, "topLeftImage");
                Intrinsics.checkNotNullParameter(background, "background");
                Intrinsics.checkNotNullParameter(bottomTitle, "bottomTitle");
                this.f56083a = topLeftImage;
                this.f56084b = background;
                this.f56085c = bottomTitle;
                this.d = clause;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof MerchantSticker)) {
                    return false;
                }
                MerchantSticker merchantSticker = (MerchantSticker) obj2;
                return Intrinsics.f(this.f56083a, merchantSticker.f56083a) && Intrinsics.f(this.f56084b, merchantSticker.f56084b) && Intrinsics.f(this.f56085c, merchantSticker.f56085c) && Intrinsics.f(this.d, merchantSticker.d);
            }

            public final int hashCode() {
                int iA = p.a.a(b.c(this.f56084b, this.f56083a.hashCode() * 31, 31), 31, this.f56085c);
                Clause clause = this.d;
                return iA + (clause == null ? 0 : clause.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f56083a, i);
                dest.writeParcelable(this.f56084b, i);
                dest.writeParcelable(this.f56085c, i);
                dest.writeParcelable(this.d, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content$TitleValue;", "Lcom/revolut/core/ui_kit/internal/sticker/StickerView$Content;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TitleValue extends Content {

            @NotNull
            public static final Parcelable.Creator<TitleValue> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f56086a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f56087b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Clause f56088c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TitleValue((Clause) parcel.readParcelable(TitleValue.class.getClassLoader()), (Clause) parcel.readParcelable(TitleValue.class.getClassLoader()), (Clause) parcel.readParcelable(TitleValue.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TitleValue[i];
                }
            }

            public TitleValue(Clause value, Clause title, Clause clause) {
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(title, "title");
                this.f56086a = value;
                this.f56087b = title;
                this.f56088c = clause;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof TitleValue)) {
                    return false;
                }
                TitleValue titleValue = (TitleValue) obj2;
                return Intrinsics.f(this.f56086a, titleValue.f56086a) && Intrinsics.f(this.f56087b, titleValue.f56087b) && Intrinsics.f(this.f56088c, titleValue.f56088c);
            }

            public final int hashCode() {
                int iA = p.a.a(this.f56086a.hashCode() * 31, 31, this.f56087b);
                Clause clause = this.f56088c;
                return iA + (clause == null ? 0 : clause.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f56086a, i);
                dest.writeParcelable(this.f56087b, i);
                dest.writeParcelable(this.f56088c, i);
            }
        }

        private Content() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StickerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getBackgroundImage() {
        return (ImageView) this.backgroundImage.f();
    }

    private final TextView getBottomSubtitle() {
        return (TextView) this.bottomSubtitle.f();
    }

    private final TextView getBottomText() {
        return (TextView) this.bottomText.f();
    }

    private final TextView getBottomTitle() {
        return (TextView) this.bottomTitle.f();
    }

    private final View getImageGradient() {
        return this.imageGradient.f();
    }

    private final ImageView getStartImage() {
        return (ImageView) this.startImage.f();
    }

    private final TextView getTitle() {
        return (TextView) this.title.f();
    }

    private final ImageView getTopLeftImage() {
        return (ImageView) this.topLeftImage.f();
    }

    private final TextView getValue() {
        return (TextView) this.value.f();
    }

    private final void setBackgroundImage(Image image) {
        if (image == null) {
            getBackgroundImage().setVisibility(8);
            return;
        }
        f.e(u.k(this).Q(), image, getBackgroundImage(), new a(1, this, StickerView.class, "emitBackgroundImageDominantColor", "emitBackgroundImageDominantColor(Landroid/graphics/drawable/Drawable;)V", 0, 9), null, 8);
        getBackgroundImage().setVisibility(0);
    }

    private final void setBadgeImage(Image image) {
        f.e(u.k(this).Q(), image, getBadge(), null, null, 8);
    }

    private final void setBottomSubtitle(Clause clause) {
        if (clause == null) {
            getBottomSubtitle().setVisibility(8);
        } else {
            getBottomSubtitle().setVisibility(0);
            h0(getBottomSubtitle(), clause);
        }
    }

    private final void setBottomTitle(Clause clause) {
        if (clause == null) {
            getBottomTitle().setVisibility(8);
        } else {
            getBottomTitle().setVisibility(0);
            h0(getBottomTitle(), clause);
        }
    }

    private final void setImageValue(Content.ImageValue content) {
        getStartImage().setVisibility(0);
        getTopImage().setVisibility(8);
        getBadge().setVisibility(8);
        getTopImage().setImageDrawable(null);
        setValue(content.f56081a);
        setTitle(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        getTitle().setVisibility(8);
        setStartImage(content.f56082b);
    }

    private final void setMerchantSticker(Content.MerchantSticker content) {
        getStartImage().setVisibility(8);
        getStartImage().setImageDrawable(null);
        getTopImage().setVisibility(8);
        getBadge().setVisibility(8);
        getTopLeftImage().setVisibility(0);
        getTitle().setVisibility(0);
        setTopLeftImage(content.f56083a);
        setBottomTitle(content.f56085c);
        setBottomSubtitle(content.d);
        setBackgroundImage(content.f56084b);
        if (getImageGradient().getVisibility() == 0 && getImageGradient().getBackground() == null) {
            View imageGradient = getImageGradient();
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iS = kli.a.s(R$attr.uikit_colorTransparent, context);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            imageGradient.setBackground(new GradientDrawable(orientation, new int[]{iS, kli.a.s(R$attr.uikit_colorBlack_60, context2)}));
        }
    }

    private final void setStartImage(Image image) {
        f.e(u.k(this).Q(), image, getStartImage(), null, null, 8);
    }

    private final void setTitle(Clause clause) {
        h0(getTitle(), clause);
    }

    private final void setTopImage(Image image) {
        f.e(u.k(this).Q(), image, getTopImage(), null, null, 8);
    }

    private final void setTopLeftImage(Image image) {
        f.e(u.k(this).Q(), image, getTopLeftImage(), null, null, 8);
    }

    private final void setValue(Clause clause) {
        h0(getValue(), clause);
    }

    public static /* synthetic */ void setupRoundedBackground$default(StickerView stickerView, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i2 = R$attr.uikit_colorWidgetBackground;
        }
        stickerView.setupRoundedBackground(i, i2);
    }

    public final void f0(Drawable drawable) {
        Bitmap bitmap$default;
        Function1 function1 = this.backgroundImageDominantColorListener;
        if (function1 != null) {
            k kVar = new k(13, function1);
            if (drawable == null || (bitmap$default = DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null)) == null) {
                return;
            }
            Palette.from(bitmap$default).generate(new a0(kVar, 11));
        }
    }

    public final void g0(Clause clause, StoryColours storyColours) {
        if (clause == null) {
            getBottomText().setVisibility(8);
            return;
        }
        getBottomText().setVisibility(0);
        h0(getBottomText(), clause);
        i0(getBottomText(), storyColours.i);
    }

    public final Function1<Integer, Unit> getBackgroundImageDominantColorListener() {
        return this.backgroundImageDominantColorListener;
    }

    @NotNull
    public final ImageView getBadge() {
        return (ImageView) this.badge.f();
    }

    @NotNull
    public final ImageView getTopImage() {
        return (ImageView) this.topImage.f();
    }

    public final void h0(TextView textView, Clause clause) {
        ty0.c.b(u.k(this).b0(), clause, textView, null, null, 12);
    }

    public final void i0(TextView textView, int i) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(kli.a.s(i, context));
    }

    public final void j0(Content.TitleValue titleValue, StoryColours storyColours) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(kli.a.s(storyColours.f58281h, context));
        getTitle().setVisibility(0);
        getTopImage().setVisibility(8);
        getBadge().setVisibility(8);
        getStartImage().setVisibility(8);
        setValue(titleValue.f56086a);
        setTitle(titleValue.f56087b);
        g0(titleValue.f56088c, storyColours);
        TextView value = getValue();
        int i = storyColours.i;
        i0(value, i);
        i0(getTitle(), i);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float dimension = getValue().getContext().getResources().getDimension(R$dimen.internal_H0_text_size);
        float dimension2 = getValue().getContext().getResources().getDimension(R$dimen.internal_H1_text_size);
        getValue();
        TextViewCompat.setAutoSizeTextTypeWithDefaults(getValue(), 0);
        getValue().setTextSize(0, dimension);
        super.onMeasure(i, i2);
        getValue();
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(getValue(), (int) dimension2, (int) dimension, 1, 0);
        getValue().measure(View.MeasureSpec.makeMeasureSpec(getValue().getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        getValue();
        float textSize = getValue().getTextSize();
        TextViewCompat.setAutoSizeTextTypeWithDefaults(getValue(), 0);
        getValue().setTextSize(0, textSize);
        super.onMeasure(i, i2);
        Content content = this.f56077r;
        if (content == null) {
            Intrinsics.r("content");
            throw null;
        }
        if (content instanceof Content.MerchantSticker) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, 362.0f);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(kli.a.k(context2, 289.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(iK, 1073741824));
        }
    }

    public final void setBackgroundImageDominantColorListener(Function1<? super Integer, Unit> function1) {
        this.backgroundImageDominantColorListener = function1;
        f0(getBackgroundImage().getDrawable());
    }

    public final void setContent(@NotNull Content content, @NotNull StoryColours storyColours) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(storyColours, "storyColours");
        this.f56077r = content;
        getTitle().setVisibility(0);
        boolean z = content instanceof Content.MerchantSticker;
        getImageGradient().setVisibility(z ? 0 : 8);
        if (getContext().getResources().getConfiguration().smallestScreenWidthDp < 360) {
            if (content instanceof Content.ImageTitleValue) {
                Content.ImageTitleValue imageTitleValue = (Content.ImageTitleValue) content;
                j0(new Content.TitleValue(imageTitleValue.f56078a, imageTitleValue.f56080c, null), storyColours);
                return;
            } else if (content instanceof Content.ImageValue) {
                setValue(((Content.ImageValue) content).f56081a);
                return;
            } else if (content instanceof Content.TitleValue) {
                j0((Content.TitleValue) content, storyColours);
                return;
            } else {
                if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
                setMerchantSticker((Content.MerchantSticker) content);
                return;
            }
        }
        if (!(content instanceof Content.ImageTitleValue)) {
            if (content instanceof Content.ImageValue) {
                setImageValue((Content.ImageValue) content);
                return;
            } else if (content instanceof Content.TitleValue) {
                j0((Content.TitleValue) content, storyColours);
                return;
            } else {
                if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
                setMerchantSticker((Content.MerchantSticker) content);
                return;
            }
        }
        Content.ImageTitleValue imageTitleValue2 = (Content.ImageTitleValue) content;
        boolean z3 = imageTitleValue2.f;
        Image image = imageTitleValue2.d;
        boolean z4 = z3 && getBadge().getVisibility() != 0;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i = storyColours.f58281h;
        int i2 = storyColours.i;
        setBackgroundColor(kli.a.s(i, context));
        getStartImage().setVisibility(8);
        getStartImage().setImageDrawable(null);
        getTopImage().setVisibility(0);
        getBadge().setVisibility(image != null ? 0 : 8);
        getTitle().setVisibility(0);
        setValue(imageTitleValue2.f56078a);
        i0(getValue(), i2);
        setTitle(imageTitleValue2.f56080c);
        i0(getTitle(), i2);
        setTopImage(imageTitleValue2.f56079b);
        if (image != null) {
            setBadgeImage(image);
        }
        g0(imageTitleValue2.e, storyColours);
        if (z4) {
            ImageView badge = getBadge();
            c cVar = this.f56068b;
            cVar.a(badge, 0L);
            ImageView view = getTopImage();
            Intrinsics.checkNotNullParameter(view, "view");
            if (view.getTag() instanceof d) {
                return;
            }
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            c.a aVar = c.Companion;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(cVar.d(view, 1.0f, 0.9f, 150L, 0L), cVar.d(view, 0.9f, 1.0f, 150L, 150L));
            c.a.a(aVar, animatorSet, view);
        }
    }

    public final void setupRoundedBackground(int cornerRadiusAttr, int colorAttrRes) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iW = kli.a.w(cornerRadiusAttr, context);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = iW;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        shapeDrawable.setColorFilter(new PorterDuffColorFilter(kli.a.s(colorAttrRes, context2), PorterDuff.Mode.SRC_IN));
        setBackground(shapeDrawable);
        u.v(cornerRadiusAttr, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StickerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56068b = new c();
        this.title = kli.a.J(R$id.stickerView_title, this);
        this.bottomTitle = kli.a.J(R$id.stickerView_bottomTitle, this);
        this.bottomSubtitle = kli.a.J(R$id.stickerView_bottomSubtitle, this);
        this.bottomText = kli.a.J(R$id.stickerView_bottomText, this);
        this.value = kli.a.J(R$id.stickerView_value, this);
        this.startImage = kli.a.J(R$id.stickerView_startImage, this);
        this.topLeftImage = kli.a.J(R$id.stickerView_topLeftImage, this);
        this.backgroundImage = kli.a.J(R$id.stickerView_backgroundImage, this);
        this.imageGradient = kli.a.J(R$id.stickerView_imageGradient, this);
        this.topImage = kli.a.J(R$id.stickerView_topImage, this);
        this.badge = kli.a.J(R$id.stickerView_badge, this);
        View.inflate(context, R$layout.internal_view_sticker, this);
        setupRoundedBackground$default(this, R$attr.uikit_dp16, 0, 2, null);
    }

    public /* synthetic */ StickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
