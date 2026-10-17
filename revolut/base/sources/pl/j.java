package pl;

import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Navigator f237232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f237233b;

    public j(Navigator navigator, q createDocumentUseCase) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(createDocumentUseCase, "createDocumentUseCase");
        this.f237232a = navigator;
        this.f237233b = createDocumentUseCase;
    }

    public final Observable a(ArrayList arrayList) {
        Observable observableCompose = this.f237233b.a(arrayList, null).l().compose(new pjg.i(this, 4));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }
}
