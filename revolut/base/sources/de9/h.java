package de9;

import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f113323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f113324c;
    public final Data d;
    public final PinCodeView.Header e;

    public h(String passcode, long j2, boolean z, Data passcodeVerificationState, PinCodeView.Header header) {
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        Intrinsics.checkNotNullParameter(passcodeVerificationState, "passcodeVerificationState");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f113322a = passcode;
        this.f113323b = j2;
        this.f113324c = z;
        this.d = passcodeVerificationState;
        this.e = header;
    }

    public static h a(h hVar, String str, long j2, boolean z, Data data, PinCodeView.Header header, int i) {
        if ((i & 1) != 0) {
            str = hVar.f113322a;
        }
        String passcode = str;
        if ((i & 2) != 0) {
            j2 = hVar.f113323b;
        }
        long j3 = j2;
        if ((i & 4) != 0) {
            z = hVar.f113324c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            data = hVar.d;
        }
        Data passcodeVerificationState = data;
        if ((i & 16) != 0) {
            header = hVar.e;
        }
        PinCodeView.Header header2 = header;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        Intrinsics.checkNotNullParameter(passcodeVerificationState, "passcodeVerificationState");
        Intrinsics.checkNotNullParameter(header2, "header");
        return new h(passcode, j3, z3, passcodeVerificationState, header2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f113322a, hVar.f113322a) && this.f113323b == hVar.f113323b && this.f113324c == hVar.f113324c && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, j6.a.c(a0.d.c(this.f113322a.hashCode() * 31, 31, this.f113323b), 31, this.f113324c), 31);
    }
}
