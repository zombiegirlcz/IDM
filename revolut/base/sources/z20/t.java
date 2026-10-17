package z20;

import efm.d0;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk0.b f318938a;

    public t(zk0.b fileSystemRepository, a bitmapDecoder) {
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(bitmapDecoder, "bitmapDecoder");
        this.f318938a = fileSystemRepository;
    }

    public final d0 a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (a0.z(lim.o.n(file), "pdf", true)) {
            ufm.b bVarM = d0.m(file);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        ufm.i iVar = new ufm.i(((a80.h) this.f318938a).l("RevolutChat"), new z1i.n(new b22.j(file, this), 10), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
