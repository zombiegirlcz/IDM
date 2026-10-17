package com.revolut.retail.core.navigation;

import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/core/navigation/IntentSenderCommand;", "Lcom/revolut/retail/core/navigation/NaviCommand;", "", "toString", "()Ljava/lang/String;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class IntentSenderCommand extends NaviCommand {

    @NotNull
    public static final Parcelable.Creator<IntentSenderCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f98662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98663b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IntentSenderCommand((IntentSender) parcel.readParcelable(IntentSenderCommand.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IntentSenderCommand[i];
        }
    }

    public IntentSenderCommand(IntentSender intentSender, int i) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f98662a = intentSender;
        this.f98663b = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final IntentSender getF98662a() {
        return this.f98662a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF98663b() {
        return this.f98663b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IntentSenderCommand)) {
            return false;
        }
        IntentSenderCommand intentSenderCommand = (IntentSenderCommand) obj2;
        return Intrinsics.f(this.f98662a, intentSenderCommand.f98662a) && this.f98663b == intentSenderCommand.f98663b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98663b) + (this.f98662a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98662a, i);
        dest.writeInt(this.f98663b);
    }
}
