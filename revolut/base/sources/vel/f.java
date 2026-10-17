package vel;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class f {
    private f() {
    }

    public final String a() {
        if (this instanceof e) {
            return ((e) this).f288355a.f214560a.f214596b;
        }
        if (this instanceof c) {
            return ((c) this).f288349a.f194590b;
        }
        if (this instanceof b) {
            a aVar = ((b) this).f288347a;
            return com.google.android.gms.internal.mlkit_vision_face.a.o(aVar.f288344a.f306286a, "_", aVar.f288345b.f306286a);
        }
        if (this instanceof d) {
            return ((d) this).f288352a.f306286a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract g b();

    public final String c() {
        if (this instanceof e) {
            return ((e) this).f288355a.f214560a.e;
        }
        if (this instanceof c) {
            return ((c) this).f288350b.f105113c;
        }
        if (this instanceof b) {
            return ((b) this).f288347a.f288344a.f306286a;
        }
        if (this instanceof d) {
            return ((d) this).f288352a.f306286a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean d() {
        return (this instanceof d) && cp5.d.z(((d) this).f288352a);
    }
}
