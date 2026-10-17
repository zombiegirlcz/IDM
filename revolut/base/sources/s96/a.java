package s96;

import android.app.Activity;
import android.content.Intent;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public interface a {
    h extractImageUri(Intent intent);

    Object getStartScanIntent(Activity activity, d dVar, Continuation continuation);
}
