package com.revolut.chat.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/chat/navigation/ChatFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChatFlowDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ChatFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatTarget f51110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f51111c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChatFlowDestination((ChatTarget) parcel.readParcelable(ChatFlowDestination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChatFlowDestination[i];
        }
    }

    public /* synthetic */ ChatFlowDestination(ChatTarget chatTarget) {
        this(chatTarget, true);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ChatTarget getF51110b() {
        return this.f51110b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChatFlowDestination)) {
            return false;
        }
        ChatFlowDestination chatFlowDestination = (ChatFlowDestination) obj2;
        return Intrinsics.f(this.f51110b, chatFlowDestination.f51110b) && this.f51111c == chatFlowDestination.f51111c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f51111c) + (this.f51110b.hashCode() * 31);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getF51111c() {
        return this.f51111c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f51110b, i);
        dest.writeInt(this.f51111c ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFlowDestination(ChatTarget chatTarget, boolean z) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(chatTarget, "chatTarget");
        this.f51110b = chatTarget;
        this.f51111c = z;
    }
}
