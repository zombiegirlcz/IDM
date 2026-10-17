package kr4;

import cz4.b;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import p35.p0;
import p35.u0;
import te0.w;
import w4l.i;
import xb5.g;
import y45.f;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188659a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f188660b;

    public a(lb5.a autoPayInteractor) {
        Intrinsics.checkNotNullParameter(autoPayInteractor, "autoPayInteractor");
        this.f188660b = autoPayInteractor;
    }

    @Override // cz4.b
    public final efm.b a(String facilityId, String sourceId) {
        switch (this.f188659a) {
            case 0:
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                qb5.b bVar = (qb5.b) ((lb5.a) this.f188660b);
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                g gVar = (g) bVar.f244118a;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                return w.g0(gVar.f303997a.selectDirectDebitMandate(facilityId, sourceId));
            default:
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                l35.b bVar2 = (l35.b) this.f188660b;
                return ((f) bVar2).q(facilityId, u0.DIRECT_DEBIT, p0.ACTIVE, sourceId);
        }
    }

    @Override // cz4.b
    public final r b(String facilityId) {
        switch (this.f188659a) {
            case 0:
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                qb5.b bVar = (qb5.b) ((lb5.a) this.f188660b);
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                i loadingStrategy = i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                g gVar = (g) bVar.f244118a;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.w(gVar.f.e(facilityId, loadingStrategy), new kpj.a(8));
            default:
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                return nim.a.w(((f) ((l35.b) this.f188660b)).m(facilityId, i.f294643c), new x29.a(19));
        }
    }

    public a(l35.b loanInteractor) {
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        this.f188660b = loanInteractor;
    }
}
