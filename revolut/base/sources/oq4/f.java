package oq4;

import android.text.InputFilter;
import kotlin.jvm.internal.Intrinsics;
import u80.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputFilter f227737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je6.h f227738b;

    public f(o moneyPrefixFormatter, InputFilter amountInputFilter, je6.h externalInstitutionLogoMapper, d hintMapper, j suggestionsMapper) {
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountInputFilter, "amountInputFilter");
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        Intrinsics.checkNotNullParameter(hintMapper, "hintMapper");
        Intrinsics.checkNotNullParameter(suggestionsMapper, "suggestionsMapper");
        this.f227737a = amountInputFilter;
        this.f227738b = externalInstitutionLogoMapper;
    }
}
