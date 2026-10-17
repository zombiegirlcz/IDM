package qll;

import com.revolut.data.model.Data;
import com.revolut.sso.impl.domain.models.Identifier;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f247595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Identifier.Phone f247596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Identifier.Email f247597c;
    public final Set d;
    public final Data e;

    public q(p type, Identifier.Phone identifierPhone, Identifier.Email identifierEmail, Set availableAuthenticationOptions, Data otherOptions) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(identifierPhone, "identifierPhone");
        Intrinsics.checkNotNullParameter(identifierEmail, "identifierEmail");
        Intrinsics.checkNotNullParameter(availableAuthenticationOptions, "availableAuthenticationOptions");
        Intrinsics.checkNotNullParameter(otherOptions, "otherOptions");
        this.f247595a = type;
        this.f247596b = identifierPhone;
        this.f247597c = identifierEmail;
        this.d = availableAuthenticationOptions;
        this.e = otherOptions;
    }

    public static q a(q qVar, p pVar, Identifier.Phone phone, Identifier.Email email, Data data, int i) {
        if ((i & 1) != 0) {
            pVar = qVar.f247595a;
        }
        p type = pVar;
        if ((i & 2) != 0) {
            phone = qVar.f247596b;
        }
        Identifier.Phone identifierPhone = phone;
        if ((i & 4) != 0) {
            email = qVar.f247597c;
        }
        Identifier.Email identifierEmail = email;
        Set availableAuthenticationOptions = qVar.d;
        if ((i & 16) != 0) {
            data = qVar.e;
        }
        Data otherOptions = data;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(identifierPhone, "identifierPhone");
        Intrinsics.checkNotNullParameter(identifierEmail, "identifierEmail");
        Intrinsics.checkNotNullParameter(availableAuthenticationOptions, "availableAuthenticationOptions");
        Intrinsics.checkNotNullParameter(otherOptions, "otherOptions");
        return new q(type, identifierPhone, identifierEmail, availableAuthenticationOptions, otherOptions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f247595a, qVar.f247595a) && Intrinsics.f(this.f247596b, qVar.f247596b) && Intrinsics.f(this.f247597c, qVar.f247597c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.f(p.a.c((this.f247596b.hashCode() + (this.f247595a.hashCode() * 31)) * 31, 31, this.f247597c.f106149a), 31, this.d);
    }
}
