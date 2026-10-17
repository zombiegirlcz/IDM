package eek;

import cek.b;
import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;
import so3.c;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f125216a = DateTimeFormatter.ISO_LOCAL_DATE;

    public static final PodNominee a(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String str = bVar.f23486a;
        String str2 = bVar.f23487b;
        String str3 = bVar.f23488c;
        String str4 = bVar.d;
        LocalDate localDate = LocalDate.parse(bVar.e, f125216a);
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        String str5 = bVar.f;
        c cVar = bVar.f23489g;
        return new PodNominee(str, str2, str3, str4, localDate, str5, cVar != null ? to3.a.a(cVar) : null, (int) bVar.f23490h);
    }

    public static final PodNominee b(fek.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String id10 = bVar.getId();
        String firstName = bVar.getFirstName();
        String lastName = bVar.getLastName();
        String displayName = bVar.getDisplayName();
        LocalDate localDate = LocalDate.parse(bVar.getDateOfBirth());
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        String email = bVar.getEmail();
        no3.b address = bVar.getAddress();
        return new PodNominee(id10, firstName, lastName, displayName, localDate, email, address != null ? oo3.a.a(address) : null, bVar.getPercentage());
    }
}
