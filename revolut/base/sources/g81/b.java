package g81;

import aii.i;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.error_handling.R$string;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.e0;
import nii.y0;
import r10.f;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f141234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f141235c;

    public /* synthetic */ b(e eVar, i iVar, int i) {
        this.f141233a = i;
        this.f141234b = eVar;
        this.f141235c = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f141233a) {
            case 0:
                f fVar = this.f141234b.f141237a;
                i event = this.f141235c;
                Intrinsics.checkNotNullParameter(event, "event");
                boolean zB = ((b80.c) fVar.c).b();
                return new y0(null, new e0((Clause) new TextLocalisedClause(!zB ? R$string.offline_widget_title : R$string.connection_error_title, null, null, 14), (Clause) new TextLocalisedClause(!zB ? R$string.offline_widget_description : R$string.connection_error_description, null, null, 14), new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), (Parcelable) null, true, (AnalyticsProduct) null, 980), false, 5);
            case 1:
                return this.f141234b.f141237a.S(this.f141235c);
            default:
                return this.f141234b.f141237a.S(this.f141235c);
        }
    }
}
