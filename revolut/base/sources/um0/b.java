package um0;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ue0.c;
import ulm.p0;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final api.a f281174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f281175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f281176c;

    public b(api.a databaseChecks, c storage) {
        Intrinsics.checkNotNullParameter(databaseChecks, "databaseChecks");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f281174a = databaseChecks;
        this.f281175b = storage;
        this.f281176c = j.a(this, new p0(this, 1));
    }
}
