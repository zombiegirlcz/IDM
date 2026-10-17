package og9;

import cli.n;
import cli.y;
import com.revolut.feature.apm.bills.core.api.model.form.DropdownField;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_searchable.DropdownSearchableSelectionScreenContract$InputData;
import efm.r;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import te0.w;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends oki.h implements g {

    @NotNull
    public static final i Companion = new i();
    public final cji.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f225062p;

    public j(n stateMapper, DropdownSearchableSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        this.o = new cji.d("");
        DropdownField dropdownField = inputData.f78713a;
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this.f225062p = mra.d.b(this, new e(dropdownField, ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        r rVarC = this.o.c();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l.b1(this, rd0.e.b(w.y(rVarC, 300L)), null, new o95.c(this, null, 17), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f225062p;
    }
}
