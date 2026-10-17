package ms0;

import android.content.Context;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b3 implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f208189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lx0.j f208190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kl.b0 f208191c;
    public final ArrayDeque d;
    public final ihm.f e;

    public b3(Context context, lx0.j videoPreloader, kl.b0 delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoPreloader, "videoPreloader");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f208189a = context;
        this.f208190b = videoPreloader;
        this.f208191c = delegate;
        this.d = new ArrayDeque();
        ihm.f fVarD = v0.a.d("create(...)");
        this.e = fVarD;
        fVarD.distinctUntilChanged().switchMapSingle(new j0(new v2(this, 0), 10)).subscribe(new j0(new v2(this, 1), 11));
    }
}
