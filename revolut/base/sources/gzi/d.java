package gzi;

import ang.f;
import dwi.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements vvi.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f148136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f148137b;

    public d(s airportLoungePassesInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(airportLoungePassesInteractor, "airportLoungePassesInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f148136a = airportLoungePassesInteractor;
        this.f148137b = userInteractor;
    }
}
