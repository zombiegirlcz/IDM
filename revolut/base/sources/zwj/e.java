package zwj;

import android.content.Context;
import bjl.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import skm.p0;
import te0.w;
import zt4.l;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements jf0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f325971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f325972b;

    public e(f otpContentInteractor, Context context) {
        Intrinsics.checkNotNullParameter(otpContentInteractor, "otpContentInteractor");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f325971a = otpContentInteractor;
        this.f325972b = context;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return d0.J(deeplink.f173627a, "email-authenticate", false) && !Intrinsics.f(deeplink.d.get("scope"), "post-onboarding-email-verification");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return w.o0(p0.f264003c, new l(this, (String) zhm.d0.m0(deeplink.h()), null, 12));
    }
}
