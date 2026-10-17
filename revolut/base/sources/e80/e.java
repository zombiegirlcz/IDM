package e80;

import android.text.Html;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Html.TagHandler f123549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f123550b;

    public e() {
        this(null, null, 7);
    }

    public e(ep0.e eVar, Integer num, int i) {
        eVar = (i & 2) != 0 ? null : eVar;
        num = (i & 4) != 0 ? null : num;
        this.f123549a = eVar;
        this.f123550b = num;
    }
}
