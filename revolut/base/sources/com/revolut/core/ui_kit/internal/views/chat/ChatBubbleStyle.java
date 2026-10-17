package com.revolut.core.ui_kit.internal.views.chat;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit_resources.R$attr;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle;", "Landroid/os/Parcelable;", "<init>", "()V", "Grey", "Uncontained", "Search", "Light", "Blue", "Gradient", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle$Blue;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle$Gradient;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle$Grey;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle$Light;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle$Search;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle$Uncontained;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ChatBubbleStyle implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle$Blue;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Blue extends ChatBubbleStyle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Blue f56805a = new Blue();

        @NotNull
        public static final Parcelable.Creator<Blue> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Blue.f56805a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Blue[i];
            }
        }

        private Blue() {
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setBackground(ChatBubbleStyle.j(context, R$attr.uikit_colorAccent, R$attr.uikit_colorGreyTone5));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void b(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setTextColor(kli.a.s(R$attr.uikit_colorOnAccent, context));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void c(View backgroundView) {
            Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
            Context context = backgroundView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            backgroundView.setBackground(ChatBubbleStyle.e(context, R$attr.uikit_colorAccent, R$attr.uikit_colorDeepGrey, GradientDrawable.Orientation.BL_TR));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void d(TextView textView, boolean z) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            if (z) {
                Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textView.setTextColor(kli.a.s(R$attr.uikit_colorOnAccent, context));
            } else {
                Context context2 = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                textView.setTextColor(kli.a.s(R$attr.uikit_colorOnAccent_50, context2));
            }
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle$Gradient;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Gradient extends ChatBubbleStyle {

        @NotNull
        public static final Parcelable.Creator<Gradient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56807b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Gradient(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gradient[i];
            }
        }

        public Gradient(int i, int i2) {
            this.f56806a = i;
            this.f56807b = i2;
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorForeground, context));
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            view.setBackground(new RippleDrawable(colorStateListValueOf, ChatBubbleStyle.e(context2, this.f56806a, this.f56807b, GradientDrawable.Orientation.TOP_BOTTOM), null));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void b(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void c(View backgroundView) {
            Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
            Context context = backgroundView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            backgroundView.setBackground(ChatBubbleStyle.e(context, R$attr.uikit_colorGrey10, R$attr.uikit_colorGrey5, GradientDrawable.Orientation.BL_TR));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void d(TextView textView, boolean z) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            if (z) {
                Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textView.setTextColor(kli.a.s(R$attr.uikit_colorWhite, context));
            } else {
                Context context2 = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                textView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context2));
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) obj2;
            return this.f56806a == gradient.f56806a && this.f56807b == gradient.f56807b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f56807b) + (Integer.hashCode(this.f56806a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f56806a);
            dest.writeInt(this.f56807b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle$Grey;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Grey extends ChatBubbleStyle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Grey f56808a = new Grey();

        @NotNull
        public static final Parcelable.Creator<Grey> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Grey.f56808a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Grey[i];
            }
        }

        private Grey() {
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            gradientDrawable.setColor(kli.a.s(R$attr.uikit_colorWidgetBackground, context));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            gradientDrawable2.setColor(kli.a.s(R$attr.uikit_colorGreyTone8, context2));
            Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            view.setBackground(new RippleDrawable(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorGreyTone50, context3)), new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2}), null));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void b(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void c(View backgroundView) {
            Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
            Context context = backgroundView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            backgroundView.setBackground(ChatBubbleStyle.e(context, R$attr.uikit_colorGrey10, R$attr.uikit_colorGrey5, GradientDrawable.Orientation.BL_TR));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void d(TextView textView, boolean z) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            if (z) {
                Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textView.setTextColor(kli.a.s(R$attr.uikit_colorWhite, context));
            } else {
                Context context2 = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                textView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context2));
            }
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle$Light;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Light extends ChatBubbleStyle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Light f56809a = new Light();

        @NotNull
        public static final Parcelable.Creator<Light> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Light.f56809a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Light[i];
            }
        }

        private Light() {
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setBackground(ChatBubbleStyle.j(context, R$attr.uikit_colorWidgetBackground, R$attr.uikit_colorGreyTone10));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void b(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void c(View backgroundView) {
            Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
            Context context = backgroundView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            backgroundView.setBackground(ChatBubbleStyle.e(context, R$attr.uikit_colorGrey10, R$attr.uikit_colorGrey5, GradientDrawable.Orientation.BL_TR));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void d(TextView textView, boolean z) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            if (z) {
                Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textView.setTextColor(kli.a.s(R$attr.uikit_colorWhite, context));
            } else {
                Context context2 = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                textView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context2));
            }
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle$Search;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Search extends ChatBubbleStyle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Search f56810a = new Search();

        @NotNull
        public static final Parcelable.Creator<Search> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Search.f56810a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Search[i];
            }
        }

        private Search() {
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setBackground(ChatBubbleStyle.j(context, R$attr.uikit_colorSearchBackground, R$attr.uikit_colorGreyTone10));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void b(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void c(View backgroundView) {
            Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
            Context context = backgroundView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            backgroundView.setBackground(ChatBubbleStyle.e(context, R$attr.uikit_colorGrey10, R$attr.uikit_colorGrey5, GradientDrawable.Orientation.BL_TR));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void d(TextView textView, boolean z) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            if (z) {
                Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textView.setTextColor(kli.a.s(R$attr.uikit_colorWhite, context));
            } else {
                Context context2 = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                textView.setTextColor(kli.a.s(R$attr.uikit_colorGrey50, context2));
            }
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle$Uncontained;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Uncontained extends ChatBubbleStyle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Uncontained f56811a = new Uncontained();

        @NotNull
        public static final Parcelable.Creator<Uncontained> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Uncontained.f56811a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Uncontained[i];
            }
        }

        private Uncontained() {
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setBackground(null);
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void b(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void c(View backgroundView) {
            Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleStyle
        public final void d(TextView textView, boolean z) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            if (z) {
                Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textView.setTextColor(kli.a.s(R$attr.uikit_colorWhite, context));
            } else {
                Context context2 = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                textView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context2));
            }
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

    private ChatBubbleStyle() {
    }

    public static GradientDrawable e(Context context, int i, int i2, GradientDrawable.Orientation orientation) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{a.s(i, context), a.s(i2, context)});
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }

    public static RippleDrawable j(Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(a.s(i, context));
        return new RippleDrawable(ColorStateList.valueOf(a.s(i2, context)), gradientDrawable, null);
    }

    public abstract void a(View view);

    public abstract void b(TextView textView);

    public abstract void c(View view);

    public abstract void d(TextView textView, boolean z);
}
