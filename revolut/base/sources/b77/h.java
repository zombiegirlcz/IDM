package b77;

import com.revolut.feature.giro.impl.ui.form.domain.FormState;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f12922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FormState f12923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f12924c;

    public h(g mode, FormState formState, Set fieldsWithErrors) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(fieldsWithErrors, "fieldsWithErrors");
        this.f12922a = mode;
        this.f12923b = formState;
        this.f12924c = fieldsWithErrors;
    }

    public static h a(h hVar, FormState formState, Set fieldsWithErrors, int i) {
        g mode = hVar.f12922a;
        if ((i & 2) != 0) {
            formState = hVar.f12923b;
        }
        if ((i & 4) != 0) {
            fieldsWithErrors = hVar.f12924c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(fieldsWithErrors, "fieldsWithErrors");
        return new h(mode, formState, fieldsWithErrors);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f12922a == hVar.f12922a && Intrinsics.f(this.f12923b, hVar.f12923b) && Intrinsics.f(this.f12924c, hVar.f12924c);
    }

    public final int hashCode() {
        return this.f12924c.hashCode() + ((this.f12923b.hashCode() + (this.f12922a.hashCode() * 31)) * 31);
    }
}
