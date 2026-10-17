package pnf;

import akl.s;
import b22.j;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.feature.view.image.api.navigation.ViewImageDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.d0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import ozc.z;
import pjg.i;
import pjg.k;
import skm.p0;
import sri.m;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f237751b;

    public /* synthetic */ d(h hVar, int i) {
        this.f237750a = i;
        this.f237751b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f237750a) {
            case 0:
                File receiptFile = (File) obj2;
                Intrinsics.checkNotNullParameter(receiptFile, "receiptFile");
                ((npi.c) this.f237751b.k).R(new rp0.b("ID_REMOVE_RECEIPT_ALERT_DIALOG", new TextLocalisedClause(R$string.transactionUI_transaction_details_attachment_delete_title, null, null, 14), new TextLocalisedClause(R$string.transactionUI_transaction_details_attachment_delete_subtitle, null, null, 14), new TextLocalisedClause(R.string.common_action_confirm, null, null, 14), null, new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), receiptFile, true, 784));
                return Unit.f186387a;
            case 1:
                rp0.c dialogResult = (rp0.c) obj2;
                Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
                if (Intrinsics.f(dialogResult.f256050a, "ID_REMOVE_RECEIPT_ALERT_DIALOG")) {
                    int i = e.f237752a[dialogResult.f256052c.ordinal()];
                    h hVar = this.f237751b;
                    if (i == 1) {
                        Object obj3 = dialogResult.f256051b;
                        File file = obj3 instanceof File ? (File) obj3 : null;
                        if (file == null) {
                            throw new IllegalStateException("Payload should be instance of File");
                        }
                        pfm.h hVarN = pd.b.n(p0.f264003c, new f(hVar, file, null, 0));
                        s sVar = hVar.i;
                        pfm.a aVar = new pfm.a(hVarN, new m3l.d(16, new k(new BreadcrumbException(), 6)), 2);
                        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                        ofm.h hVarW = aVar.w(new o9h.d(9, sVar), new z(11, g.f237755a));
                        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                        w.j0(hVar.f239031a, hVarW);
                    } else if (i == 2) {
                        ((npi.c) hVar.k).f218223l.a();
                    }
                }
                return Unit.f186387a;
            case 2:
                File selectedReceiptPath = (File) obj2;
                Intrinsics.checkNotNullParameter(selectedReceiptPath, "selectedReceiptPath");
                d0 d0VarFirstOrError = this.f237751b.Q().firstOrError();
                i iVar = new i(new j(selectedReceiptPath, 6), 13);
                d0VarFirstOrError.getClass();
                return new ufm.i(d0VarFirstOrError, iVar, 1);
            case 3:
                Pair pair = (Pair) obj2;
                Object obj4 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj4, "component1(...)");
                List list = (List) obj4;
                Object obj5 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj5, "component2(...)");
                File file2 = (File) obj5;
                m mVar = this.f237751b.f237757l;
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new FileImage((File) it8.next(), (FileImage.Placeholder) null, new ImageTransformations(null, null, null, gz0.b.FitCenter, null, null, null, LDSFile.EF_SOD_TAG), 10));
                }
                mVar.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new ViewImageDestination(new ViewImageDestination.InputData.Gallery(arrayList, list.indexOf(file2))), false, (Integer) null, 0, 61)));
                return Unit.f186387a;
            default:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, this.f237751b.f237757l);
                return Unit.f186387a;
        }
    }
}
