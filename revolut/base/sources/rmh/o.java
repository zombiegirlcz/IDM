package rmh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    @NotNull
    private static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hph.c f255336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hph.a f255337b;

    public o(hph.c collectionMapper, hph.a collectionAvatarMapper) {
        Intrinsics.checkNotNullParameter(collectionMapper, "collectionMapper");
        Intrinsics.checkNotNullParameter(collectionAvatarMapper, "collectionAvatarMapper");
        this.f255336a = collectionMapper;
        this.f255337b = collectionAvatarMapper;
    }
}
