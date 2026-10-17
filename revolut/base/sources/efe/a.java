package efe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f125319a = new a();

    private a() {
    }

    public static e a(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return packageName.equals("com.android.vending") ? b.f125320a : packageName.equals("com.huawei.appmarket") ? c.f125321a : new d(packageName);
    }
}
