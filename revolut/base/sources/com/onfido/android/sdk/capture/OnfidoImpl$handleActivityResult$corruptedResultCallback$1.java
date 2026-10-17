package com.onfido.android.sdk.capture;

import android.content.Intent;
import com.onfido.android.sdk.capture.Onfido;
import com.onfido.android.sdk.capture.errors.OnfidoException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import v1.c;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class OnfidoImpl$handleActivityResult$corruptedResultCallback$1 extends u implements Function0<Unit> {
    final /* synthetic */ Onfido.OnfidoResultListener $callback;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ int $resultCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnfidoImpl$handleActivityResult$corruptedResultCallback$1(Onfido.OnfidoResultListener onfidoResultListener, Intent intent, int i) {
        super(0);
        this.$callback = onfidoResultListener;
        this.$intent = intent;
        this.$resultCode = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m3663invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3663invoke() {
        String string;
        Onfido.OnfidoResultListener onfidoResultListener = this.$callback;
        Intent intent = this.$intent;
        if (intent == null || (string = intent.toString()) == null) {
            string = "null";
        }
        onfidoResultListener.onError(new OnfidoException(c.t(this.$resultCode, "Unexpected result Intent. It might be a result of incorrect integration, make sure you only pass Onfido intent to handleActivityResult. It might be due to unpredictable crash or error. Please report the problem to support@onfido.com. Intent: ", string, " \n resultCode: ")));
    }
}
