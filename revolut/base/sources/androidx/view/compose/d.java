package androidx.view.compose;

import androidx.view.compose.internal.BackHandlerCompat;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BackHandlerCompat f6776c;
    public final /* synthetic */ Function d;

    public /* synthetic */ d(BackHandlerCompat backHandlerCompat, boolean z, Function function, int i) {
        this.f6774a = i;
        this.f6776c = backHandlerCompat;
        this.f6775b = z;
        this.d = function;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6774a) {
            case 0:
                return BackHandlerKt.BackHandler$lambda$5$0((ComposeBackHandler) this.f6776c, this.f6775b, (Function0) this.d);
            default:
                return PredictiveBackHandlerKt.PredictiveBackHandler$lambda$5$0((ComposePredictiveBackHandler) this.f6776c, this.f6775b, (Function2) this.d);
        }
    }
}
