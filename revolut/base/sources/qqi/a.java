package qqi;

import com.revolut.retail.common.ui.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import npi.f;
import t70.g;
import t80.m;
import t80.n;
import t80.o;
import upi.d;
import upi.e;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f248549b;

    public /* synthetic */ a(c cVar, int i) {
        this.f248548a = i;
        this.f248549b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f248548a;
        c cVar = this.f248549b;
        switch (i) {
            case 0:
                f fVar = cVar.f248551j;
                e result = (e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof d) {
                    Function1 function1 = cVar.f248553m;
                    if (function1 == null) {
                        Intrinsics.r("onDocumentPicked");
                        throw null;
                    }
                    function1.invoke(d0.b0(((d) result).f282063a));
                } else {
                    if (!(result instanceof upi.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    upi.c cVar2 = (upi.c) result;
                    m mVar = cVar2.f282060a;
                    y80.d dVar = cVar2.f282061b;
                    g gVar = cVar.i;
                    if (mVar instanceof n) {
                        f.B(fVar, null, gVar.i(R$string.common_attachments_error_too_large, "10 MB"), null, 13);
                    } else if (mVar.equals(m.d.f268770a)) {
                        if (dVar == y80.d.DENIED_PERMANENTLY) {
                            f.J(cVar.f248551j, null, gVar.getString(R$string.common_attachments_error_permissions_required), gVar.getString(R$string.common_attachments_permission_dialog_positive), gVar.getString(R$string.common_action_cancel), new a(cVar, 1), 49);
                        }
                    } else if (mVar.equals(m.e.f268771a)) {
                        f.B(fVar, null, gVar.getString(R$string.common_attachments_error_not_valid), null, 13);
                    } else if ((mVar instanceof o) || mVar.equals(m.b.f268768a) || mVar.equals(m.c.f268769a)) {
                        f.B(fVar, null, gVar.getString(R$string.common_attachments_error_unknown), null, 13);
                    } else {
                        if (!mVar.equals(m.a.f268767a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.b(rd0.c.INFO, "MediaPickerPresenterDelegate", "File picking is cancelled", null, null, 16);
                    }
                }
                return Unit.f186387a;
            case 1:
                if (((Boolean) obj2).booleanValue()) {
                    cVar.k.a();
                }
                return Unit.f186387a;
            default:
                ryl.a model = (ryl.a) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                String f52519a = model.getF52519a();
                if (Intrinsics.f(f52519a, "PHOTO")) {
                    upi.f.C(cVar.f248550h, 2);
                } else if (Intrinsics.f(f52519a, "DOCUMENT")) {
                    upi.f.z(cVar.f248550h, null, false, 14);
                }
                return Unit.f186387a;
        }
    }
}
