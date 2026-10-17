package qc0;

import com.revolut.core.android.model.country.CountryInfo;
import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.chooser.ChooserScreenContract$Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f244470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f244471c;

    public /* synthetic */ p(j0 j0Var, String str, int i) {
        this.f244469a = i;
        this.f244470b = j0Var;
        this.f244471c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f244469a) {
            case 0:
                FormScreen screen = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(screen, "screen");
                aa0.t tVar = this.f244470b.z;
                List list = screen.f63468b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof BackendFlowUploadItem) {
                        arrayList.add(obj3);
                    }
                }
                return tVar.c(screen, ((BackendFlowUploadItem) ((InputItem) zhm.d0.b0(arrayList))).getId(), new aa0.p0(this.f244471c));
            case 1:
                FormScreen it8 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                aa0.f0 f0Var = this.f244470b.f244442g;
                String str = this.f244471c;
                return f0Var.c(it8, str, new aa0.a1(str));
            case 2:
                FormScreen it9 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                aa0.b bVar = this.f244470b.i;
                String str2 = this.f244471c;
                return bVar.c(it9, str2, new aa0.a1(str2));
            case 3:
                FormScreen it10 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return this.f244470b.f244444j.c(it10, this.f244471c, Unit.f186387a);
            case 4:
                FormScreen it11 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                aa0.f0 f0Var2 = this.f244470b.f244442g;
                String str3 = this.f244471c;
                return f0Var2.c(it11, str3, new aa0.a1(str3));
            default:
                ChooserScreenContract$Model chooserModel = (ChooserScreenContract$Model) obj2;
                Intrinsics.checkNotNullParameter(chooserModel, "chooserModel");
                Serializable serializable = chooserModel.f65909l;
                CountryInfo countryInfo = serializable instanceof CountryInfo ? (CountryInfo) serializable : null;
                if (countryInfo == null) {
                    return null;
                }
                j0 j0Var = this.f244470b;
                String str4 = this.f244471c;
                return j0Var.m3(str4, new pza.d(j0Var, 8, str4, countryInfo));
        }
    }
}
