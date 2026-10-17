package mmm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public class c0 extends s {
    @Override // mmm.s
    public final q0 d(h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        File file2 = file.toFile();
        Intrinsics.checkNotNullParameter(file2, "<this>");
        FileOutputStream fileOutputStream = new FileOutputStream(file2, true);
        Intrinsics.checkNotNullParameter(fileOutputStream, "<this>");
        return new d(fileOutputStream, new v0());
    }

    @Override // mmm.s
    public void g(h0 source, h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // mmm.s
    public final void i(h0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        eoi.e eVarO = o(dir);
        if (eVarO == null || !eVarO.f127932c) {
            throw new IOException("failed to create directory: " + dir);
        }
    }

    @Override // mmm.s
    public final void j(h0 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    @Override // mmm.s
    public final List m(h0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        File file = dir.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                throw new IOException("failed to list " + dir);
            }
            throw new FileNotFoundException("no such file: " + dir);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Intrinsics.h(str);
            arrayList.add(dir.e(str));
        }
        zhm.z.v(arrayList);
        return arrayList;
    }

    @Override // mmm.s
    public eoi.e o(h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new eoi.e(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // mmm.s
    public final b0 p(h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new b0(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // mmm.s
    public final b0 q(h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new b0(true, new RandomAccessFile(file.toFile(), "rw"));
    }

    @Override // mmm.s
    public final q0 r(h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        File file2 = file.toFile();
        Intrinsics.checkNotNullParameter(file2, "<this>");
        FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
        Intrinsics.checkNotNullParameter(fileOutputStream, "<this>");
        return new d(fileOutputStream, new v0());
    }

    @Override // mmm.s
    public final s0 t(h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        File file2 = file.toFile();
        Intrinsics.checkNotNullParameter(file2, "<this>");
        return new e(new FileInputStream(file2), v0.d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
