package androidx.core.content;

import android.content.ClipData;
import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;
import com.revolut.feature.push.PushDispatcherActivity;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7348a;

    public /* synthetic */ a(int i) {
        this.f7348a = i;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj2) {
        switch (this.f7348a) {
            case 0:
                return IntentSanitizer.Builder.lambda$new$0((String) obj2);
            case 1:
                return IntentSanitizer.Builder.lambda$new$1((Uri) obj2);
            case 2:
                return IntentSanitizer.Builder.lambda$new$2((String) obj2);
            case 3:
                return IntentSanitizer.Builder.lambda$new$3((String) obj2);
            case 4:
                return IntentSanitizer.Builder.lambda$new$4((String) obj2);
            case 5:
                return IntentSanitizer.Builder.lambda$new$5((ComponentName) obj2);
            case 6:
                return IntentSanitizer.Builder.lambda$new$6((Uri) obj2);
            case 7:
                return IntentSanitizer.Builder.lambda$new$7((ClipData) obj2);
            case 8:
                return IntentSanitizer.Builder.lambda$allowAnyComponent$10((ComponentName) obj2);
            case 9:
                return IntentSanitizer.Builder.lambda$allowExtra$14(obj2);
            case 10:
                break;
            case 11:
                break;
            default:
                PushDispatcherActivity.a aVar = PushDispatcherActivity.Companion;
                return true;
        }
        PushDispatcherActivity.a aVar2 = PushDispatcherActivity.Companion;
        return true;
    }
}
