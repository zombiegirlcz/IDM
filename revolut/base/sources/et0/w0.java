package et0;

import android.text.Layout;
import android.text.Spannable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Layout f129138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Spannable f129139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f129140c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f129141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f129142h;

    public w0(Layout layout, Spannable spannable, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(spannable, "spannable");
        this.f129138a = layout;
        this.f129139b = spannable;
        this.f129140c = i;
        this.d = i2;
        this.e = i3;
        this.f = i5;
        this.f129141g = -1;
        this.f129142h = -1;
    }
}
