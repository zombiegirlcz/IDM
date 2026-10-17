package a0l;

import android.os.Parcelable;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document.NationalIdentifierDocumentContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        b currentState = (b) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new NationalIdentifierDocumentContract$RetainedState(currentState.f426a, currentState.f427b);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        b initialState = (b) obj2;
        NationalIdentifierDocumentContract$RetainedState retainedState = (NationalIdentifierDocumentContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        xel.f document = retainedState.f104208a;
        xel.a aVar = retainedState.f104209b;
        initialState.getClass();
        Intrinsics.checkNotNullParameter(document, "document");
        return new b(document, aVar);
    }
}
