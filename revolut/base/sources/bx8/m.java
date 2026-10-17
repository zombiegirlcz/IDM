package bx8;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19522b;

    public m(List consents, List formFields) {
        Intrinsics.checkNotNullParameter(consents, "consents");
        Intrinsics.checkNotNullParameter(formFields, "formFields");
        this.f19521a = consents;
        this.f19522b = formFields;
    }

    public static m a(m mVar, ArrayList arrayList, List formFields, int i) {
        List consents = arrayList;
        if ((i & 1) != 0) {
            consents = mVar.f19521a;
        }
        if ((i & 2) != 0) {
            formFields = mVar.f19522b;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(consents, "consents");
        Intrinsics.checkNotNullParameter(formFields, "formFields");
        return new m(consents, formFields);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f19521a, mVar.f19521a) && Intrinsics.f(this.f19522b, mVar.f19522b);
    }

    public final int hashCode() {
        return this.f19522b.hashCode() + (this.f19521a.hashCode() * 31);
    }
}
