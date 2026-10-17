package gm0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o implements od0.e {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f144751a;

    public o(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f144751a = storage;
    }

    @Override // od0.e
    public final void clear() {
        this.f144751a.clear();
    }
}
