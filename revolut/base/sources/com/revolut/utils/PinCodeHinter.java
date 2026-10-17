package com.revolut.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pincode.common.R$string;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yx0.f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/utils/PinCodeHinter;", "Lyx0/f;", "Landroid/os/Parcelable;", "Companion", "a", "feature_pincode_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PinCodeHinter implements f, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f107332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f107333c;
    public final Clause d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<PinCodeHinter> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.utils.PinCodeHinter$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static PinCodeHinter a() {
            return new PinCodeHinter(1, 3, null, new TextLocalisedClause(R$string.revolut_passcode_pin_short_hint, null, null, 14));
        }

        public static PinCodeHinter b() {
            return new PinCodeHinter(1, 3, new TextLocalisedClause(R$string.revolut_passcode_pin_empty_hint, null, null, 14), new TextLocalisedClause(R$string.revolut_passcode_pin_short_hint, null, null, 14));
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PinCodeHinter(parcel.readInt(), parcel.readInt(), (Clause) parcel.readParcelable(PinCodeHinter.class.getClassLoader()), (Clause) parcel.readParcelable(PinCodeHinter.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PinCodeHinter[i];
        }
    }

    public PinCodeHinter(int i, int i2, Clause clause, Clause clause2) {
        this.f107331a = i;
        this.f107332b = i2;
        this.f107333c = clause;
        this.d = clause2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!PinCodeHinter.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.utils.PinCodeHinter");
        PinCodeHinter pinCodeHinter = (PinCodeHinter) obj2;
        if (this.f107331a == pinCodeHinter.f107331a && this.f107332b == pinCodeHinter.f107332b && Intrinsics.f(this.f107333c, pinCodeHinter.f107333c)) {
            return Intrinsics.f(this.d, pinCodeHinter.d);
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.f107331a * 31) + this.f107332b) * 31;
        Clause clause = this.f107333c;
        return this.d.hashCode() + ((i + (clause != null ? clause.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f107331a);
        dest.writeInt(this.f107332b);
        dest.writeParcelable(this.f107333c, i);
        dest.writeParcelable(this.d, i);
    }
}
