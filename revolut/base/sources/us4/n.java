package us4;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f282436b;

    public /* synthetic */ n(g gVar, int i) {
        this.f282435a = i;
        this.f282436b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        h update = (h) obj2;
        switch (this.f282435a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data content = Data.copy$default(update.f282425a, this.f282436b, null, false, 6, null);
                Intrinsics.checkNotNullParameter(content, "content");
                return new h(content);
            default:
                Data content2 = Data.copy$default(update.f282425a, this.f282436b, null, false, 6, null);
                Intrinsics.checkNotNullParameter(content2, "content");
                return new h(content2);
        }
    }
}
