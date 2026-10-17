package ss4;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f265297b;

    public /* synthetic */ r(i iVar, int i) {
        this.f265296a = i;
        this.f265297b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        l update = (l) obj2;
        switch (this.f265296a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data content = Data.copy$default(update.f265284a, this.f265297b, null, false, 6, null);
                Intrinsics.checkNotNullParameter(content, "content");
                return new l(content);
            default:
                Data content2 = Data.copy$default(update.f265284a, this.f265297b, null, false, 6, null);
                Intrinsics.checkNotNullParameter(content2, "content");
                return new l(content2);
        }
    }
}
