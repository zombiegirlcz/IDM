package mw;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import zw.c;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f209276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f209277b;

    public a(Context context, c fileRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileRepository, "fileRepository");
        this.f209276a = context;
        this.f209277b = fileRepository;
    }

    public final void a() {
        File[] fileArrListFiles;
        File file = new File(this.f209276a.getApplicationInfo().dataDir, "camerakit");
        this.f209277b.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            file2.delete();
        }
    }
}
