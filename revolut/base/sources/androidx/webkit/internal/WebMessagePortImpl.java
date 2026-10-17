package androidx.webkit.internal;

import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import knm.b;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* JADX INFO: loaded from: classes16.dex */
public class WebMessagePortImpl extends WebMessagePortCompat {
    private WebMessagePortBoundaryInterface mBoundaryInterface;

    public WebMessagePortImpl(InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (WebMessagePortBoundaryInterface) b.c(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
