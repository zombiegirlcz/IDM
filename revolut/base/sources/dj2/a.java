package dj2;

import a80.h;
import android.content.Context;
import android.content.pm.ShortcutManager;
import g2e.t;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import od0.e;
import r10.w;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115087a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f115088b;

    public a(a61.a retailAppShortcutsInitialiser) {
        Intrinsics.checkNotNullParameter(retailAppShortcutsInitialiser, "retailAppShortcutsInitialiser");
        this.f115088b = retailAppShortcutsInitialiser;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // od0.e
    public final void clear() {
        switch (this.f115087a) {
            case 0:
                ((ShortcutManager) ((w) ((t) ((a61.a) this.f115088b).f1531b).f140031b).f250866b.getValue()).removeAllDynamicShortcuts();
                break;
            default:
                h hVar = (h) ((zk0.b) this.f115088b);
                Intrinsics.checkNotNullParameter("transaction_receipts", "dirName");
                Context context = hVar.f1992a;
                File dir = new File(context.getFilesDir(), "transaction_receipts");
                Intrinsics.checkNotNullParameter(dir, "dir");
                o80.c.a(dir);
                Intrinsics.checkNotNullParameter("txn_receipts", "dirName");
                File dir2 = new File(context.getFilesDir(), "txn_receipts");
                Intrinsics.checkNotNullParameter(dir2, "dir");
                o80.c.a(dir2);
                break;
        }
    }

    public a(zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f115088b = fileSystemRepository;
    }
}
