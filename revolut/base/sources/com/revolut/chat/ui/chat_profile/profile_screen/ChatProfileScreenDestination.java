package com.revolut.chat.ui.chat_profile.profile_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.chat.ui.chat_profile.ChatProfileInputData;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/chat/ui/chat_profile/profile_screen/ChatProfileScreenDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/chat/ui/chat_profile/ChatProfileInputData;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatProfileScreenDestination extends InternalDestination<ChatProfileInputData> {

    @NotNull
    public static final Parcelable.Creator<ChatProfileScreenDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatProfileInputData f51131b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChatProfileScreenDestination((ChatProfileInputData) parcel.readParcelable(ChatProfileScreenDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChatProfileScreenDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatProfileScreenDestination(ChatProfileInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f51131b = inputData;
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF98300a() {
        return this.f51131b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ChatProfileInputData getF51131b() {
        return this.f51131b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f51131b, i);
    }
}
