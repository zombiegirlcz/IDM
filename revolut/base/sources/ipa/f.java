package ipa;

import android.app.PendingIntent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f167694a;

    public f(PendingIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f167694a = intent;
    }

    public final Object a() {
        return this.f167694a;
    }
}
