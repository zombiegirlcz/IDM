package n8a;

import com.revolut.feature.pix.impl.data.network.PixAuthorisationsService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixAuthorisationsService f213348a;

    public s(PixAuthorisationsService authorisationsService) {
        Intrinsics.checkNotNullParameter(authorisationsService, "authorisationsService");
        this.f213348a = authorisationsService;
    }
}
