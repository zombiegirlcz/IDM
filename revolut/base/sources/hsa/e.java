package hsa;

import com.revolut.feature.push_to_card.api.data.CardOwner;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwner f155014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155016c;
    public final String d;
    public final List e;

    public e(CardOwner cardOwner, String firstName, String lastName, String email, List errors) {
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f155014a = cardOwner;
        this.f155015b = firstName;
        this.f155016c = lastName;
        this.d = email;
        this.e = errors;
    }

    public static e a(e eVar, String str, String lastName, String email, aim.e errors, int i) {
        String firstName = str;
        CardOwner cardOwner = eVar.f155014a;
        if ((i & 2) != 0) {
            firstName = eVar.f155015b;
        }
        if ((i & 4) != 0) {
            lastName = eVar.f155016c;
        }
        if ((i & 8) != 0) {
            email = eVar.d;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(errors, "errors");
        String str2 = email;
        return new e(cardOwner, firstName, lastName, str2, errors);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f155014a, eVar.f155014a) && Intrinsics.f(this.f155015b, eVar.f155015b) && Intrinsics.f(this.f155016c, eVar.f155016c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f155014a.hashCode() * 31, 31, this.f155015b), 31, this.f155016c), 31, this.d);
    }
}
