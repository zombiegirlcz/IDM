package ky1;

import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettings;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import vkm.d;

/* JADX INFO: loaded from: classes20.dex */
public interface a {
    Flow a(String str);

    Object b(List list, Continuation continuation);

    Object c(String str, gim.c cVar);

    default Object d(String str, ApmRecipientSettings apmRecipientSettings, Continuation continuation) {
        return null;
    }

    d e();

    d f(String str);

    Object g(String str, fy1.c cVar);
}
