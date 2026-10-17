package androidx.camera.video.internal.utils;

import java.io.File;

/* JADX INFO: loaded from: classes15.dex */
public abstract class OutputUtil {
    public static boolean createParentFolder(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        return parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs();
    }
}
