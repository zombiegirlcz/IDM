package com.revolut.kompot.navigable;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/kompot/navigable/ModalTransitionAnimation;", "Lcom/revolut/kompot/navigable/TransitionAnimation;", "", "toString", "()Ljava/lang/String;", "Style", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ModalTransitionAnimation implements TransitionAnimation {

    @NotNull
    public static final Parcelable.Creator<ModalTransitionAnimation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Style f98379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f98380b;

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style;", "Landroid/os/Parcelable;", "FULLSCREEN_FADE", "FULLSCREEN_IMMEDIATE", "POPUP", "FULLSCREEN_SLIDE_FROM_BOTTOM", "BOTTOM_DIALOG", "ExpandableBottomDialog", "ContextualAlert", "Custom", "FullscreenPaged", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$BOTTOM_DIALOG;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$ContextualAlert;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$Custom;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$ExpandableBottomDialog;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$FULLSCREEN_FADE;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$FULLSCREEN_IMMEDIATE;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$FULLSCREEN_SLIDE_FROM_BOTTOM;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$FullscreenPaged;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$POPUP;", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Style extends Parcelable {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$BOTTOM_DIALOG;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BOTTOM_DIALOG implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final BOTTOM_DIALOG f98381a = new BOTTOM_DIALOG();

            @NotNull
            public static final Parcelable.Creator<BOTTOM_DIALOG> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BOTTOM_DIALOG.f98381a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BOTTOM_DIALOG[i];
                }
            }

            private BOTTOM_DIALOG() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof BOTTOM_DIALOG);
            }

            public final int hashCode() {
                return -532339476;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$ContextualAlert;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style;", "", "toString", "()Ljava/lang/String;", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ContextualAlert implements Style {

            @NotNull
            public static final Parcelable.Creator<ContextualAlert> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ParcelableViewTarget f98382a;

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
                this.f98382a = anchor;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ParcelableViewTarget getF98382a() {
                return this.f98382a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ContextualAlert) && Intrinsics.f(this.f98382a, ((ContextualAlert) obj2).f98382a);
            }

            public final int hashCode() {
                return this.f98382a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f98382a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$Custom;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style;", "", "toString", "()Ljava/lang/String;", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Custom implements Style {

            @NotNull
            public static final Parcelable.Creator<Custom> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TransitionAnimation.NonDefault f98383a;

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
                this.f98383a = animation;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final TransitionAnimation.NonDefault getF98383a() {
                return this.f98383a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Custom) && Intrinsics.f(this.f98383a, ((Custom) obj2).f98383a);
            }

            public final int hashCode() {
                return this.f98383a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f98383a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$ExpandableBottomDialog;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style;", "", "toString", "()Ljava/lang/String;", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ExpandableBottomDialog implements Style {

            @NotNull
            public static final Parcelable.Creator<ExpandableBottomDialog> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f98384a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f98385b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Float f98386c;

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

            public ExpandableBottomDialog(int i, float f, Float f4) {
                this.f98384a = i;
                this.f98385b = f;
                this.f98386c = f4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getF98384a() {
                return this.f98384a;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Float getF98386c() {
                return this.f98386c;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final float getF98385b() {
                return this.f98385b;
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
                return this.f98384a == expandableBottomDialog.f98384a && Float.compare(this.f98385b, expandableBottomDialog.f98385b) == 0 && Intrinsics.f(this.f98386c, expandableBottomDialog.f98386c);
            }

            public final int hashCode() {
                int iB = m72.b.b(this.f98385b, Integer.hashCode(this.f98384a) * 31, 31);
                Float f = this.f98386c;
                return iB + (f == null ? 0 : f.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f98384a);
                dest.writeFloat(this.f98385b);
                Float f = this.f98386c;
                if (f == null) {
                    dest.writeInt(0);
                } else {
                    r6.b.p(dest, 1, f);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$FULLSCREEN_FADE;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FULLSCREEN_FADE implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final FULLSCREEN_FADE f98387a = new FULLSCREEN_FADE();

            @NotNull
            public static final Parcelable.Creator<FULLSCREEN_FADE> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return FULLSCREEN_FADE.f98387a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FULLSCREEN_FADE[i];
                }
            }

            private FULLSCREEN_FADE() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof FULLSCREEN_FADE);
            }

            public final int hashCode() {
                return -784059504;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$FULLSCREEN_IMMEDIATE;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FULLSCREEN_IMMEDIATE implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final FULLSCREEN_IMMEDIATE f98388a = new FULLSCREEN_IMMEDIATE();

            @NotNull
            public static final Parcelable.Creator<FULLSCREEN_IMMEDIATE> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return FULLSCREEN_IMMEDIATE.f98388a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FULLSCREEN_IMMEDIATE[i];
                }
            }

            private FULLSCREEN_IMMEDIATE() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof FULLSCREEN_IMMEDIATE);
            }

            public final int hashCode() {
                return -781095171;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$FULLSCREEN_SLIDE_FROM_BOTTOM;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FULLSCREEN_SLIDE_FROM_BOTTOM implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final FULLSCREEN_SLIDE_FROM_BOTTOM f98389a = new FULLSCREEN_SLIDE_FROM_BOTTOM();

            @NotNull
            public static final Parcelable.Creator<FULLSCREEN_SLIDE_FROM_BOTTOM> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return FULLSCREEN_SLIDE_FROM_BOTTOM.f98389a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FULLSCREEN_SLIDE_FROM_BOTTOM[i];
                }
            }

            private FULLSCREEN_SLIDE_FROM_BOTTOM() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof FULLSCREEN_SLIDE_FROM_BOTTOM);
            }

            public final int hashCode() {
                return 1932375582;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$FullscreenPaged;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FullscreenPaged implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final FullscreenPaged f98390a = new FullscreenPaged();

            @NotNull
            public static final Parcelable.Creator<FullscreenPaged> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return FullscreenPaged.f98390a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FullscreenPaged[i];
                }
            }

            private FullscreenPaged() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof FullscreenPaged);
            }

            public final int hashCode() {
                return 1353109418;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style$POPUP;", "Lcom/revolut/kompot/navigable/ModalTransitionAnimation$Style;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class POPUP implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final POPUP f98391a = new POPUP();

            @NotNull
            public static final Parcelable.Creator<POPUP> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return POPUP.f98391a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new POPUP[i];
                }
            }

            private POPUP() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof POPUP);
            }

            public final int hashCode() {
                return 462586780;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ModalTransitionAnimation((Style) parcel.readParcelable(ModalTransitionAnimation.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ModalTransitionAnimation[i];
        }
    }

    public ModalTransitionAnimation(Style style, boolean z) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f98379a = style;
        this.f98380b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ModalTransitionAnimation)) {
            return false;
        }
        ModalTransitionAnimation modalTransitionAnimation = (ModalTransitionAnimation) obj2;
        return Intrinsics.f(this.f98379a, modalTransitionAnimation.f98379a) && this.f98380b == modalTransitionAnimation.f98380b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f98380b) + (this.f98379a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98379a, i);
        dest.writeInt(this.f98380b ? 1 : 0);
    }
}
