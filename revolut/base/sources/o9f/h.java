package o9f;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.trading.transfer.investments.api.navigation.TransferOutFeatureConfig;
import efm.d0;
import h8b.l;
import h8b.m;
import java.io.File;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import pfm.n;
import q90.l1;
import te0.w;
import ulm.a1;
import ulm.b1;
import ulm.c1;
import ulm.p1;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements wl2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f223266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferOutFeatureConfig.TransferOut f223267b;

    public h(i transferOutFlowInteractor, TransferOutFeatureConfig.TransferOut config) {
        Intrinsics.checkNotNullParameter(transferOutFlowInteractor, "transferOutFlowInteractor");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f223266a = transferOutFlowInteractor;
        this.f223267b = config;
    }

    @Override // wl2.f
    public final d0 a(BackendFlow flow) {
        Intrinsics.checkNotNullParameter(flow, "answers");
        String str = this.f223267b.f91541b;
        Intrinsics.checkNotNullParameter(flow, "answers");
        i iVar = this.f223266a;
        h9f.b bVar = iVar.f223268a;
        u8f.h transferType = (u8f.h) iVar.f223269b.f213644a.invoke();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(flow, "flow");
        d0<q90.i> d0VarPostFlow = bVar.f150238a.postFlow(h9f.b.a(transferType), bVar.f150240c.b(flow), str);
        m mVar = new m(new gwc.h(1, bVar.f150240c, t90.g.class, "toDomain", "toDomain(Lcom/revolut/core/backend_flow/data/network/dto/BackendFlowDto;)Lcom/revolut/feature/backend_flow/domain/models/BackendFlow;", 0, 19), 17);
        d0VarPostFlow.getClass();
        ufm.i iVar2 = new ufm.i(d0VarPostFlow, mVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return w.i0(iVar2);
    }

    @Override // wl2.f
    public final d0 b(File file) {
        b1 b1VarB;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(file, "file");
        i iVar = this.f223266a;
        h9f.b bVar = iVar.f223268a;
        u8f.h transferType = (u8f.h) iVar.f223269b.f213644a.invoke();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(file, "file");
        String strD = o80.c.d(file);
        if (strD != null) {
            b1.Companion.getClass();
            b1VarB = a1.b(strD);
        } else {
            b1VarB = null;
        }
        c1 c1Var = new c1(0);
        c1Var.f(okhttp3.c.f226117n);
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String name2 = file.getName();
        RequestBody.Companion.getClass();
        c1Var.b(name, name2, p1.a(file, b1VarB));
        d0<l1> d0VarUploadFile = bVar.f150238a.uploadFile(h9f.b.a(transferType), c1Var.e());
        m mVar = new m(new l(17), 18);
        d0VarUploadFile.getClass();
        ufm.i iVar2 = new ufm.i(d0VarUploadFile, mVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return w.i0(iVar2);
    }

    @Override // wl2.f
    public final d0 k() {
        String str = this.f223267b.f91541b;
        i iVar = this.f223266a;
        h9f.b bVar = iVar.f223268a;
        u8f.h transferType = (u8f.h) iVar.f223269b.f213644a.invoke();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        d0<q90.i> flow = bVar.f150238a.getFlow(h9f.b.a(transferType), str);
        m mVar = new m(new gwc.h(1, bVar.f150240c, t90.g.class, "toDomain", "toDomain(Lcom/revolut/core/backend_flow/data/network/dto/BackendFlowDto;)Lcom/revolut/feature/backend_flow/domain/models/BackendFlow;", 0, 18), 16);
        flow.getClass();
        ufm.i iVar2 = new ufm.i(flow, mVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return w.i0(iVar2);
    }

    @Override // wl2.f
    public final efm.b removeFile(String id10, String remoteId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(remoteId, "remoteId");
        n nVarN = efm.b.n(new NotImplementedError(null, 1, null));
        Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
        return nVarN;
    }
}
