package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class mj extends WebViewDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f54488b;

    public mj(String url2, Map map) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f54487a = url2;
        this.f54488b = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mj)) {
            return false;
        }
        mj mjVar = (mj) obj2;
        return Intrinsics.f(this.f54487a, mjVar.f54487a) && Intrinsics.f(this.f54488b, mjVar.f54488b);
    }

    public final int hashCode() {
        int iHashCode = this.f54487a.hashCode() * 31;
        Map map = this.f54488b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
