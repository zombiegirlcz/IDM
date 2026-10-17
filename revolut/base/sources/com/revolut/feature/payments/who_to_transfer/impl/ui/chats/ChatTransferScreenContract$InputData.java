package com.revolut.feature.payments.who_to_transfer.impl.ui.chats;

import android.os.Parcel;
import android.os.Parcelable;
import c5a.n;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TabTransferShotDialogAction;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/who_to_transfer/impl/ui/chats/ChatTransferScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChatTransferScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ChatTransferScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f80150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80152c;
    public final TabTransferShotDialogAction d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChatTransferScreenContract$InputData(n.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, (TabTransferShotDialogAction) parcel.readParcelable(ChatTransferScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChatTransferScreenContract$InputData[i];
        }
    }

    public ChatTransferScreenContract$InputData(n navBarMode, boolean z, boolean z3, TabTransferShotDialogAction tabTransferShotDialogAction) {
        Intrinsics.checkNotNullParameter(navBarMode, "navBarMode");
        this.f80150a = navBarMode;
        this.f80151b = z;
        this.f80152c = z3;
        this.d = tabTransferShotDialogAction;
    }

    public final boolean a() {
        return this.f80150a != n.FULLSCREEN;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChatTransferScreenContract$InputData)) {
            return false;
        }
        ChatTransferScreenContract$InputData chatTransferScreenContract$InputData = (ChatTransferScreenContract$InputData) obj2;
        return this.f80150a == chatTransferScreenContract$InputData.f80150a && this.f80151b == chatTransferScreenContract$InputData.f80151b && this.f80152c == chatTransferScreenContract$InputData.f80152c && Intrinsics.f(this.d, chatTransferScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f80150a.hashCode() * 31, 31, this.f80151b), 31, this.f80152c);
        TabTransferShotDialogAction tabTransferShotDialogAction = this.d;
        return iC + (tabTransferShotDialogAction == null ? 0 : tabTransferShotDialogAction.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80150a.name());
        dest.writeInt(this.f80151b ? 1 : 0);
        dest.writeInt(this.f80152c ? 1 : 0);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ ChatTransferScreenContract$InputData(n nVar) {
        this(nVar, false, false, null);
    }
}
