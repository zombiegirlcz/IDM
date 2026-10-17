package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle;", "Landroid/os/Parcelable;", "Companion", "Accent", "Semiaccent", "Black", "Transparent", "Grey", "a", "Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle$Accent;", "Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle$Black;", "Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle$Grey;", "Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle$Semiaccent;", "Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle$Transparent;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SuggestionViewStyle implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56422a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle$Accent;", "Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Accent extends SuggestionViewStyle {

        @NotNull
        public static final Parcelable.Creator<Accent> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56423b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Accent(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Accent[i];
            }
        }

        public Accent() {
            this((Object) null);
        }

        @Override // com.revolut.core.ui_kit.internal.views.SuggestionViewStyle
        public final Drawable a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return dr0.l.j(dr0.l.f117054a, dr0.l.e(context, new Color.Solid(R$attr.uikit_colorGreyTone10), dr0.l.h(context, 15.0f, new Color.Solid(R$attr.uikit_colorAccentNeutral), 0, null), null, 24), dr0.l.h(context, 15.0f, new Color.Opaque(R$attr.uikit_colorAccentNeutral, 0.2f), 0, null), null, null, Constants.TAG_SUPPORTED_LOCALE_LIST);
        }

        @Override // com.revolut.core.ui_kit.internal.views.SuggestionViewStyle
        public final float b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return 0.7f;
        }

        @Override // com.revolut.core.ui_kit.internal.views.SuggestionViewStyle
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF56427b() {
            return this.f56423b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Accent) && this.f56423b == ((Accent) obj2).f56423b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f56423b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f56423b);
        }

        public /* synthetic */ Accent(Object obj2) {
            this(R$attr.uikit_dp12);
        }

        public Accent(int i) {
            super(R$attr.uikit_colorOnAccentNeutral);
            this.f56423b = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle$Black;", "Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Black extends SuggestionViewStyle {

        @NotNull
        public static final Parcelable.Creator<Black> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56424b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Black(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Black[i];
            }
        }

        public Black() {
            this((Object) null);
        }

        @Override // com.revolut.core.ui_kit.internal.views.SuggestionViewStyle
        public final Drawable a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int i = R$attr.uikit_colorForeground;
            return dr0.l.j(dr0.l.f117054a, dr0.l.e(context, new Color.Opaque(i, 0.1f), dr0.l.h(context, 15.0f, new Color.Solid(i), 0, null), null, 24), dr0.l.h(context, 15.0f, new Color.Opaque(R$attr.uikit_colorForeground, 0.6f), 0, null), null, null, Constants.TAG_SUPPORTED_LOCALE_LIST);
        }

        @Override // com.revolut.core.ui_kit.internal.views.SuggestionViewStyle
        public final float b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return 0.8f;
        }

        @Override // com.revolut.core.ui_kit.internal.views.SuggestionViewStyle
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF56427b() {
            return this.f56424b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Black) && this.f56424b == ((Black) obj2).f56424b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f56424b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f56424b);
        }

        public /* synthetic */ Black(Object obj2) {
            this(R$attr.uikit_dp12);
        }

        public Black(int i) {
            super(R$attr.uikit_colorBackground);
            this.f56424b = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle$Grey;", "Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Grey extends SuggestionViewStyle {

        @NotNull
        public static final Parcelable.Creator<Grey> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56425b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Grey(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Grey[i];
            }
        }

        public Grey() {
            this((Object) null);
        }

        @Override // com.revolut.core.ui_kit.internal.views.SuggestionViewStyle
        public final Drawable a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return dr0.l.j(dr0.l.f117054a, dr0.l.e(context, new Color.Solid(R$attr.uikit_colorGreyTone50_20), dr0.l.h(context, 15.0f, new Color.Opaque(R$attr.uikit_colorGreyTone50, 0.1f), 0, null), null, 24), dr0.l.h(context, 15.0f, new Color.Opaque(R$attr.uikit_colorGreyTone50, 0.05f), 0, null), null, null, Constants.TAG_SUPPORTED_LOCALE_LIST);
        }

        @Override // com.revolut.core.ui_kit.internal.views.SuggestionViewStyle
        public final float b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return 0.4f;
        }

        @Override // com.revolut.core.ui_kit.internal.views.SuggestionViewStyle
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF56427b() {
            return this.f56425b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Grey) && this.f56425b == ((Grey) obj2).f56425b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f56425b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f56425b);
        }

        public /* synthetic */ Grey(Object obj2) {
            this(R$attr.uikit_dp12);
        }

        public Grey(int i) {
            super(R$attr.uikit_colorForeground);
            this.f56425b = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle$Semiaccent;", "Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Semiaccent extends SuggestionViewStyle {

        @NotNull
        public static final Parcelable.Creator<Semiaccent> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56426b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Semiaccent(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Semiaccent[i];
            }
        }

        public Semiaccent() {
            this((Object) null);
        }

        @Override // com.revolut.core.ui_kit.internal.views.SuggestionViewStyle
        public final Drawable a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return dr0.l.j(dr0.l.f117054a, dr0.l.e(context, new Color.Solid(R$attr.uikit_colorAccentNeutral_20), dr0.l.h(context, 15.0f, new Color.Solid(R$attr.uikit_colorActionBackgroundNeutral), 0, null), null, 24), dr0.l.h(context, 15.0f, new Color.Solid(R$attr.uikit_colorActionBackgroundNeutral), 0, null), null, null, Constants.TAG_SUPPORTED_LOCALE_LIST);
        }

        @Override // com.revolut.core.ui_kit.internal.views.SuggestionViewStyle
        public final float b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return 0.5f;
        }

        @Override // com.revolut.core.ui_kit.internal.views.SuggestionViewStyle
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF56427b() {
            return this.f56426b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Semiaccent) && this.f56426b == ((Semiaccent) obj2).f56426b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f56426b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f56426b);
        }

        public /* synthetic */ Semiaccent(Object obj2) {
            this(R$attr.uikit_dp12);
        }

        public Semiaccent(int i) {
            super(R$attr.uikit_colorAccentNeutral);
            this.f56426b = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle$Transparent;", "Lcom/revolut/core/ui_kit/internal/views/SuggestionViewStyle;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transparent extends SuggestionViewStyle {

        @NotNull
        public static final Parcelable.Creator<Transparent> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56427b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transparent(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transparent[i];
            }
        }

        public Transparent() {
            this((Object) null);
        }

        @Override // com.revolut.core.ui_kit.internal.views.SuggestionViewStyle
        public final Drawable a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return null;
        }

        @Override // com.revolut.core.ui_kit.internal.views.SuggestionViewStyle
        public final float b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return 0.4f;
        }

        @Override // com.revolut.core.ui_kit.internal.views.SuggestionViewStyle
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF56427b() {
            return this.f56427b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Transparent) && this.f56427b == ((Transparent) obj2).f56427b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f56427b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f56427b);
        }

        public /* synthetic */ Transparent(Object obj2) {
            this(R$attr.uikit_dp0);
        }

        public Transparent(int i) {
            super(R$attr.uikit_colorGreyTone50);
            this.f56427b = i;
        }
    }

    public SuggestionViewStyle(int i) {
        this.f56422a = i;
    }

    public abstract Drawable a(Context context);

    public abstract float b(Context context);

    /* JADX INFO: renamed from: c */
    public abstract int getF56427b();
}
