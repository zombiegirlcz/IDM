package px9;

import ang.f;
import kotlin.jvm.internal.Intrinsics;
import mv9.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f240585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f240586b;

    public c(k messagesRepository, f userInteractor) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f240585a = messagesRepository;
        this.f240586b = userInteractor;
    }
}
