package hc0;

import a80.h;
import android.graphics.Bitmap;
import hae.k;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk0.b f150765a;

    public b(zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f150765a = fileSystemRepository;
    }

    public final i a(Bitmap bitmap, String str) {
        i iVar = new i(((h) this.f150765a).l("selfie_with_card"), new k(new gqh.a(str, 21), 6), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        i iVar2 = new i(w.i0(iVar), new k(new a(bitmap, 0), 5), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }
}
