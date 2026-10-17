package com.revolut.core.ui_kit.internal.views.chat;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chat/ChatBubbleButtonModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChatBubbleButtonModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChatBubbleButtonModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f56790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h4 f56791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f56792c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChatBubbleButtonModel((Clause) parcel.readParcelable(ChatBubbleButtonModel.class.getClassLoader()), h4.valueOf(parcel.readString()), (Image) parcel.readParcelable(ChatBubbleButtonModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChatBubbleButtonModel[i];
        }
    }

    public ChatBubbleButtonModel(Clause text, h4 style, Image image) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f56790a = text;
        this.f56791b = style;
        this.f56792c = image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChatBubbleButtonModel)) {
            return false;
        }
        ChatBubbleButtonModel chatBubbleButtonModel = (ChatBubbleButtonModel) obj2;
        return Intrinsics.f(this.f56790a, chatBubbleButtonModel.f56790a) && this.f56791b == chatBubbleButtonModel.f56791b && Intrinsics.f(this.f56792c, chatBubbleButtonModel.f56792c);
    }

    public final int hashCode() {
        int iHashCode = (this.f56791b.hashCode() + (this.f56790a.hashCode() * 31)) * 31;
        Image image = this.f56792c;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f56790a, i);
        dest.writeString(this.f56791b.name());
        dest.writeParcelable(this.f56792c, i);
    }
}
