package yc;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class e implements FileFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f312408a = new e();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        int i = a.f312389p;
        return file.getName().endsWith(".apk");
    }
}
