package a2f;

import com.revolut.feature.credit.application.plugins.api.models.birth_place.BirthCity;
import com.revolut.feature.transfer.core.api.reason.ReasonTransferDetails;
import com.revolut.feature.user_declarations.shared.flows.pep.models.PersonalDetails;
import d27.t;
import d27.u;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.text.z;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharSequence f819b;

    public /* synthetic */ k(int i, CharSequence charSequence) {
        this.f818a = i;
        this.f819b = charSequence;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f818a) {
            case 0:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return f.a(update, null, this.f819b.toString(), null, 5);
            case 1:
                u update2 = (u) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return u.a(update2, null, null, null, null, d27.q.a(update2.e, this.f819b.toString(), false, 2), false, null, d27.s.CUSTOM_FIELD, null, null, null, 1903);
            case 2:
                u update3 = (u) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return u.a(update3, null, null, null, null, null, false, null, d27.s.TITLE, null, null, this.f819b.toString(), 895);
            case 3:
                u update4 = (u) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                t tVar = update4.f110777j;
                Integer numM = z.m(this.f819b.toString());
                boolean z = tVar.f110769a;
                tVar.getClass();
                return u.a(update4, null, null, null, null, null, false, null, d27.s.REUSABLE_COUNT, null, new t(z, numM), null, 1407);
            case 4:
                h50.i update5 = (h50.i) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return h50.i.a(update5, null, this.f819b.toString(), 15);
            case 5:
                iog.f update6 = (iog.f) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return iog.f.a(PersonalDetails.a(update6.f163318a, null, this.f819b.toString(), null, null, null, null, 123));
            case 6:
                iog.f update7 = (iog.f) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return iog.f.a(PersonalDetails.a(update7.f163318a, null, null, this.f819b.toString(), null, null, null, LDSFile.EF_SOD_TAG));
            case 7:
                iog.f update8 = (iog.f) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return iog.f.a(PersonalDetails.a(update8.f163318a, null, null, null, this.f819b.toString(), null, null, LDSFile.EF_DG15_TAG));
            case 8:
                iog.f update9 = (iog.f) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return iog.f.a(PersonalDetails.a(update9.f163318a, null, null, null, null, null, this.f819b.toString(), 63));
            case 9:
                j8i.e update10 = (j8i.e) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                String text = this.f819b.toString();
                update10.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                return new j8i.e(text);
            case 10:
                o27.l update11 = (o27.l) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return o27.l.a(update11, null, null, o27.j.REASON, d0.F0(this.f819b.toString()).toString(), null, null, 439);
            case 11:
                pp6.b update12 = (pp6.b) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                return pp6.b.a(update12, null, this.f819b, null, null, 13);
            case 12:
                qgd.c update13 = (qgd.c) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                String newWatchlistNameInput = this.f819b.toString();
                UUID idempotencyKey = update13.f245779b;
                Intrinsics.checkNotNullParameter(newWatchlistNameInput, "newWatchlistNameInput");
                Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
                return new qgd.c(idempotencyKey, newWatchlistNameInput);
            case 13:
                qgg.h updateState = (qgg.h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return qgg.h.a(updateState, null, this.f819b.toString(), 1);
            case 14:
                qp6.b update14 = (qp6.b) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                return qp6.b.a(update14, this.f819b.toString(), 6);
            case 15:
                qqf.f updateState2 = (qqf.f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                krf.d dVar = new krf.d(this.f819b.toString());
                ReasonTransferDetails transferDetails = updateState2.f248535a;
                krf.f reasonConfig = updateState2.f248536b;
                Intrinsics.checkNotNullParameter(transferDetails, "transferDetails");
                Intrinsics.checkNotNullParameter(reasonConfig, "reasonConfig");
                return new qqf.f(transferDetails, reasonConfig, dVar);
            case 16:
                vmf.f update15 = (vmf.f) obj2;
                Intrinsics.checkNotNullParameter(update15, "$this$update");
                return vmf.f.a(update15, this.f819b.toString());
            case 17:
                y54.f updateState3 = (y54.f) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return y54.f.a(updateState3, BirthCity.a(updateState3.f310983b, this.f819b.toString()));
            default:
                yed.o updateState4 = (yed.o) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return yed.o.a(updateState4, null, null, null, null, false, false, null, null, null, null, false, this.f819b.toString(), false, null, null, null, 1040383);
        }
    }
}
