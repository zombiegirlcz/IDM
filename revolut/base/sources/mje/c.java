package mje;

import com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$ReloadParcel;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f205977a = new c();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        return new SplitAccountsItemGroup.ErrorGroup(new SplitAccountsItemGroup.ErrorItem(true, SplitAccountsWidgetContract$ReloadParcel.f71418a, "REVOLUT_X_FIAT_ERROR_STATE_ID"));
    }
}
