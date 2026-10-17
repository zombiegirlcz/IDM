package dwi;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f120424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f120425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f120426c;

    public h(s loungePassesInteractor) {
        Intrinsics.checkNotNullParameter(loungePassesInteractor, "loungePassesInteractor");
        this.f120424a = loungePassesInteractor;
        this.f120425b = j6.a.h("create(...)");
        this.f120426c = new AtomicBoolean(true);
    }
}
