package t3i;

import android.content.Context;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public interface j {
    void deleteFourthlineFiles(Context context);

    void launchDocuments(Context context, DocType docType, String str, Function1 function1);

    void launchSelfie(Context context, Function1 function1);

    Object startSession(Context context, String str, Continuation continuation);
}
