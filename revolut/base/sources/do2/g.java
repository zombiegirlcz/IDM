package do2;

import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f116374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FormState f116375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f116376c;

    public g(Data data, FormState formState, List errors) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f116374a = data;
        this.f116375b = formState;
        this.f116376c = errors;
    }

    public static g a(g gVar, Data data, FormState formState, List errors, int i) {
        if ((i & 1) != 0) {
            data = gVar.f116374a;
        }
        if ((i & 2) != 0) {
            formState = gVar.f116375b;
        }
        if ((i & 4) != 0) {
            errors = gVar.f116376c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(errors, "errors");
        return new g(data, formState, errors);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f116374a, gVar.f116374a) && Intrinsics.f(this.f116375b, gVar.f116375b) && Intrinsics.f(this.f116376c, gVar.f116376c);
    }

    public final int hashCode() {
        return this.f116376c.hashCode() + ((this.f116375b.hashCode() + (this.f116374a.hashCode() * 31)) * 31);
    }
}
