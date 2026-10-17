package kk9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import nii.m0;
import nii.z;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements nii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f184542a = new l();

    @Override // nii.p1
    public final m0 a(Object obj2) {
        Throwable it8 = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R$string.general_error_common, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
    }
}
