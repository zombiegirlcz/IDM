package eul;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.f3;
import mx0.h3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f129638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f129639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o7.b f129640c;
    public final j d;
    public final r e;

    public h(c amountDelegateMapper, x switcherDataStateMapper, o7.b amountInputHintMapper, j currencyPickerDataMapper, r orderSettingsStateMapper) {
        Intrinsics.checkNotNullParameter(amountDelegateMapper, "amountDelegateMapper");
        Intrinsics.checkNotNullParameter(switcherDataStateMapper, "switcherDataStateMapper");
        Intrinsics.checkNotNullParameter(amountInputHintMapper, "amountInputHintMapper");
        Intrinsics.checkNotNullParameter(currencyPickerDataMapper, "currencyPickerDataMapper");
        Intrinsics.checkNotNullParameter(orderSettingsStateMapper, "orderSettingsStateMapper");
        this.f129638a = amountDelegateMapper;
        this.f129639b = switcherDataStateMapper;
        this.f129640c = amountInputHintMapper;
        this.d = currencyPickerDataMapper;
        this.e = orderSettingsStateMapper;
    }

    public final CenteredAmountDelegate.Model a() {
        m70.a.c(t0.f186434a);
        TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        bw0.h hVarA = c.a();
        f3 f3Var = new f3(null, null, null, false, h3.LOADING, false);
        bw0.m.Companion.getClass();
        return new CenteredAmountDelegate.Model("LIST_ID_CENTERED_AMOUNT_DELEGATE", textClause, hVarA, f3Var, bw0.k.a(), null, null, false, false, null, null, 1888);
    }
}
