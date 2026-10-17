package com.onfido.android.sdk.capture.ui.proofOfAddress.host;

import com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostViewModel;
import com.onfido.android.sdk.capture.utils.CountryCode;
import igm.c;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostViewModel$GetCountriesResponse;", "invoke", "()Lio/reactivex/rxjava3/core/Observable;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class PoaHostViewModel$getCountriesResponse$2 extends u implements Function0<Observable> {
    final /* synthetic */ PoaHostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoaHostViewModel$getCountriesResponse$2(PoaHostViewModel poaHostViewModel) {
        super(0);
        this.this$0 = poaHostViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Observable invoke() {
        return Observable.combineLatest(this.this$0.poaCountriesSubject, this.this$0.errorMessageSubject, new c() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostViewModel$getCountriesResponse$2.1
            @Override // igm.c
            @NotNull
            public final PoaHostViewModel.GetCountriesResponse apply(List<? extends CountryCode> list, String str) {
                Intrinsics.h(list);
                return new PoaHostViewModel.GetCountriesResponse(list, str);
            }
        });
    }
}
