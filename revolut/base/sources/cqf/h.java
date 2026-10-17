package cqf;

import com.revolut.feature.transfer.core.api.ui.additional_information.AdditionalInformationInputData;
import com.revolut.feature.transfer.models.config.AdditionalInformationInput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jki.i;
import jki.p;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import yhm.j;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AdditionalInformationInputData f108096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Lazy f108097q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AdditionalInformationInputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f108096p = inputData;
        this.f108097q = j.b(new co7.a(this, 8));
    }

    @Override // jki.g
    public final i r2() {
        return (e) this.f108097q.getValue();
    }

    public final boolean y2(String str) {
        AdditionalInformationInput additionalInformationInput = this.f108096p.e;
        String str2 = additionalInformationInput != null ? additionalInformationInput.f92268c : null;
        if (str2 != null) {
            Pattern patternCompile = Pattern.compile(str2, 0);
            Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
            if (patternCompile != null) {
                Matcher matcher = patternCompile.matcher(str == null ? "" : str);
                if (matcher != null) {
                    return matcher.matches();
                }
            }
        }
        return (str == null || d0.W(str)) ? false : true;
    }
}
