package x92;

import android.app.Application;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public interface l {

    @NotNull
    public static final k Companion = k.f303543a;

    Object confirmPendingPayment(String str, String str2, String str3, Continuation continuation);

    Object init(Application application, y92.b bVar, Continuation continuation);

    Object parseQRCodeInfo(String str, Continuation continuation);

    Object register(y92.c cVar, Continuation continuation);

    Object registerQRCodePayment(String str, String str2, String str3, Continuation continuation);

    Object rejectPendingPayment(String str, String str2, Continuation continuation);

    Object searchPendingPayment(String str, String str2, Continuation continuation);
}
