package fzd;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f139143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomisationSelection f139144b;

    public j(Data parameters, CustomisationSelection selection) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.f139143a = parameters;
        this.f139144b = selection;
    }

    public static j a(j jVar, Data parameters, CustomisationSelection selection, int i) {
        if ((i & 1) != 0) {
            parameters = jVar.f139143a;
        }
        if ((i & 2) != 0) {
            selection = jVar.f139144b;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(selection, "selection");
        return new j(parameters, selection);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f139143a, jVar.f139143a) && Intrinsics.f(this.f139144b, jVar.f139144b);
    }

    public final int hashCode() {
        return this.f139144b.hashCode() + (this.f139143a.hashCode() * 31);
    }
}
