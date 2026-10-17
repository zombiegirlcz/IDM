package com.revolut.kompot.common;

import aii.u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ModalDestination implements u {

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/kompot/common/ModalDestination$Style;", "Landroid/os/Parcelable;", "Companion", "FULLSCREEN_FADE", "FULLSCREEN_IMMEDIATE", "POPUP", "FULLSCREEN_SLIDE_FROM_BOTTOM", "BOTTOM_DIALOG", "ContextualAlert", "ExpandableBottomDialog", "Custom", "FullscreenPaged", "a", "Lcom/revolut/kompot/common/ModalDestination$Style$BOTTOM_DIALOG;", "Lcom/revolut/kompot/common/ModalDestination$Style$ContextualAlert;", "Lcom/revolut/kompot/common/ModalDestination$Style$Custom;", "Lcom/revolut/kompot/common/ModalDestination$Style$ExpandableBottomDialog;", "Lcom/revolut/kompot/common/ModalDestination$Style$FULLSCREEN_FADE;", "Lcom/revolut/kompot/common/ModalDestination$Style$FULLSCREEN_IMMEDIATE;", "Lcom/revolut/kompot/common/ModalDestination$Style$FULLSCREEN_SLIDE_FROM_BOTTOM;", "Lcom/revolut/kompot/common/ModalDestination$Style$FullscreenPaged;", "Lcom/revolut/kompot/common/ModalDestination$Style$POPUP;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Style extends Parcelable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f98312a;

        /* JADX INFO: loaded from: classes10.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/common/ModalDestination$Style$BOTTOM_DIALOG;", "Lcom/revolut/kompot/common/ModalDestination$Style;", "<init>", "()V", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class BOTTOM_DIALOG implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final BOTTOM_DIALOG f98301a = new BOTTOM_DIALOG();

            @NotNull
            public static final Parcelable.Creator<BOTTOM_DIALOG> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BOTTOM_DIALOG.f98301a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BOTTOM_DIALOG[i];
                }
            }

            private BOTTOM_DIALOG() {
            }

            @Override // com.revolut.kompot.common.ModalDestination.Style
            public final /* bridge */ /* synthetic */ ModalTransitionAnimation.Style Y3() {
                return ModalTransitionAnimation.Style.BOTTOM_DIALOG.f98381a;
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

        /* JADX INFO: loaded from: classes10.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/ModalDestination$Style$ContextualAlert;", "Lcom/revolut/kompot/common/ModalDestination$Style;", "", "toString", "()Ljava/lang/String;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ContextualAlert implements Style {

            @NotNull
            public static final Parcelable.Creator<ContextualAlert> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ParcelableViewTarget f98302a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ContextualAlert((ParcelableViewTarget) parcel.readParcelable(ContextualAlert.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ContextualAlert[i];
                }
            }

            public ContextualAlert(ParcelableViewTarget anchor) {
                Intrinsics.checkNotNullParameter(anchor, "anchor");
                this.f98302a = anchor;
            }

            @Override // com.revolut.kompot.common.ModalDestination.Style
            public final ModalTransitionAnimation.Style Y3() {
                return new ModalTransitionAnimation.Style.ContextualAlert(this.f98302a);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ContextualAlert) && Intrinsics.f(this.f98302a, ((ContextualAlert) obj2).f98302a);
            }

            public final int hashCode() {
                return this.f98302a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f98302a, i);
            }
        }

        /* JADX INFO: loaded from: classes10.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/ModalDestination$Style$Custom;", "Lcom/revolut/kompot/common/ModalDestination$Style;", "", "toString", "()Ljava/lang/String;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Custom implements Style {

            @NotNull
            public static final Parcelable.Creator<Custom> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TransitionAnimation.NonDefault f98303a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Custom((TransitionAnimation.NonDefault) parcel.readParcelable(Custom.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Custom[i];
                }
            }

            public Custom(TransitionAnimation.NonDefault animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f98303a = animation;
            }

            @Override // com.revolut.kompot.common.ModalDestination.Style
            public final ModalTransitionAnimation.Style Y3() {
                return new ModalTransitionAnimation.Style.Custom(this.f98303a);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Custom) && Intrinsics.f(this.f98303a, ((Custom) obj2).f98303a);
            }

            public final int hashCode() {
                return this.f98303a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f98303a, i);
            }
        }

        /* JADX INFO: loaded from: classes10.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/ModalDestination$Style$ExpandableBottomDialog;", "Lcom/revolut/kompot/common/ModalDestination$Style;", "", "toString", "()Ljava/lang/String;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ExpandableBottomDialog implements Style {

            @NotNull
            public static final Parcelable.Creator<ExpandableBottomDialog> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f98304a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f98305b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Float f98306c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ExpandableBottomDialog(parcel.readInt(), parcel.readFloat(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ExpandableBottomDialog[i];
                }
            }

            public ExpandableBottomDialog() {
                this(7);
            }

            @Override // com.revolut.kompot.common.ModalDestination.Style
            public final ModalTransitionAnimation.Style Y3() {
                return new ModalTransitionAnimation.Style.ExpandableBottomDialog(this.f98304a, this.f98305b, this.f98306c);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ExpandableBottomDialog)) {
                    return false;
                }
                ExpandableBottomDialog expandableBottomDialog = (ExpandableBottomDialog) obj2;
                return this.f98304a == expandableBottomDialog.f98304a && Float.compare(this.f98305b, expandableBottomDialog.f98305b) == 0 && Intrinsics.f(this.f98306c, expandableBottomDialog.f98306c);
            }

            public final int hashCode() {
                int iB = m72.b.b(this.f98305b, Integer.hashCode(this.f98304a) * 31, 31);
                Float f = this.f98306c;
                return iB + (f == null ? 0 : f.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f98304a);
                dest.writeFloat(this.f98305b);
                Float f = this.f98306c;
                if (f == null) {
                    dest.writeInt(0);
                } else {
                    r6.b.p(dest, 1, f);
                }
            }

            public ExpandableBottomDialog(int i, float f, Float f4) {
                this.f98304a = i;
                this.f98305b = f;
                this.f98306c = f4;
                if (BitmapDescriptorFactory.HUE_RED > f || f > 1.0f) {
                    throw new IllegalArgumentException(("halfExpandedRatio must be in [0, 1], but was " + f).toString());
                }
                if (f4 != null) {
                    float fFloatValue = f4.floatValue();
                    if (BitmapDescriptorFactory.HUE_RED > fFloatValue || fFloatValue > 1.0f) {
                        throw new IllegalArgumentException(("collapsedPeekHeightRatio must be in [0, 1], but was " + fFloatValue).toString());
                    }
                    if (fFloatValue < f) {
                        return;
                    }
                    throw new IllegalArgumentException(("collapsedPeekHeightRatio (" + fFloatValue + ") must be less than halfExpandedRatio (" + f + ")").toString());
                }
            }

            public /* synthetic */ ExpandableBottomDialog(int i) {
                this(-1, (i & 2) != 0 ? 0.6f : 0.55f, (i & 4) != 0 ? null : Float.valueOf(0.105f));
            }
        }

        /* JADX INFO: loaded from: classes10.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/common/ModalDestination$Style$FULLSCREEN_FADE;", "Lcom/revolut/kompot/common/ModalDestination$Style;", "<init>", "()V", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class FULLSCREEN_FADE implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final FULLSCREEN_FADE f98307a = new FULLSCREEN_FADE();

            @NotNull
            public static final Parcelable.Creator<FULLSCREEN_FADE> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return FULLSCREEN_FADE.f98307a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FULLSCREEN_FADE[i];
                }
            }

            private FULLSCREEN_FADE() {
            }

            @Override // com.revolut.kompot.common.ModalDestination.Style
            public final /* bridge */ /* synthetic */ ModalTransitionAnimation.Style Y3() {
                return ModalTransitionAnimation.Style.FULLSCREEN_FADE.f98387a;
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

        /* JADX INFO: loaded from: classes10.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/common/ModalDestination$Style$FULLSCREEN_IMMEDIATE;", "Lcom/revolut/kompot/common/ModalDestination$Style;", "<init>", "()V", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class FULLSCREEN_IMMEDIATE implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final FULLSCREEN_IMMEDIATE f98308a = new FULLSCREEN_IMMEDIATE();

            @NotNull
            public static final Parcelable.Creator<FULLSCREEN_IMMEDIATE> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return FULLSCREEN_IMMEDIATE.f98308a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FULLSCREEN_IMMEDIATE[i];
                }
            }

            private FULLSCREEN_IMMEDIATE() {
            }

            @Override // com.revolut.kompot.common.ModalDestination.Style
            public final /* bridge */ /* synthetic */ ModalTransitionAnimation.Style Y3() {
                return ModalTransitionAnimation.Style.FULLSCREEN_IMMEDIATE.f98388a;
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

        /* JADX INFO: loaded from: classes10.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/common/ModalDestination$Style$FULLSCREEN_SLIDE_FROM_BOTTOM;", "Lcom/revolut/kompot/common/ModalDestination$Style;", "<init>", "()V", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class FULLSCREEN_SLIDE_FROM_BOTTOM implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final FULLSCREEN_SLIDE_FROM_BOTTOM f98309a = new FULLSCREEN_SLIDE_FROM_BOTTOM();

            @NotNull
            public static final Parcelable.Creator<FULLSCREEN_SLIDE_FROM_BOTTOM> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FULLSCREEN_SLIDE_FROM_BOTTOM[i];
                }
            }

            private FULLSCREEN_SLIDE_FROM_BOTTOM() {
            }

            @Override // com.revolut.kompot.common.ModalDestination.Style
            public final /* bridge */ /* synthetic */ ModalTransitionAnimation.Style Y3() {
                return ModalTransitionAnimation.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98389a;
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

        /* JADX INFO: loaded from: classes10.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/common/ModalDestination$Style$FullscreenPaged;", "Lcom/revolut/kompot/common/ModalDestination$Style;", "<init>", "()V", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class FullscreenPaged implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final FullscreenPaged f98310a = new FullscreenPaged();

            @NotNull
            public static final Parcelable.Creator<FullscreenPaged> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return FullscreenPaged.f98310a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FullscreenPaged[i];
                }
            }

            private FullscreenPaged() {
            }

            @Override // com.revolut.kompot.common.ModalDestination.Style
            public final /* bridge */ /* synthetic */ ModalTransitionAnimation.Style Y3() {
                return ModalTransitionAnimation.Style.FullscreenPaged.f98390a;
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

        /* JADX INFO: loaded from: classes10.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/common/ModalDestination$Style$POPUP;", "Lcom/revolut/kompot/common/ModalDestination$Style;", "<init>", "()V", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class POPUP implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final POPUP f98311a = new POPUP();

            @NotNull
            public static final Parcelable.Creator<POPUP> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return POPUP.f98311a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new POPUP[i];
                }
            }

            private POPUP() {
            }

            @Override // com.revolut.kompot.common.ModalDestination.Style
            public final /* bridge */ /* synthetic */ ModalTransitionAnimation.Style Y3() {
                return ModalTransitionAnimation.Style.POPUP.f98391a;
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

        /* JADX INFO: renamed from: com.revolut.kompot.common.ModalDestination$Style$a, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes10.dex */
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ Companion f98312a = new Companion();

            private Companion() {
            }

            public static Style a(TransitionAnimation transitionAnimation) {
                ModalTransitionAnimation modalTransitionAnimation = transitionAnimation instanceof ModalTransitionAnimation ? (ModalTransitionAnimation) transitionAnimation : null;
                ModalTransitionAnimation.Style style = modalTransitionAnimation != null ? modalTransitionAnimation.f98379a : null;
                if (Intrinsics.f(style, ModalTransitionAnimation.Style.BOTTOM_DIALOG.f98381a)) {
                    return BOTTOM_DIALOG.f98301a;
                }
                if (style instanceof ModalTransitionAnimation.Style.Custom) {
                    return new Custom(((ModalTransitionAnimation.Style.Custom) style).f98383a);
                }
                if (style instanceof ModalTransitionAnimation.Style.ExpandableBottomDialog) {
                    ModalTransitionAnimation.Style.ExpandableBottomDialog expandableBottomDialog = (ModalTransitionAnimation.Style.ExpandableBottomDialog) style;
                    return new ExpandableBottomDialog(expandableBottomDialog.f98384a, expandableBottomDialog.f98385b, expandableBottomDialog.f98386c);
                }
                if (style instanceof ModalTransitionAnimation.Style.ContextualAlert) {
                    return new ContextualAlert(((ModalTransitionAnimation.Style.ContextualAlert) style).f98382a);
                }
                if (Intrinsics.f(style, ModalTransitionAnimation.Style.FULLSCREEN_FADE.f98387a)) {
                    return FULLSCREEN_FADE.f98307a;
                }
                if (Intrinsics.f(style, ModalTransitionAnimation.Style.FULLSCREEN_IMMEDIATE.f98388a)) {
                    return FULLSCREEN_IMMEDIATE.f98308a;
                }
                if (Intrinsics.f(style, ModalTransitionAnimation.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98389a)) {
                    return FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a;
                }
                if (Intrinsics.f(style, ModalTransitionAnimation.Style.FullscreenPaged.f98390a)) {
                    return FullscreenPaged.f98310a;
                }
                if (Intrinsics.f(style, ModalTransitionAnimation.Style.POPUP.f98391a)) {
                    return POPUP.f98311a;
                }
                if (style == null) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        ModalTransitionAnimation.Style Y3();
    }

    private ModalDestination() {
    }
}
