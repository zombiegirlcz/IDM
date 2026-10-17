package zw;

import android.content.Context;
import au6.e2;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f325718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw.a f325719b;

    public e(Context context, xw.a fileSignatureCalculator, c fileRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileSignatureCalculator, "fileSignatureCalculator");
        Intrinsics.checkNotNullParameter(fileRepository, "fileRepository");
        this.f325718a = context;
        this.f325719b = fileSignatureCalculator;
    }

    public final File a(String name, String checksum) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(checksum, "checksum");
        File directory = new File(this.f325718a.getCacheDir(), "vision");
        Intrinsics.checkNotNullParameter(directory, "directory");
        directory.mkdirs();
        File file = new File(directory, name);
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.exists()) {
            this.f325719b.getClass();
            Intrinsics.checkNotNullParameter(file, "file");
            MessageDigest messageDigest = MessageDigest.getInstance(new String(xw.b.a, Charsets.UTF_8));
            Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[1024];
                for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, i);
                }
                Unit unit = Unit.f186387a;
                fileInputStream.close();
                byte[] bArrDigest = messageDigest.digest();
                Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                Intrinsics.checkNotNullParameter(bArrDigest, "<this>");
                if (Intrinsics.f(kotlin.collections.d.a0(bArrDigest, "", null, null, new e2(29), 30), checksum)) {
                    return file;
                }
            } finally {
            }
        }
        Intrinsics.checkNotNullParameter(file, "file");
        file.delete();
        return null;
    }
}
