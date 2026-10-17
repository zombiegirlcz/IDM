package com.revolut.retail.core.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/retail/core/navigation/ActivityAnimation;", "Landroid/os/Parcelable;", "<init>", "()V", "System", "Expand", "ContentTransition", "Lcom/revolut/retail/core/navigation/ActivityAnimation$ContentTransition;", "Lcom/revolut/retail/core/navigation/ActivityAnimation$Expand;", "Lcom/revolut/retail/core/navigation/ActivityAnimation$System;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ActivityAnimation implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/core/navigation/ActivityAnimation$Expand;", "Lcom/revolut/retail/core/navigation/ActivityAnimation;", "", "toString", "()Ljava/lang/String;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Expand extends ActivityAnimation {

        @NotNull
        public static final Parcelable.Creator<Expand> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98615a;

        /* JADX INFO: loaded from: classes10.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Expand(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Expand[i];
            }
        }

        public Expand(String sharedViewStorageKey) {
            Intrinsics.checkNotNullParameter(sharedViewStorageKey, "sharedViewStorageKey");
            this.f98615a = sharedViewStorageKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Expand) && Intrinsics.f(this.f98615a, ((Expand) obj2).f98615a);
        }

        public final int hashCode() {
            return this.f98615a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f98615a);
        }
    }

    private ActivityAnimation() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/core/navigation/ActivityAnimation$ContentTransition;", "Lcom/revolut/retail/core/navigation/ActivityAnimation;", "", "toString", "()Ljava/lang/String;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContentTransition extends ActivityAnimation {

        @NotNull
        public static final Parcelable.Creator<ContentTransition> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f98614a;

        /* JADX INFO: loaded from: classes10.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ContentTransition(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContentTransition[i];
            }
        }

        public ContentTransition(boolean z) {
            this.f98614a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ContentTransition) && this.f98614a == ((ContentTransition) obj2).f98614a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f98614a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f98614a ? 1 : 0);
        }

        public ContentTransition() {
            this(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/core/navigation/ActivityAnimation$System;", "Lcom/revolut/retail/core/navigation/ActivityAnimation;", "", "toString", "()Ljava/lang/String;", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class System extends ActivityAnimation {

        @NotNull
        public static final Parcelable.Creator<System> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f98616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f98617b;

        /* JADX INFO: loaded from: classes10.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new System(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new System[i];
            }
        }

        public System(Integer num, Integer num2) {
            this.f98616a = num;
            this.f98617b = num2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof System)) {
                return false;
            }
            System system = (System) obj2;
            return Intrinsics.f(this.f98616a, system.f98616a) && Intrinsics.f(this.f98617b, system.f98617b);
        }

        public final int hashCode() {
            Integer num = this.f98616a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f98617b;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.f98616a;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            Integer num2 = this.f98617b;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num2);
            }
        }

        public System() {
            this(null, null);
        }
    }
}
