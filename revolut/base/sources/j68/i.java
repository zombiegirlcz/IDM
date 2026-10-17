package j68;

import cli.n;
import cli.y;
import cli.z;
import com.revolut.feature.junior.account_activation.impl.ui.screen.edit_dob.EditBirthDateControllerContract$InputData;
import java.time.LocalDate;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends oki.h implements z {
    public final kbb.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f171694p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f171695q;

    public i(EditBirthDateControllerContract$InputData inputData, n stateMapper, kbb.c juniorConfigInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = juniorConfigInteractor;
        this.f171694p = userInteractor;
        LocalDate localDate = inputData.f76665a;
        this.f171695q = mra.d.b(this, new e(localDate, localDate, null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, mo3.a.g(u0.m(rd0.e.b(this.o.O(false)), rd0.e.b(this.f171694p.k(false))), null, new j0g.b(23), 1), null, null, new iug.j(this, (Continuation) null, 24), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f171695q;
    }
}
