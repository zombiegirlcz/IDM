package pd4;

import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.UploadDocumentsScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends m {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        i currentState = (i) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new UploadDocumentsScreenContract$RetainedState(currentState.e);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        i initialState = (i) obj2;
        UploadDocumentsScreenContract$RetainedState retainedState = (UploadDocumentsScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return i.a(initialState, null, retainedState.f67926a, null, 47);
    }
}
