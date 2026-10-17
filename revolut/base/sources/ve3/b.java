package ve3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f288109a;

    static {
        Intrinsics.checkNotNullParameter("CATEGORY_BOOST_INTRODUCTION_COMPLETED", "id");
    }

    public b(mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f288109a = personalisationStorage;
    }
}
