package vc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class e implements wc.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f287579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qm.e f287580b;

    public /* synthetic */ e(qm.e eVar, int i) {
        this.f287579a = i;
        this.f287580b = eVar;
    }

    @Override // wc.n
    public final Object zza() {
        String string;
        switch (this.f287579a) {
            case 0:
                Context context = ((r8.o) this.f287580b.f247740b).f252294a;
                try {
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle == null || (string = bundle.getString("local_testing_dir")) == null) {
                        return null;
                    }
                    return new File(context.getExternalFilesDir(null), string);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            default:
                return new k(((r8.o) this.f287580b.f247740b).f252294a);
        }
    }
}
