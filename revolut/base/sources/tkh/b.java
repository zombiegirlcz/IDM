package tkh;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import kotlin.jvm.internal.Intrinsics;
import mre.c;
import pgi.h;
import pgi.k;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f271957a;

    public b(c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.f271957a = termsNavigationFactory;
    }

    public static ActivityNavigateCommand b(String str) {
        k.Companion.getClass();
        return new ActivityNavigateCommand(h.f235963b, new WebViewContract$WebViewConfiguration(str, (Clause) null, 0, true, false, true, (String) null, (Parcelable) null, (String) null, false, false, (String) null, (String) null, (String) null, false, false, 128910), null, null, 0, null, null, null, null, false, 1020);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r9 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (r9 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        if (r9 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ty0.a r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tkh.b.a(ty0.a, gim.c):java.lang.Object");
    }
}
