package cdc;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f80.a f23230a;

    public f(f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f23230a = uriHelper;
    }

    public final Uri a(String redirectUri, String errorCode, String str) {
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Uri.Builder builderAppendQueryParameter = ((f80.b) this.f23230a).f(redirectUri).buildUpon().appendQueryParameter("error", errorCode);
        if (str != null) {
            builderAppendQueryParameter.appendQueryParameter("state", str);
        }
        Uri uriBuild = builderAppendQueryParameter.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
        return uriBuild;
    }

    public final boolean b(String redirectUri) {
        Object objA;
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        try {
            m.Companion companion = m.INSTANCE;
            objA = ((f80.b) this.f23230a).f(redirectUri).getScheme();
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        CharSequence charSequence = (CharSequence) objA;
        return !(charSequence == null || d0.W(charSequence));
    }
}
