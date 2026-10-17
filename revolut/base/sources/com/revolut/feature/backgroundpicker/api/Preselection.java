package com.revolut.feature.backgroundpicker.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/backgroundpicker/api/Preselection;", "Landroid/os/Parcelable;", "ThemePreselection", "Lcom/revolut/feature/backgroundpicker/api/Preselection$ThemePreselection;", "feature_background_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface Preselection extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/api/Preselection$ThemePreselection;", "Lcom/revolut/feature/backgroundpicker/api/Preselection;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ThemePreselection implements Preselection {

        @NotNull
        public static final Parcelable.Creator<ThemePreselection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f63733b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ThemePreselection(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThemePreselection[i];
            }
        }

        public ThemePreselection(String themeId, boolean z) {
            Intrinsics.checkNotNullParameter(themeId, "themeId");
            this.f63732a = themeId;
            this.f63733b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ThemePreselection)) {
                return false;
            }
            ThemePreselection themePreselection = (ThemePreselection) obj2;
            return Intrinsics.f(this.f63732a, themePreselection.f63732a) && this.f63733b == themePreselection.f63733b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f63733b) + (this.f63732a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63732a);
            dest.writeInt(this.f63733b ? 1 : 0);
        }
    }
}
