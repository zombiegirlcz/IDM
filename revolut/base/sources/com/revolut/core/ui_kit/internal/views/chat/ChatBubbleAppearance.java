package com.revolut.core.ui_kit.internal.views.chat;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo0.g;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleAppearance;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChatBubbleAppearance implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChatBubbleAppearance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatBubbleStyle f56787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatBubbleTitleStyle f56788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f56789c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChatBubbleAppearance((ChatBubbleStyle) parcel.readParcelable(ChatBubbleAppearance.class.getClassLoader()), (ChatBubbleTitleStyle) parcel.readParcelable(ChatBubbleAppearance.class.getClassLoader()), g.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChatBubbleAppearance[i];
        }
    }

    public ChatBubbleAppearance(ChatBubbleStyle style, ChatBubbleTitleStyle titleStyle, g position) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f56787a = style;
        this.f56788b = titleStyle;
        this.f56789c = position;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChatBubbleAppearance)) {
            return false;
        }
        ChatBubbleAppearance chatBubbleAppearance = (ChatBubbleAppearance) obj2;
        return Intrinsics.f(this.f56787a, chatBubbleAppearance.f56787a) && Intrinsics.f(this.f56788b, chatBubbleAppearance.f56788b) && this.f56789c == chatBubbleAppearance.f56789c;
    }

    public final int hashCode() {
        return this.f56789c.hashCode() + ((this.f56788b.hashCode() + (this.f56787a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f56787a, i);
        dest.writeParcelable(this.f56788b, i);
        dest.writeString(this.f56789c.name());
    }
}
