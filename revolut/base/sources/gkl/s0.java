package gkl;

import com.revolut.sso.impl.domain.models.AuthResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f144495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AuthResult f144496c;
    public final u0 d;

    public s0(String id10, List evidences, AuthResult authResult) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(evidences, "evidences");
        Intrinsics.checkNotNullParameter(authResult, "authResult");
        this.f144494a = id10;
        this.f144495b = evidences;
        this.f144496c = authResult;
        this.d = u0.SIGN_IN;
    }

    @Override // gkl.v0
    public final String a() {
        return this.f144494a;
    }

    public final AuthResult b() {
        return this.f144496c;
    }

    public final List c() {
        return this.f144495b;
    }

    public final u0 d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f144494a, s0Var.f144494a) && Intrinsics.f(this.f144495b, s0Var.f144495b) && Intrinsics.f(this.f144496c, s0Var.f144496c);
    }

    public final int hashCode() {
        return this.f144496c.hashCode() + p.a.d(this.f144494a.hashCode() * 31, 31, this.f144495b);
    }
}
