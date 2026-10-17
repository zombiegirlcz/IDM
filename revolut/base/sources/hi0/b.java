package hi0;

import ihm.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b extends gi0.b implements hh0.c {

    @NotNull
    public static final a Companion = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f152441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f152442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f152443c;

    public b(c tokenProvider) {
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        this.f152441a = tokenProvider;
        this.f152442b = p.a.h("toSerialized(...)");
        j jVarD = new ihm.b().d();
        Intrinsics.checkNotNullExpressionValue(jVarD, "toSerialized(...)");
        this.f152443c = jVarD;
    }
}
