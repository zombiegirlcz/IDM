package com.revolut.feature.mainscreen.core.api.ui.screen;

import android.os.Parcel;
import android.os.Parcelable;
import dy0.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/mainscreen/core/api/ui/screen/MainContainerNavigationId;", "Landroid/os/Parcelable;", "<init>", "()V", "MainContainerScreenId", "MainContainerTabId", "NewMainScreenContainerTabId", "Lcom/revolut/feature/mainscreen/core/api/ui/screen/MainContainerNavigationId$MainContainerScreenId;", "Lcom/revolut/feature/mainscreen/core/api/ui/screen/MainContainerNavigationId$MainContainerTabId;", "Lcom/revolut/feature/mainscreen/core/api/ui/screen/MainContainerNavigationId$NewMainScreenContainerTabId;", "feature_mainscreen_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MainContainerNavigationId implements Parcelable {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/mainscreen/core/api/ui/screen/MainContainerNavigationId$MainContainerScreenId;", "Lcom/revolut/feature/mainscreen/core/api/ui/screen/MainContainerNavigationId;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_mainscreen_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MainContainerScreenId extends MainContainerNavigationId implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<MainContainerScreenId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78082a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MainContainerScreenId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MainContainerScreenId[i];
            }
        }

        public MainContainerScreenId(String stringValue) {
            Intrinsics.checkNotNullParameter(stringValue, "stringValue");
            this.f78082a = stringValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MainContainerScreenId) && Intrinsics.f(this.f78082a, ((MainContainerScreenId) obj2).f78082a);
        }

        public final int hashCode() {
            return this.f78082a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78082a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/mainscreen/core/api/ui/screen/MainContainerNavigationId$MainContainerTabId;", "Lcom/revolut/feature/mainscreen/core/api/ui/screen/MainContainerNavigationId;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_mainscreen_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MainContainerTabId extends MainContainerNavigationId implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<MainContainerTabId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78083a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MainContainerTabId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MainContainerTabId[i];
            }
        }

        public MainContainerTabId(String stringValue) {
            Intrinsics.checkNotNullParameter(stringValue, "stringValue");
            this.f78083a = stringValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MainContainerTabId) && Intrinsics.f(this.f78083a, ((MainContainerTabId) obj2).f78083a);
        }

        public final int hashCode() {
            return this.f78083a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78083a);
        }
    }

    private MainContainerNavigationId() {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/mainscreen/core/api/ui/screen/MainContainerNavigationId$NewMainScreenContainerTabId;", "Lcom/revolut/feature/mainscreen/core/api/ui/screen/MainContainerNavigationId;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_mainscreen_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewMainScreenContainerTabId extends MainContainerNavigationId implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<NewMainScreenContainerTabId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f78085b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewMainScreenContainerTabId(parcel.readString(), parcel.readInt() == 0 ? null : o.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewMainScreenContainerTabId[i];
            }
        }

        public NewMainScreenContainerTabId(String stringValue, o oVar) {
            Intrinsics.checkNotNullParameter(stringValue, "stringValue");
            this.f78084a = stringValue;
            this.f78085b = oVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewMainScreenContainerTabId)) {
                return false;
            }
            NewMainScreenContainerTabId newMainScreenContainerTabId = (NewMainScreenContainerTabId) obj2;
            return Intrinsics.f(this.f78084a, newMainScreenContainerTabId.f78084a) && this.f78085b == newMainScreenContainerTabId.f78085b;
        }

        public final int hashCode() {
            int iHashCode = this.f78084a.hashCode() * 31;
            o oVar = this.f78085b;
            return iHashCode + (oVar == null ? 0 : oVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78084a);
            o oVar = this.f78085b;
            if (oVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(oVar.name());
            }
        }

        public /* synthetic */ NewMainScreenContainerTabId(String str) {
            this(str, null);
        }
    }
}
