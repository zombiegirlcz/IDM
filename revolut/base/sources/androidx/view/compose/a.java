package androidx.view.compose;

import androidx.view.compose.internal.BackHandlerCompat;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BackHandlerCompat f6766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f6767c;

    public /* synthetic */ a(BackHandlerCompat backHandlerCompat, Function function, int i) {
        this.f6765a = i;
        this.f6766b = backHandlerCompat;
        this.f6767c = function;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6765a) {
            case 0:
                return BackHandlerKt.BackHandler$lambda$2$0((ComposeBackHandler) this.f6766b, (Function0) this.f6767c);
            default:
                return PredictiveBackHandlerKt.PredictiveBackHandler$lambda$2$0((ComposePredictiveBackHandler) this.f6766b, (Function2) this.f6767c);
        }
    }
}
