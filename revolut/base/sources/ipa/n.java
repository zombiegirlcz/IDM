package ipa;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f167707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f167708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f167709c;

    public n(Bitmap bitmap, String name, String uniqueKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(uniqueKey, "uniqueKey");
        this.f167707a = bitmap;
        this.f167708b = name;
        this.f167709c = uniqueKey;
    }

    public final Bitmap a() {
        return this.f167707a;
    }

    public final String b() {
        return this.f167708b;
    }

    public final String c() {
        return this.f167709c;
    }
}
