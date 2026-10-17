package com.revolut.feature.remote_stories.models.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/remote_stories/models/params/RemoteStoryModelButtonParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_remote_stories_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RemoteStoryModelButtonParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RemoteStoryModelButtonParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tza.a f82011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f82012b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RemoteStoryModelButtonParams(tza.a.valueOf(parcel.readString()), (NaviCommand) parcel.readParcelable(RemoteStoryModelButtonParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RemoteStoryModelButtonParams[i];
        }
    }

    public RemoteStoryModelButtonParams() {
        this((tza.a) null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RemoteStoryModelButtonParams)) {
            return false;
        }
        RemoteStoryModelButtonParams remoteStoryModelButtonParams = (RemoteStoryModelButtonParams) obj2;
        return this.f82011a == remoteStoryModelButtonParams.f82011a && Intrinsics.f(this.f82012b, remoteStoryModelButtonParams.f82012b);
    }

    public final int hashCode() {
        return this.f82012b.hashCode() + (this.f82011a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82011a.name());
        dest.writeParcelable(this.f82012b, i);
    }

    public RemoteStoryModelButtonParams(tza.a style, NaviCommand command) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(command, "command");
        this.f82011a = style;
        this.f82012b = command;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RemoteStoryModelButtonParams(tza.a aVar, int i) {
        NaviCommand finishCommand;
        aVar = (i & 1) != 0 ? tza.a.WHITE : aVar;
        if ((i & 2) != 0) {
            finishCommand = new FinishCommand(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
        } else {
            finishCommand = DummyCommand.f98635a;
        }
        this(aVar, finishCommand);
    }
}
