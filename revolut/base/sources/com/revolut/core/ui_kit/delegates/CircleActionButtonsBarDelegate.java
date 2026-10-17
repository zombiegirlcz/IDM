package com.revolut.core.ui_kit.delegates;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.CircleActionView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.CircleActionButtonsBarView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/y3;", "Lip0/ya;", "<init>", "()V", "CircleActionButton", "CircleActionButtonDelegate", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CircleActionButtonsBarDelegate extends BaseRecyclerViewDelegate<y3, ip0.ya> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52087c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButtonDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton;", "Lcom/revolut/core/ui_kit/delegates/w3;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CircleActionButtonDelegate extends BaseRecyclerViewDelegate<CircleActionButton, w3> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e01.a f52099c;

        public CircleActionButtonDelegate() {
            super(R$layout.internal_delegate_circle_button, new ip0.h8(25));
            this.f52099c = new e01.a();
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new w3(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_circle_button));
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(w3 holder, CircleActionButton data, int i, List payloads) {
            ms0.z zVar;
            ms0.a0 a0Var;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            CircleActionView circleActionView = holder.f;
            int i2 = x3.f55592a[data.e.ordinal()];
            if (i2 == 1) {
                zVar = ms0.z.SIZE_48;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zVar = ms0.z.SIZE_56;
            }
            circleActionView.setSize(zVar);
            CircleActionButton.ButtonStyle buttonStyle = data.d;
            if (Intrinsics.f(buttonStyle, CircleActionButton.ButtonStyle.SolidAccentButton.f52097a)) {
                a0Var = ms0.a0.SOLID_ACCENT;
            } else if (Intrinsics.f(buttonStyle, CircleActionButton.ButtonStyle.AccentButton.f52093a)) {
                a0Var = ms0.a0.ACCENT_HIGHLIGHTED;
            } else if (Intrinsics.f(buttonStyle, CircleActionButton.ButtonStyle.SemiAccentButton.f52096a)) {
                a0Var = ms0.a0.ACCENT;
            } else if (Intrinsics.f(buttonStyle, CircleActionButton.ButtonStyle.WhiteButton.f52098a)) {
                a0Var = ms0.a0.ELEVATED;
            } else if (Intrinsics.f(buttonStyle, CircleActionButton.ButtonStyle.PrimaryNeutral.f52095a)) {
                a0Var = ms0.a0.PRIMARY_NEUTRAL;
            } else {
                if (!Intrinsics.f(buttonStyle, CircleActionButton.ButtonStyle.DangerButton.f52094a)) {
                    throw new NoWhenBranchMatchedException();
                }
                a0Var = ms0.a0.DANGER;
            }
            circleActionView.setStyle(a0Var, data.f52091g, true);
            circleActionView.setIcon(data.f52090c);
            circleActionView.setLabel(data.f52089b);
            circleActionView.setLoadingButtonTag(data.f);
            efm.r map = circleActionView.f56119a.map(new ip0.a9(new ijg.c(data, holder, 28), 14));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            this.f52099c.a(map, holder);
        }
    }

    public CircleActionButtonsBarDelegate() {
        super(R$layout.internal_delegate_circle_buttons_bar, new ip0.h8(24));
        this.f52087c = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.ya(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_circle_buttons_bar));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.ya holder, y3 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        CircleActionButtonsBarView circleActionButtonsBarView = holder.f;
        data.getClass();
        circleActionButtonsBarView.setSingleLine(false);
        circleActionButtonsBarView.setActions(data.f55618b);
        this.f52087c.a(circleActionButtonsBarView.a(), holder);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ButtonStyle", "com/revolut/core/ui_kit/delegates/v3", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CircleActionButton implements koi.j, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f52089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f52090c;
        public final ButtonStyle d;
        public final v3 e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f52091g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f52092h;
        public Parcelable i;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle;", "Landroid/os/Parcelable;", "<init>", "()V", "SolidAccentButton", "AccentButton", "SemiAccentButton", "WhiteButton", "PrimaryNeutral", "DangerButton", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle$AccentButton;", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle$DangerButton;", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle$PrimaryNeutral;", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle$SemiAccentButton;", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle$SolidAccentButton;", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle$WhiteButton;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class ButtonStyle implements Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle$AccentButton;", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class AccentButton extends ButtonStyle {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final AccentButton f52093a = new AccentButton();

                @NotNull
                public static final Parcelable.Creator<AccentButton> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return AccentButton.f52093a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new AccentButton[i];
                    }
                }

                private AccentButton() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle$DangerButton;", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class DangerButton extends ButtonStyle {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final DangerButton f52094a = new DangerButton();

                @NotNull
                public static final Parcelable.Creator<DangerButton> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return DangerButton.f52094a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new DangerButton[i];
                    }
                }

                private DangerButton() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle$PrimaryNeutral;", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class PrimaryNeutral extends ButtonStyle {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final PrimaryNeutral f52095a = new PrimaryNeutral();

                @NotNull
                public static final Parcelable.Creator<PrimaryNeutral> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return PrimaryNeutral.f52095a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new PrimaryNeutral[i];
                    }
                }

                private PrimaryNeutral() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle$SemiAccentButton;", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class SemiAccentButton extends ButtonStyle {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final SemiAccentButton f52096a = new SemiAccentButton();

                @NotNull
                public static final Parcelable.Creator<SemiAccentButton> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return SemiAccentButton.f52096a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new SemiAccentButton[i];
                    }
                }

                private SemiAccentButton() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle$SolidAccentButton;", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class SolidAccentButton extends ButtonStyle {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final SolidAccentButton f52097a = new SolidAccentButton();

                @NotNull
                public static final Parcelable.Creator<SolidAccentButton> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return SolidAccentButton.f52097a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new SolidAccentButton[i];
                    }
                }

                private SolidAccentButton() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle$WhiteButton;", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class WhiteButton extends ButtonStyle {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final WhiteButton f52098a = new WhiteButton();

                @NotNull
                public static final Parcelable.Creator<WhiteButton> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return WhiteButton.f52098a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new WhiteButton[i];
                    }
                }

                private WhiteButton() {
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

            private ButtonStyle() {
            }
        }

        public CircleActionButton(String listId, Clause text, Image image, ButtonStyle buttonStyle, v3 buttonSize, String str, boolean z, Object obj2, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
            Intrinsics.checkNotNullParameter(buttonSize, "buttonSize");
            this.f52088a = listId;
            this.f52089b = text;
            this.f52090c = image;
            this.d = buttonStyle;
            this.e = buttonSize;
            this.f = str;
            this.f52091g = z;
            this.f52092h = obj2;
            this.i = parcelable;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52567m() {
            return this.f52092h;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52560a() {
            return this.f52088a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CircleActionButton)) {
                return false;
            }
            CircleActionButton circleActionButton = (CircleActionButton) obj2;
            return Intrinsics.f(this.f52088a, circleActionButton.f52088a) && Intrinsics.f(this.f52089b, circleActionButton.f52089b) && Intrinsics.f(this.f52090c, circleActionButton.f52090c) && Intrinsics.f(this.d, circleActionButton.d) && this.e == circleActionButton.e && Intrinsics.f(this.f, circleActionButton.f) && this.f52091g == circleActionButton.f52091g && Intrinsics.f(this.f52092h, circleActionButton.f52092h) && Intrinsics.f(this.i, circleActionButton.i);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52566l() {
            return this.i;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f52088a.hashCode() * 31, 31, this.f52089b);
            Image image = this.f52090c;
            int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((iA + (image == null ? 0 : image.hashCode())) * 31)) * 31)) * 31;
            String str = this.f;
            int iC = j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f52091g);
            Object obj2 = this.f52092h;
            int iHashCode2 = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.i;
            return iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        public /* synthetic */ CircleActionButton(String str, Clause clause, Image image, ButtonStyle buttonStyle, v3 v3Var, String str2, boolean z, Object obj2, int i) {
            this(str, clause, image, buttonStyle, (i & 16) != 0 ? v3.SIZE_48 : v3Var, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? true : z, (i & 128) != 0 ? null : obj2, (Parcelable) null);
        }
    }
}
