package ab4;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.qr.parser.impl.ui.scanner.CryptoQrScannerControllerContract$ProcessingState;
import com.revolut.feature.payments.profile.impl.ui_kompot.scanner.ProfileScannerScreenContract$ProcessingState;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f2885b;

    public /* synthetic */ q(Throwable th10, int i) {
        this.f2884a = i;
        this.f2885b = th10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        switch (this.f2884a) {
            case 0:
                return new h(new Data(null, this.f2885b, false, 5, null));
            case 1:
                Data contentData = new Data(null, this.f2885b, false, 5, null);
                ((alb.e) obj2).getClass();
                Intrinsics.checkNotNullParameter(contentData, "contentData");
                return new alb.e(contentData);
            case 2:
                ProfileScannerScreenContract$ProcessingState.Error error = new ProfileScannerScreenContract$ProcessingState.Error(this.f2885b);
                ((ax9.e) obj2).getClass();
                return ax9.e.a(error);
            case 3:
                bb2.j update = (bb2.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return bb2.j.a(update, null, new Data(null, this.f2885b, false, 5, null), 1);
            case 4:
                bb2.j update2 = (bb2.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return bb2.j.a(update2, new Data(null, this.f2885b, false, 5, null), null, 2);
            case 5:
                bq7.f updateState = (bq7.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Data data = new Data(null, this.f2885b, false, 5, null);
                updateState.getClass();
                return bq7.f.a(data);
            case 6:
                cab.g update3 = (cab.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return cab.g.a(update3, null, null, new Data(null, this.f2885b, false, 5, null), null, 11);
            case 7:
                return db.l.a((db.l) obj2, null, null, null, new Data(null, this.f2885b, false, 5, null), null, null, 55);
            case 8:
                return db.l.a((db.l) obj2, new Data(null, this.f2885b, false, 5, null), null, null, null, null, null, 46);
            case 9:
                Data data2 = new Data(null, this.f2885b, false, 5, null);
                ((dmb.g) obj2).getClass();
                Intrinsics.checkNotNullParameter(data2, "data");
                return new dmb.g(data2);
            case 10:
                Intrinsics.checkNotNullParameter((eql.h) obj2, "$this$updateState");
                return new eql.f(this.f2885b);
            case 11:
                fee.e update4 = (fee.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Data transactions = new Data(null, this.f2885b, false, 5, null);
                update4.getClass();
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new fee.e(transactions);
            case 12:
                fj5.b update5 = (fj5.b) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                CryptoQrScannerControllerContract$ProcessingState.Error processingState = new CryptoQrScannerControllerContract$ProcessingState.Error(this.f2885b);
                update5.getClass();
                Intrinsics.checkNotNullParameter(processingState, "processingState");
                return new fj5.b(processingState);
            case 13:
                gc4.e update6 = (gc4.e) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                Data howItWorksInfoData = new Data(null, this.f2885b, false, 5, null);
                update6.getClass();
                Intrinsics.checkNotNullParameter(howItWorksInfoData, "howItWorksInfoData");
                return new gc4.e(howItWorksInfoData);
            case 14:
                h32.d update7 = (h32.d) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                Data data3 = new Data(null, this.f2885b, false, 5, null);
                update7.getClass();
                Intrinsics.checkNotNullParameter(data3, "data");
                return new h32.d(data3);
            case 15:
                hb4.e update8 = (hb4.e) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return hb4.e.a(update8, null, new Data(null, this.f2885b, false, 5, null), 1);
            case 16:
                hf8.a resolver = (hf8.a) obj2;
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                resolver.getClass();
                Throwable throwable = this.f2885b;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                ServerError serverErrorA = resolver.f151778a.a(throwable);
                if (serverErrorA == null) {
                    return null;
                }
                v60.d dVarA = ((ao0.a) resolver.f151779b).a(serverErrorA.f51362a, v60.a.SERVER);
                if (dVarA instanceof v60.b) {
                    z = false;
                } else {
                    if (!(dVarA instanceof v60.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                }
                return new TextLocalisedClause(dVarA.a(), (List) null, (Clause) null, z, 14);
            case 17:
                i42.d update9 = (i42.d) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return i42.d.a(update9, new Data(null, this.f2885b, false, 5, null), false, 2);
            case 18:
                ieb.g update10 = (ieb.g) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return ieb.g.a(update10, Data.copy$default(update10.f160684a, null, this.f2885b, false, 1, null), null, null, null, null, null, null, null, 254);
            case 19:
                Data benefitsLayout = new Data(null, this.f2885b, false, 5, null);
                ((iga.e) obj2).getClass();
                Intrinsics.checkNotNullParameter(benefitsLayout, "benefitsLayout");
                return new iga.e(benefitsLayout);
            case 20:
                Intrinsics.checkNotNullParameter((ij4.g) obj2, "$this$update");
                return new ij4.g(new Data(null, this.f2885b, false, 5, null), null, false);
            case 21:
                j17.d updateState2 = (j17.d) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                Data upsellData = zi0.c.O(this.f2885b);
                updateState2.getClass();
                Intrinsics.checkNotNullParameter(upsellData, "upsellData");
                return new j17.d(upsellData);
            case 22:
                ji1.e update11 = (ji1.e) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return ji1.e.a(update11, null, new ji1.g(new Data(null, this.f2885b, false, 5, null), null), null, 5);
            case 23:
                koe.h update12 = (koe.h) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                return koe.h.a(update12, null, null, null, new Data(null, this.f2885b, false, 5, null), 7);
            case 24:
                l0c.j update13 = (l0c.j) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                return l0c.j.a(update13, null, new Data(null, this.f2885b, false, 5, null), false, 1);
            case 25:
                return lck.c.a((lck.c) obj2, new Data(null, this.f2885b, false, 5, null));
            case 26:
                return ma.g.a((ma.g) obj2, new Data(null, this.f2885b, false, 5, null), null, 2);
            case 27:
                ma2.e update14 = (ma2.e) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                return ma2.e.a(update14, new Data(null, this.f2885b, false, 5, null));
            case 28:
                md9.e update15 = (md9.e) obj2;
                Intrinsics.checkNotNullParameter(update15, "$this$update");
                return md9.e.a(update15, new Data(null, this.f2885b, false, 5, null), false, 2);
            default:
                nci.k update16 = (nci.k) obj2;
                Intrinsics.checkNotNullParameter(update16, "$this$update");
                return nci.k.a(update16, null, new Data(null, this.f2885b, false, 5, null), false, 1);
        }
    }
}
