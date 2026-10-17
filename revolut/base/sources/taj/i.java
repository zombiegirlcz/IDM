package taj;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f269351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f269352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f269353c;

    public i(xi0.b currency, Instant launchDate, g project) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(launchDate, "launchDate");
        Intrinsics.checkNotNullParameter(project, "project");
        this.f269351a = currency;
        this.f269352b = launchDate;
        this.f269353c = project;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f269351a, iVar.f269351a) && Intrinsics.f(this.f269352b, iVar.f269352b) && Intrinsics.f(this.f269353c, iVar.f269353c);
    }

    public final int hashCode() {
        return this.f269353c.hashCode() + r6.b.c(this.f269351a.hashCode() * 31, 31, this.f269352b);
    }
}
