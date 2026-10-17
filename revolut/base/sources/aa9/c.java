package aa9;

import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import fa9.d;
import kotlin.jvm.internal.Intrinsics;
import rfm.u;
import t70.g;
import te0.w;
import ypi.i;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends d {
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f2792j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g localization, a presentationModel, i nextButtonView) {
        super(nextButtonView);
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        this.i = localization;
        this.f2792j = presentationModel;
    }

    @Override // fa9.d
    public final String N() {
        return this.i.getString(R.string.missing_info_code_us_ssn_itin_input_field_error);
    }

    @Override // fa9.d
    public final String O() {
        return this.i.getString(R.string.missing_personal_code_input_field_hint);
    }

    @Override // fa9.d
    public final String P() {
        return "[00000000000]";
    }

    @Override // fa9.d
    public final String Q() {
        return this.i.getString(R.string.missing_personal_code_input_field_title);
    }

    @Override // fa9.d
    public final u S() {
        return w.f(this.i.getString(R.string.missing_personal_code_subtitle));
    }

    @Override // fa9.d
    public final u T() {
        return w.f(this.i.getString(R.string.missing_personal_code_title));
    }

    @Override // fa9.d
    public final r U() {
        return this.f2792j.Z2();
    }

    @Override // fa9.d
    public final r V() {
        return this.f2792j.z1();
    }

    @Override // fa9.d
    public final void X(String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f2792j.c3(text, z);
    }
}
