package vw;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelFileDescriptor f292583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f292584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292585c;
    public final Uri d;

    public f(ParcelFileDescriptor descriptor, File previewFile) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(previewFile, "previewFile");
        this.f292583a = descriptor;
        this.f292584b = previewFile;
        String name = previewFile.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        this.f292585c = name;
        File absoluteFile = previewFile.getAbsoluteFile();
        Intrinsics.checkNotNullExpressionValue(absoluteFile, "getAbsoluteFile(...)");
        this.d = Uri.fromFile(absoluteFile);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            m.Companion companion = yhm.m.INSTANCE;
            this.f292583a.close();
            Unit unit = Unit.f186387a;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            yhm.o.a(th10);
        }
        this.f292584b.delete();
    }

    @Override // vw.o
    public final long d() {
        Object objA;
        ParcelFileDescriptor parcelFileDescriptor = this.f292583a;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            long statSize = parcelFileDescriptor.getStatSize();
            Long lValueOf = Long.valueOf(statSize);
            if (statSize < 0) {
                lValueOf = null;
            }
            objA = Long.valueOf(lValueOf != null ? lValueOf.longValue() : Os.fstat(parcelFileDescriptor.getFileDescriptor()).st_size);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (objA instanceof yhm.n) {
            objA = -1L;
        }
        return ((Number) objA).longValue();
    }

    @Override // vw.o
    public final String f() {
        return this.f292585c;
    }

    @Override // vw.o
    public final Uri g() {
        return this.d;
    }

    @Override // vw.o
    public final InputStream h() throws IOException {
        ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(this.f292583a.getFileDescriptor());
        Intrinsics.checkNotNullExpressionValue(parcelFileDescriptorDup, "dup(...)");
        return new uw.b(parcelFileDescriptorDup);
    }
}
