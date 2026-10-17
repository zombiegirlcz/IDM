package e0f;

import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.national_identifier_document_screen.NationalIdentifierDocumentFragment;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements kfm.o, kfm.p, kfm.g, zp0.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f121625b;

    public /* synthetic */ k(Object obj2, int i) {
        this.f121624a = i;
        this.f121625b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f121624a) {
            case 7:
                ((ald.o) this.f121625b).invoke(obj2);
                break;
            case 12:
                ((l) this.f121625b).invoke(obj2);
                break;
            case 13:
                ((l) this.f121625b).invoke(obj2);
                break;
            default:
                ((l) this.f121625b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f121624a) {
            case 0:
                dz7.k kVar = (dz7.k) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) kVar.invoke(p0);
            case 1:
                dz7.k kVar2 = (dz7.k) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) kVar2.invoke(p0);
            case 2:
                l lVar = (l) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (t61.c) lVar.invoke(p0);
            case 3:
                j jVar = (j) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) jVar.invoke(p0);
            case 4:
            case 7:
            case 12:
            case 13:
            case 14:
            case 16:
            case 22:
            case 23:
            default:
                e1.b bVar = (e1.b) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (AutoTopUpState) bVar.invoke(p0);
            case 5:
                l lVar2 = (l) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) lVar2.invoke(p0);
            case 6:
                dz7.k kVar3 = (dz7.k) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                kVar3.invoke(p0);
                throw null;
            case 8:
                l lVar3 = (l) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) lVar3.invoke(p0);
            case 9:
                l lVar4 = (l) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) lVar4.invoke(p0);
            case 10:
                doe.c cVar = (doe.c) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) cVar.invoke(p0);
            case 11:
                l lVar5 = (l) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                lVar5.invoke(p0);
                throw null;
            case 15:
                dz7.k kVar4 = (dz7.k) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) kVar4.invoke(p0);
            case 17:
                e0l.g gVar = (e0l.g) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) gVar.invoke(p0);
            case 18:
                e0l.g gVar2 = (e0l.g) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) gVar2.invoke(p0);
            case 19:
                e0l.g gVar3 = (e0l.g) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) gVar3.invoke(p0);
            case 20:
                e1.b bVar2 = (e1.b) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) bVar2.invoke(p0);
            case 21:
                e1d.h hVar = (e1d.h) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) hVar.invoke(p0);
            case 24:
                e1.b bVar3 = (e1.b) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) bVar3.invoke(p0);
            case 25:
                e2i.l lVar6 = (e2i.l) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) lVar6.invoke(p0);
            case 26:
                e2j.j jVar2 = (e2j.j) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) jVar2.invoke(p0);
            case 27:
                e1d.h hVar2 = (e1d.h) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) hVar2.invoke(p0);
        }
    }

    @Override // zp0.x
    public void e(String listId, String extractedValue, String formattedValue, boolean z) {
        NationalIdentifierDocumentFragment nationalIdentifierDocumentFragment = (NationalIdentifierDocumentFragment) this.f121625b;
        int i = NationalIdentifierDocumentFragment.j0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        nationalIdentifierDocumentFragment.g0.onNext(new Pair(listId, new xel.a(extractedValue, formattedValue, z)));
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f121624a) {
            case 4:
                d7a.p pVar = (d7a.p) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) pVar.invoke(p0)).booleanValue();
            case 22:
                e1d.h hVar = (e1d.h) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) hVar.invoke(p0)).booleanValue();
            case 23:
                e1d.h hVar2 = (e1d.h) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) hVar2.invoke(p0)).booleanValue();
            default:
                be7.l lVar = (be7.l) this.f121625b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) lVar.invoke(p0)).booleanValue();
        }
    }
}
