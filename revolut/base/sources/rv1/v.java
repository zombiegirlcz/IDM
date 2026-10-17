package rv1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.r f257680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fv1.e f257681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fkg.a f257682c;

    public v(r10.r qrRepository, fv1.e brebRepository, fkg.a qrCodeGenerator) {
        Intrinsics.checkNotNullParameter(qrRepository, "qrRepository");
        Intrinsics.checkNotNullParameter(brebRepository, "brebRepository");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        this.f257680a = qrRepository;
        this.f257681b = brebRepository;
        this.f257682c = qrCodeGenerator;
    }
}
