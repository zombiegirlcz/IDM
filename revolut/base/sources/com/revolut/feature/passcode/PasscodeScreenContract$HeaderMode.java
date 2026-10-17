package com.revolut.feature.passcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/passcode/PasscodeScreenContract$HeaderMode", "Landroid/os/Parcelable;", "Static", "Dynamic", "Lcom/revolut/feature/passcode/PasscodeScreenContract$HeaderMode$Dynamic;", "Lcom/revolut/feature/passcode/PasscodeScreenContract$HeaderMode$Static;", "feature_passcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PasscodeScreenContract$HeaderMode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/passcode/PasscodeScreenContract$HeaderMode$Dynamic;", "Lcom/revolut/feature/passcode/PasscodeScreenContract$HeaderMode;", "", "toString", "()Ljava/lang/String;", "feature_passcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dynamic implements PasscodeScreenContract$HeaderMode {

        @NotNull
        public static final Parcelable.Creator<Dynamic> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PinCodeView.Header f78618a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Dynamic((PinCodeView.Header) parcel.readParcelable(Dynamic.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dynamic[i];
            }
        }

        public Dynamic(PinCodeView.Header initialHeader) {
            Intrinsics.checkNotNullParameter(initialHeader, "initialHeader");
            this.f78618a = initialHeader;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Dynamic) && Intrinsics.f(this.f78618a, ((Dynamic) obj2).f78618a);
        }

        public final int hashCode() {
            return this.f78618a.hashCode();
        }

        @Override // com.revolut.feature.passcode.PasscodeScreenContract$HeaderMode
        /* JADX INFO: renamed from: w4, reason: from getter */
        public final PinCodeView.Header getF78619a() {
            return this.f78618a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78618a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/passcode/PasscodeScreenContract$HeaderMode$Static;", "Lcom/revolut/feature/passcode/PasscodeScreenContract$HeaderMode;", "", "toString", "()Ljava/lang/String;", "feature_passcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Static implements PasscodeScreenContract$HeaderMode {

        @NotNull
        public static final Parcelable.Creator<Static> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PinCodeView.Header f78619a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Static((PinCodeView.Header) parcel.readParcelable(Static.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Static[i];
            }
        }

        public Static(PinCodeView.Header initialHeader) {
            Intrinsics.checkNotNullParameter(initialHeader, "initialHeader");
            this.f78619a = initialHeader;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Static) && Intrinsics.f(this.f78619a, ((Static) obj2).f78619a);
        }

        public final int hashCode() {
            return this.f78619a.hashCode();
        }

        @Override // com.revolut.feature.passcode.PasscodeScreenContract$HeaderMode
        /* JADX INFO: renamed from: w4, reason: from getter */
        public final PinCodeView.Header getF78619a() {
            return this.f78619a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78619a, i);
        }
    }

    /* JADX INFO: renamed from: w4 */
    PinCodeView.Header getF78619a();
}
