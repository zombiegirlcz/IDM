package com.revolut.core.ui_kit.views.navbar;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItemBadge;", "Landroid/os/Parcelable;", "<init>", "()V", "None", "Dot", "Text", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItemBadge$Dot;", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItemBadge$None;", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItemBadge$Text;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class NavBarMenuItemBadge implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItemBadge$Dot;", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItemBadge;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Dot extends NavBarMenuItemBadge {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Dot f59308a = new Dot();

        @NotNull
        public static final Parcelable.Creator<Dot> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Dot.f59308a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dot[i];
            }
        }

        private Dot() {
        }

        @Override // com.revolut.core.ui_kit.views.navbar.NavBarMenuItemBadge
        public final boolean a() {
            return true;
        }

        @Override // com.revolut.core.ui_kit.views.navbar.NavBarMenuItemBadge
        /* JADX INFO: renamed from: b */
        public final String getF59310a() {
            return null;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItemBadge$None;", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItemBadge;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None extends NavBarMenuItemBadge {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f59309a = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.f59309a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new None[i];
            }
        }

        private None() {
        }

        @Override // com.revolut.core.ui_kit.views.navbar.NavBarMenuItemBadge
        public final boolean a() {
            return false;
        }

        @Override // com.revolut.core.ui_kit.views.navbar.NavBarMenuItemBadge
        /* JADX INFO: renamed from: b */
        public final String getF59310a() {
            return null;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItemBadge$Text;", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItemBadge;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Text extends NavBarMenuItemBadge {

        @NotNull
        public static final Parcelable.Creator<Text> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f59310a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Text(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Text[i];
            }
        }

        public Text(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f59310a = value;
        }

        @Override // com.revolut.core.ui_kit.views.navbar.NavBarMenuItemBadge
        public final boolean a() {
            return false;
        }

        @Override // com.revolut.core.ui_kit.views.navbar.NavBarMenuItemBadge
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF59310a() {
            return this.f59310a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Text) && Intrinsics.f(this.f59310a, ((Text) obj2).f59310a);
        }

        public final int hashCode() {
            return this.f59310a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f59310a);
        }
    }

    private NavBarMenuItemBadge() {
    }

    public abstract boolean a();

    /* JADX INFO: renamed from: b */
    public abstract String getF59310a();
}
