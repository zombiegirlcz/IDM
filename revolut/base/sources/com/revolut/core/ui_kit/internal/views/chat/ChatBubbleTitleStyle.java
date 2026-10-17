package com.revolut.core.ui_kit.internal.views.chat;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleTitleStyle;", "Landroid/os/Parcelable;", "<init>", "()V", "Custom", "Foreground", "Blue", "White", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleTitleStyle$Blue;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleTitleStyle$Custom;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleTitleStyle$Foreground;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleTitleStyle$White;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ChatBubbleTitleStyle implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleTitleStyle$Blue;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleTitleStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Blue extends ChatBubbleTitleStyle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Blue f56814a = new Blue();

        @NotNull
        public static final Parcelable.Creator<Blue> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Blue.f56814a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Blue[i];
            }
        }

        private Blue() {
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleTitleStyle
        public final void a(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setTextColor(kli.a.s(R$attr.uikit_colorAccent, context));
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleTitleStyle$Custom;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleTitleStyle;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custom extends ChatBubbleTitleStyle {

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56815a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Custom(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom(int i) {
            this.f56815a = i;
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleTitleStyle
        public final void a(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            textView.getPaint().setShader(null);
            textView.setTextColor(this.f56815a);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Custom) && this.f56815a == ((Custom) obj2).f56815a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f56815a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f56815a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleTitleStyle$Foreground;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleTitleStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Foreground extends ChatBubbleTitleStyle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Foreground f56816a = new Foreground();

        @NotNull
        public static final Parcelable.Creator<Foreground> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Foreground.f56816a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Foreground[i];
            }
        }

        private Foreground() {
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleTitleStyle
        public final void a(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            textView.getPaint().setShader(null);
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleTitleStyle$White;", "Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleTitleStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class White extends ChatBubbleTitleStyle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final White f56817a = new White();

        @NotNull
        public static final Parcelable.Creator<White> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return White.f56817a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new White[i];
            }
        }

        private White() {
        }

        @Override // com.revolut.core.ui_kit.internal.views.chat.ChatBubbleTitleStyle
        public final void a(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            textView.getPaint().setShader(null);
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setTextColor(kli.a.s(R$attr.uikit_colorOnAccent, context));
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

    private ChatBubbleTitleStyle() {
    }

    public abstract void a(TextView textView);
}
