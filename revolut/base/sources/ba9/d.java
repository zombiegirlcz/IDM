package ba9;

import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import rfm.u;
import t70.g;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n89.b f13998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f13999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f14000c;
    public final u d;

    public d(n89.b presentationModel, g localization) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f13998a = presentationModel;
        this.f13999b = localization;
        this.f14000c = w.f(localization.getString(R.string.missing_info_code_us_ssn_itin_title));
        this.d = w.f(localization.getString(R.string.missing_info_code_us_ssn_itin_subtitle));
    }
}
