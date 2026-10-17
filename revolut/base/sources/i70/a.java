package i70;

import android.content.Context;
import bmm.t;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f159044a;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f159044a = j.b(new t(this, context, 8));
    }

    public final String a() {
        Object value = this.f159044a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (String) value;
    }
}
