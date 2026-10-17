package kw6;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.feature.freelancer.impl.ui.dialog.date_picker.FreelancerDatePickerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements n {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerDatePickerScreenContract$InputData f190296a;

    public e(FreelancerDatePickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f190296a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        FreelancerDatePickerScreenContract$InputData freelancerDatePickerScreenContract$InputData = this.f190296a;
        lw0.a aVar = new lw0.a(freelancerDatePickerScreenContract$InputData.f73770a, null, null, null, false, 30);
        g5 g5Var = new g5("LIST_ID_EXPIRY_DATE_PICKER", freelancerDatePickerScreenContract$InputData.f73771b, freelancerDatePickerScreenContract$InputData.f73772c, false, null, freelancerDatePickerScreenContract$InputData.d, freelancerDatePickerScreenContract$InputData.e, null, null, null, 0, 0, 1048376);
        yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
        return new cii.b(null, u.c(g5Var), aVar);
    }
}
