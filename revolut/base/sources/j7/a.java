package j7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import d7.c0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f171823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f171825c;

    public a(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f171824b = str;
        } else {
            this.f171824b = str.concat("/");
        }
        this.f171825c = map;
        if (callback instanceof View) {
            this.f171823a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f171823a = null;
        }
    }

    public final void a(Bitmap bitmap, String str) {
        synchronized (d) {
            ((c0) this.f171825c.get(str)).g(bitmap);
        }
    }
}
