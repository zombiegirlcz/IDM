package m00;

import c00.f;
import dx.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f201032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f201033b;

    public c(l previewMetadata, f coordinatesTransformer) {
        Intrinsics.checkNotNullParameter(previewMetadata, "previewMetadata");
        Intrinsics.checkNotNullParameter(coordinatesTransformer, "coordinatesTransformer");
        this.f201032a = previewMetadata;
        this.f201033b = coordinatesTransformer;
    }
}
