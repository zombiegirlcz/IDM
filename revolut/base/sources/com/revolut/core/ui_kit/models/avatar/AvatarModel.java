package com.revolut.core.ui_kit.models.avatar;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.gradients.UiKitGradient;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;", "Landroid/os/Parcelable;", "<init>", "()V", "AvatarImage", "Default", "Layered", "Card", "AddCard", "SegmentedProgress", "Builder", "GridImage", "TimeProgress", "BadgeModel", "BottomDecoration", "Border", "State", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$AddCard;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Builder;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Card;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Default;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$GridImage;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Layered;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$SegmentedProgress;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$TimeProgress;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AvatarModel implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final State.Enabled f57988a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$AddCard;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddCard extends AvatarModel {

        @NotNull
        public static final Parcelable.Creator<AddCard> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f57989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f57990c;
        public final AvatarImage.SingleImage d;
        public final float e;
        public final float f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddCard((Image) parcel.readParcelable(AddCard.class.getClassLoader()), (Image) parcel.readParcelable(AddCard.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddCard[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddCard(Image image, Image image2) {
            super(0);
            Intrinsics.checkNotNullParameter(image, "image");
            this.f57989b = image;
            this.f57990c = image2;
            this.d = new AvatarImage.SingleImage(image);
            this.e = 47.0f;
            this.f = 72.0f;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: T, reason: from getter */
        public final Image getF57990c() {
            return this.f57990c;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        public final AvatarImage a() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddCard)) {
                return false;
            }
            AddCard addCard = (AddCard) obj2;
            return Intrinsics.f(this.f57989b, addCard.f57989b) && Intrinsics.f(this.f57990c, addCard.f57990c);
        }

        public final int hashCode() {
            int iHashCode = this.f57989b.hashCode() * 31;
            Image image = this.f57990c;
            return iHashCode + (image == null ? 0 : image.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f57989b, i);
            dest.writeParcelable(this.f57990c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$AvatarImage;", "Landroid/os/Parcelable;", "<init>", "()V", "SingleImage", "LayeredImage", "GridImage", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$AvatarImage$GridImage;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$AvatarImage$LayeredImage;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$AvatarImage$SingleImage;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class AvatarImage implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$AvatarImage$GridImage;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$AvatarImage;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GridImage extends AvatarImage {

            @NotNull
            public static final Parcelable.Creator<GridImage> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Image f57991a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Image f57992b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Image f57993c;
            public final Image d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new GridImage((Image) parcel.readParcelable(GridImage.class.getClassLoader()), (Image) parcel.readParcelable(GridImage.class.getClassLoader()), (Image) parcel.readParcelable(GridImage.class.getClassLoader()), (Image) parcel.readParcelable(GridImage.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new GridImage[i];
                }
            }

            public GridImage(Image topStart, Image topEnd, Image image, Image image2) {
                Intrinsics.checkNotNullParameter(topStart, "topStart");
                Intrinsics.checkNotNullParameter(topEnd, "topEnd");
                this.f57991a = topStart;
                this.f57992b = topEnd;
                this.f57993c = image;
                this.d = image2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof GridImage)) {
                    return false;
                }
                GridImage gridImage = (GridImage) obj2;
                return Intrinsics.f(this.f57991a, gridImage.f57991a) && Intrinsics.f(this.f57992b, gridImage.f57992b) && Intrinsics.f(this.f57993c, gridImage.f57993c) && Intrinsics.f(this.d, gridImage.d);
            }

            public final int hashCode() {
                int iC = a10.b.c(this.f57992b, this.f57991a.hashCode() * 31, 31);
                Image image = this.f57993c;
                int iHashCode = (iC + (image == null ? 0 : image.hashCode())) * 31;
                Image image2 = this.d;
                return iHashCode + (image2 != null ? image2.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f57991a, i);
                dest.writeParcelable(this.f57992b, i);
                dest.writeParcelable(this.f57993c, i);
                dest.writeParcelable(this.d, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$AvatarImage$LayeredImage;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$AvatarImage;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/models/avatar/a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LayeredImage extends AvatarImage {

            @NotNull
            public static final Parcelable.Creator<LayeredImage> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f57994a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Image f57995b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final com.revolut.core.ui_kit.models.avatar.a f57996c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(LayeredImage.class, parcel, arrayList, iE, 1);
                    }
                    return new LayeredImage(arrayList, (Image) parcel.readParcelable(LayeredImage.class.getClassLoader()), com.revolut.core.ui_kit.models.avatar.a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LayeredImage[i];
                }
            }

            public LayeredImage(List images, Image image, com.revolut.core.ui_kit.models.avatar.a style) {
                Intrinsics.checkNotNullParameter(images, "images");
                Intrinsics.checkNotNullParameter(style, "style");
                this.f57994a = images;
                this.f57995b = image;
                this.f57996c = style;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof LayeredImage)) {
                    return false;
                }
                LayeredImage layeredImage = (LayeredImage) obj2;
                return Intrinsics.f(this.f57994a, layeredImage.f57994a) && Intrinsics.f(this.f57995b, layeredImage.f57995b) && this.f57996c == layeredImage.f57996c;
            }

            public final int hashCode() {
                int iHashCode = this.f57994a.hashCode() * 31;
                Image image = this.f57995b;
                return this.f57996c.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = p.a.v(this.f57994a, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
                dest.writeParcelable(this.f57995b, i);
                dest.writeString(this.f57996c.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$AvatarImage$SingleImage;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$AvatarImage;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SingleImage extends AvatarImage {

            @NotNull
            public static final Parcelable.Creator<SingleImage> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Image f57997a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SingleImage((Image) parcel.readParcelable(SingleImage.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SingleImage[i];
                }
            }

            public SingleImage(Image image) {
                Intrinsics.checkNotNullParameter(image, "image");
                this.f57997a = image;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SingleImage) && Intrinsics.f(this.f57997a, ((SingleImage) obj2).f57997a);
            }

            public final int hashCode() {
                return this.f57997a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f57997a, i);
            }
        }

        private AvatarImage() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$BadgeModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/models/avatar/b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BadgeModel implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<BadgeModel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CircleBadgeModel f57998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f57999b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BadgeModel((CircleBadgeModel) parcel.readParcelable(BadgeModel.class.getClassLoader()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BadgeModel[i];
            }
        }

        public BadgeModel(CircleBadgeModel badge, b position) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(position, "position");
            this.f57998a = badge;
            this.f57999b = position;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BadgeModel)) {
                return false;
            }
            BadgeModel badgeModel = (BadgeModel) obj2;
            return Intrinsics.f(this.f57998a, badgeModel.f57998a) && this.f57999b == badgeModel.f57999b;
        }

        public final int hashCode() {
            return this.f57999b.hashCode() + (this.f57998a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f57998a, i);
            dest.writeString(this.f57999b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Border;", "Landroid/os/Parcelable;", "AnimatedGradient", "StaticGradient", "com/revolut/core/ui_kit/models/avatar/c", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Border$AnimatedGradient;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Border$StaticGradient;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Border extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Border$AnimatedGradient;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Border;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AnimatedGradient implements Border {

            @NotNull
            public static final Parcelable.Creator<AnimatedGradient> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f58000a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final c f58001b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(Integer.valueOf(parcel.readInt()));
                    }
                    return new AnimatedGradient(arrayList, c.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AnimatedGradient[i];
                }
            }

            public AnimatedGradient(List colorsAttrs, c shape) {
                Intrinsics.checkNotNullParameter(colorsAttrs, "colorsAttrs");
                Intrinsics.checkNotNullParameter(shape, "shape");
                this.f58000a = colorsAttrs;
                this.f58001b = shape;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AnimatedGradient)) {
                    return false;
                }
                AnimatedGradient animatedGradient = (AnimatedGradient) obj2;
                return Intrinsics.f(this.f58000a, animatedGradient.f58000a) && this.f58001b == animatedGradient.f58001b;
            }

            @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel.Border
            /* JADX INFO: renamed from: g4, reason: from getter */
            public final c getF58003b() {
                return this.f58001b;
            }

            public final int hashCode() {
                return this.f58001b.hashCode() + (this.f58000a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = p.a.v(this.f58000a, dest);
                while (itV.hasNext()) {
                    dest.writeInt(((Number) itV.next()).intValue());
                }
                dest.writeString(this.f58001b.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Border$StaticGradient;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Border;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StaticGradient implements Border {

            @NotNull
            public static final Parcelable.Creator<StaticGradient> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UiKitGradient f58002a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final c f58003b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new StaticGradient(UiKitGradient.CREATOR.createFromParcel(parcel), c.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new StaticGradient[i];
                }
            }

            public StaticGradient(UiKitGradient gradient, c shape) {
                Intrinsics.checkNotNullParameter(gradient, "gradient");
                Intrinsics.checkNotNullParameter(shape, "shape");
                this.f58002a = gradient;
                this.f58003b = shape;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof StaticGradient)) {
                    return false;
                }
                StaticGradient staticGradient = (StaticGradient) obj2;
                return Intrinsics.f(this.f58002a, staticGradient.f58002a) && this.f58003b == staticGradient.f58003b;
            }

            @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel.Border
            /* JADX INFO: renamed from: g4, reason: from getter */
            public final c getF58003b() {
                return this.f58003b;
            }

            public final int hashCode() {
                return this.f58003b.hashCode() + (this.f58002a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f58002a.writeToParcel(dest, i);
                dest.writeString(this.f58003b.name());
            }
        }

        /* JADX INFO: renamed from: g4 */
        c getF58003b();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$BottomDecoration;", "Landroid/os/Parcelable;", "Tag", "Badge", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$BottomDecoration$Badge;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$BottomDecoration$Tag;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface BottomDecoration extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$BottomDecoration$Badge;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$BottomDecoration;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Badge implements BottomDecoration {

            @NotNull
            public static final Parcelable.Creator<Badge> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Image f58004a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Badge((Image) parcel.readParcelable(Badge.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Badge[i];
                }
            }

            public Badge(Image image) {
                Intrinsics.checkNotNullParameter(image, "image");
                this.f58004a = image;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Badge) && Intrinsics.f(this.f58004a, ((Badge) obj2).f58004a);
            }

            public final int hashCode() {
                return this.f58004a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f58004a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$BottomDecoration$Tag;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$BottomDecoration;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Tag implements BottomDecoration {

            @NotNull
            public static final Parcelable.Creator<Tag> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TagViewData f58005a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Tag(TagViewData.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Tag[i];
                }
            }

            public Tag(TagViewData tag2) {
                Intrinsics.checkNotNullParameter(tag2, "tag");
                this.f58005a = tag2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Tag) && Intrinsics.f(this.f58005a, ((Tag) obj2).f58005a);
            }

            public final int hashCode() {
                return this.f58005a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f58005a.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Builder;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Builder extends AvatarModel {

        @NotNull
        public static final Parcelable.Creator<Builder> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f58006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f58007c;
        public final State d;
        public final AvatarImage.LayeredImage e;
        public final float f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f58008g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Builder.class, parcel, arrayList, iE, 1);
                }
                return new Builder(arrayList, (Image) parcel.readParcelable(Builder.class.getClassLoader()), (State) parcel.readParcelable(Builder.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Builder[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(ArrayList images, Image image, State state) {
            super(0);
            Intrinsics.checkNotNullParameter(images, "images");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f58006b = images;
            this.f58007c = image;
            this.d = state;
            this.e = new AvatarImage.LayeredImage(images, image, com.revolut.core.ui_kit.models.avatar.a.UNCLIPPED);
            this.f = 216.0f;
            this.f58008g = 216.0f;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: W, reason: from getter */
        public final State getE() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        public final AvatarImage a() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj2;
            return this.f58006b.equals(builder.f58006b) && Intrinsics.f(this.f58007c, builder.f58007c) && Intrinsics.f(this.d, builder.d);
        }

        public final int hashCode() {
            int iHashCode = this.f58006b.hashCode() * 31;
            Image image = this.f58007c;
            return this.d.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f58006b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeParcelable(this.f58007c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$GridImage;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GridImage extends AvatarModel {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f58026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f58027c;
        public final Image d;
        public final Image e;
        public final CircleBadgeModel f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AvatarImage.GridImage f58028g;

        @NotNull
        public static final Parcelable.Creator<GridImage> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GridImage((Image) parcel.readParcelable(GridImage.class.getClassLoader()), (Image) parcel.readParcelable(GridImage.class.getClassLoader()), (Image) parcel.readParcelable(GridImage.class.getClassLoader()), (Image) parcel.readParcelable(GridImage.class.getClassLoader()), (CircleBadgeModel) parcel.readParcelable(GridImage.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GridImage[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GridImage(Image topStart, Image topEnd, Image image, Image image2, CircleBadgeModel circleBadgeModel) {
            super(0);
            Intrinsics.checkNotNullParameter(topStart, "topStart");
            Intrinsics.checkNotNullParameter(topEnd, "topEnd");
            this.f58026b = topStart;
            this.f58027c = topEnd;
            this.d = image;
            this.e = image2;
            this.f = circleBadgeModel;
            this.f58028g = new AvatarImage.GridImage(topStart, topEnd, image, image2);
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        public final AvatarImage a() {
            return this.f58028g;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final CircleBadgeModel getK() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GridImage)) {
                return false;
            }
            GridImage gridImage = (GridImage) obj2;
            return Intrinsics.f(this.f58026b, gridImage.f58026b) && Intrinsics.f(this.f58027c, gridImage.f58027c) && Intrinsics.f(this.d, gridImage.d) && Intrinsics.f(this.e, gridImage.e) && Intrinsics.f(this.f, gridImage.f);
        }

        public final int hashCode() {
            int iC = a10.b.c(this.f58027c, this.f58026b.hashCode() * 31, 31);
            Image image = this.d;
            int iHashCode = (iC + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.e;
            int iHashCode2 = (iHashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
            CircleBadgeModel circleBadgeModel = this.f;
            return iHashCode2 + (circleBadgeModel != null ? circleBadgeModel.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f58026b, i);
            dest.writeParcelable(this.f58027c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$SegmentedProgress;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SegmentedProgress extends AvatarModel {

        @NotNull
        public static final Parcelable.Creator<SegmentedProgress> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f58036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f58037c;
        public final ProgressStyle d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SegmentedProgress(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SegmentedProgress[i];
            }
        }

        public SegmentedProgress(int i, int i2) {
            super(0);
            this.f58036b = i;
            this.f58037c = i2;
            this.d = new ProgressStyle(i, i2, 0, 0, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, ViewUtils.EDGE_TO_EDGE_FLAGS);
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: J, reason: from getter */
        public final ProgressStyle getF58044h() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        public final AvatarImage a() {
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SegmentedProgress)) {
                return false;
            }
            SegmentedProgress segmentedProgress = (SegmentedProgress) obj2;
            return this.f58036b == segmentedProgress.f58036b && this.f58037c == segmentedProgress.f58037c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f58037c) + (Integer.hashCode(this.f58036b) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f58036b);
            dest.writeInt(this.f58037c);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$State;", "Landroid/os/Parcelable;", "Enabled", "DisabledExceptBadge", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$State$DisabledExceptBadge;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$State$Enabled;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface State extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$State$DisabledExceptBadge;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$State;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class DisabledExceptBadge implements State {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final DisabledExceptBadge f58038a = new DisabledExceptBadge();

            @NotNull
            public static final Parcelable.Creator<DisabledExceptBadge> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DisabledExceptBadge.f58038a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DisabledExceptBadge[i];
                }
            }

            private DisabledExceptBadge() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$State$Enabled;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$State;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Enabled implements State {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Enabled f58039a = new Enabled();

            @NotNull
            public static final Parcelable.Creator<Enabled> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Enabled.f58039a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Enabled[i];
                }
            }

            private Enabled() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$TimeProgress;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TimeProgress extends AvatarModel {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f58041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f58042c;
        public final long d;
        public final State e;
        public final Border f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AvatarImage.SingleImage f58043g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ProgressStyle f58044h;
        public final BottomDecoration.Tag i;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<TimeProgress> CREATOR = new b();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f58040j = R$attr.uikit_colorGrey50;
        public static final int k = R$attr.uikit_colorWhite;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.models.avatar.AvatarModel$TimeProgress$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TimeProgress((Image) parcel.readParcelable(TimeProgress.class.getClassLoader()), parcel.readLong(), parcel.readLong(), (State) parcel.readParcelable(TimeProgress.class.getClassLoader()), (Border) parcel.readParcelable(TimeProgress.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TimeProgress[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TimeProgress(Image image, long j2, long j3, State state, Border border) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(state, "state");
            int i = 0;
            super(i);
            this.f58041b = image;
            this.f58042c = j2;
            this.d = j3;
            this.e = state;
            this.f = border;
            this.f58043g = new AvatarImage.SingleImage(image);
            int i2 = (int) j2;
            ProgressStyle.INSTANCE.getClass();
            int i3 = R$attr.uikit_colorWhite;
            this.f58044h = new ProgressStyle(i2, i2, i3, i3, R$attr.uikit_colorGreyTone10, 2.0f, 2.0f, null, 256);
            TagViewData.Companion companion = TagViewData.INSTANCE;
            TimeClause timeClause = new TimeClause(j2, new TimeClause.Format.Duration(i), null, null, 12);
            companion.getClass();
            this.i = new BottomDecoration.Tag(TagViewData.Companion.b(f58040j, k, timeClause, null));
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: J, reason: from getter */
        public final ProgressStyle getF58044h() {
            return this.f58044h;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: W, reason: from getter */
        public final State getE() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        public final AvatarImage a() {
            return this.f58043g;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Border getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: e */
        public final BottomDecoration getF58031g() {
            return this.i;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TimeProgress)) {
                return false;
            }
            TimeProgress timeProgress = (TimeProgress) obj2;
            return Intrinsics.f(this.f58041b, timeProgress.f58041b) && this.f58042c == timeProgress.f58042c && this.d == timeProgress.d && Intrinsics.f(this.e, timeProgress.e) && Intrinsics.f(this.f, timeProgress.f);
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + a0.d.c(a0.d.c(this.f58041b.hashCode() * 31, 31, this.f58042c), 31, this.d)) * 31;
            Border border = this.f;
            return iHashCode + (border == null ? 0 : border.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f58041b, i);
            dest.writeLong(this.f58042c);
            dest.writeLong(this.d);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
        }
    }

    public /* synthetic */ AvatarModel(int i) {
        this();
    }

    /* JADX INFO: renamed from: J */
    public ProgressStyle getF58044h() {
        return null;
    }

    /* JADX INFO: renamed from: T */
    public Image getF57990c() {
        return null;
    }

    /* JADX INFO: renamed from: W */
    public State getE() {
        return this.f57988a;
    }

    public abstract AvatarImage a();

    /* JADX INFO: renamed from: b */
    public LottieImage getF58025j() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public Border getF() {
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public CircleBadgeModel getF58035m() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public CircleBadgeModel getK() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public BottomDecoration getF58031g() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public CircleBadgeModel getF58034l() {
        return null;
    }

    /* JADX INFO: renamed from: z */
    public GlyphImage getK() {
        return null;
    }

    private AvatarModel() {
        this.f57988a = State.Enabled.f58039a;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Card;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;", "", "toString", "()Ljava/lang/String;", "Overlay", "com/revolut/core/ui_kit/models/avatar/d", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Card extends AvatarModel {

        @NotNull
        public static final Parcelable.Creator<Card> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f58009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final State f58010c;
        public final Overlay d;
        public final d e;
        public final AvatarImage.SingleImage f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Border f58011g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CircleBadgeModel f58012h;
        public final CircleBadgeModel i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final CircleBadgeModel f58013j;
        public final GlyphImage k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final float f58014l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final float f58015m;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Card$Overlay;", "Landroid/os/Parcelable;", "None", "Badges", "MiddleIcon", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Card$Overlay$Badges;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Card$Overlay$MiddleIcon;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Card$Overlay$None;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Overlay extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Card$Overlay$Badges;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Card$Overlay;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Badges implements Overlay {

                @NotNull
                public static final Parcelable.Creator<Badges> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Border f58016a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CircleBadgeModel f58017b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final CircleBadgeModel f58018c;
                public final CircleBadgeModel d;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Badges((Border) parcel.readParcelable(Badges.class.getClassLoader()), (CircleBadgeModel) parcel.readParcelable(Badges.class.getClassLoader()), (CircleBadgeModel) parcel.readParcelable(Badges.class.getClassLoader()), (CircleBadgeModel) parcel.readParcelable(Badges.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Badges[i];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Badges() {
                    this(null, 0 == true ? 1 : 0, 15);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Badges)) {
                        return false;
                    }
                    Badges badges = (Badges) obj2;
                    return Intrinsics.f(this.f58016a, badges.f58016a) && Intrinsics.f(this.f58017b, badges.f58017b) && Intrinsics.f(this.f58018c, badges.f58018c) && Intrinsics.f(this.d, badges.d);
                }

                public final int hashCode() {
                    Border border = this.f58016a;
                    int iHashCode = (border == null ? 0 : border.hashCode()) * 31;
                    CircleBadgeModel circleBadgeModel = this.f58017b;
                    int iHashCode2 = (iHashCode + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31;
                    CircleBadgeModel circleBadgeModel2 = this.f58018c;
                    int iHashCode3 = (iHashCode2 + (circleBadgeModel2 == null ? 0 : circleBadgeModel2.hashCode())) * 31;
                    CircleBadgeModel circleBadgeModel3 = this.d;
                    return iHashCode3 + (circleBadgeModel3 != null ? circleBadgeModel3.hashCode() : 0);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f58016a, i);
                    dest.writeParcelable(this.f58017b, i);
                    dest.writeParcelable(this.f58018c, i);
                    dest.writeParcelable(this.d, i);
                }

                public Badges(Border border, CircleBadgeModel circleBadgeModel, CircleBadgeModel circleBadgeModel2, CircleBadgeModel circleBadgeModel3) {
                    this.f58016a = border;
                    this.f58017b = circleBadgeModel;
                    this.f58018c = circleBadgeModel2;
                    this.d = circleBadgeModel3;
                }

                public /* synthetic */ Badges(Border border, CircleIconBadge circleIconBadge, int i) {
                    this((i & 1) != 0 ? null : border, null, (i & 4) != 0 ? null : circleIconBadge, null);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Card$Overlay$MiddleIcon;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Card$Overlay;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class MiddleIcon implements Overlay {

                @NotNull
                public static final Parcelable.Creator<MiddleIcon> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final GlyphImage f58019a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new MiddleIcon((GlyphImage) parcel.readParcelable(MiddleIcon.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new MiddleIcon[i];
                    }
                }

                public MiddleIcon(GlyphImage icon) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    this.f58019a = icon;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof MiddleIcon) && Intrinsics.f(this.f58019a, ((MiddleIcon) obj2).f58019a);
                }

                public final int hashCode() {
                    return this.f58019a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f58019a, i);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Card$Overlay$None;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Card$Overlay;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class None implements Overlay {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final None f58020a = new None();

                @NotNull
                public static final Parcelable.Creator<None> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return None.f58020a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new None[i];
                    }
                }

                private None() {
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Card((Image) parcel.readParcelable(Card.class.getClassLoader()), (State) parcel.readParcelable(Card.class.getClassLoader()), (Overlay) parcel.readParcelable(Card.class.getClassLoader()), d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Card[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Card(Image image, Border.AnimatedGradient animatedGradient, CircleBadgeModel circleBadgeModel, d size, int i) {
            animatedGradient = (i & 4) != 0 ? null : animatedGradient;
            Intrinsics.checkNotNullParameter(image, "image");
            State.Enabled state = State.Enabled.f58039a;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(size, "size");
            this(image, state, new Overlay.Badges(animatedGradient, null, circleBadgeModel, null), size);
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: W, reason: from getter */
        public final State getE() {
            return this.f58010c;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        public final AvatarImage a() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Border getF() {
            return this.f58011g;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: c0, reason: from getter */
        public final CircleBadgeModel getF58035m() {
            return this.f58013j;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final CircleBadgeModel getK() {
            return this.f58012h;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Card)) {
                return false;
            }
            Card card = (Card) obj2;
            return Intrinsics.f(this.f58009b, card.f58009b) && Intrinsics.f(this.f58010c, card.f58010c) && Intrinsics.f(this.d, card.d) && this.e == card.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.f58010c.hashCode() + (this.f58009b.hashCode() * 31)) * 31)) * 31);
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: j, reason: from getter */
        public final CircleBadgeModel getF58034l() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f58009b, i);
            dest.writeParcelable(this.f58010c, i);
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e.name());
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: z, reason: from getter */
        public final GlyphImage getK() {
            return this.k;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(Image image, State state, Overlay overlay, d size) {
            float f;
            float f4;
            super(0);
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            Intrinsics.checkNotNullParameter(size, "size");
            this.f58009b = image;
            this.f58010c = state;
            this.d = overlay;
            this.e = size;
            this.f = new AvatarImage.SingleImage(image);
            boolean z = overlay instanceof Overlay.Badges;
            Overlay.Badges badges = z ? (Overlay.Badges) overlay : null;
            this.f58011g = badges != null ? badges.f58016a : null;
            Overlay.Badges badges2 = z ? (Overlay.Badges) overlay : null;
            this.f58012h = badges2 != null ? badges2.f58017b : null;
            Overlay.Badges badges3 = z ? (Overlay.Badges) overlay : null;
            this.i = badges3 != null ? badges3.f58018c : null;
            Overlay.Badges badges4 = z ? (Overlay.Badges) overlay : null;
            this.f58013j = badges4 != null ? badges4.d : null;
            Overlay.MiddleIcon middleIcon = overlay instanceof Overlay.MiddleIcon ? (Overlay.MiddleIcon) overlay : null;
            this.k = middleIcon != null ? middleIcon.f58019a : null;
            int[] iArr = e.f58045a;
            int i = iArr[size.ordinal()];
            if (i == 1) {
                f = 39.0f;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 47.0f;
            }
            this.f58014l = f;
            int i2 = iArr[size.ordinal()];
            if (i2 == 1) {
                f4 = 60.0f;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f4 = 72.0f;
            }
            this.f58015m = f4;
        }

        public /* synthetic */ Card(Image image, Overlay.Badges badges, d dVar, int i) {
            this(image, State.Enabled.f58039a, (i & 4) != 0 ? Overlay.None.f58020a : badges, dVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Default;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;", "", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default extends AvatarModel {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f58021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final State f58022c;
        public final Border d;
        public final ProgressStyle e;
        public final CircleBadgeModel f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CircleBadgeModel f58023g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CircleBadgeModel f58024h;
        public final BottomDecoration i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final LottieImage f58025j;
        public final AvatarImage.SingleImage k;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default((Image) parcel.readParcelable(Default.class.getClassLoader()), (State) parcel.readParcelable(Default.class.getClassLoader()), (Border) parcel.readParcelable(Default.class.getClassLoader()), parcel.readInt() == 0 ? null : ProgressStyle.CREATOR.createFromParcel(parcel), (CircleBadgeModel) parcel.readParcelable(Default.class.getClassLoader()), (CircleBadgeModel) parcel.readParcelable(Default.class.getClassLoader()), (CircleBadgeModel) parcel.readParcelable(Default.class.getClassLoader()), (BottomDecoration) parcel.readParcelable(Default.class.getClassLoader()), (LottieImage) parcel.readParcelable(Default.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0053  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Default(com.revolut.core.ui_kit_core.displayers.image.Image r15, com.revolut.core.ui_kit.internal.views.tag.TagViewData r16, com.revolut.core.ui_kit.models.avatar.AvatarModel.Border.StaticGradient r17, com.revolut.core.ui_kit.internal.views.ProgressStyle r18, com.revolut.core.ui_kit.models.avatar.AvatarModel.BadgeModel r19, com.revolut.core.ui_kit.models.badge.CircleBadgeModel r20, com.revolut.core.ui_kit.models.badge.CircleBadgeModel r21, com.revolut.core.ui_kit.models.badge.CircleBadgeModel r22, int r23) {
            /*
                r14 = this;
                r0 = r16
                r1 = r23
                r2 = r1 & 8
                r3 = 0
                if (r2 == 0) goto Lb
                r7 = r3
                goto Ld
            Lb:
                r7 = r17
            Ld:
                r2 = r1 & 16
                if (r2 == 0) goto L13
                r8 = r3
                goto L15
            L13:
                r8 = r18
            L15:
                r2 = r1 & 32
                if (r2 == 0) goto L1b
                r2 = r3
                goto L1d
            L1b:
                r2 = r19
            L1d:
                r4 = r1 & 64
                if (r4 == 0) goto L23
                r4 = r3
                goto L25
            L23:
                r4 = r20
            L25:
                r5 = r1 & 128(0x80, float:1.8E-43)
                if (r5 == 0) goto L2b
                r5 = r3
                goto L2d
            L2b:
                r5 = r21
            L2d:
                r1 = r1 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L33
                r1 = r3
                goto L35
            L33:
                r1 = r22
            L35:
                java.lang.String r6 = "image"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r6)
                java.lang.String r6 = "state"
                com.revolut.core.ui_kit.models.avatar.AvatarModel$State$Enabled r9 = com.revolut.core.ui_kit.models.avatar.AvatarModel.State.Enabled.f58039a
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r6)
                if (r4 != 0) goto L54
                if (r2 == 0) goto L53
                com.revolut.core.ui_kit.models.avatar.b r4 = r2.f57999b
                com.revolut.core.ui_kit.models.avatar.b r6 = com.revolut.core.ui_kit.models.avatar.b.BOTTOM
                if (r4 != r6) goto L4d
                r4 = r2
                goto L4e
            L4d:
                r4 = r3
            L4e:
                if (r4 == 0) goto L53
                com.revolut.core.ui_kit.models.badge.CircleBadgeModel r4 = r4.f57998a
                goto L54
            L53:
                r4 = r3
            L54:
                if (r5 != 0) goto L65
                if (r2 == 0) goto L67
                com.revolut.core.ui_kit.models.avatar.b r5 = r2.f57999b
                com.revolut.core.ui_kit.models.avatar.b r6 = com.revolut.core.ui_kit.models.avatar.b.MIDDLE
                if (r5 != r6) goto L60
                r5 = r2
                goto L61
            L60:
                r5 = r3
            L61:
                if (r5 == 0) goto L67
                com.revolut.core.ui_kit.models.badge.CircleBadgeModel r5 = r5.f57998a
            L65:
                r10 = r5
                goto L68
            L67:
                r10 = r3
            L68:
                if (r1 != 0) goto L78
                if (r2 == 0) goto L7a
                com.revolut.core.ui_kit.models.avatar.b r1 = r2.f57999b
                com.revolut.core.ui_kit.models.avatar.b r5 = com.revolut.core.ui_kit.models.avatar.b.TOP
                if (r1 != r5) goto L73
                goto L74
            L73:
                r2 = r3
            L74:
                if (r2 == 0) goto L7a
                com.revolut.core.ui_kit.models.badge.CircleBadgeModel r1 = r2.f57998a
            L78:
                r11 = r1
                goto L7b
            L7a:
                r11 = r3
            L7b:
                if (r0 == 0) goto L82
                com.revolut.core.ui_kit.models.avatar.AvatarModel$BottomDecoration$Tag r3 = new com.revolut.core.ui_kit.models.avatar.AvatarModel$BottomDecoration$Tag
                r3.<init>(r0)
            L82:
                r12 = r3
                r13 = 0
                r5 = r15
                r6 = r9
                r9 = r4
                r4 = r14
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.models.avatar.AvatarModel.Default.<init>(com.revolut.core.ui_kit_core.displayers.image.Image, com.revolut.core.ui_kit.internal.views.tag.TagViewData, com.revolut.core.ui_kit.models.avatar.AvatarModel$Border$StaticGradient, com.revolut.core.ui_kit.internal.views.ProgressStyle, com.revolut.core.ui_kit.models.avatar.AvatarModel$BadgeModel, com.revolut.core.ui_kit.models.badge.CircleBadgeModel, com.revolut.core.ui_kit.models.badge.CircleBadgeModel, com.revolut.core.ui_kit.models.badge.CircleBadgeModel, int):void");
        }

        public static Default f0(Default r102, CircleBadgeModel circleBadgeModel, int i) {
            Image image = r102.f58021b;
            State state = r102.f58022c;
            Border border = r102.d;
            ProgressStyle progressStyle = r102.e;
            CircleBadgeModel circleBadgeModel2 = (i & 16) != 0 ? r102.f : null;
            CircleBadgeModel circleBadgeModel3 = r102.f58023g;
            BottomDecoration bottomDecoration = r102.i;
            LottieImage lottieImage = r102.f58025j;
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(state, "state");
            return new Default(image, state, border, progressStyle, circleBadgeModel2, circleBadgeModel3, circleBadgeModel, bottomDecoration, lottieImage);
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: J, reason: from getter */
        public final ProgressStyle getF58044h() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: W, reason: from getter */
        public final State getE() {
            return this.f58022c;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        public final AvatarImage a() {
            return this.k;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final LottieImage getF58025j() {
            return this.f58025j;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Border getF() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: c0, reason: from getter */
        public final CircleBadgeModel getF58035m() {
            return this.f58024h;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final CircleBadgeModel getK() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final BottomDecoration getF58031g() {
            return this.i;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Default)) {
                return false;
            }
            Default r56 = (Default) obj2;
            return Intrinsics.f(this.f58021b, r56.f58021b) && Intrinsics.f(this.f58022c, r56.f58022c) && Intrinsics.f(this.d, r56.d) && Intrinsics.f(this.e, r56.e) && Intrinsics.f(this.f, r56.f) && Intrinsics.f(this.f58023g, r56.f58023g) && Intrinsics.f(this.f58024h, r56.f58024h) && Intrinsics.f(this.i, r56.i) && Intrinsics.f(this.f58025j, r56.f58025j);
        }

        public final int hashCode() {
            int iHashCode = (this.f58022c.hashCode() + (this.f58021b.hashCode() * 31)) * 31;
            Border border = this.d;
            int iHashCode2 = (iHashCode + (border == null ? 0 : border.hashCode())) * 31;
            ProgressStyle progressStyle = this.e;
            int iHashCode3 = (iHashCode2 + (progressStyle == null ? 0 : progressStyle.hashCode())) * 31;
            CircleBadgeModel circleBadgeModel = this.f;
            int iHashCode4 = (iHashCode3 + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31;
            CircleBadgeModel circleBadgeModel2 = this.f58023g;
            int iHashCode5 = (iHashCode4 + (circleBadgeModel2 == null ? 0 : circleBadgeModel2.hashCode())) * 31;
            CircleBadgeModel circleBadgeModel3 = this.f58024h;
            int iHashCode6 = (iHashCode5 + (circleBadgeModel3 == null ? 0 : circleBadgeModel3.hashCode())) * 31;
            BottomDecoration bottomDecoration = this.i;
            int iHashCode7 = (iHashCode6 + (bottomDecoration == null ? 0 : bottomDecoration.hashCode())) * 31;
            LottieImage lottieImage = this.f58025j;
            return iHashCode7 + (lottieImage != null ? lottieImage.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: j, reason: from getter */
        public final CircleBadgeModel getF58034l() {
            return this.f58023g;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f58021b, i);
            dest.writeParcelable(this.f58022c, i);
            dest.writeParcelable(this.d, i);
            ProgressStyle progressStyle = this.e;
            if (progressStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                progressStyle.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f58023g, i);
            dest.writeParcelable(this.f58024h, i);
            dest.writeParcelable(this.i, i);
            dest.writeParcelable(this.f58025j, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Default(Image image, State state, Border border, ProgressStyle progressStyle, CircleBadgeModel circleBadgeModel, CircleBadgeModel circleBadgeModel2, CircleBadgeModel circleBadgeModel3, BottomDecoration bottomDecoration, LottieImage lottieImage) {
            super(0);
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f58021b = image;
            this.f58022c = state;
            this.d = border;
            this.e = progressStyle;
            this.f = circleBadgeModel;
            this.f58023g = circleBadgeModel2;
            this.f58024h = circleBadgeModel3;
            this.i = bottomDecoration;
            this.f58025j = lottieImage;
            this.k = new AvatarImage.SingleImage(image);
        }

        public /* synthetic */ Default(Image image, Border.StaticGradient staticGradient, CircleBadgeModel circleBadgeModel, LottieImage lottieImage, int i) {
            this(image, State.Enabled.f58039a, (i & 4) != 0 ? null : staticGradient, (ProgressStyle) null, circleBadgeModel, (CircleBadgeModel) null, (CircleBadgeModel) null, (BottomDecoration) null, (i & 256) != 0 ? null : lottieImage);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Default(com.revolut.core.ui_kit_core.displayers.image.Image r11, com.revolut.core.ui_kit.models.avatar.AvatarModel.State r12, com.revolut.core.ui_kit.models.avatar.AvatarModel.Border r13, com.revolut.core.ui_kit.internal.views.ProgressStyle r14, com.revolut.core.ui_kit.models.avatar.AvatarModel.BadgeModel r15, com.revolut.core.ui_kit_core.displayers.image.models.LottieImage r16, int r17) {
            /*
                r10 = this;
                r0 = r17 & 2
                if (r0 == 0) goto L6
                com.revolut.core.ui_kit.models.avatar.AvatarModel$State$Enabled r12 = com.revolut.core.ui_kit.models.avatar.AvatarModel.State.Enabled.f58039a
            L6:
                r2 = r12
                r12 = r17 & 4
                r0 = 0
                if (r12 == 0) goto Le
                r3 = r0
                goto Lf
            Le:
                r3 = r13
            Lf:
                r12 = r17 & 8
                if (r12 == 0) goto L15
                r4 = r0
                goto L16
            L15:
                r4 = r14
            L16:
                r12 = r17 & 16
                if (r12 == 0) goto L1c
                r12 = r0
                goto L1d
            L1c:
                r12 = r15
            L1d:
                r13 = r17 & 64
                if (r13 == 0) goto L23
                r9 = r0
                goto L25
            L23:
                r9 = r16
            L25:
                java.lang.String r13 = "image"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r13)
                java.lang.String r13 = "state"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r13)
                if (r12 == 0) goto L40
                com.revolut.core.ui_kit.models.avatar.b r13 = r12.f57999b
                com.revolut.core.ui_kit.models.avatar.b r14 = com.revolut.core.ui_kit.models.avatar.b.BOTTOM
                if (r13 != r14) goto L39
                r13 = r12
                goto L3a
            L39:
                r13 = r0
            L3a:
                if (r13 == 0) goto L40
                com.revolut.core.ui_kit.models.badge.CircleBadgeModel r13 = r13.f57998a
                r5 = r13
                goto L41
            L40:
                r5 = r0
            L41:
                if (r12 == 0) goto L52
                com.revolut.core.ui_kit.models.avatar.b r13 = r12.f57999b
                com.revolut.core.ui_kit.models.avatar.b r14 = com.revolut.core.ui_kit.models.avatar.b.MIDDLE
                if (r13 != r14) goto L4b
                r13 = r12
                goto L4c
            L4b:
                r13 = r0
            L4c:
                if (r13 == 0) goto L52
                com.revolut.core.ui_kit.models.badge.CircleBadgeModel r13 = r13.f57998a
                r6 = r13
                goto L53
            L52:
                r6 = r0
            L53:
                if (r12 == 0) goto L61
                com.revolut.core.ui_kit.models.avatar.b r13 = r12.f57999b
                com.revolut.core.ui_kit.models.avatar.b r14 = com.revolut.core.ui_kit.models.avatar.b.TOP
                if (r13 != r14) goto L5c
                goto L5d
            L5c:
                r12 = r0
            L5d:
                if (r12 == 0) goto L61
                com.revolut.core.ui_kit.models.badge.CircleBadgeModel r0 = r12.f57998a
            L61:
                r7 = r0
                r8 = 0
                r0 = r10
                r1 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.models.avatar.AvatarModel.Default.<init>(com.revolut.core.ui_kit_core.displayers.image.Image, com.revolut.core.ui_kit.models.avatar.AvatarModel$State, com.revolut.core.ui_kit.models.avatar.AvatarModel$Border, com.revolut.core.ui_kit.internal.views.ProgressStyle, com.revolut.core.ui_kit.models.avatar.AvatarModel$BadgeModel, com.revolut.core.ui_kit_core.displayers.image.models.LottieImage, int):void");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/avatar/AvatarModel$Layered;", "Lcom/revolut/core/ui_kit/models/avatar/AvatarModel;", "", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Layered extends AvatarModel {

        @NotNull
        public static final Parcelable.Creator<Layered> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f58029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final State f58030c;
        public final Border d;
        public final ProgressStyle e;
        public final BadgeModel f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final BottomDecoration f58031g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Image f58032h;
        public final com.revolut.core.ui_kit.models.avatar.a i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AvatarImage.LayeredImage f58033j;
        public final CircleBadgeModel k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final CircleBadgeModel f58034l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final CircleBadgeModel f58035m;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Layered.class, parcel, arrayList, iE, 1);
                }
                return new Layered(arrayList, (State) parcel.readParcelable(Layered.class.getClassLoader()), (Border) parcel.readParcelable(Layered.class.getClassLoader()), parcel.readInt() == 0 ? null : ProgressStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BadgeModel.CREATOR.createFromParcel(parcel) : null, (BottomDecoration) parcel.readParcelable(Layered.class.getClassLoader()), (Image) parcel.readParcelable(Layered.class.getClassLoader()), com.revolut.core.ui_kit.models.avatar.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Layered[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Layered(java.util.List r2, com.revolut.core.ui_kit.models.avatar.AvatarModel.State r3, com.revolut.core.ui_kit.models.avatar.AvatarModel.Border r4, com.revolut.core.ui_kit.internal.views.ProgressStyle r5, com.revolut.core.ui_kit.models.avatar.AvatarModel.BadgeModel r6, com.revolut.core.ui_kit.models.avatar.AvatarModel.BottomDecoration r7, com.revolut.core.ui_kit_core.displayers.image.Image r8, com.revolut.core.ui_kit.models.avatar.a r9) {
            /*
                r1 = this;
                java.lang.String r0 = "images"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "state"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "style"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r0 = 0
                r1.<init>(r0)
                r1.f58029b = r2
                r1.f58030c = r3
                r1.d = r4
                r1.e = r5
                r1.f = r6
                r1.f58031g = r7
                r1.f58032h = r8
                r1.i = r9
                com.revolut.core.ui_kit.models.avatar.AvatarModel$AvatarImage$LayeredImage r3 = new com.revolut.core.ui_kit.models.avatar.AvatarModel$AvatarImage$LayeredImage
                r3.<init>(r2, r8, r9)
                r1.f58033j = r3
                r2 = 0
                if (r6 == 0) goto L3b
                com.revolut.core.ui_kit.models.avatar.b r3 = r6.f57999b
                com.revolut.core.ui_kit.models.avatar.b r4 = com.revolut.core.ui_kit.models.avatar.b.BOTTOM
                if (r3 != r4) goto L35
                r3 = r6
                goto L36
            L35:
                r3 = r2
            L36:
                if (r3 == 0) goto L3b
                com.revolut.core.ui_kit.models.badge.CircleBadgeModel r3 = r3.f57998a
                goto L3c
            L3b:
                r3 = r2
            L3c:
                r1.k = r3
                if (r6 == 0) goto L4e
                com.revolut.core.ui_kit.models.avatar.b r3 = r6.f57999b
                com.revolut.core.ui_kit.models.avatar.b r4 = com.revolut.core.ui_kit.models.avatar.b.MIDDLE
                if (r3 != r4) goto L48
                r3 = r6
                goto L49
            L48:
                r3 = r2
            L49:
                if (r3 == 0) goto L4e
                com.revolut.core.ui_kit.models.badge.CircleBadgeModel r3 = r3.f57998a
                goto L4f
            L4e:
                r3 = r2
            L4f:
                r1.f58034l = r3
                if (r6 == 0) goto L5f
                com.revolut.core.ui_kit.models.avatar.b r3 = r6.f57999b
                com.revolut.core.ui_kit.models.avatar.b r4 = com.revolut.core.ui_kit.models.avatar.b.TOP
                if (r3 != r4) goto L5a
                goto L5b
            L5a:
                r6 = r2
            L5b:
                if (r6 == 0) goto L5f
                com.revolut.core.ui_kit.models.badge.CircleBadgeModel r2 = r6.f57998a
            L5f:
                r1.f58035m = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.models.avatar.AvatarModel.Layered.<init>(java.util.List, com.revolut.core.ui_kit.models.avatar.AvatarModel$State, com.revolut.core.ui_kit.models.avatar.AvatarModel$Border, com.revolut.core.ui_kit.internal.views.ProgressStyle, com.revolut.core.ui_kit.models.avatar.AvatarModel$BadgeModel, com.revolut.core.ui_kit.models.avatar.AvatarModel$BottomDecoration, com.revolut.core.ui_kit_core.displayers.image.Image, com.revolut.core.ui_kit.models.avatar.a):void");
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: J, reason: from getter */
        public final ProgressStyle getF58044h() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: W, reason: from getter */
        public final State getE() {
            return this.f58030c;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        public final AvatarImage a() {
            return this.f58033j;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Border getF() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: c0, reason: from getter */
        public final CircleBadgeModel getF58035m() {
            return this.f58035m;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final CircleBadgeModel getK() {
            return this.k;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final BottomDecoration getF58031g() {
            return this.f58031g;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Layered)) {
                return false;
            }
            Layered layered = (Layered) obj2;
            return Intrinsics.f(this.f58029b, layered.f58029b) && Intrinsics.f(this.f58030c, layered.f58030c) && Intrinsics.f(this.d, layered.d) && Intrinsics.f(this.e, layered.e) && Intrinsics.f(this.f, layered.f) && Intrinsics.f(this.f58031g, layered.f58031g) && Intrinsics.f(this.f58032h, layered.f58032h) && this.i == layered.i;
        }

        public final int hashCode() {
            int iHashCode = (this.f58030c.hashCode() + (this.f58029b.hashCode() * 31)) * 31;
            Border border = this.d;
            int iHashCode2 = (iHashCode + (border == null ? 0 : border.hashCode())) * 31;
            ProgressStyle progressStyle = this.e;
            int iHashCode3 = (iHashCode2 + (progressStyle == null ? 0 : progressStyle.hashCode())) * 31;
            BadgeModel badgeModel = this.f;
            int iHashCode4 = (iHashCode3 + (badgeModel == null ? 0 : badgeModel.hashCode())) * 31;
            BottomDecoration bottomDecoration = this.f58031g;
            int iHashCode5 = (iHashCode4 + (bottomDecoration == null ? 0 : bottomDecoration.hashCode())) * 31;
            Image image = this.f58032h;
            return this.i.hashCode() + ((iHashCode5 + (image != null ? image.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.core.ui_kit.models.avatar.AvatarModel
        /* JADX INFO: renamed from: j, reason: from getter */
        public final CircleBadgeModel getF58034l() {
            return this.f58034l;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f58029b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f58030c, i);
            dest.writeParcelable(this.d, i);
            ProgressStyle progressStyle = this.e;
            if (progressStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                progressStyle.writeToParcel(dest, i);
            }
            BadgeModel badgeModel = this.f;
            if (badgeModel == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                badgeModel.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f58031g, i);
            dest.writeParcelable(this.f58032h, i);
            dest.writeString(this.i.name());
        }

        public /* synthetic */ Layered(List list, ColorImage colorImage, com.revolut.core.ui_kit.models.avatar.a aVar, int i) {
            this(list, State.Enabled.f58039a, null, null, null, null, (i & 64) != 0 ? null : colorImage, (i & 128) != 0 ? com.revolut.core.ui_kit.models.avatar.a.CLIPPED : aVar);
        }
    }
}
