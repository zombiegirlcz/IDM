package wbi;

import android.text.InputFilter;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.personal_code.PersonalCodeContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PersonalCodeContract$InputData f296229a;

    public l(PersonalCodeContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f296229a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InputTextDelegate.Model model = new InputTextDelegate.Model("PERSONAL_CODE_INPUT_ID", new TextClause(domainState.f296218a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(domainState.f296219b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(domainState.f296220c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, domainState.e ? new TextLocalisedClause(R$string.personal_code_input_error, u.c(domainState.f296219b), null, 12) : null, null, null, null, null, null, false, null, null, domainState.e, true, 524432, 0, null, false, true, null, true, v.k(new InputFilter.AllCaps(), new InputFilter.LengthFilter(this.f296229a.f97707c.length())), false, false, false, null, null, 0, -1680212128, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new e(u.c(model), domainState.d);
    }
}
