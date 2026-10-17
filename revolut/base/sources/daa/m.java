package daa;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends oki.h implements dli.b {

    @NotNull
    public static final l Companion = new l();
    public final s8a.l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i8a.e f112504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tca.f f112505q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f112506r;

    public m(s8a.l pixQrCodeInteractor, i8a.e pixQrDialogProvider, tca.f pixQrResultDataExtractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(pixQrCodeInteractor, "pixQrCodeInteractor");
        Intrinsics.checkNotNullParameter(pixQrDialogProvider, "pixQrDialogProvider");
        Intrinsics.checkNotNullParameter(pixQrResultDataExtractor, "pixQrResultDataExtractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = pixQrCodeInteractor;
        this.f112504p = pixQrDialogProvider;
        this.f112505q = pixQrResultDataExtractor;
        this.f112506r = mra.d.b(this, new f(""), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f112506r;
    }
}
