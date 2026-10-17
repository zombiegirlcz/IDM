package com.onfido.android.sdk.capture.token;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.core.os.BundleKt;
import com.onfido.android.sdk.capture.token.TokenExpirationHandlerService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "token", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class TokenExpirationHandlerService$IncomingHandler$handleMessage$1 extends u implements Function1<String, Unit> {
    final /* synthetic */ TokenExpirationHandlerService.IncomingHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenExpirationHandlerService$IncomingHandler$handleMessage$1(TokenExpirationHandlerService.IncomingHandler incomingHandler) {
        super(1);
        this.this$0 = incomingHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws RemoteException {
        invoke((String) obj2);
        return Unit.f186387a;
    }

    public final void invoke(String str) throws RemoteException {
        Message messageObtain = Message.obtain(this.this$0, 0);
        messageObtain.setData(BundleKt.bundleOf(new Pair("token", str)));
        Messenger messenger = this.this$0.tokenRecevier;
        if (messenger != null) {
            messenger.send(messageObtain);
        } else {
            Intrinsics.r("tokenRecevier");
            throw null;
        }
    }
}
