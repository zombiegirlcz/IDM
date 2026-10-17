package z5;

import android.content.Context;
import androidx.profileinstaller.ProfileInstaller;
import androidx.profileinstaller.ProfileInstallerInitializer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f319399b;

    public /* synthetic */ b(Context context, int i) {
        this.f319398a = i;
        this.f319399b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f319398a) {
            case 0:
                ProfileInstallerInitializer.writeInBackground(this.f319399b);
                break;
            default:
                ProfileInstaller.writeProfile(this.f319399b);
                break;
        }
    }
}
