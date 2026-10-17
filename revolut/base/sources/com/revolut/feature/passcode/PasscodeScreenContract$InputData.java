package com.revolut.feature.passcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.feature.passcode.PasscodeScreenContract$HeaderMode;
import com.revolut.feature.passcode.PasscodeScreenContract$VerificationMode;
import com.revolut.feature.passcode.PasscodeScreenContract$WallpaperBackground;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.utils.PinCodeHinter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/passcode/PasscodeScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_passcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PasscodeScreenContract$InputData implements IOData$Input {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PasscodeScreenContract$HeaderMode f78620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PinCodeView.Mode f78621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f78622c;
    public final PinCodeHinter d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f78623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f78624h;
    public final AnalyticsProduct i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f78625j;
    public final PasscodeScreenContract$WallpaperBackground k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PasscodeScreenContract$VerificationMode f78626l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f78627m;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<PasscodeScreenContract$InputData> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.passcode.PasscodeScreenContract$InputData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static PasscodeScreenContract$InputData a(Companion companion, PinCodeView.Header header, PinCodeView.Mode mode, PasscodeScreenContract$VerificationMode.Default verificationMode, boolean z, boolean z3, AnalyticsProduct.Shared shared, boolean z4, Boolean bool) {
            boolean z6 = verificationMode.f78629a;
            companion.getClass();
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
            PasscodeScreenContract$WallpaperBackground.Disabled wallpaperBackground = PasscodeScreenContract$WallpaperBackground.Disabled.f78630a;
            Intrinsics.checkNotNullParameter(wallpaperBackground, "wallpaperBackground");
            PasscodeScreenContract$HeaderMode.Static r110 = new PasscodeScreenContract$HeaderMode.Static(header);
            PinCodeHinter.INSTANCE.getClass();
            return new PasscodeScreenContract$InputData(r110, mode, true, PinCodeHinter.Companion.b(), z, true, z6, z3, shared, z4, wallpaperBackground, verificationMode, bool);
        }

        public static PasscodeScreenContract$InputData b(PinCodeView.Header.Title header, int i, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(header, "header");
            PasscodeScreenContract$HeaderMode.Static r2 = new PasscodeScreenContract$HeaderMode.Static(header);
            PinCodeView.Mode.Placeholder placeholder = new PinCodeView.Mode.Placeholder(i);
            PinCodeHinter.INSTANCE.getClass();
            return new PasscodeScreenContract$InputData(r2, placeholder, PinCodeHinter.Companion.a(), analyticsProduct, new PasscodeScreenContract$VerificationMode.Default(false));
        }

        public static PasscodeScreenContract$InputData c(PinCodeView.Header.Title header, PinCodeView.Mode.Placeholder mode, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(mode, "mode");
            PasscodeScreenContract$HeaderMode.Static r2 = new PasscodeScreenContract$HeaderMode.Static(header);
            PinCodeHinter.INSTANCE.getClass();
            return new PasscodeScreenContract$InputData(r2, mode, new PinCodeHinter(6, 5, null, new TextLocalisedClause(com.revolut.feature.pincode.common.R$string.revolut_passcode_pin_short_hint, null, null, 14)), analyticsProduct, new PasscodeScreenContract$VerificationMode.Default(false));
        }

        public static PasscodeScreenContract$InputData d(Companion companion, PinCodeView.Header.Title header, PinCodeView.Mode mode, PasscodeScreenContract$VerificationMode verificationMode, boolean z, AnalyticsProduct analyticsProduct, Boolean bool, int i) {
            boolean z3 = (i & 8) != 0;
            boolean z4 = (i & 16) != 0 ? false : z;
            boolean f78629a = verificationMode.getF78629a();
            AnalyticsProduct analyticsProduct2 = (i & 128) != 0 ? null : analyticsProduct;
            Boolean bool2 = (i & 256) != 0 ? null : bool;
            companion.getClass();
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
            PasscodeScreenContract$HeaderMode.Static r56 = new PasscodeScreenContract$HeaderMode.Static(header);
            PinCodeHinter.INSTANCE.getClass();
            return new PasscodeScreenContract$InputData(r56, mode, z3, PinCodeHinter.Companion.a(), z4, true, f78629a, true, analyticsProduct2, false, PasscodeScreenContract$WallpaperBackground.Disabled.f78630a, verificationMode, bool2);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            PinCodeHinter pinCodeHinter;
            boolean z4;
            boolean z6;
            boolean z11;
            boolean z12;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            PasscodeScreenContract$HeaderMode passcodeScreenContract$HeaderMode = (PasscodeScreenContract$HeaderMode) parcel.readParcelable(PasscodeScreenContract$InputData.class.getClassLoader());
            PinCodeView.Mode mode = (PinCodeView.Mode) parcel.readParcelable(PasscodeScreenContract$InputData.class.getClassLoader());
            boolean z29 = true;
            boolean z31 = parcel.readInt() != 0;
            PinCodeHinter pinCodeHinter2 = (PinCodeHinter) parcel.readParcelable(PasscodeScreenContract$InputData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z29 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = false;
                pinCodeHinter = pinCodeHinter2;
                z4 = z;
            } else {
                z3 = false;
                pinCodeHinter = pinCodeHinter2;
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = z;
            } else {
                z6 = z;
                z = z3;
            }
            if (parcel.readInt() != 0) {
                z11 = z3;
                z3 = z6;
            } else {
                z11 = z3;
            }
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(PasscodeScreenContract$InputData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z12 = z11;
                z11 = z6;
            } else {
                z12 = z11;
            }
            PasscodeScreenContract$WallpaperBackground passcodeScreenContract$WallpaperBackground = (PasscodeScreenContract$WallpaperBackground) parcel.readParcelable(PasscodeScreenContract$InputData.class.getClassLoader());
            PasscodeScreenContract$VerificationMode passcodeScreenContract$VerificationMode = (PasscodeScreenContract$VerificationMode) parcel.readParcelable(PasscodeScreenContract$InputData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z12 = z6;
                }
                boolValueOf = Boolean.valueOf(z12);
            }
            return new PasscodeScreenContract$InputData(passcodeScreenContract$HeaderMode, mode, z31, pinCodeHinter, z29, z4, z, z3, analyticsProduct, z11, passcodeScreenContract$WallpaperBackground, passcodeScreenContract$VerificationMode, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PasscodeScreenContract$InputData[i];
        }
    }

    public PasscodeScreenContract$InputData(PasscodeScreenContract$HeaderMode headerMode, PinCodeView.Mode mode, boolean z, PinCodeHinter pinCodeHinter, boolean z3, boolean z4, boolean z6, boolean z11, AnalyticsProduct analyticsProduct, boolean z12, PasscodeScreenContract$WallpaperBackground wallpaperBackground, PasscodeScreenContract$VerificationMode verificationMode, Boolean bool) {
        Intrinsics.checkNotNullParameter(headerMode, "headerMode");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(pinCodeHinter, "pinCodeHinter");
        Intrinsics.checkNotNullParameter(wallpaperBackground, "wallpaperBackground");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.f78620a = headerMode;
        this.f78621b = mode;
        this.f78622c = z;
        this.d = pinCodeHinter;
        this.e = z3;
        this.f = z4;
        this.f78623g = z6;
        this.f78624h = z11;
        this.i = analyticsProduct;
        this.f78625j = z12;
        this.k = wallpaperBackground;
        this.f78626l = verificationMode;
        this.f78627m = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PasscodeScreenContract$InputData)) {
            return false;
        }
        PasscodeScreenContract$InputData passcodeScreenContract$InputData = (PasscodeScreenContract$InputData) obj2;
        return Intrinsics.f(this.f78620a, passcodeScreenContract$InputData.f78620a) && Intrinsics.f(this.f78621b, passcodeScreenContract$InputData.f78621b) && this.f78622c == passcodeScreenContract$InputData.f78622c && Intrinsics.f(this.d, passcodeScreenContract$InputData.d) && this.e == passcodeScreenContract$InputData.e && this.f == passcodeScreenContract$InputData.f && this.f78623g == passcodeScreenContract$InputData.f78623g && this.f78624h == passcodeScreenContract$InputData.f78624h && Intrinsics.f(this.i, passcodeScreenContract$InputData.i) && this.f78625j == passcodeScreenContract$InputData.f78625j && Intrinsics.f(this.k, passcodeScreenContract$InputData.k) && Intrinsics.f(this.f78626l, passcodeScreenContract$InputData.f78626l) && Intrinsics.f(this.f78627m, passcodeScreenContract$InputData.f78627m);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.d.hashCode() + j6.a.c((this.f78621b.hashCode() + (this.f78620a.hashCode() * 31)) * 31, 31, this.f78622c)) * 31, 31, this.e), 31, this.f), 31, this.f78623g), 31, this.f78624h);
        AnalyticsProduct analyticsProduct = this.i;
        int iHashCode = (this.f78626l.hashCode() + ((this.k.hashCode() + j6.a.c((iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31, 31, this.f78625j)) * 31)) * 31;
        Boolean bool = this.f78627m;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78620a, i);
        dest.writeParcelable(this.f78621b, i);
        dest.writeInt(this.f78622c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f78623g ? 1 : 0);
        dest.writeInt(this.f78624h ? 1 : 0);
        dest.writeParcelable(this.i, i);
        dest.writeInt(this.f78625j ? 1 : 0);
        dest.writeParcelable(this.k, i);
        dest.writeParcelable(this.f78626l, i);
        Boolean bool = this.f78627m;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }

    public /* synthetic */ PasscodeScreenContract$InputData(PasscodeScreenContract$HeaderMode.Static r152, PinCodeView.Mode.Placeholder placeholder, PinCodeHinter pinCodeHinter, AnalyticsProduct analyticsProduct, PasscodeScreenContract$VerificationMode.Default r192) {
        this(r152, placeholder, false, pinCodeHinter, false, true, false, true, analyticsProduct, false, PasscodeScreenContract$WallpaperBackground.Disabled.f78630a, r192, null);
    }
}
