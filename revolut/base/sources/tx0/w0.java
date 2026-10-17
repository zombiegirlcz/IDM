package tx0;

import android.os.SystemClock;
import com.revolut.core.ui_kit.views.navbar.MarketingPhotoHeaderContentView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MarketingPhotoHeaderContentView f275256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f275257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f275258c;
    public long d;
    public boolean e;
    public final t70.x f;

    public w0(MarketingPhotoHeaderContentView host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.f275256a = host;
        this.e = true;
        this.f = new t70.x(this, 9);
    }

    public final void a() {
        long j2 = this.f275258c;
        if (j2 <= 0) {
            return;
        }
        boolean z = !this.e && j2 > 0;
        long j3 = this.d;
        MarketingPhotoHeaderContentView.Companion aVar = MarketingPhotoHeaderContentView.INSTANCE;
        MarketingPhotoHeaderContentView marketingPhotoHeaderContentView = this.f275256a;
        if (marketingPhotoHeaderContentView.f59259t != -1 || z || (j3 <= 0 && j2 >= 0)) {
            marketingPhotoHeaderContentView.f59257r = z;
            marketingPhotoHeaderContentView.f59259t = j2;
            marketingPhotoHeaderContentView.f59258s = j3;
            marketingPhotoHeaderContentView.c();
        }
    }

    public final void b() {
        if (this.e) {
            return;
        }
        if (this.f275258c > 0) {
            this.f275257b = SystemClock.uptimeMillis();
            long j2 = this.f275258c - this.d;
            this.f275256a.postDelayed(this.f, j2 >= 0 ? j2 : 0L);
        }
    }
}
