package rh8;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb4.t f254352a;

    public l(tb4.t repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f254352a = repository;
    }

    public final efm.d0 a(String firstName, String lastName, LocalDate birthDate) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        ao.h hVar = (ao.h) this.f254352a.f269457c;
        String string = birthDate.toString("yyyy-MM-dd");
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return hVar.k(new uh8.h(firstName, lastName, string));
    }
}
