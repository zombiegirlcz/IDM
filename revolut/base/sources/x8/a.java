package x8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import c8.g;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import y8.l;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f303248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f303249b;

    public a(int i, g gVar) {
        this.f303248a = i;
        this.f303249b = gVar;
    }

    public static a a(Context context) {
        PackageInfo packageInfo;
        ConcurrentHashMap concurrentHashMap = b.f303250a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = b.f303250a;
        g gVar = (g) concurrentHashMap2.get(packageName);
        if (gVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                String str = "Cannot resolve info for" + context.getPackageName();
                packageInfo = null;
            }
            e eVar = new e(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            g gVar2 = (g) concurrentHashMap2.putIfAbsent(packageName, eVar);
            gVar = gVar2 == null ? eVar : gVar2;
        }
        return new a(context.getResources().getConfiguration().uiMode & 48, gVar);
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (obj2 instanceof a) {
            a aVar = (a) obj2;
            if (this.f303248a == aVar.f303248a && this.f303249b.equals(aVar.f303249b)) {
                return true;
            }
        }
        return false;
    }

    @Override // c8.g
    public final int hashCode() {
        return l.h(this.f303248a, this.f303249b);
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f303249b.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f303248a).array());
    }
}
