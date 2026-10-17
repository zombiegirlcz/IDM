package gah;

import android.util.Patterns;
import android.webkit.URLUtil;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements d1h.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f142175a;

    public a(x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f142175a = deeplinkHandler;
    }

    @Override // d1h.d
    public final d1h.c C1(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        String str = clickData.f275445a;
        if (this.f142175a.y1(str)) {
            return new d1h.a(str);
        }
        if (URLUtil.isHttpsUrl(str) && Patterns.WEB_URL.matcher(str).matches()) {
            return new d1h.b(new ExternalDestination.Browser(str, null));
        }
        return null;
    }
}
