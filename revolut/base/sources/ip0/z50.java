package ip0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f167398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f167399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f167400c;
    public final int d;

    public z50(int i, int i2, int i3, int i5) {
        this.f167398a = i;
        this.f167399b = i2;
        this.f167400c = i3;
        this.d = i5;
    }

    public z50(Context context, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f167398a = kli.a.k(context, 54.0f);
                this.f167399b = kli.a.k(context, 98.0f);
                this.f167400c = kli.a.k(context, 8.0f);
                this.d = kli.a.k(context, 16.0f);
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f167398a = kli.a.k(context, 54.0f);
                this.f167399b = kli.a.k(context, 98.0f);
                this.f167400c = kli.a.k(context, 8.0f);
                this.d = kli.a.k(context, 16.0f);
                break;
        }
    }
}
