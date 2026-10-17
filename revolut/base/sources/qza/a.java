package qza;

import com.revolut.data.model.Data;
import com.revolut.domain.models.beneficiary.BeneficiarySearchList;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$RemoteStoriesModel;
import com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.McyExchangeRateScreen;
import efm.h0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements kfm.o, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f250455b;

    public /* synthetic */ a(int i, Function1 function1) {
        this.f250454a = i;
        this.f250455b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((qpb.a) this.f250455b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f250454a) {
            case 0:
                qz9.b bVar = (qz9.b) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) bVar.invoke(p0);
            case 1:
            case 9:
            default:
                q2j.j jVar = (q2j.j) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) jVar.invoke(p0);
            case 2:
                qz9.o oVar = (qz9.o) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (RemoteStoriesContract$RemoteStoriesModel) oVar.invoke(p0);
            case 3:
                q2k.b bVar2 = (q2k.b) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (RemoteStoriesContract$RemoteStoriesModel) bVar2.invoke(p0);
            case 4:
                r rVar = (r) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) rVar.invoke(p0);
            case 5:
                r rVar2 = (r) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) rVar2.invoke(p0);
            case 6:
                return (String) ((qz9.b) this.f250455b).invoke(p0);
            case 7:
                qz9.b bVar3 = (qz9.b) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) bVar3.invoke(p0);
            case 8:
                qz9.b bVar4 = (qz9.b) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) bVar4.invoke(p0);
            case 10:
                r10.b bVar5 = (r10.b) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) bVar5.invoke(p0);
            case 11:
                r10.b bVar6 = (r10.b) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar6.invoke(p0);
            case 12:
                r0e.i iVar = (r0e.i) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) iVar.invoke(p0);
            case 13:
                r0e.i iVar2 = (r0e.i) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n61.i) iVar2.invoke(p0);
            case 14:
                r0e.i iVar3 = (r0e.i) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f5j.a) iVar3.invoke(p0);
            case 15:
                r21.b bVar7 = (r21.b) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar7.invoke(p0);
            case 16:
                r10.b bVar8 = (r10.b) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar8.invoke(p0);
            case 17:
                r0e.i iVar4 = (r0e.i) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n61.e) iVar4.invoke(p0);
            case 18:
                r0e.i iVar5 = (r0e.i) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) iVar5.invoke(p0);
            case 19:
                r0e.i iVar6 = (r0e.i) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f5j.a) iVar6.invoke(p0);
            case 20:
                r0e.i iVar7 = (r0e.i) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n61.d) iVar7.invoke(p0);
            case 21:
                r21.b bVar9 = (r21.b) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar9.invoke(p0);
            case 22:
                r10.b bVar10 = (r10.b) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar10.invoke(p0);
            case 23:
                r0e.i iVar8 = (r0e.i) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n61.p) iVar8.invoke(p0);
            case 24:
                r0e.i iVar9 = (r0e.i) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BeneficiarySearchList) iVar9.invoke(p0);
            case 25:
                r0e.i iVar10 = (r0e.i) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) iVar10.invoke(p0);
            case 26:
                r0e.i iVar11 = (r0e.i) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) iVar11.invoke(p0);
            case 27:
                r0e.i iVar12 = (r0e.i) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) iVar12.invoke(p0);
            case 28:
                r10.b bVar11 = (r10.b) this.f250455b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar11.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        r0e.i iVar = (r0e.i) this.f250455b;
        KProperty[] kPropertyArr = McyExchangeRateScreen.U;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) iVar.invoke(p0)).booleanValue();
    }
}
