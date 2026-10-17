package okhttp3;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mmm.g;
import mmm.h0;
import mmm.j;
import mmm.k0;
import mmm.m;
import mmm.s;
import mmm.y;
import mmm.z;
import org.jetbrains.annotations.NotNull;
import ulm.b1;
import ulm.l1;
import ulm.m1;
import ulm.n1;
import ulm.p1;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
public abstract class RequestBody {

    @NotNull
    public static final p1 Companion = new p1();

    @NotNull
    public static final RequestBody EMPTY;

    static {
        m mVar = m.d;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        EMPTY = new m1(mVar, null);
    }

    @NotNull
    public static final RequestBody create(@NotNull File file, b1 b1Var) {
        Companion.getClass();
        return p1.a(file, b1Var);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract b1 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    @NotNull
    public final m sha256() throws IOException {
        y yVar = z.Companion;
        g gVar = new g();
        yVar.getClass();
        z zVarA = y.a(gVar);
        k0 k0VarB = u1.b(zVarA);
        try {
            writeTo(k0VarB);
            Unit unit = Unit.f186387a;
            k0VarB.close();
            return zVarA.d();
        } finally {
        }
    }

    public abstract void writeTo(j jVar);

    @NotNull
    public static final RequestBody create(@NotNull FileDescriptor fileDescriptor, b1 b1Var) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(fileDescriptor, "<this>");
        return new n1(fileDescriptor, b1Var);
    }

    @NotNull
    public static final RequestBody create(@NotNull String str, b1 b1Var) {
        Companion.getClass();
        return p1.b(str, b1Var);
    }

    @NotNull
    public static final RequestBody create(@NotNull h0 h0Var, @NotNull s fileSystem, b1 b1Var) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        return new l1(h0Var, fileSystem, b1Var);
    }

    @NotNull
    @d
    public static final RequestBody create(b1 b1Var, @NotNull String content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return p1.b(content, b1Var);
    }

    @NotNull
    @d
    public static final RequestBody create(b1 b1Var, @NotNull m content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        return new m1(content, b1Var);
    }

    @NotNull
    @d
    public static final RequestBody create(b1 b1Var, @NotNull byte[] content) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length;
        Intrinsics.checkNotNullParameter(content, "content");
        return p1.c(b1Var, content, 0, length);
    }

    @NotNull
    @d
    public static final RequestBody create(b1 b1Var, @NotNull byte[] content, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length;
        Intrinsics.checkNotNullParameter(content, "content");
        return p1.c(b1Var, content, i, length);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr) {
        p1 p1Var = Companion;
        p1Var.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return p1.d(p1Var, bArr, null, 0, 7);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr, b1 b1Var) {
        p1 p1Var = Companion;
        p1Var.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return p1.d(p1Var, bArr, b1Var, 0, 6);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr, b1 b1Var, int i) {
        p1 p1Var = Companion;
        p1Var.getClass();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return p1.d(p1Var, bArr, b1Var, i, 4);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr, b1 b1Var, int i, int i2) {
        Companion.getClass();
        return p1.c(b1Var, bArr, i, i2);
    }

    @NotNull
    public static final RequestBody create(@NotNull m mVar, b1 b1Var) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new m1(mVar, b1Var);
    }

    @NotNull
    @d
    public static final RequestBody create(b1 b1Var, @NotNull byte[] content, int i, int i2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return p1.c(b1Var, content, i, i2);
    }

    @NotNull
    @d
    public static final RequestBody create(b1 b1Var, @NotNull File file) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        return p1.a(file, b1Var);
    }
}
