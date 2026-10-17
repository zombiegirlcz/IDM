package enf;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f127822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.b f127823b;

    public c(e renderer, zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f127822a = renderer;
        this.f127823b = fileSystemRepository;
    }

    public static final byte[] a(c cVar, Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (!bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream)) {
                throw new IllegalStateException("JPEG compression failed");
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
            return byteArray;
        } catch (Throwable th10) {
            try {
                throw th10;
            } catch (Throwable th11) {
                com.bumptech.glide.d.e(byteArrayOutputStream, th10);
                throw th11;
            }
        }
    }

    public static File b(File file) {
        return new File(file.getParentFile(), a0.d.r(file.getName(), ".thumb.jpg"));
    }
}
