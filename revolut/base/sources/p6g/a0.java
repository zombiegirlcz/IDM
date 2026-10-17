package p6g;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f233266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m7g.j f233267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f233268c;

    public a0(String passengerRef, m7g.j travellerType, ArrayList fields) {
        Intrinsics.checkNotNullParameter(passengerRef, "passengerRef");
        Intrinsics.checkNotNullParameter(travellerType, "travellerType");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f233266a = passengerRef;
        this.f233267b = travellerType;
        this.f233268c = fields;
    }

    public static a0 a(a0 a0Var, ArrayList fields) {
        String passengerRef = a0Var.f233266a;
        m7g.j travellerType = a0Var.f233267b;
        Intrinsics.checkNotNullParameter(passengerRef, "passengerRef");
        Intrinsics.checkNotNullParameter(travellerType, "travellerType");
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new a0(passengerRef, travellerType, fields);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f233266a, a0Var.f233266a) && this.f233267b == a0Var.f233267b && this.f233268c.equals(a0Var.f233268c);
    }

    public final int hashCode() {
        return this.f233268c.hashCode() + ((this.f233267b.hashCode() + (this.f233266a.hashCode() * 31)) * 31);
    }
}
