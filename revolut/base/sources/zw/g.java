package zw;

import android.content.Context;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f325720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f325721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File f325722c;

    public g(Context context, f videoIdGenerator, c fileRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoIdGenerator, "videoIdGenerator");
        Intrinsics.checkNotNullParameter(fileRepository, "fileRepository");
        this.f325720a = context;
        this.f325721b = fileRepository;
    }

    public final File a() {
        File directory = new File(this.f325720a.getApplicationInfo().dataDir, "camerakit");
        Intrinsics.checkNotNullParameter(directory, "directory");
        directory.mkdirs();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        File file = new File(directory, a0.d.r(string, ".mp4"));
        b();
        this.f325722c = file;
        return file;
    }

    public final void b() {
        File file = this.f325722c;
        if (file != null) {
            this.f325721b.getClass();
            Intrinsics.checkNotNullParameter(file, "file");
            file.delete();
        }
        this.f325722c = null;
    }
}
