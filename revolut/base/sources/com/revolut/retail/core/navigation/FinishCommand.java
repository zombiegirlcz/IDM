package com.revolut.retail.core.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/core/navigation/FinishCommand;", "Lcom/revolut/retail/core/navigation/NaviCommand;", "", "toString", "()Ljava/lang/String;", "Mode", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class FinishCommand extends NaviCommand {

    @NotNull
    public static final Parcelable.Creator<FinishCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f98642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f98643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mode f98644c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/core/navigation/FinishCommand$Mode;", "Landroid/os/Parcelable;", "FinishAffinity", "FinishAfterTransition", "Lcom/revolut/retail/core/navigation/FinishCommand$Mode$FinishAffinity;", "Lcom/revolut/retail/core/navigation/FinishCommand$Mode$FinishAfterTransition;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Mode extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/core/navigation/FinishCommand$Mode$FinishAffinity;", "Lcom/revolut/retail/core/navigation/FinishCommand$Mode;", "<init>", "()V", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class FinishAffinity implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final FinishAffinity f98645a = new FinishAffinity();

            @NotNull
            public static final Parcelable.Creator<FinishAffinity> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return FinishAffinity.f98645a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FinishAffinity[i];
                }
            }

            private FinishAffinity() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/core/navigation/FinishCommand$Mode$FinishAfterTransition;", "Lcom/revolut/retail/core/navigation/FinishCommand$Mode;", "<init>", "()V", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class FinishAfterTransition implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final FinishAfterTransition f98646a = new FinishAfterTransition();

            @NotNull
            public static final Parcelable.Creator<FinishAfterTransition> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return FinishAfterTransition.f98646a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FinishAfterTransition[i];
                }
            }

            private FinishAfterTransition() {
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
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readValue(FinishCommand.class.getClassLoader()));
            }
            return new FinishCommand(numValueOf, linkedHashMap, (Mode) parcel.readParcelable(FinishCommand.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FinishCommand[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FinishCommand() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FinishCommand)) {
            return false;
        }
        FinishCommand finishCommand = (FinishCommand) obj2;
        return Intrinsics.f(this.f98642a, finishCommand.f98642a) && Intrinsics.f(this.f98643b, finishCommand.f98643b) && Intrinsics.f(this.f98644c, finishCommand.f98644c);
    }

    public final int hashCode() {
        Integer num = this.f98642a;
        int iE = p.a.e((num == null ? 0 : num.hashCode()) * 31, 31, this.f98643b);
        Mode mode = this.f98644c;
        return iE + (mode != null ? mode.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.f98642a;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Iterator itZ = j6.a.z(this.f98643b, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeValue(entry.getValue());
        }
        dest.writeParcelable(this.f98644c, i);
    }

    public FinishCommand(Integer num, Map extras, Mode mode) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f98642a = num;
        this.f98643b = extras;
        this.f98644c = mode;
    }

    public /* synthetic */ FinishCommand(Integer num, Map map, Mode mode, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? r0.g() : map, (i & 4) != 0 ? null : mode);
    }
}
