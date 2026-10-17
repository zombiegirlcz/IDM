package rc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import zc.y;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f253148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f253150c;
    public final qf.b d;
    public final zc.c e;

    public f(Context context, y yVar, qf.b bVar) {
        y yVar2;
        this.f253149b = context.getPackageName();
        this.f253148a = yVar;
        this.d = bVar;
        this.f253150c = context;
        y yVar3 = zc.d.f320979a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (zc.d.b(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.e = new zc.c(context, yVar, "IntegrityService", g.f253151a, new ah.a(13));
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    yVar2 = yVar;
                    yVar3.c("Play Store package is not found.", new Object[0]);
                }
            } else {
                yVar3.c("Play Store package is disabled.", new Object[0]);
            }
            yVar2 = yVar;
        } catch (PackageManager.NameNotFoundException unused2) {
            yVar2 = yVar;
            yVar3.c("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        yVar2.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            y.d(yVar2.f320997a, "Phonesky is not installed.", objArr);
        }
        this.e = null;
    }

    public static /* bridge */ /* synthetic */ Bundle a(f fVar, byte[] bArr, Long l2) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", fVar.f253149b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l2 != null) {
            bundle.putLong("cloud.prj", l2.longValue());
        }
        ArrayList arrayList = new ArrayList();
        vc.o.c(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(vc.o.b(arrayList)));
        return bundle;
    }
}
