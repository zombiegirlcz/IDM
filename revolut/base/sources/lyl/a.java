package lyl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lyd.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    @NotNull
    public static final C1139a Companion = new C1139a();

    /* JADX INFO: renamed from: lyl.a$a, reason: collision with other inner class name */
    public static final class C1139a {
        private C1139a() {
        }
    }

    public final String a(File file) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        Intrinsics.h(messageDigest);
        byte[] bArr = new byte[1024];
        for (int i = fileInputStream.read(bArr, 0, 1024); i > -1; i = fileInputStream.read(bArr, 0, 1024)) {
            messageDigest.update(bArr, 0, i);
        }
        byte[] bArrDigest = messageDigest.digest();
        fileInputStream.close();
        Intrinsics.h(bArrDigest);
        return d.a0(bArrDigest, "", null, null, new b(13), 30);
    }
}
