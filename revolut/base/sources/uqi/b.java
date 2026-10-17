package uqi;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import zc.n;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f282191a;

    public /* synthetic */ b(Context context, byte b4) {
        this.f282191a = context;
    }

    public static b b(Context context) {
        return new b(context, (byte) 0);
    }

    @Override // zc.o
    public Object a() {
        return this.f282191a;
    }

    public b(Context context, int i) {
        switch (i) {
            case 3:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f282191a = context;
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "appContext");
                this.f282191a = context;
                break;
        }
    }
}
