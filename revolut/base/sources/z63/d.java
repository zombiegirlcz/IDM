package z63;

import android.app.Activity;
import android.content.Intent;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends fsi.c implements p {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fsi.b f319657n = new fsi.b("TAP_AND_PAY_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f319658h;
    public final zri.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final li0.c f319659j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v60.i f319660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v60.i f319661m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Activity activity, zri.a screensRepository, li0.c tapAndPayClientFactory) {
        super(f319657n);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(screensRepository, "screensRepository");
        Intrinsics.checkNotNullParameter(tapAndPayClientFactory, "tapAndPayClientFactory");
        this.f319658h = activity;
        this.i = screensRepository;
        this.f319659j = tapAndPayClientFactory;
        this.k = yhm.j.b(new yq0.e(this, 19));
        this.f319660l = new v60.i();
        this.f319661m = new v60.i();
    }

    @Override // fsi.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1000) {
            this.f319660l.onNext(Boolean.valueOf(i2 == -1));
        } else {
            if (i != 1001) {
                return;
            }
            this.f319661m.onNext(Boolean.valueOf(i2 == -1));
        }
    }
}
