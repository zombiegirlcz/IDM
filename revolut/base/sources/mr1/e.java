package mr1;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f208040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f208041b;

    public e(List formFields, Map userInputs) {
        Intrinsics.checkNotNullParameter(formFields, "formFields");
        Intrinsics.checkNotNullParameter(userInputs, "userInputs");
        this.f208040a = formFields;
        this.f208041b = userInputs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f208040a, eVar.f208040a) && Intrinsics.f(this.f208041b, eVar.f208041b);
    }

    public final int hashCode() {
        return this.f208041b.hashCode() + (this.f208040a.hashCode() * 31);
    }
}
