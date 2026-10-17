package qc0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowBinary;
import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f244474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f244475c;

    public /* synthetic */ q(j0 j0Var, File file, int i) {
        this.f244473a = i;
        this.f244474b = j0Var;
        this.f244475c = file;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f244473a) {
            case 0:
                FormScreen it8 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                aa0.t tVar = this.f244474b.z;
                List list = it8.f63468b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof BackendFlowUploadItem) {
                        arrayList.add(obj3);
                    }
                }
                return tVar.c(it8, ((BackendFlowUploadItem) ((InputItem) zhm.d0.b0(arrayList))).getId(), new aa0.q0(BackendFlowBinary.Companion.a(BackendFlowBinary.INSTANCE, this.f244475c, xl2.e.UPLOADING, null, 4)));
            default:
                od0.i result = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                j0 j0Var = this.f244474b;
                return j0Var.m3(null, new pza.d(j0Var, 7, this.f244475c, result));
        }
    }
}
