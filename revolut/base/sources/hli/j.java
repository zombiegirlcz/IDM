package hli;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gli.b f153476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gli.b f153477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gli.b f153478c;

    public j(gli.b totalMeasureDuration, gli.b totalLayoutDuration, gli.b totalDrawDuration) {
        Intrinsics.checkNotNullParameter(totalMeasureDuration, "totalMeasureDuration");
        Intrinsics.checkNotNullParameter(totalLayoutDuration, "totalLayoutDuration");
        Intrinsics.checkNotNullParameter(totalDrawDuration, "totalDrawDuration");
        this.f153476a = totalMeasureDuration;
        this.f153477b = totalLayoutDuration;
        this.f153478c = totalDrawDuration;
    }

    public final gli.b a() {
        return this.f153478c;
    }

    public final gli.b b() {
        return this.f153477b;
    }

    public final gli.b c() {
        return this.f153476a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f153476a, jVar.f153476a) && Intrinsics.f(this.f153477b, jVar.f153477b) && Intrinsics.f(this.f153478c, jVar.f153478c);
    }

    public final int hashCode() {
        return this.f153478c.hashCode() + ((this.f153477b.hashCode() + (this.f153476a.hashCode() * 31)) * 31);
    }
}
