package mhb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f205470a;

    /* JADX INFO: renamed from: mhb.a$a, reason: collision with other inner class name */
    public static final class C1165a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f205471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f205472b;

        public C1165a() {
            this(0);
        }

        public static C1165a a(C1165a c1165a, String email, String name, int i) {
            if ((i & 1) != 0) {
                email = c1165a.f205471a;
            }
            if ((i & 2) != 0) {
                name = c1165a.f205472b;
            }
            c1165a.getClass();
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(name, "name");
            return new C1165a(email, name);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1165a)) {
                return false;
            }
            C1165a c1165a = (C1165a) obj2;
            return Intrinsics.f(this.f205471a, c1165a.f205471a) && Intrinsics.f(this.f205472b, c1165a.f205472b);
        }

        public final int hashCode() {
            return this.f205472b.hashCode() + (this.f205471a.hashCode() * 31);
        }

        public /* synthetic */ C1165a(int i) {
            this("", "");
        }

        public C1165a(String email, String name) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(name, "name");
            this.f205471a = email;
            this.f205472b = name;
        }
    }

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f205470a, ((a) obj2).f205470a);
    }

    public final int hashCode() {
        return this.f205470a.hashCode();
    }

    public a(List contactForms) {
        Intrinsics.checkNotNullParameter(contactForms, "contactForms");
        this.f205470a = contactForms;
    }

    public /* synthetic */ a(int i) {
        this(u.c(new C1165a(0)));
    }
}
