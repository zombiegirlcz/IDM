package com.revolut.retail.core.navigation;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/core/navigation/IntentCommand;", "Lcom/revolut/retail/core/navigation/NaviCommand;", "", "toString", "()Ljava/lang/String;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class IntentCommand extends NaviCommand {

    @NotNull
    public static final Parcelable.Creator<IntentCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f98660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f98661b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IntentCommand((Intent) parcel.readParcelable(IntentCommand.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IntentCommand[i];
        }
    }

    public IntentCommand(Intent intent, Integer num) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f98660a = intent;
        this.f98661b = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Intent getF98660a() {
        return this.f98660a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getF98661b() {
        return this.f98661b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IntentCommand)) {
            return false;
        }
        IntentCommand intentCommand = (IntentCommand) obj2;
        return Intrinsics.f(this.f98660a, intentCommand.f98660a) && Intrinsics.f(this.f98661b, intentCommand.f98661b);
    }

    public final int hashCode() {
        int iHashCode = this.f98660a.hashCode() * 31;
        Integer num = this.f98661b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98660a, i);
        Integer num = this.f98661b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }

    public /* synthetic */ IntentCommand(Intent intent) {
        this(intent, null);
    }
}
