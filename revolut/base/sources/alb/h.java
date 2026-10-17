package alb;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f6179b;

    public /* synthetic */ h(d dVar, int i) {
        this.f6178a = i;
        this.f6179b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e update = (e) obj2;
        switch (this.f6178a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data contentData = Data.copy$default(update.f6175a, this.f6179b, null, false, 6, null);
                Intrinsics.checkNotNullParameter(contentData, "contentData");
                return new e(contentData);
            default:
                Data contentData2 = new Data(this.f6179b, null, false, 6, null);
                update.getClass();
                Intrinsics.checkNotNullParameter(contentData2, "contentData");
                return new e(contentData2);
        }
    }
}
