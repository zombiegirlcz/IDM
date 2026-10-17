package wh4;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v35.b f297415b;

    public /* synthetic */ v(v35.b bVar, int i) {
        this.f297414a = i;
        this.f297415b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data screenContent;
        a aVar;
        Data content;
        yh4.a aVar2;
        switch (this.f297414a) {
            case 0:
                v35.b bVar = this.f297415b;
                c update = (c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data = update.f297396a;
                try {
                    Object content2 = data.getContent();
                    if (content2 != null) {
                        x35.e eVar = bVar.f285853a;
                        dz3.c configuration = ((a) content2).f297394a;
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        aVar = new a(configuration, eVar);
                    } else {
                        aVar = null;
                    }
                    screenContent = new Data(aVar, data.getError(), data.getLoading());
                    break;
                } catch (Throwable th10) {
                    screenContent = new Data(null, th10, data.getLoading());
                }
                Intrinsics.checkNotNullParameter(screenContent, "screenContent");
                return new c(screenContent);
            default:
                v35.b bVar2 = this.f297415b;
                yh4.c update2 = (yh4.c) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data data2 = update2.f313751a;
                try {
                    Object content3 = data2.getContent();
                    if (content3 != null) {
                        x35.e selectedAccount = bVar2.f285853a;
                        dz3.c configuration2 = ((yh4.a) content3).f313749a;
                        Intrinsics.checkNotNullParameter(configuration2, "configuration");
                        Intrinsics.checkNotNullParameter(selectedAccount, "selectedAccount");
                        aVar2 = new yh4.a(configuration2, selectedAccount);
                    } else {
                        aVar2 = null;
                    }
                    content = new Data(aVar2, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th11) {
                    content = new Data(null, th11, data2.getLoading());
                }
                Intrinsics.checkNotNullParameter(content, "content");
                return new yh4.c(content);
        }
    }
}
