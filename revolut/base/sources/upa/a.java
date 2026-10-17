package upa;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.view.ContextThemeWrapper;
import b90.f;
import f80.b;
import ipa.j;
import ipa.k;
import jf0.c;
import kotlin.jvm.internal.Intrinsics;
import q06.d;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements mpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f281939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f80.a f281940b;

    public a(d deeplinkParser, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f281939a = deeplinkParser;
        this.f281940b = uriHelper;
    }

    @Override // mpa.a
    public final Intent a(ContextThemeWrapper context, j message, f action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        String strB = action.b();
        if (strB == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Uri.Builder builderBuildUpon = ((b) this.f281940b).f(strB).buildUpon();
        String strJ = k.j(message);
        if (strJ != null) {
            builderBuildUpon.appendQueryParameter("message_id", strJ);
        }
        String strK = k.k(message);
        if (strK != null) {
            builderBuildUpon.appendQueryParameter("push_id", strK);
        }
        return new Intent("android.intent.action.VIEW", builderBuildUpon.build());
    }

    @Override // mpa.a
    public final boolean b(j message, f action) {
        c cVarD;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        String strB = action.b();
        if (strB == null || (cVarD = ((s06.c) this.f281939a).d(strB)) == null) {
            return false;
        }
        return Intrinsics.f(cVarD.a(), "stories") || Intrinsics.f(cVarD.a(), "articles");
    }
}
