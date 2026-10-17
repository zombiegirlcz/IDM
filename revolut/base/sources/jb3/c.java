package jb3;

import com.revolut.feature.cash_topup.api.models.BarcodeDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f172578b;

    public /* synthetic */ c(d dVar, int i) {
        this.f172577a = i;
        this.f172578b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f172577a) {
            case 0:
                Response response = (Response) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                int iCode = response.code();
                d dVar = this.f172578b;
                if (iCode != 200) {
                    if (response.code() == 204) {
                        dVar.f172580b.I0("BARCODE_DETAILS_KEY");
                    }
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                Object objBody = response.body();
                if (objBody == null) {
                    throw new IllegalArgumentException("Body was incorrect and status code was 200");
                }
                hb3.i iVar = (hb3.i) objBody;
                ib3.a aVarA = a.a(iVar, iVar.getStoreId());
                dVar.a(aVarA);
                BarcodeDetails barcodeDetailsB = a.b(aVarA);
                od0.i.Companion.getClass();
                return od0.h.a(barcodeDetailsB);
            default:
                this.f172578b.f172580b.I0("BARCODE_DETAILS_KEY");
                return Unit.f186387a;
        }
    }
}
