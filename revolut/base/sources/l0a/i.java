package l0a;

import androidx.compose.runtime.Updater;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f191202b;

    public /* synthetic */ i(int i, Function1 function1) {
        this.f191201a = i;
        this.f191202b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ChatTransferRecipient chatTransferRecipient;
        switch (this.f191201a) {
            case 0:
                ChatTransferRecipient recipient = (ChatTransferRecipient) obj2;
                Data data = (Data) obj3;
                Intrinsics.checkNotNullParameter(recipient, "recipient");
                Intrinsics.checkNotNullParameter(data, "data");
                Object content = data.getContent();
                return (content == null || (chatTransferRecipient = (ChatTransferRecipient) this.f191202b.invoke(content)) == null) ? recipient : chatTransferRecipient;
            default:
                return Updater.reconcile_impl$lambda$0(this.f191202b, obj2, (Unit) obj3);
        }
    }
}
