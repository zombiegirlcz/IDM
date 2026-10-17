package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
final class ox0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f31783b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31784a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ox0(String otp) {
        Intrinsics.checkNotNullParameter(otp, "otp");
        this.f31784a = otp;
    }

    public final String a() {
        return this.f31784a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ox0) && Intrinsics.f(this.f31784a, ((ox0) obj2).f31784a);
    }

    public int hashCode() {
        return this.f31784a.hashCode();
    }

    public String toString() {
        return "QesUserConfirmationRequest(otp=" + this.f31784a + ")";
    }
}
