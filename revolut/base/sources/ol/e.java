package ol;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class e implements f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f226265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Json f226266b;

    public e(Context appContext, Json parser) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f226265a = appContext;
        this.f226266b = parser;
    }

    @Override // ol.f
    public final ogm.e a(String customerUserHash, String biometricToken) {
        Intrinsics.checkNotNullParameter(customerUserHash, "customerUserHash");
        Intrinsics.checkNotNullParameter(biometricToken, "biometricToken");
        ogm.e eVar = new ogm.e(new nl.f(4, customerUserHash, this, biometricToken), 2);
        Intrinsics.checkNotNullExpressionValue(eVar, "fromAction(...)");
        return eVar;
    }

    @Override // ol.f
    public final Observable b(String customerUserHash) {
        Intrinsics.checkNotNullParameter(customerUserHash, "customerUserHash");
        Observable observableCreate = Observable.create(new kp0.b(this, customerUserHash, 25));
        Intrinsics.checkNotNullExpressionValue(observableCreate, "create(...)");
        return observableCreate;
    }

    @Override // ol.f
    public final g getType() {
        return g.INTERNAL;
    }
}
