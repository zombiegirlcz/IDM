package xjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements bjl.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mni.a f306554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mni.a f306555b;

    public e(mni.a otpDispatcher, mni.a otpObservable) {
        Intrinsics.checkNotNullParameter(otpDispatcher, "otpDispatcher");
        Intrinsics.checkNotNullParameter(otpObservable, "otpObservable");
        this.f306554a = otpDispatcher;
        this.f306555b = otpObservable;
    }

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        String strD;
        Intrinsics.checkNotNullParameter(message, "message");
        if (!ipa.k.r(message) || (strD = ipa.k.d(message)) == null || strD.length() != 6) {
            return false;
        }
        String strD2 = ipa.k.d(message);
        if (strD2 == null) {
            strD2 = "";
        }
        this.f306554a.c(strD2);
        return false;
    }
}
