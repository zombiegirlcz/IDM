package iy8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import tx8.w;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements cy8.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f169625a;

    public d(List terminalCallbackUrls) {
        Intrinsics.checkNotNullParameter(terminalCallbackUrls, "terminalCallbackUrls");
        this.f169625a = terminalCallbackUrls;
    }

    @Override // cy8.a
    public final Object i(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        if (a0.H(url2, "uaepass://", false) || a0.H(url2, "uaepassstg://", false)) {
            return new f(url2);
        }
        List list = this.f169625a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (a0.H(url2, (String) it8.next(), false)) {
                return new e(url2);
            }
        }
        return null;
    }

    @Override // cy8.a
    public final /* bridge */ /* synthetic */ av1.c m() {
        return w.f275366c;
    }
}
