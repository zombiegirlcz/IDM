package ial;

import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionBannerAction;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionConfirmDialog;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionConfirmationDialog;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ral.i;
import ral.m;
import ral.n;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f160052b;

    public /* synthetic */ a(f fVar, int i) {
        this.f160051a = i;
        this.f160052b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f160051a;
        f fVar = this.f160052b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) fVar.f160060b.get("KEY_SUSPICIOUS_TRANSACTIONS");
            case 1:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                fVar.f160060b.remove("KEY_SUSPICIOUS_TRANSACTIONS");
                return Unit.f186387a;
            default:
                n it8 = (n) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                fVar.f160061c.h(Unit.f186387a);
                Object obj3 = sal.a.f261455a;
                Intrinsics.checkNotNullParameter(it8, "<this>");
                m dialog = it8.getDialog();
                SuspiciousTransactionConfirmDialog suspiciousTransactionConfirmDialog = null;
                if (dialog != null) {
                    String title = dialog.getTitle();
                    String description = dialog.getDescription();
                    i primaryAction = dialog.getPrimaryAction();
                    suspiciousTransactionConfirmDialog = new SuspiciousTransactionConfirmDialog(title, description, primaryAction != null ? new SuspiciousTransactionBannerAction(primaryAction.getTitle(), primaryAction.getDeeplink(), null) : null);
                }
                return new SuspiciousTransactionConfirmationDialog(suspiciousTransactionConfirmDialog);
        }
    }
}
