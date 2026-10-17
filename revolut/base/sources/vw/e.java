package vw;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class e extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f292580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f292581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292582c;

    public e(File file, Uri previewUri) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(previewUri, "previewUri");
        this.f292580a = file;
        this.f292581b = previewUri;
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        this.f292582c = name;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f292580a.delete();
    }

    @Override // vw.o
    public final long d() {
        return this.f292580a.length();
    }

    @Override // vw.o
    public final String f() {
        return this.f292582c;
    }

    @Override // vw.o
    public final Uri g() {
        return this.f292581b;
    }

    @Override // vw.o
    public final InputStream h() {
        return new FileInputStream(this.f292580a);
    }
}
